//Simple if Seperate method
import java.util.Scanner;
public class SimpleifseperateMethod {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter a number");
int marks=scan.nextInt();
System.out.println("Welcome to kodnest");
checkEligibility(marks);
}
public static void checkEligibility(int marks) {
//Simple if Conditional control construct
if(marks>=80)
{
	System.out.println("Welcome to tech club");
}
}
}
