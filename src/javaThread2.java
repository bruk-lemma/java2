public class javaThread2 implements Runnable{
    public static  int amount=0;

    public  static void main(String[] args){
        javaThread2 thread=new javaThread2();
        Thread thread1=new Thread(thread);
        thread1.start();
        System.out.println("This code is outside of the thread");
    }
    public void run(){
        System.out.println("This code is running in a thread");
    }
}
