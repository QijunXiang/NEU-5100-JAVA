package problemOne;

public class Test {
	public static void main(String args[]) {
		Student s1 = new Student("Amanda",1);
		Student s2 = new Student("Bill", 2);
		Student s3 = new Student("Cindy", 3);
		Student s4 = new Student("David",4);
		Student s5 = new Student("Emma",5);
		Student s6 = new Student("Frank",6);
		Student s7 = new Student("Gigi",7);
		Student s8 = new Student("Henry",8);
		Student s9 = new Student("Ivy",9);
		Student s10 = new Student("Jery",10);
		Student s11 = new Student("Ken",11);
		
		Course math = new Course("Math");
		System.out.println(math.getTitle());
		math.registerStudent(s1);
		math.registerStudent(s2);
		math.registerStudent(s3);
		math.registerStudent(s4);
		math.registerStudent(s5);
		math.registerStudent(s6);
		math.registerStudent(s7);
		math.registerStudent(s8);
		math.registerStudent(s9);
		

		math.isFull();
		
		math.registerStudent(s10);
		math.isFull();
		math.registerStudent(s11);
		
		
	}
}
