package arrathmethoddemo;

public class arraymethoddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {3,5,6,2, 8};
		//sa1[5]=10;
		System.out.println("The first element of the array:" + a1[0]);
		/*
		m1(a1);
		System.out.println("The first element of the array:" + a1[0]);
		m2(a1[0]);
		System.out.println("The first element of the array:" + a1[0]);
		*/
	}

	public static void m1(int[] x){
		x[0] = 100;

	}
	public static void m2(int a){
		a= 200;
	}

}
