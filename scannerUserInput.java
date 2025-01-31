/******************************************************************************

         Using java.util.* we can call classes and interfaces 
         from the java.util package into the current Java file.
The asterisk (*) is a wildcard character, which means "import everything" from the java.util package.

*******************************************************************************/
//import java.util.Scanner; // Import the only Scanner class
import java.util.*;// Its an import statement 
public class scannerUserInput
{
	public static void main(String[] args) {
	    //Scanner class is used to get input from the user.
	    Scanner sc=new Scanner(System.in); //we create sc as a scanner object.
	    System.out.println("Take input from user: ");
	    int a=sc.nextInt(); //here we read an input from the user where a=9
	    int b=sc.nextInt();//b=8
	    
	    
	    int sum=a+b; //sum of a+b =17;
		System.out.println("Total input sum: "+sum);//At last it prints the sum of a and b, return 17;
	}
}


//Take input from user: 
// 9
// 8
// Total input sum: 17 
