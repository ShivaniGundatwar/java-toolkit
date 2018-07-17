public class DoWhileDemo
{
	
	public static void main(String[] args){

		boolean flag = true;
		int i = 0;
		while( flag ){
			
			System.out.println("Shivani "+i);
			if(i == 7){
			//	flag = false;			
				return;
			}
			//i =i++;
			//i = i + 1;
			i++;
		}
		
		System.out.println("Hello");
	}
}
