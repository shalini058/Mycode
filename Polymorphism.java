package OOPs;
 
//runtime polymorphism
 
public class Polymorphism {
    public static void main(String[] args) {
        // but here we call two reference for class A and class B also.
       A obj=new A();
       obj.show(); //obj only working when it's inheritance because obj is parent type variable.
       obj=new B();// creating objects.
       obj.show();
    }
}
// All the concept is called dynamic mathod dispatch becuase it's dynamic.
class A{
    public void show(){
        System.out.println("Let's show A");
    }
}
class B extends A{
    @Override // here same method as class A , it's called overriding.
    public void show(){
        System.out.println("Let's show B");
    }
}
