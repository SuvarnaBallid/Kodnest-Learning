
public class Q1 {
	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0||(j==0&&i<=8)||i==8||(j==n&&i<=8)||(i==j&&i>=6)){
				
					System.out.print("*");
				}
					else {
					System.out.print(" ");
			}
			}
				System.out.println();
			}
	}
}
