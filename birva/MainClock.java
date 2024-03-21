class clock1 extends Thread
{
    clock1(String s)
    {
        super(s);
    }
    public void run()
    {
        while(true){
            
            System.out.println(test+" :- Good Morning");       
            try
            {
                Thread.currentThread().sleep(1000);
            }
            catch(InterruptedException e)
            {}
        }
    }
}
class clock2 extends Thread
{
    clock2(String s)
    {
        super(s);
    }
    public void run()
    {
        while(true)  {
            String test = Thread.currentThread().getName();
            System.out.println(test+":- Good Afternoon");       
            try
            {
                Thread.currentThread().sleep(3000);
            }
            catch(InterruptedException e)
            {}
        }
    }
}
class MainClock
{
    public static void main(String args[])
    {
        System.out.println("\nThrean name:"+Thread.currentThread().getName());
        System.out.println("\n");
        clock1 obj1=new clock1("Thread 1");
        clock2 obj2=new clock2("Thread 2");
        obj1.start();
        obj2.start();
    }
}
 