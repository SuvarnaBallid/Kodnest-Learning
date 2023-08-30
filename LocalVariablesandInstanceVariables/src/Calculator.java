
public class Calculator {
	//Instance Variables/Data Members
	int num1;
	int num2;
	void add()
	//Local variables
	{	
		int res1;
		res1=num1+num2;
		System.out.println("Addition result is "+ res1);
	}
	void sub()
	{	
		int res2=num1-num2;
		System.out.println("Substraction result is "+ res2);
	}
	void mul()
	{	
		int res3=num1*num2;
		System.out.println("Multiplication result is "+ res3);
	}
	void div()
	{	
		int res4=num1/num2;
		System.out.println("Division result is "+ res4);
	}
}