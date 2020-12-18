package application;

import javafx.beans.property.SimpleStringProperty;
//import javafx.beans.property.DoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
//import javafx.stage.Stage;

public class ShoppingListController {

	//ObservableList Choicelist = FXCollections.observableArrayList();

	@FXML private TextField TxtField_ItemName;
	@FXML private TextField TxtField_PriceEstimate;
	@FXML private TextField TxtField_Quantity;
	@FXML private ChoiceBox<String> CBCategory;
	@FXML private CheckBox ChkUrgent;
	@FXML private Button BtnAdd;
	@FXML private Button BtnClear;
	@FXML private TextArea TxtTotal;
	@FXML private Button BtnCalculate;
	@FXML private TableView<ItemAdd> TVCart;
	@FXML private TableColumn<ItemAdd, String> TCItem;
	@FXML private TableColumn<ItemAdd, String> TCPrice;
	@FXML private TableColumn<ItemAdd, String> TCQuantity;
	@FXML private TableColumn<ItemAdd, String> TCStatus;
	@FXML private TableColumn<ItemAdd, String> TCCategory;
	private ObservableList<ItemAdd> Itemaddlist;



	@FXML private void initialize(){
		ObservableList<String> Choicelist = FXCollections.observableArrayList(
				"Fruits & Veggies", "Grains", "Meat", "Dairy Products"
				);

		CBCategory.setItems(Choicelist);
		CBCategory.setValue("Fruits & Veggies");

		/*
		TableColumn TCItem = new TableColumn("ItemName");
		TableColumn TCPrice = new TableColumn("PriceEstimate");
		TableColumn TCQuantity = new TableColumn("Quantity");
		TableColumn TCCategory = new TableColumn("Category");
		TableColumn TCStatus = new TableColumn("Urgent");
		 */
		//TVCart.setEditable(true);
		TCItem.setCellValueFactory
		(TVCart -> new SimpleStringProperty(TVCart.getValue().getItemName()));

		TCPrice.setCellValueFactory
		(TVCart -> new SimpleStringProperty(TVCart.getValue().getItemName()));

		TCQuantity.setCellValueFactory
		(TVCart -> new SimpleStringProperty(TVCart.getValue().getQuantity()));

		TCCategory.setCellValueFactory
		(TVCart -> new SimpleStringProperty(TVCart.getValue().getCategory()));

		TCStatus.setCellValueFactory
		(TVCart -> new SimpleStringProperty(TVCart.getValue().getUrgent()));

		/*
		TCItem.setCellValueFactory
		(new PropertyValueFactory<ItemAdd, String>("ItemName"));

		TCPrice.setCellValueFactory
		(new PropertyValueFactory<ItemAdd, String>("PriceEstimate"));

		TCQuantity.setCellValueFactory
		(new PropertyValueFactory<ItemAdd, String>("Quantity"));

		TCCategory.setCellValueFactory
		(new PropertyValueFactory<ItemAdd, String>("Category"));

		TCStatus.setCellValueFactory
		(new PropertyValueFactory<ItemAdd, String>("Urgent"));
		 */
		/*
		TCItem.setCellValueFactory
		(new PropertyValueFactory<>("ItemName"));

		TCPrice.setCellValueFactory
		(new PropertyValueFactory<>("PriceEstimate"));

		TCQuantity.setCellValueFactory
		(new PropertyValueFactory<>("Quantity"));

		TCCategory.setCellValueFactory
		(new PropertyValueFactory<>("Category"));

		TCStatus.setCellValueFactory
		(new PropertyValueFactory<>("Urgent"));
		*/
		/*
		 TableColumn nameColumn = new TableColumn("Name");
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
		 */
		//tab.getColumns().addAll(nameColumn, surnameColumn);

/*
		TVCart.getColumns().addAll(TCItem, TCPrice, TCQuantity,
				TCCategory, TCStatus );
			*/
/*
		Stage stage = (Stage) TVCart.getScene().getWindow();
	    stage.setScene(value);
 */


		//TVCart.setItems();
		//TVCart.setEditable(true);
		// to test a row
		/*
		TVCart.getColumns().add(TCItem);
		TVCart.getColumns().add(TCPrice);
		TVCart.getColumns().add(TCQuantity);
		TVCart.getColumns().add(TCCategory);
		TVCart.getColumns().add(TCStatus);
		*/
		//TVCart.setItems(getItems());
		TVCart.refresh();


	}
// testing row
	/*
	public ObservableList<ItemAdd> getItems(){
		ObservableList<ItemAdd> Items = FXCollections.observableArrayList();
		Items.add(new ItemAdd("Apple", "1", "1" , "Fruits & Veggies", "Urgent"));
		return Items;

	}
	*/

	public void ClearItems(){
		TVCart.getItems().clear();
	}

	public void Additem(){



		String ItemName = "";
		//double PriceEstimate = 0;
		//int Quantity = 0;
		String PriceEstimate = "";
		String Quantity = "";
		boolean IsUrgent = false;
		String Category="";
		String Urgent ="";
		ItemName = TxtField_ItemName.getText();
		//PriceEstimate = Double.parseDouble(TxtField_PriceEstimate.getText());
		PriceEstimate = TxtField_PriceEstimate.getText();
		//Quantity = Integer.parseInt(TxtField_Quantity.getText());
		Quantity = TxtField_Quantity.getText();
		IsUrgent = ChkUrgent.isSelected();
		if(IsUrgent==true){
			Urgent="Urgent";

		}else{
			Urgent="Not Urgent";
		}
		Category = CBCategory.getValue().toString();


		ItemAdd added = new ItemAdd(ItemName, PriceEstimate,
				Quantity, Category, Urgent);
		/*
		Itemaddlist.add(new ItemAdd(ItemName, PriceEstimate,
				Quantity, Category, Urgent));
		 */
		//TVCart.setItems(Itemaddlist);
		//TVCart.getItems().setAll(Itemaddlist);
		TVCart.getItems().add(added);

		//prints data of the newly added item
		System.out.println("Item Name:" + added.getItemName()+
				"\nPrice:" + added.getPriceEstimate()+
				"\nQuantity:" + added.getQuantity() +
				"\nCategory:" + added.getCategory() +
				"\nStatus:" + added.getUrgent());
		//prints size of the cart
		System.out.println(TVCart.getItems().size());
		//test
		//System.out.println(TVCart.getItems().get(0).getItemName());
		TVCart.refresh();
	}

	public void calculate(){
		//int x=0;
		int itemquantity=0;
		double itemprice=0, total=0, totalurgent=0;

		for (int loop=0; TVCart.getItems().size() > loop; loop++){
			/*
			itemquantity = Integer.parseInt(TCPrice.getCellData(loop));
			itemprice = Double.parseDouble(TCQuantity.getCellData(loop));
			itemprice = itemprice*itemquantity;
			if(TCStatus.getCellData(loop).equals("Urgent")){
				totalurgent = totalurgent +itemprice;
			}
			else{
				total=total+itemprice;
			}
			//x++;

			 */
			/*
			 execption fix later
			 public static boolean isNumeric(String str)
{
  try
  {
    double d = Double.parseDouble(str);
  }
  catch(NumberFormatException nfe)
  {
    return false;
  }
  return true;
}

			 */

			itemquantity = Integer.parseInt(
					TVCart.getItems().get(loop).getQuantity());
			itemprice = Double.parseDouble(
					TVCart.getItems().get(loop).getPriceEstimate());
			itemprice = itemprice*itemquantity;
			if(TVCart.getItems().get(loop).getUrgent().equals("Urgent")){
				totalurgent = totalurgent +itemprice;
			}
			else{
				total=total+itemprice;
			}
		}
		TxtTotal.setText("Customer Name: John Doe\n"
				+ "The total money to be spent:$" + total + "\n"
						+ "The amount to be spend on Urgent Items:$" + totalurgent );
	}


}
