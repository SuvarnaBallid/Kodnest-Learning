//Static Method  outside the class(Different class)
public class StaticMethodOutside {
public static void main(String[] args) {
	int x=60;
	int y=40;
	int res=app.add(x,y);
	System.out.println(res);
	}
	}
	class app{
		public static int add(int x,int y) 
		{
		int z=x+y;
		return z;
		}
}
	


