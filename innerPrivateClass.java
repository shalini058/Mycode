public class innerPrivateClass
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
   private class B //here if we make it private, then we can't able to access class B. if you don't want outside objects to access the inner class, declare the class as private.
   { 
        public void dance()
        {
            System.out.println("Let's dance...");
        }
    }
}

//If you try to access a private inner class from an outside class, an error occurs

// innerPrivateClass.java:14: error: A.B has private access in A
// 		A.B obj1= new A.B();// here to access the inner class, create an object of the outer class, and then create an object of the inner class
// 		 ^
// innerPrivateClass.java:14: error: A.B has private access in A
// 		A.B obj1= new A.B();//
