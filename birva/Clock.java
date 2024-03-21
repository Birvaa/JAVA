import java.util.*;
import java.lang.Thread;
class MyThread implements Runnable{
    public void run(){
        while(true){
            System.out.println("good morning");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
class MyThread implements Runnable{
    public void run(){
        while(true){
            System.out.println("good Afternoon");
            try{
                Thread.sleep(3000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class Clock{
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());
        m.start();
        Thread u = new Thread(new MyThread());
        u.start();
    }
}