
	public class LabelledForLoop {
		public static void main(String[] args) {
			System.out.println("ROBO");
			rajini:for(int i=1;i<=5;i++)
			{
				tamana:for(int j=1;j<=5;j++)
				{
					System.out.println(" * ");
					break rajini;
				}
				System.out.println();
			}
		}
}
