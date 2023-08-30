//if else Conditional Control Construct:
//if we have two block of statements and if any one block should be executed at any given point of time 
//then we have make use of the if else conditional control Construct.
import java.util.Scanner;
public class ifelseCCC {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter  age");
int age=scan.nextInt();
if(age>=18)
{
	System.out.println("You are eligible for voting");	
}
else
{
	System.out.println("You are not eligible for voting");
}
}

}
