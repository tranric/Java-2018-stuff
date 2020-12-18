
public class purchase {


	private int id;
	private customer c;
	private item i;

	public purchase(int id, customer c, item i) {
		super();
		this.id = id;
		this.c = c;
		this.i = i;
		this.c.additem(i.getName());
		//this.c.getListofitems().add(i.getName());
		this.i.addcustomer(c.getName());


	}

	public void allcustomerspurcahseditem(item i){
		System.out.println("list of customers that have purchased:" + i);
		for(int x=0; x < i.getListofcustomers().size(); x++){
			System.out.println(i.getListofcustomers().get(x));
		}
	}









}
