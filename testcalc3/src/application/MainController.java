/**
 * @author: Elmira Adeeb
 * note1: This application is not exception handled against invalid input
 * note2: Make sure you fully comment (javadoc style) this application (MealCost.java, Controller)
 */

package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	@FXML private Button _btnPlus;
	@FXML private Button _btnMinus;
	@FXML private TextField _txtAmount;
	@FXML private Label _lblPercent;
	@FXML private Label _lblTotal;
	@FXML private Button _btnCalculate;
    private MealCost _cost;

	  @FXML private void initialize() {
		  _cost = new MealCost();
		  _btnPlus.setOnAction(e -> onPlusClicked());
		  _btnMinus.setOnAction(e -> onMinusClicked());
		  _btnCalculate.setOnAction(e->onCalculateClicked());
	  }

      /**
       * onPlusClicked gets called whenever the user clicks the + button
      */
	  private void onPlusClicked() {
          int curTipPercent = Integer.parseInt(_lblPercent.getText().replace('%', ' ').trim());
           _cost.setTipPercent(++curTipPercent);
		  _lblPercent.setText(String.valueOf(_cost.getTipPercent()) +"%");

	    }
	  /**
       * onMinusClicked gets called whenever the user clicks the - button
      */
	  private void onMinusClicked() {
          int curTipPercent = Integer.parseInt(_lblPercent.getText().replace('%', ' ').trim());
		  _cost.setTipPercent(--curTipPercent);
		//  System.out.print(_cost.getTipPercent());

		  _lblPercent.setText(String.valueOf(_cost.getTipPercent()) +"%");
	  }
	  /**
       * onPlusClicked gets called whenever the user clicks the calculate button
      */
	  private void onCalculateClicked(){

		  _cost.setAmount(Double.parseDouble(_txtAmount.getText()));
		  double totalAmount = ((_cost.getTipPercent()/100.00) * _cost.getAmount())+ _cost.getAmount();
		  _lblTotal.setText("$"+String.valueOf(totalAmount));

	  }




}
