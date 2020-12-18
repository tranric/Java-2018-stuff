import java.util.ArrayList;

public class item {



	private int id;
	private String name;
	private ArrayList<String> listofcustomers = new ArrayList();

	public item(int id, String name){

	this.id = id;
	this.name = name;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getListofcustomers() {
		return listofcustomers;
	}

	public void setListofcustomers(ArrayList<String> listofcustomers) {
		this.listofcustomers = listofcustomers;
	}

	public void addcustomer(String name){
		listofcustomers.add(name);
	}




}
