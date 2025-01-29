/*
Ducking Exception:- An Exception refers to avoiding directly handling it (i.e., catching it)
in our code and instead allowing it to be handle else where. */

//Ducking the Exception for the particular method but it is done with the help of throws Keyword.

import java.io.*; //Import all classes from java.io package (Input/Output)

class Demo { 
    
    // Method that throws an ClassNotFoundException (it is Checked Exception).
      public void show() throws ClassNotFoundException
      //use throws when a method cannot handle a certain exception and wants to pass it to the caller (like JVM).
      {
          Class.forName("ThrowsExample"); // we check class name if class name is wrong then printStackTrace is calling
      }
    }
    public class ThrowsExample {
        
    // Static block to be executed when the class is loaded
        static
        {
            System.out.println("Class Loaded");
        }

    public static void main(String[] args) {
        Demo obj = new Demo();

        // Calling the show method, which throws an ClassNotFoundException
       try{
           obj.show();
       }
       catch(ClassNotFoundException e){
           e.printStackTrace();
       }
    }
}
