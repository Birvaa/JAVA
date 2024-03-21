import java.util.*;
class Animal{
    String name;
    static int noOfAnimal=0;
    static int typeOfAnimal=0;
    int legOfAnimal;
    Animal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of animal:");
        name = sc.next();
        noOfAnimal++;
        
    }
}
class Lion extends Animal{
    final int leg=4;
    static int noOfLion=0;
    Lion(){
        noOfLion++;
        System.out.println("No of Lion:"+noOfLion);
        if(noOfLion==1){
            typeOfAnimal++;
        }
    }

}
class Tiger extends Animal{
    final int leg=4;
    static int noOfTiger=0;
    Tiger(){
        noOfTiger++;
        System.out.println("No of Tiger:"+noOfTiger);
        if(noOfTiger==1){
            typeOfAnimal++;
        }
    }
}
public class Animals{
    public static void main(String[] args) {
        Animal l1= new Lion();
        Animal t1= new Tiger();
        System.out.println("typeOfAnimal"+t1.typeOfAnimal);
        System.out.println("noOfAnimal"+t1.noOfAnimal);

    }
}