public class SwitchDemo2
{
	
	enum fruits { MANGO, APPLE, ORANGE, BANANA, STROWBERRY};

	public static void main(String[] args){

		fruits  c = fruits.MANGO;
		switch(c){
			case APPLE:
				System.out.println("student 1");
				break;

			case ORANGE:
				System.out.println("student 2");
				break;

			case MANGO:
				System.out.println("student 3");
				break;

			case BANANA:
				System.out.println("student 4");
				break;
			

		}
	}
}
