public class InstanceVar {

	int id;

	public InstanceVar(int id){

		this.id=id;
	}

	public static void main(String[] args){

		InstanceVar i1 = new InstanceVar(100);
		InstanceVar i2 = new InstanceVar(200);

		System.out.println(i1.id);
		System.out.println(i2.id);

		i1.id = 399;
		
	        System.out.println(i2.id);	
	}

}
