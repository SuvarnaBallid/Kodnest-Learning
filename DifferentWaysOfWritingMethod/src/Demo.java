//Non-Static Inside class
public class Demo {
public static void main(String[] args) {
int a=60;
int b=40;
Demo d1=new Demo();
int res=d1.add(a,b);
System.out.println(res);
}
	public int add(int x,int y)
	{
		int c=x+y;
		return c;
	}
}

