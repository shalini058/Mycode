public class annotationExample
{
	public static void main(String[] args) {
	    Dog obj= new Dog();
	    obj.eat();
	    obj.noa();
	}
}
//Animal class as deprecated Annotation, meaning it's outdated and might be removed in future versions.
@Deprecated
 class Animal{
     String eat; // Declares an instance variable 'eat' (not used here)
     
      public void noa() // Method 'noa' which prints "5"
      { 
          System.out.println("5");
      }
 }
 
 //Dog extends from Animal, inheriting methods and properties from parent class.
 class Dog extends Animal
 {
     public void eat(){
         System.out.println("eating");
     }
     
     //here overrides the superclass method, It's an Override Annotation.
     @Override
     public void noa() //Overriding the 'noa' method from Animal class
     {
         System.out.println("5");
     }
 }
