public class NumOfObj{
    static int count = 0;

    public NumOfObj(){
        count++;
    }
    
    public static void main(String[] args) {
        NumOfObj obj1 = new NumOfObj();
        NumOfObj obj2 = new NumOfObj();
        NumOfObj obj3 = new NumOfObj();
        NumOfObj obj4 = new NumOfObj();
        NumOfObj obj5 = new NumOfObj();

        System.out.println("Number of objects created: " +count);
    }
}