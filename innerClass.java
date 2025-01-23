public class innerClass
{
	public static void main(String[] args) {
		A obj=new A();
		obj.show();
		A.B obj1= new A.B();// here to access the inner class, create an object of the outer class, and then create an object of the inner class
		obj1.dance();
		
	}
}
// for the outer class only public, abstract and final are permitted.
class A //for outer class static is not permitted, because it says illegal.
{
    public void show(){
        System.out.println("show....");
    }
    //class B is a nested class .. Means a class inside the class.. here we see that B class is inside the class A
   static class B //here if we make it static, then we don't need object.
   { 
        public void dance()
        {
            System.out.println("Let's dance...");
        }
    }
}
