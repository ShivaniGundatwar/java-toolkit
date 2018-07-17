public class SwitchDemo {

	public static void main(String[] args){

		char c = 'a';	
		final long x = 10;
		// switch argument can be byte, short, int and char
		// 1.5 Enum, Byte, Integer, Short, Character
		// 7 String
		switch(c){
	
			case 'd':
				System.out.println("Jan");
			case 'b':
				System.out.println("Feb");
				break;
			case 'c':
				System.out.println("Mar");
			case 97:
				System.out.println("Apr");
		}

		// Switch argument with String
	}
}
