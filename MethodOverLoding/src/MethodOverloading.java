//Method overloading refers to the process of multiple of methods having the same name but different in the signture.
public class MethodOverloading {
public static void main(String[] args) {
teaBill();
teaBill("Ginger");
teaBill(10);
teaBill("Green",10);
}
public static void teaBill()
	{
	System.out.println("Bill for tea is 10Rs");
	}
public static void teaBill(int n)
{
	System.out.println("Bill for" +n+ "teas is"+(n*10)+"Rs");
}
public static void teaBill(String type)
{
	System.out.println("Bill for"+type+"tea is 15Rs");
}
public static void teaBill(String type,int n)
{
	System.out.println("Bill for"+n+" "+type+"tea is"+(n*15));
}
}
//Below method definition gives error so we will comment it 
/*public static int teaBill(String l)
//{
//System.out.println("Bill for"+t+tea is"+(n*15));
}*/

//O/P:Bill forGingertea is 15Rs
//Bill for10teas is100Rs
//Bill for10 Greentea is150
