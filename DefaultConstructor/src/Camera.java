//if we donot write any constructor in a class then by default a zero parameterized constructor would be added into the class
//by java compiler this constructor technically called as default constructor
public class Camera {
String color;
String brand;
int cost;
void captureImage()
{
	System.out.println("Image capature....");
}
void displayImage()
{
	System.out.println("camera is displaying image");
}
//Default Constructor
public Camera()
{
	super();
}
}


