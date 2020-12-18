package application;

public class MealCost {


	private int _tipPercent = 15;
	private double _amount;



	public int getTipPercent() {
		return _tipPercent;
	}

	public void setTipPercent(int _tipPercent) {
		this._tipPercent = _tipPercent;
	}

	public double getAmount() {
		return _amount;
	}

	public void setAmount(double _amount) {
		this._amount = _amount;
	}


	public double calculateCost(){

        return ((_tipPercent/100.00)*(_amount))+_amount;

	}







}
