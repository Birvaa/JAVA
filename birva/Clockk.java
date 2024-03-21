import java.lang.*;
import java.util.*;
import java.io.*;

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
class Thread2 implements Runnable{
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
public class Clockk{
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());
        t.start();
        Thread u = new Thread(new Thread2());
        u.start();
    }
}