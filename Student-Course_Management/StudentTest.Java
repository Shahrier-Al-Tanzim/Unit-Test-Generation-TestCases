// ---------------------------------------------------------------------------------
// --------------------------- E R R O R S --------------------------------
// (ragvenv) PS C:\Thesis\RagPipe\ragvenv> python .\RagPipeline.py
// Loading knowledge base...
// Loaded 4 documents.
// Splitting documents...
// Loaded chunked splits from cache.
// Embedding documents...
// Loading existing FAISS index...
// Setting up retriever...
// Initializing LLM and RAG pipeline...
// Java syntax error: Expected ')' (IT IS THIS)
// ---------------------------------------------------------------------------------

// actual class 
package pack1;
/**
 * @author PAVAN
 */
import java.util.Scanner;

public class Student {
	/*
	 * using private variables for encapsulation
	 * creating the courses
	 */
	private String firstname;
	private String lastname;
	private int gradlevel;
	private String Courses [] = {"Maths","English","Computer_Science","IT"};
	private  String  enrollchoice [] = new String[4];
	private int cost;
	private static int id = 1000;

	Scanner sc = new Scanner(System.in);

	//Constructor to read name,year
	public Student() {
		System.out.println("---------------------------------------");

		System.out.println("Enter the First Name :");
		firstname = sc.next();
		System.out.println("Enter the Last Name :");
		lastname = sc.next();
		System.out.println("Enter the current pursuing Grad Level :");
		gradlevel = sc.nextInt();

	}


	// Generate ID
	private int Id() {
		id++;
		return gradlevel+id;
	}

	// Enroll in courses
	 void Enroll() {

		System.out.println("\n\n\t*Courses List*\n \n \"Maths\" \t\"English\" \n\"Computer Science\" \t \"IT\" ");
		System.out.println("\n\nEnter '1' to enroll and '0' to not enroll !!");
		int choice;
				for(int i=0;i<4;i++) {
					System.out.println("\nDo you want to enroll for "+Courses[i]);
					choice = sc.nextInt();
					if (choice ==1)  {
						enrollchoice[i] = Courses[i];
						cost = cost+600;

					}
				}
				balence();


	}


	// view Balance
	void balence() {
		System.out.println("Remaining balence is Rs: "+cost);
	}

	// Pay fee
	void paytut() {
		System.out.println("How much do you want to pay : Rs ");
		int pay;
		pay = sc.nextInt();
		cost =cost-pay;
		System.out.println("Thank you for your payment Rs "+pay);
		balence();

	}

	// Show Status
	void stat() {
		System.out.println("------------------------------------");
		System.out.println("\n\t Student Name : "+firstname+" "+lastname);
		System.out.println("\n\t Graduation Level : "+gradlevel+" year");
		System.out.println("\n\t Enrollment ID : "+Id());
		System.out.println("\n\tEnrolled courses are: ");
		for(int i=0;i<4;i++) {
			if (enrollchoice[i] != null)
				System.out.println("\t\t\t\t"+enrollchoice[i]);
			}
		if (cost != 0 ) balence();
		else System.out.println("--------Total paid--------- ");
	}
}