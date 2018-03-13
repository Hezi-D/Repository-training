package Pack1;

import java.util.Random;

public class Lab2 {

	public static void main(String[] args) {

		Student s1Student = new Student("Jim", "30541277");
		Student s2Student = new Student("Momi", "842516214");
		Student s3Student = new Student("Jim", "74851987");
		
		s1Student.enroll("English");
		s1Student.enroll("Arabic");
		s1Student.checkBalance();
		s1Student.pay(250);
		s1Student.checkBalance();
		System.out.println(s1Student.toString());

		//Use set method
		s1Student.setName("Buli");
		
		//Use set method
		System.out.println(s1Student.getName());
		
		
		
		}		
	}	

		class Student{
			
			//Define variables
			private String name;
			private String ssn;
			private String email;
			private int id = 1000;
			private String UserId;
			private String courses = "";
			private static final int costForCourse = 800;
			private int balance=0;
			
			
			//create constructor
			public Student (String name, String ssn ) {
				id++;
				this.name = name;
				this.ssn = ssn;
				setEmail();		
				setId();
				setUserId();
				
			}

			
			
			
			private void setUserId() {
				int max=90;
				int min = 10;
				int randnumber = (int)(Math.random()*((max-min)));
				randnumber = randnumber + min;
				String UserId = id + "" +randnumber + ssn.substring(5);
				System.out.println(UserId);
				
			}

			private void setId() {
				String id = "9485124";		
			}

			//Function to create student email
			private void setEmail(){		
				email = name.toLowerCase() + "@gmail.com";
				System.out.println("Your student email is: "+email);			
			}
			
			//Methods
			
			//Enrollment to courses
			public void enroll(String course) {
				this.courses = this.courses + "\n " + course;
				System.out.println(courses);
				balance = balance + costForCourse;
			}
			
			public void pay(int amount) {
				balance = balance - amount;
				System.out.println("Payment "+ amount);
			}
			
			public void checkBalance() {
				System.out.println("your balance is : " + balance);
			}
			
		
			public void showCourses() {
				System.out.println(courses);
			}
			
			public String toString() {
				
				
				return "[NAME:] \n" + name + "\n[COURSES]:"+ courses + "\n[BALANCE:]\n " +  balance + "]";
			
			
		}
			
			//Set
			public void setName (String name) {
				
				this.name =name;			
			}
			
			//Get
			public String  getName() {
				
				return name;
			}
		}
	


