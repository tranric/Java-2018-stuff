
public class Student implements Comparable<Student>{
private int StudentID=0;
private String Name="";
public Student(int studentID, String name) {
	super();
	StudentID = studentID;
	Name = name;
}
public int getStudentID() {
	return StudentID;
}
public void setStudentID(int studentID) {
	StudentID = studentID;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
@Override
public int compareTo(Student s) {
	if(this.getStudentID() < s.getStudentID())
                return -1;
	else if(this.getStudentID() == s.getStudentID())
                return 0;
	else
                return 1;
}

}
