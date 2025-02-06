/******************************************************************************
Threads: Threads in Java allow executing multiple tasks simultaneously,
improving efficiency by performing multiple actions concurrently and
utilizing resources better.

There are two ways to create a thread.

first extending the thread class and overriding its run() method

second create a thread is to implement the Runnable interface.
                           
*******************************************************************************/
//Extending the Thread class from the Main class


//Example of threads but with concurrency problem because amount is unpredictable.
public class MyThread extends Thread
{
    public static int amount=0; //take variable amount initialized with 0
    
	public static void main(String[] args)
	{
	    MyThread thread=new MyThread(); //Create an object of the Main class (which extends Thread)
	    
	    System.out.println(amount); //Print initial amount (0) before starting the thread
	    
	    thread.start(); //start thread , calling threads with start() method
	    
	    System.out.println(amount);// Print the amount after thread starts (still 0 because thread execution is not completed yet)
	    
	    amount++;// Increment amount in the main thread
	    
		System.out.println(amount);// 1,2;
	}
	 
	public void run(){ //Overridden run() method where thread code is written
	    amount++; //Increment amount in the new thread
	    
	}
}


// But in threads, there are concurrency problems such as data inconsistency, 
// race conditions, and thread interference when multiple threads access shared resources 
// simultaneously without proper synchronization.
