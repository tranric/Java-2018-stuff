
/*use an array numbers to store the distinct values.
read each value from input, check if it is already in the array numbers,
if not, add it into it.
*/

// Suggested template:
public class DistinctNumber_Template {
  public static void main(String[] args) {
    // numbers array will store distinct values, maximum is 10
    int[] numbers = new int[10];

    // How many distinct numbers are in the array
    int numberOfDistinctValues = 0;
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter ten numbers: ");
    boolean validnumber = true;

    for (int i = 0; i < numbers.length; i++) {
      // Read an input
      int value = input.nextInt();
      validnumber = true;
    //  Step 1: Check if value is in numbers
      for (int x=0; x < i; x++){
    	  if(value == numbers[x]){
    		  System.out.println("Number was already entered.");
    		  //value = input.nextInt();
    		  validnumber = false;
    	  }

      }
    //  Step 2: If value is not in numbers, add it into numbers
      if(validnumber == true){
    	  numbers[i]=value;
    	  //  Step 3: Increment numberOfDistinctValues
          numberOfDistinctValues++;
      }


     }
   // Step 4: Display output
    for (int i = 0; i < numbers.length; i++) {
    System.out.println("Numbers array:"+
    		"\n numbers[" + i + "]:" +  numbers[i]);

    }
    System.out.println("Number of Distinct Values:" + numberOfDistinctValues);
  }
}

