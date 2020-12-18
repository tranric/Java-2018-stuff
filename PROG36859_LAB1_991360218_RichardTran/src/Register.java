
public class Register {

	private int registrationId;
	private Student student;
	private Course course;

	public Register(int registrationId, Student student, Course course) {
		super();
		this.registrationId = registrationId;
		this.student = student;
		this.course = course;
		this.student.addcourse(course.getName());
		this.course.addstudent(student.getName());
	}

	public int getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}




}
