
public class Demo1 {

	public static void main(String[] args) {
     for(int i=1; i<=7; i++) {
	if(i==4)
	{
		continue;//skip the iteration when i is 5
		//System.out.println("can;t execute this statement");//Error
	}
System.out.println("i= "+i);
//we can place a statement after continue in next block
	}
	System.out.println("Loop ended");
}
}
