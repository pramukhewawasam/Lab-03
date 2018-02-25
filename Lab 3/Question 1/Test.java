public class Test{
	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.name = "Balla";
		s2.name = "Bitch";
			
		s1.ditno = 123;
		s2.ditno = 1234;
		
		s1.address = "Malabe";
		s2.address = "Colamba";
		
		System.out.println("S1 Student Name :"+s1.name);
		System.out.println("S2 Student Name :"+s1.name);
		
		System.out.println("S1 Student ditno :"+s1.ditno);
		System.out.println("S2 Student ditno :"+s2.ditno);
		
		System.out.println("S1 Student address :"+s1.address);
		System.out.println("S2 Student address :"+s2.address);
		
	}
}
