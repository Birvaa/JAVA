public class NumberOfObjects {
    static int count = 0;

    public NumberOfObjects() {
        count++;
    }
    
    public static void main(String[] args) {
        NumberOfObjects obj1 = new NumberOfObjects();
        NumberOfObjects obj2 = new NumberOfObjects();
        NumberOfObjects obj3 = new NumberOfObjects();
        NumberOfObjects obj4 = new NumberOfObjects();
        NumberOfObjects obj5 = new NumberOfObjects();

        System.out.println("Number of objects created: " +count);
    }
}