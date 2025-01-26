//Enum or Enumeration, it means specifically listed.
//An enum is a special "class" which represents a group of constants(unchangeable variables, like final variable).

public class demoOfEnum

{
	public static void main(String[] args) {
	    Example eg= Example.CAR;// using dot we can access enum constants.
	    System.out.println(eg.ordinal());// using ordinal we find order of enum constants. 
	    System.out.println(eg); //eg holds an object of type Example
	    
	    //using for loop we return the enum array.
	    for(Example ss:Example.values())//enum type has a values() method, which returns an array of all enum constants
	    {
	        System.out.println(ss +" : "+ ss.ordinal());// here it's return constants and their order.
	    }
 // In enum, we used switch statement to check for corresponding values.
		switch(eg) //eg 
		{ 
			case CAR:
				System.out.println("It's running"); //If 'eg' is equal to 'Example.CAR'.
				break;
			case SPEED:
				System.out.println("It's in normal speed");
				break;
			case TIME: // along this we can use default because its last.
				System.out.println("It's 7:03 pm");
				break;
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
 
