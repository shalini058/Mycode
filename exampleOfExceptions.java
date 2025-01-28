/******************************************************************************

                Exception: When executing Java code, different errors can occur
                coding errors made by the programmer, errors due to wrong input, 
                       or other unforeseeable things.

*******************************************************************************/
//If the statement is critical, then to handle the exception we need to try to execute the code.

//Arithmetic Exception

public class exampleOfExceptions
{
	public static void main(String[] args) {
		int a=9;
		int b=3;
		//It's trying to handle the errors in java.
		try
		{
		    //if b=0 then it will throw an error.
		    System.out.println(a/b); //If java tries to execute the code and there will be an error then it will throw the error.
		}
		
		//It will catch the error. 
		catch(Exception e)//here you will create an object or you will refer that with an exception class
		{
		    System.out.println("there is something wrong...");//If try block is not working then catch will be execute the code.
		}
		
		System.out.println(b);
	}
}

