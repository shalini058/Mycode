//interface:- another way to acheive abstraction.

//Java does not support "multiple inheritance" (a class can only inherit from one superclass).
//but In java, it can be achieved with interfaces, because the class can implement multiple interfaces.
public class multipleInterface
{
	public static void main(String[] args) {
	   Animal obj;//it is not possible to create an "Animal" object in the MyMainClass
	   puppy obj1=new puppy();
	   obj1.sound();
	   obj1.eat();
	}
}

interface Animal //multiple interface
{ 
    public void sound();//In interface, it does not have body
    
}

interface dog
{
    public void eat();//interface method.
}

class puppy implements Animal,dog{ //to implement multiple interface, separate them with a comma.

   //The body sound is provided here. Whenever we use to implements the interface, then it becomes compulsory for you to define both methods.
    public void sound(){
        System.out.println("Animal sound");
    }
    
    //If we fail to define the both methods our class becomesby default abstract.
    public void eat(){
        System.out.println("Animal Eat");
    }
}
