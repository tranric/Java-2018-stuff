//Richard Tran

import java.util.Random;
/**
 *
 * @author Richard Tran
 * @since 2018-06-09 (YYYY-MM-DD)
 * @version 1.0
 *  Description - Randomly choose a prediction from an array. Can
 *  add another prediction of on the array if the array size can handle it.
 */
public class Horscope {
/**
 *
 * @param array - holds the array of the predictions
 * @param x - holds the number of predictions which is used to randomized the return
 */
	public void randomHorscope(String[] array, int x){
		Random rnd = new Random();
		/*
		int x=0 , randomized = 0;;
		while(array[x] != ""){
			x++;
		}
		 */
		System.out.printf("Your Prediction: %s", array[rnd.nextInt(x)]);

	}


/**
 *
 * @param array holds the array
 * @return x - the number of predictions
 */
	public int numberofpredicitions(String[] array){
		int x=0;
		while(array[x] != ""){

			x++;
			if (x==10){
				break;
			}
		}

		return x;

	}
	/**
	 *
	 * @param array - array of predictions entered by the user
	 * @param x - the number of the predictions
	 * @param prediction - the new prediction added by the user
	 */
	public void addnewprediction(String[] array, int x, String prediction){

		array[x+1] = prediction;
		x++;

	}







}
