public class Student{
	private String name;
	private int ditno;
	private String address;
	
	//Constructor
	Student(String name,int ditno,String address){
		this.name = name;
		this.ditno = ditno;
		this.address = address;
		
		
	}
	
	public void printDetails(){
		System.out.println("Student Name	:"+name);
		System.out.println("Student ditno	:"+ditno);
		System.out.println("Student address	:"+address);
	}
}