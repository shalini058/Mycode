public class abstractionInterface
{
	public static void main(String[] args) {
	   Animal obj;//it is not possible to create an "Animal" object in the MyMainClass
	   dog obj1=new dog();
	   obj1.sound();
	   obj1.eat();
	}
}
//interface
interface Animal
{ 
    public void sound();//In interface, it does not have body
    public void eat();//interface method.
}

//implements keyword instead of extends.
class dog implements Animal
{ 
   //The body sound is provided here. Whenever we use to implements the interface, then it becomes compulsory for you to define both methods.
    public void sound()
  {
        System.out.println("Animal sound");
    }
    
    //If we fail to define the both methods our class becomesby default abstract.
    public void eat()
  {
        System.out.println("Animal Eat");
    }
}
