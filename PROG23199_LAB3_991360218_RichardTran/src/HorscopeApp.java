
import java.util.Arrays;
import java.util.Scanner;


//Richard Tran
/**
 *
 * @author Richard Tran
 * @since 2018-06-09 (YYYY-MM-DD)
 * @version 1.0
 * Description - Asks the user to enter predictions into an array with a
 * maximum of 10 predictions.  It then chooses randomly one of the predictions
 * that was entered and displays it as the result.
 */
public class HorscopeApp {


	public static void main(String[] args) {
		Horscope scope = new Horscope();
		String userinput="";
		String array[];
		array = new String[10];
		Arrays.fill(array, "");
		int x=0;
		Scanner input = new Scanner(System.in);
		//string[] intArray = new String[20]
		System.out.print("Please enter your predictions."
				+ " \nA Maximum of 10 Predictions are allowed. "
				+ "\nEnter nothing to finish entering predictions:");

		while(x != 10){
			userinput = input.nextLine();
			if(userinput.isEmpty() || x == 10){
				System.out.println("Closed prediction entries.");
				//x=10;
				break;
			}
			//System.out.printf("x before array:%d\n", x);
			array[x]=userinput;
			System.out.println("Prediction added.");
			x++;


		}
		System.out.println("Random prediction: ");
		x=scope.numberofpredicitions(array);
		//check if x is correct
		//System.out.printf("x numberofpredictions:%d", x);


		scope.randomHorscope(array, x);


		input.close();

	}

}
