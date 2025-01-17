package OOPs;


//Inheritance

class Calculator 
{ // here calculator is parent class where add, sub, multiply, and divide extends from the calculator.
protected double result; //protected:- if it is in same package then it's work.


public Calculator() // Constructor initializes result to 0
{
result = 0;
}

public double getResult() // Method to get the result of operations
{
return result;
}

public void clear() //for clear the result for reset it 0 again.
{
result = 0;
}
}
class Add extends Calculator
{ // here addion, sub, multiply, and divide are child class which are accessing the features from parent class.
public void add(double a, double b) //add method
{ //here we want value in points also , like (1/2)+(1)=1.5; we want full answer after point that's why we use double.
result = a + b;
}

}
class Subtract extends Calculator{
public void subtract(double a, double b){ //subtract method
result=a-b;
}
}
class Multiplication extends Calculator{
public void multiplication(double a, double b){
result=a*b;
}
}
class Divide extends Calculator{
public void divide(double a, double b){
if (b != 0) {
result = a / b;
} else {
System.out.println("Error: Division by zero");
}
}
}
public class Inheritance {

public static void main(String[] args) {
Add addOperation = new Add(); //addOperation is an object ,to create an object of Main(which is my main class, Inheritance), specify the class name, followed by the object name, and use the keyword new.
Subtract subtractOperation = new Subtract();
Multiplication multiplyOperation = new Multiplication();
Divide divideOperation = new Divide();

// Perform addition  
addOperation.add(10, 5);
System.out.println("Addition Result: " + addOperation.getResult()); // 10 + 5 = 15

  
// Perform subtraction
subtractOperation.subtract(10, 5);
System.out.println("Subtraction Result: " + subtractOperation.getResult()); // 10 - 5 = 5
  
// Perform multiplication
multiplyOperation.multiplication(10, 5);
System.out.println("Multiplication Result: " + multiplyOperation.getResult()); // 10 * 5 = 50

  
// Perform division
divideOperation.divide(10, 5);
System.out.println("Division Result: " + divideOperation.getResult()); // 10 / 5 = 2.0

  
// Attempt division by zero
divideOperation.divide(10, 0);
}
}
