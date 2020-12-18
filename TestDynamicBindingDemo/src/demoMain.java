
public class demoMain {

	public static void main(String[] args) {

		C c = new C();
		B b = new B();
		A a = new A();


		System.out.println(c.m1(5, 7, 2, 1));
		System.out.println(c.m1(5, 7, 2));
		System.out.println(c.m1(5, 2.5));
		System.out.println(c.m1(7, 9));
		b = new C();
		System.out.println(((C)b).m1(7, 9, 5, 6));


	}



}

class A{

	int m1 (int a, int b){
		return a+b;
	}

}

class B extends A{
	int m1(int a, int b, int c){
		return a+b+c;
	}

	double m1(int a, double b){
		return a+b;
	}

}

class C extends B{

	int m1(int a, int b, int c, int d){
		return a+b+c+d;
	}

}




