
public class Table {
//Attributes or properties or Data Members
	int seatingCapacity;
	int cost;
	String color;
	String brand;
	//Behaviours or Functionalities or Member functions 
	void allowToSit()
	{
		System.out.println("User sit on the Table which is "+color+"in color");
	}
	void allowToWrite()
	{
		System.out.println("User can write in the Book by keeping it on the table which costs"+cost);
	}
}
