import java.util.*;
public class PartAEighteen{
    public static void main(String[] args) {
       
        int m;
        //  m = x*y;
        //     System.out.println(m);
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            m = x*y;
            System.out.println(m);
        } catch (Exception e) {
                System.out.println("Error:invalid datatype");
        }
        System.out.println("Helloww");
    }
}