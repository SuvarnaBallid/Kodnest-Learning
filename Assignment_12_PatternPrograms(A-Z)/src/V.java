
public class V {
public static void main(String[] args) {
int n=20;
for(int i=1;i<=n;i++)
{
	for(int j=0;j<=n;j++)
	{
	if((i==j&&i<=n/2)||(j==n-i&&i<=n/2))
	{
		System.out.print("*");
	}
	else
	{
		System.out.print(" ");
	}
	}
	System.out.println();
}
	}

}
