package task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Student class with parameterized constructor
 */
class Student{
	
	private String name;
	
	public Student() {
		
	}

	/*
	 * Parameterized constructor
	 */
	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}


public class School {

	public static void main(String[] args) {
		/*
		 * Create a list to store students
		 */
        List<Student> studentList = new ArrayList<>();
    	Scanner scanner = new Scanner(System.in);
    	 while (true) {
			System.out.println("\nSchool Management System :");
			System.out.println();
		    System.out.println("------------------------------------------");
			System.out.println();
			System.out.println("1. Add a student name and grade ");
			System.out.println("2. Seperate students name starts with 'A' ");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
		
			int choice = scanner.nextInt();
			scanner.nextLine();  // Consume newline character
			 switch (choice) {
	            case 1:
				        System.out.println("Enter the total number of students to store in the class: ");
				        int totalCount = scanner.nextInt();
						scanner.nextLine();  // Consume newline character
						String name = null;
						System.out.println("Enter the "+totalCount+" number of students name to store: ");
						for(int i=0;i <= totalCount-1;i++) {
							Scanner inputObj = new Scanner(System.in);
							name = inputObj.next();
							studentList.add(new Student(name));
						}
					    System.out.println("Students created successfully");
					    System.out.println("------------------------------------------");
					    System.out.println();
					    displayStudentGrades(studentList);
					    break;
	            case 2:
	            	aNameStudents(studentList);
	            	System.out.println();
	                System.out.println("------------------------------------------");
	                System.out.println();
	                break;
	            case 5:
	                System.out.println("Exiting the program. Goodbye!");
	                System.out.println();
	                System.out.println("------------------------------------------");
	                System.out.println();
	                System.exit(0);
	
	            default:
	                System.out.println("Invalid choice. Please enter a valid option.");
	                System.out.println();
	                System.out.println("------------------------------------------");
	                System.out.println();
    	 }
      }
	}

	/*
	 * Use Stream API and lambda expression to filter students name with 'A'
	 */
	private static void aNameStudents(List<Student> studentList) {
		List<Student> aGradeStudents = studentList.stream().filter(s -> s.getName().startsWith("A")).toList();
		
		/*
		 * Print the list of students with grade 'A'
		 */
        System.out.println("List of students name starts with 'A':");
        aGradeStudents.forEach(s->System.out.println(s.getName()));
		
	}

	/*
	 * display the List of Students available in the class:
	 */
	private static void displayStudentGrades(List<Student> studentList) {
		System.out.println("List of Students available in the class:");
		System.out.println("------------------------------------------");
        System.out.println();
		for(Student student : studentList) {
			System.out.println(student.getName());
		}
		
	}
}
