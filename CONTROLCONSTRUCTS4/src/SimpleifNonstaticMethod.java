//Simple if Non-Static method//Check.java
import java.util.Scanner;
public class SimpleifNonstaticMethod {
	public static void main(String[]args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter a number");
int marks=scan.nextInt();
System.out.println("Welcome to Kodnest");
Check check=new Check();
check.checkEligibility(marks);
}
}
