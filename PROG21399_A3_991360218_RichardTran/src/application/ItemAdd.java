package application;

//import javafx.beans.property.SimpleDoubleProperty;
//import javafx.beans.property.SimpleIntegerProperty;
//import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public class ItemAdd {

	private SimpleStringProperty ItemName, Urgent, Category;
	private SimpleStringProperty  PriceEstimate;
	private SimpleStringProperty  Quantity;
	//private SimpleDoubleProperty  PriceEstimate;
	//private SimpleIntegerProperty  Quantity;
	//private SimpleBooleanProperty Urgent;

	public ItemAdd(String itemName,
			//double priceEstimate, int quantity,
			String priceEstimate, String quantity,
			String category, String urgent) {
		super();
		ItemName = new SimpleStringProperty(itemName);
		//PriceEstimate = new SimpleDoubleProperty(priceEstimate);
		//Quantity = new SimpleIntegerProperty(quantity);
		PriceEstimate = new SimpleStringProperty(priceEstimate);
		Quantity = new SimpleStringProperty(quantity);
		Category = new SimpleStringProperty(category);
		Urgent = new SimpleStringProperty(urgent);
	}

	protected String getItemName() {
		return ItemName.get();
	}

	protected void setItemName(SimpleStringProperty itemName) {
		//protected void setItemName(String itemName) {
		ItemName = itemName;
		//ItemName.set(itemName);
	}

	//protected double getPriceEstimate() {
	protected String getPriceEstimate() {
		return PriceEstimate.get();
	}

	//protected void setPriceEstimate(SimpleDoubleProperty priceEstimate) {
	protected void setPriceEstimate(SimpleStringProperty priceEstimate) {
		//protected void setPriceEstimate(String priceEstimate) {
		PriceEstimate = priceEstimate;
			//PriceEstimate.set(priceEstimate);
	}

	//protected int getQuantity() {
		protected String getQuantity() {
		return Quantity.get();
	}

	//protected void setQuantity(SimpleIntegerProperty quantity) {
		protected void setQuantity(SimpleStringProperty quantity) {
		//protected void setQuantity(String quantity) {
		Quantity = quantity;
		//	Quantity.set(quantity);
	}

	protected String getCategory() {
		return Category.get();
	}

	protected void setCategory(SimpleStringProperty category) {
	//protected void setCategory(String category) {
		Category = category;
		//Category.set(category);
	}

	protected String getUrgent() {
		return Urgent.get();
	}

	protected void setUrgent(SimpleStringProperty urgent) {
	//protected void setUrgent(String urgent) {
		Urgent = urgent;
		//Urgent.set(urgent);
	}





/*
	String ItemName = "";
	String PriceEstimate = "";
	String Quantity = "";
	Boolean Urgent = false;
	String Category="";
	protected String getItemName() {
		return ItemName;
	}
	protected void setItemName(String itemName) {
		ItemName = itemName;
	}
	protected String getPriceEstimate() {
		return PriceEstimate;
	}
	protected void setPriceEstimate(String priceEstimate) {
		PriceEstimate = priceEstimate;
	}
	protected String getQuantity() {
		return Quantity;
	}
	protected void setQuantity(String quantity) {
		Quantity = quantity;
	}
	protected Boolean getUrgent() {
		return Urgent;
	}
	protected void setUrgent(Boolean urgent) {
		Urgent = urgent;
	}
	protected String getCategory() {
		return Category;
	}
	protected void setCategory(String category) {
		Category = category;
	}
	public ItemAdd(){
	}
	public ItemAdd(String Item, String Price, String Quantity, Boolean Urgent, String Category ){
		ItemName = Item;
		PriceEstimate = Price;
		this.Quantity = Quantity;
		this.Urgent = Urgent;
		this.Category = Category;
	}

	*/

}
