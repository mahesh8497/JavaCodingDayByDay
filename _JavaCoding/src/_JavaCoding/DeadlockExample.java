package _JavaCoding;


class ResourceA {}
class ResourceB {}
public class DeadlockExample {
public static void main(String[] args) 
{
	   ResourceA resourceA = new ResourceA();
       ResourceB resourceB = new ResourceB();
       
       Thread t1=new Thread(()->{
    	   synchronized (resourceA) {
			System.out.println("Thread1: locked resourseA");
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			synchronized (resourceB) {
				System.out.println("Thread2: locked resourseB");
			}
		}
       });
       
      Thread t2=new Thread(()->{
    	  synchronized (resourceB) {
    		  System.out.println("Thread2 locked resourseB");
    		  try {
				Thread.sleep(10000);
			} catch (Exception e) {
				// TODO: handle exception
			}
    		  synchronized (resourceA) {
				System.out.println("Thread2 locked resourseA");
			}
			
		}
      });
      t1.start();
      t2.start();
       }
}
