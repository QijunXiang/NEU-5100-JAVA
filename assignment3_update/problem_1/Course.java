package problemOne;

import java.util.LinkedList;
import java.util.List;

public class Course {
	private String title;
	private int numberOfStudent;
	private int maximumValue;
	private Student[] registeredStudents;
	public Course(String title) {
		this.title = title;
		numberOfStudent = 0;
		maximumValue = 10;
		registeredStudents = new Student[maximumValue];
	}
	String getTitle() {
		return this.title;
	}
	public Student[] getStudents() {
		return this.registeredStudents;
	}
	public boolean isFull() {
		if(this.numberOfStudent == this.maximumValue ) {
			System.out.println("Course " + this.title + " is full.");
			return true;
		}
		System.out.println("Course " + this.title + " is not full.");
	    return false;
	}
	
	boolean registerStudent(Student a)
	{
		if(numberOfStudent < 10) {
			registeredStudents[numberOfStudent] = a;
			numberOfStudent++;
			System.out.println("No." + a.getId() + " Student " + a.getName() +" successfully registed in course " + this.title);
			return true;
		} 
		System.out.println(this.title + " class is full, register failed");
		return false;
	}
 }
