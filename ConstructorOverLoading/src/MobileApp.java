
public class MobileApp {
public static void main(String[] args) {
Mobile mobile=new Mobile("Samsung","purple",1250000);
System.out.println(mobile.brand+" "+mobile.color+" "+mobile.cost);
Mobile mobile2=new Mobile();
System.out.println(mobile2.brand+" "+mobile2.color+" "+mobile2.cost);
Mobile mobile3=new Mobile("MI");
System.out.println(mobile3.brand+" "+mobile3.color+" "+mobile3.cost);
Mobile mobile4=new Mobile("50000");
System.out.println(mobile4.brand+" "+mobile4.color+" "+mobile4.cost);
 }
}
