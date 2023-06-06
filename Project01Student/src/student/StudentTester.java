
  
  
package student;

public class StudentTester {

	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Juninho","XXXXXXXXXX");
		System.out.println(s1.toString());
		
		Student s2 = new Student(2,"Zezinho","YYYYYYYYYY");
		System.out.println(s2.toString());
		
		s1.setName("Junior");
		System.out.println(s1.toString());

	}
}
