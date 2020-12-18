import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DatabaseMetaData;

class DBOperationDemo {
	static Connection conn;
	static Statement stmt;

	public static void main(String[] args) {

		loadDriver();
		createConnection();
		createStatement();
		//insertData();
		//readData();
		//updateData();
		//System.out.println("Data with metadata");
		//readDataWithMetaData();
		System.out.println("Data from prepared statement");
		readDataByCourseName();
	}



	static void loadDriver(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded successfully....!!");

		} catch (ClassNotFoundException e) {
			System.out.println("Driver load ERROR: " + e);
			//e.printStackTrace();
		}
	}

	static void createConnection(){
		//connection get connection (DBurl, username, password);
		try {
			//jdbc:mysql://cmdctrl.ca:3306/test
			//user: sheridan
			//pw: jdbcSQLserver
			/*
			 conn = DriverManager.getConnection("jdbc:mysql://cmdctrl.ca:3306/test",
				"sheridan","jdbcSQLserver");
		*/
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
				"root","toor");

		System.out.println("Connected successfully....!!");
		}
		catch(SQLException ex){
			System.out.println("Connection ERROR: " + ex);
		}

	}

	static void createStatement(){
		try {
		stmt = conn.createStatement();
		System.out.println("Statement created successfully....!!");
		}
		catch(SQLException ex){
			System.out.println("Statement ERROR: " + ex);
		}

	}

static void insertData(){

	String insertQuery = "Insert into course values (11,'mySQL');";
	try {
		stmt.executeUpdate(insertQuery);
		System.out.println("update created successfully....!!");
	} catch (SQLException e) {
		System.out.println("insertion ERROR: " + e);
		//e.printStackTrace();
	}
	//statements
	//executeQuery(""), executeUpdate(""), execute("")


}

static void readData(){
	String readQuery = "select * from course";
	try{
		ResultSet rs = stmt.executeQuery(readQuery);
		while(rs.next()){
			int cid = rs.getInt("CourseID");
			String cname = rs.getString("CourseName");
			System.out.println("Course ID = " + cid +
					", Course Name = " + cname);
		}
	}
	catch(SQLException e){
		System.out.println("Data read ERROR: " + e);
	}

}

static void updateData(){

String updateQuery = "Update course SET CourseName ="
		+ " 'Algorithm' WHERE CourseID = 11";
try{
	stmt.executeUpdate(updateQuery);
	readData();
	System.out.println("Data after update operation..........");

}
catch(SQLException e){
	System.out.println("Update ERROR: " + e);
}

}

static void createTable(String tName){
	String Query = "create table " + tName +
			"(id int primary key, name varchar(20),"
			+ "city varchar(20));";

	try{
		stmt.executeUpdate(Query);

	}
	catch(SQLException e){
		System.out.println("Create Table ERROR: " + e);
	}

}

static void DeleteData(){
	String delete = "delete from course where courseID = 11";

	try{
		stmt.executeUpdate(delete);
		System.out.println("deleted successfully....!!");
		readData();
	}
	catch(SQLException e){
		System.out.println("Create Table ERROR: " + e);
	}
}

public static void readDataWithMetaData(){
	String selectQuery = "select * from course";

	try{
		ResultSet rs = stmt.executeQuery(selectQuery);
		ResultSetMetaData metadata = rs.getMetaData();
		int noOfColumn = metadata.getColumnCount();

		for(int i=1; i <= noOfColumn; i++){
			System.out.printf("%-10s\t", metadata.getColumnName(i));

		}
		System.out.println();
		while(rs.next()){
			for(int i=1; i <= noOfColumn; i++){
				System.out.printf("%-10s\t", rs.getObject(i));
				//System.out.println();
			}

		}

		System.out.println();
		DatabaseMetaData dbMetaData = conn.getMetaData();
		//get url, username, product name, product version,
		//so on. get them from someone that has access to slate.

			System.out.println("database URL: " + dbMetaData.getURL());


	}
	catch(SQLException e){
		System.out.println("metadata and mdata read ERROR: " + e);
	}

}

public static void readDataByCourseName(){
	Scanner input = new Scanner(System.in);
	//String query = "select * from Course where CourseName = ?;";
	String query = "select * from Course where courseID = ? and CourseName = ?;";
	try {
		PreparedStatement preparedstmt = conn.prepareStatement(query);

			System.out.println("Please enter course ID");
			int id= input.nextInt();
			preparedstmt.setInt(1, id);
			System.out.println("Please enter course name");
			String course = input.next();
			preparedstmt.setString(2, course);

			ResultSet rs = preparedstmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}

	}
	catch(SQLException ex){
		System.out.println("Statement ERROR: " + ex);
	}

}

}
