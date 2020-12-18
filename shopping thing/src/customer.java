import java.util.ArrayList;

public class customer {

	private int id;
	private String name;
	private ArrayList<String> listofitems = new ArrayList();

	public customer (int id, String name){
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
	public ArrayList<String> getListofitems() {
		return listofitems;
	}
	public void setListofitems(ArrayList<String> listofitems) {
		this.listofitems = listofitems;
	}

	public void additem(String iname){
		listofitems.add(iname);
	}





}
