public class VarArgMethod {

	public void m1(int a, int b ){
		System.out.println("Add "+(a+b));
	}

	public void m1(String s, int... b ){
		System.out.println("str "+s);
		for(int n : b){
			System.out.println(n);
		}
	}

	public static void main(String... args){

		VarArgMethod v = new VarArgMethod();
		v.m1(10,20); // We are calling m1 method of VarArgMethod class
		v.m1("sss", 10,20,30);
		v.m1("ss", 100,200,300,400,500,600);
	}
}
