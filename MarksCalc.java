import java.util.Scanner;

public class MarksCalc {
	public static void main(String[] args) {
		System.out.println("Taking marks as an input");
		Scanner sc = new Scanner(System.in);
		int max_marks = 500;
		double calc_average_percentage;
		System.out.println("The total number of marks is " + max_marks + " Enter the Total subject marks out of " + max_marks + ":");
		System.out.println("Enter the Marks of English: ");
		int eng = sc.nextInt();
		System.out.println("Enter the Marks of Hindi: ");
		int hin =  sc.nextInt();
		System.out.println("Enter the Marks of Maths: ");
		int math = sc.nextInt();
		System.out.println("Enter the Marks of Science: ");
		int sci = sc.nextInt();
		System.out.println("Enter ther Marks of Computer: ");
		int comp = sc.nextInt();
		int calc_total_marks = eng + hin + math + sci + comp;
		calc_average_percentage = (calc_total_marks / 5);
		if(calc_average_percentage >= 90.0) {
			System.out.println("The grade is " + "A");
		}
		else if(calc_average_percentage >= 80.0 && calc_average_percentage <=89.0) {
			System.out.println("The grade is " + "B");
		}
		else if(calc_average_percentage >=70.0 && calc_average_percentage <=79.0) {
			System.out.println("The grade is " + "C");
		}
		else if(calc_average_percentage >=60.0 && calc_average_percentage <=69.0) {
			System.out.println("The grade is " + "D");
		}
		else if(calc_average_percentage >=50.0 && calc_average_percentage <=59.0) {
			System.out.println("The grade is " + "E");
		}
		else {
			System.out.println("The grade is " + "F");
		}
		sc.close();
		
		System.out.println("Sum is " + calc_total_marks + " out of " + max_marks);
		System.out.println("Average percentage of 5 marks is " + calc_average_percentage);
		
	}
}
