/******************************************************************************

                            
        Basically in java, there is no built-in class for date and time ,
        but we can import using java.time package to work with the
        date and time API.
                            
*******************************************************************************/
import java.time.LocalDate;//import date using java.time package
import java.time.LocalTime;//import time using java.time package.
public class timeDatePackage
{
	public static void main(String[] args){
	    LocalDate myDate=LocalDate.now(); // create an object for the date and now for present(Today) date.
	    System.out.println(myDate);// return 2.2.2025
	    LocalTime mytime=LocalTime.now(); //create an object for the time and now for present time.
	    System.out.println(mytime);//  return HH-mm-ss-ns
	      
	}
}
