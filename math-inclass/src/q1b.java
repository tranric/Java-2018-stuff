//richard tran
public class q1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = Math.PI;
		double holder = pi-3;
		 int x=0;
		int container2[] = new int[7];
		System.out.printf("%d",3);
        while(x!=6){
        	x++;
        holder=holder * 8;
        //container2[x] = (int)Math.round(holder);
        container2[x] = (int)holder;
        if (holder > 1){
        	holder = holder - (int)holder;
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
	}

}
