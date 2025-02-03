/******************************************************************************

Basically Exception handling in Java involves five main techniques. 
Try(trying to handle the error), 
catch (if try will fail to execute the code and throws an error then catch will catch it and execute the code without stopping it), 
throw( it will allow us to create an custom error, used to throw an error like allowing us to define our own error),
throws(if user cannot handle a certain exception and wants to pass it to the caller(JVM or Main)
then throws is going to handle it exception) and
finally(used to execute code that must run whether an exception occurs or not (like cleanup), it runs after try or catch). 

These are the exception handling techniques.


*******************************************************************************/

public class finallyExceptionHandling
{
	public static void main(String[] args) {
		int a=8;
		int b=0;
		
		try{
		    b=a/b;// this will throw an ArithmeticException because 8/0 is not possible.
		    System.out.println(b);//not executed due to exception
		}
		catch(Exception e)//catch the exception and execute the code
		{
		    System.out.println("Throw an Arithmetic Exception");
		}
		finally{
		    System.out.println("Run the code"); //Here this will always execute whether error found or not 
		}
		
		if(a<10)
		{
		    //this is an example of throw , which define a custom error
		    throw new ArithmeticException("value of is less than 10 it throws an error"); 
		}
		else{
		    System.out.println("here value is equals or greater");
		}
	}
}

//output of the code
// Throw an Arithmetic Exception
// Run the code
// Exception in thread "main" java.lang.ArithmeticException: value of is less than 10 it throws an error
// 	at finallyExceptionHandling.main(finallyExceptionHandling.java:27)
