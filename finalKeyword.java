package OOPs;
//final- method, variable, class
public class finalKyeword {
public static void main(String[] args) {
final int a=9;
// a=10;// here we see using final keyword in variable its constant, and after we again assign value in "a" it's getting error.
System.out.println(a);

demo obj=new demo();
obj.Add(5, 6);
obj.show();
}
}
// let's make class as final class
//if we use final for class it becomes constant we cannot inherit another class from the demo class .
final class demo{

// here using final my method become constant , so no one copying my method in another inherit class. Or no one can override my method.
public final void show(){
System.out.println("in demo show");
}
public void Add(int a, int b){
System.out.println(a+b);
}
}
