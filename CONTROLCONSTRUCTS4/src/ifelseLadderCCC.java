//if else Ladder or else if Ladder: if We have multiple blocks of statement and only one block of statement should be executed 
//at any given point of time then we have to make use of the else if ladder Conditional Control Construct.
import java.util.Scanner;
public class ifelseLadderCCC {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter score");
int score=scan.nextInt();
if (score>=90)
{
	System.out.println("A+ Grade");
}
else if(score>=80 && score<90) 
{
	System.out.println("A Grade");
}
else if(score>=70 && score<80) 
{
	System.out.println("B Grade");
}
else if(score>=60 && score<70) 
{
	System.out.println("C Grade");
}
else if(score>=50 && score<60) 
{
	System.out.println("D Grade");
}
else  
{
	System.out.println("FAIL ...GET LOST");
}
}
}