//Switch CCC: If We have multiple options to choose and at any given point in time only one block should be executed then
//we have to make use of Switch conditional control construct.
import java.util.Scanner;
public class SwitchCCC {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter a number between1-7");
int num=scan.nextInt();
switch(num) {
case 1:
	System.out.println("SUNDAY");
	break;
case 2:
	System.out.println("MONDAY");
	break;
case 3:
	System.out.println("TUESDAY");
	break;
case 4:
	System.out.println("WEDNESDAY");
	break;
case 5:
	System.out.println("THURSDAY");
	break;
case 6:
	System.out.println("FRIDAY");
	break;
case 7:
	System.out.println("SATURDAY");
	break;
default:
	System.out.println("IDIOT...GO TO.. VASSAN EYE CARE");
	break;
	}
}
}
