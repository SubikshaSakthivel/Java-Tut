public class RunnableIntf { 
  public static void main(String[] args) { 
  Thread borrowingThread = new Thread(new BorrowingTask(), "Borrowing Thread");
  Thread returningThread = new Thread(new ReturningTask(), "Returning Thread"); 
  borrowingThread.start(); 
  returningThread.start(); 
  } 
  static class BorrowingTask implements Runnable { 
  public void run() { 
  for (int i = 1; i <= 5; i++) { 
  System.out.println("Borrowing ice cream " + i); 
  try { 
  Thread.sleep(1000); 
  } catch (InterruptedException e) { 
  e.printStackTrace(); 
  } 
  } 
  } 
  } 
  static class ReturningTask implements Runnable { 
  public void run() { 
  for (int i = 1; i <= 5; i++) { 
  System.out.println("Returning ice cream" + i); 
  try { 
  Thread.sleep(1500); 
  } catch (InterruptedException e) { 
  e.printStackTrace(); 
  } 
  } 
  }
  
  } 
  } 
  