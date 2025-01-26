//Enum or Enumeration, it means specifically listed.
//An enum is a special "class" which represents a group of constants(unchangeable variables, like final variable).

public class demoOfEnum

{
	public static void main(String[] args) {
	    Example eg= Example.CAR;// using dot we can access enum constants.
	    System.out.println(eg.ordinal());// using ordinal we find order of enum constants. 
	    System.out.println(eg);
	    
	    //using for loop we return the enum array.
	    for(Example ss:Example.values())//enum type has a values() method, which returns an array of all enum constants
	    {
	        System.out.println(ss +" : "+ ss.ordinal());// here it's return constants and their order.
	    }
	  
	}
}


//To create an enum, use the enum keyword (instead of class or interface).
 enum Example
 {
     //separate the constants with a comma and they should be upperclass.
     CAR,
     SPEED,
     TIME
 }
 
