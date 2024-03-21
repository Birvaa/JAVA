interface A{
    int a=10;
    public void Sum();
}
interface A1 extends A{
    int b=1;
    public void Sub();
}
interface A2 extends A{
    int c=1;
    public void Multi();
}
class B implements A1,A2{
    public void Sum(){
        System.out.println("sum="+a);
    }
    public void Sub(){
        System.out.println("sub="+b);
    }
    public void Multi(){
        System.out.println("Multi="+c);
    }

}
public class Interface{
    public static void main(String[] args) {
        B b = new B();
        ((A)b).Sum();
        ((A1)b).Sub();
        ((A2)b).Multi();

    }
}