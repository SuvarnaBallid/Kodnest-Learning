//if ladder Example:Non Static method different class //Linear Execution

import java.util.Scanner;
public class DemoGrade {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter  score");
int score=scan.nextInt();
Grade grade=new Grade();
grade.giveGrade(score);
	}

}
