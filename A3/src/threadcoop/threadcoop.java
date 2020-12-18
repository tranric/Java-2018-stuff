package threadcoop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class threadcoop {
  static Connection conn;
  static Statement stmt;
  private static AnimalFeeding animalFeeding = new AnimalFeeding();
  static int iterate = 0;
  static boolean stop = false;
  static long startTime, endTime;
  static boolean stopDepositThread = false;
  static int depositCount = 0;
  static int animalCount = 0;
  static Thread t = new Thread(new DBOperation());

  public static void main(String[] args) {
	    loadDriver();
	    createConnection();
	    createStatement();
	    insertData();
        startTime = System.currentTimeMillis();
        // Create a thread pool with two threads
      ExecutorService pool = Executors.newFixedThreadPool(2);
      System.out.println("Deposit Food\tFeed Animals\t\tStock Status");
      pool.execute(new DepositFood());
      pool.execute(new FeedAnimal());
    //iterate++;
    //if (iterate > 10) {pool.shutdownNow();}
//iterate++;
    //if(stop == true)
     //   pool.shutdownNow();
    pool.shutdown();
//


    //      try{//t.start();
//    t.join();}
//    catch(Exception e){}
//    {try{
//pool.shutdownNow();} catch(Exception e){}}
////    try {
//        if(pool.awaitTermination(10, TimeUnit.SECONDS)) {
//        System.out.println("task completed");
//    }
//    else{
//        System.out.println("Executor is shutdown now");
//    }}
//    catch(InterruptedException  ex){ }
   // System.out.println("After the pool");



  }

  public static class DepositFood implements Runnable {
    @Override // Keep adding an amount to the animalFeeding
    public void run() {
      try { // Purposely delay it to let the feed method proceed
          endTime = System.currentTimeMillis();
          //while (true) {
          //while (iterate < 50) {
          //while (endTime - startTime < 15000) {
          //while (stop == false) {
          while (!stop) {
              //if(iterate >=10)
              //endTime = System.currentTimeMillis();
              //if((endTime - startTime) >= 15000)
              if(stopDepositThread == true)
              {
                  stop = true;
                  System.out.println("stopped from deposit...");
                  break;
              }

              animalFeeding.depositFood((int)(Math.random() * 10) + 1);
              //depositCount++;
              Thread.sleep(1000);
          //endTime = System.currentTimeMillis();
        //  iterate++;
        //  if (iterate > 50) {Thread.currentThread().stop(); break;}
//          if (iterate > 50) {
//              Thread.currentThread().interrupt();
//              if (Thread.currentThread().isInterrupted()) {
//                    System.out.println("interrupted deposit");
//                    break;}
//          }
          //if (iterate > 50) {Thread.currentThread().terminate(); break;}

          }
              System.out.println("Finished Depositing Task thread...");
              readData();
              deleteData();


      }
      catch (InterruptedException ex) {
        ex.printStackTrace();
      }
    }
  }

  public static class FeedAnimal implements Runnable {
    @Override // Keep subtracting food from food stock
    public void run() {
        int animalCode, requiredFood;
        String[] animals = {"Rhino", "Cow", "Horse", "Zebra", "Deer"};
        //while (true) {
        endTime = System.currentTimeMillis();
        //  while (endTime - startTime < 15000) {
           //while (iterate <50) {
           while (!stop) {
               //if(iterate >=10)
               if(animalCount >= 10)
               //endTime = System.currentTimeMillis();
              //if((endTime - startTime) >= 5000)
               {
                   stop = true;
                   System.out.println("Finished FeedingTask thread....");

                   break;
               }
            animalCode = (int)(Math.random() * 5) + 1;
           if(animalCode==1) requiredFood = 9;
           else if(animalCode==2) requiredFood = 7;
           else if(animalCode==3) requiredFood = 5;
           else if(animalCode==4) requiredFood = 5;
           else requiredFood = 3;
           //account.feed((int)(Math.random() * 10) + 1);
           animalFeeding.feed(requiredFood, animals[animalCode-1]);
           animalCount++;

           //endTime = System.currentTimeMillis();
           //iterate++;
        //    if (iterate > 50) {Thread.currentThread().stop(); break;}
//          if (iterate > 50) {
//              Thread.currentThread().interrupt();
//              if (Thread.currentThread().isInterrupted()) {
//                    System.out.println("interrupted feeding");
//                    break;}
//          }


        //   loop++;
      }
           stopDepositThread = true;
           try{Thread.sleep(1000);}
           catch (InterruptedException ex) {
               ex.printStackTrace();
           }
           t.start();
       // Thread.currentThread().stop();
    }
  }

  // An inner class for animalFeeding
  private static class AnimalFeeding {
    // Create a new lock
    private static Lock lock = new ReentrantLock();

    // Create a condition
    private static Condition newDeposit = lock.newCondition();

    private int foodStock = 0;

    public int getStock() {
      return foodStock;
    }

    public void feed(int demand, String animal) {
      lock.lock(); // Acquire the lock
      try {
        while (foodStock < demand) {
          System.out.println("\t\tWait for food..");
          newDeposit.await();
        }

        foodStock -= demand;
        System.out.println("\t\tFeed " +animal+ " " +demand + "kg" +
          "\t\t" + getStock());
      }
      catch (InterruptedException ex) {
        ex.printStackTrace();
      }
      finally {
        lock.unlock(); // Release the lock
      }
    }

    public void depositFood(int amount) {
      lock.lock(); // Acquire the lock
      try {
        foodStock += amount;
        System.out.println("Deposit " + amount +  "kg"+
          "\t\t\t\t" + getStock());

        // Signal thread waiting on the condition
        newDeposit.signalAll();
      }
      finally {
        lock.unlock(); // Release the lock
      }
    }
  }

  static void loadDriver(){
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          System.out.println("Driver loaded successfully....!!");
      }
      catch (Exception ex){
          System.out.println("Driver load ERROR: " + ex);
      }
  }
  static void createConnection(){
      try{
          conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ZooDB", "root", "toor");
          System.out.println("Connection established....!!");
      }
      catch(SQLException ex){
          System.out.println("Connection  ERROR: " + ex);
      }
  }

  static void createStatement(){
      try{
      stmt = conn.createStatement();
      System.out.println("Statement created successfully....!!! ");
      }
      catch(SQLException ex){
          System.out.println("Statement  ERROR: " + ex);
      }
  }

static void insertData(){
    String insertQuery1 = "insert into FeedingData values ('Rhino', '0')";
    String insertQuery2 = "insert into FeedingData values ('Cow', '0')";
    String insertQuery3 = "insert into FeedingData values ('Horse', '0')";
    String insertQuery4 = "insert into FeedingData values ('Zebra', '0')";
    String insertQuery5 = "insert into FeedingData values ('Deer', '0')";
    try{
        stmt.executeUpdate(insertQuery1);
        stmt.executeUpdate(insertQuery2);
        stmt.executeUpdate(insertQuery3);
        stmt.executeUpdate(insertQuery4);
        stmt.executeUpdate(insertQuery5);
         System.out.println("Data inserted.....!!");
    }
    catch(SQLException ex){
         System.out.println("Insertion  ERROR: " + ex);
    }
   }
static void readData(){
    String readQuery = "select * from FeedingData";
    //String readQuery1 = "select animalName, MAX(amountFed) from FeedingData group by amountFed";
    try{
        ResultSet rs = stmt.executeQuery(readQuery);
        while(rs.next()){
            String cName = rs.getString(1);
            int cid = rs.getInt(2);

            System.out.println(cName + " " + cid);

        /*ResultSet rs1 = stmt.executeQuery(readQuery1);
        while(rs1.next()){
        	String aName = rs1.getString(1);

        	System.out.println("Highest amount of food consumed by: " + aName);
        } */
        }

    }
    catch(SQLException ex){
        System.out.println("Data read  ERROR: " + ex);
    }
}

static void deleteData(){
    String deleteQuery = "delete from FeedingData";
    try{
        stmt.executeUpdate(deleteQuery);
        System.out.println("Deleted successfully....!!");
        readData();
    }
    catch(SQLException ex){
        System.out.println("Deletion ERROR: " + ex);
    }
}
}

