/******************************************************************************

                            
         Multithreading:- It means multiple program can run at one time;
         It can help improve the performance and responsiveness of
         applications, particularly in environments that need to handle
         multiple tasks simultaneously.
                            

*******************************************************************************/
//sleep and priority are two important concepts of thread that help control the behavior of threads during their execution.

public class multithreadSleepAndPriority
{
	public static void main(String[] args) {
	   sleep obj1=new sleep();
	   priority obj2=new priority();
	   //we can set the different priority for the threads, main priority, max priority and normal priority
	   System.out.println(obj2.getPriority());
	   // Set the maximum priority for the priority thread
        obj2.setPriority(Thread.MAX_PRIORITY);  // Set to maximum priority (10)
        
        // Print the priority of the priority thread
        System.out.println("Priority of obj2: " + obj2.getPriority());  // Should print 10
	   
	   //start Thread
	   obj1.start();
	   obj2.start();
	}
}
//Thread class extends

class sleep extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Sleeping...");
// Thread.sleep();//when we call sleep it means you are asking your thread to wait for millisecond, and here without exception handling sleep throws InterruptedException
            try {
                Thread.sleep(10);  // Sleep for 10 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Thread class demonstrating priority
class priority extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Priority...");
            try {
                Thread.sleep(10);  // Sleep for 10 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
