import java.util.ArrayList;

public class Course {

	private String courseCode;
	private String name;
	private ArrayList<String> studentList = new ArrayList();



	public Course(String courseCode, String name) {
		super();
		this.courseCode = courseCode;
		this.name = name;
	}


	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getStudentList() {
		return studentList;
	}
	public void setStudentList(ArrayList<String> studentList) {
		this.studentList = studentList;
	}

	public void addstudent(String student){
		studentList.add(student);
	}


}