class iceCreamThread extends Thread { 
  private String ice; 
  public iceCreamThread(String ice) { 
  this.ice = ice; 
  } 
  public void run() { 
  System.out.println("Ice cream '" + ice + "' is bought in " +Thread.currentThread().getId()); 
  try {
  Thread.sleep(2000); // Simulating some time taken for issuing the book 
} 
  catch (InterruptedException e) { 
  System.out.println("Thread interrupted: " + ice); 
  }
  System.out.println("ice Cream '" + ice + "' has bought and paid successfully!"); 
  } 
  } 
  public class ExtendingThread { 
  public static void main(String[] args) { 
  iceCreamThread thread1 = new iceCreamThread("pistah"); 
  iceCreamThread thread2 = new iceCreamThread("chocolate"); 
  thread1.start(); 
  thread2.start(); 
  } 
  } 
  