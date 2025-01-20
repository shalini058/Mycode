class abstractKeyword
{
	public static void main(String[] args) {
	   //Animal obj=new Animal();//It's generate an error because abstract class cannot be used create object.
	   dog obj=new dog();//I create a dog Object
	   obj.makeSound();
	   obj.eat();
	}
}

//In abstraction , abstraction can be achieved with abstract classes or interface.
abstract class Animal{
   // public void eat();//here i got error because it does not have a body and body is provided by the subclass(child class or inherited from), for this we have to declare abstract method
    public abstract void eat();// decalared abstract method but if you have an abstract method , can belong to only abstract class.
    public void makeSound(){
        System.out.println("makeSound");
    }
}
class dog extends Animal{
    public void eat(){ //the body of eat is provided here
        System.out.println("Eating");
    }
}
