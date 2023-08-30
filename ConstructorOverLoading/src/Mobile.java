//Constructor overloading is a process of having multiple constructors  with difference in the Signture.
public class Mobile {
String brand;
String color;
int cost;
public Mobile(String a,String b,int c) {
	brand =a;
	color=b;
	cost=c;
	}
public Mobile()
{
	brand="Apple";
	color="Gold";
	cost=250000;
}
public Mobile(String x)
{
	brand=x;
	cost=40000;
}
public Mobile(int c)
	{
		cost =c;
		color="Silver";
		brand="gionee";
	}

	void allowToCall()
	{
		System.out.println("TRING TRING ....calling..");
	}
	void allowToPlay()
{
		System.out.println("Start playing BGMI....");
}
}

