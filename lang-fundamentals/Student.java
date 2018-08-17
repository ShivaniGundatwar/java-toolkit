public class Student {

	private int id;
	private String name;
	private boolean pass;
	
	public Student(){
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return this.id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPass(boolean pass){
		this.pass = pass;
	}
		
	public boolean isPass(){
		return this.pass;
	}

}
