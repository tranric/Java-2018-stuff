//richard tran
import java.util.Scanner;
public class q1a {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//convert decimal to binary
		double input =0;
		int full=0;
		double holder=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a decimal number:");
		input = scan.nextFloat();
		full = (int)input;
		holder = input -  full;
        int container[] = new int[100];
        int i = 0;
        while (full > 0){
            container[i] = full%2;
            i++;
            full = full/2;
        }
        for (int j = i -1 ; j >= 0 ; j--){
            System.out.print(container[j]);
        }
        int x=0;


        //System.out.printf("\nHolder decimaled:%f", holder);
        int container2[] = new int[7];
        while(x!=6){
        	x++;
        holder=holder * 2;
        //container2[x] = (int)Math.round(holder);
        container2[x] = (int)holder;
        if (holder > 1){
        	holder = holder - 1;
        }
        //System.out.printf("\nHolder rounded:%f\n", holder);
        // = (int)Math.round(holder);

        }
        int k=1;
        //System.out.println("decimal pointing\n");
        while(container2.length > k){

            System.out.print(container2[k]);
            k++;
        }

        scan.close();

	}



}
