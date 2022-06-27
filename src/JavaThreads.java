public class JavaThreads extends Thread{

         public static void main(String[] args) {
             //creating a thread by extending the Thread class and overriding its run() method
             //if the class extends the thread class the thread can be run by creating an instance of the class and call its Start() method:

             JavaThreads thread=new JavaThreads();
             thread.start();
             System.out.println("This code is outside of thread");
         }
         public void run(){
             System.out.println("this code is running in a thread");
         }
}
