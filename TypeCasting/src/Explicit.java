//Explicit type casting it refers to the process of converting the data of larger data type to smaller data type.
public class Explicit {
public static void main(String[] args) {
char a='$';
int b;
//b=a;//Error
b=(short)a;//explicit Type conversion
System.out.println("a="+a);
System.out.println("b="+b);
}
}
