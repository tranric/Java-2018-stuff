
public class Student implements Comparable<Student> {
   // public class Student {
	int id;
	String name;
	String program;
	Student(int id, String name, String program){
		this.id = id;
		this.name = name;
		this.program = program;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getProgram() {
		return program;
	}

	@Override
	public int compareTo(Student s) {
		if(this.getId() < s.getId())
                    return -1;
		else if(this.getId() == s.getId())
                    return 0;
		else
                    return 1;
	}

}
