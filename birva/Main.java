public class Main {
    public static void main(String[] args) {
        Lion lion1 = new Lion();
        Lion lion2 = new Lion();
        Tiger tiger1 = new Tiger();
        Tiger tiger2 = new Tiger();

        System.out.println("Number of animals: " + Animal.getAnimalCount());
        System.out.println("Total number of legs: " + Animal.getTotalLegs());
        System.out.println("Number of feline animals: " + Animal.getTypeCount("Feline"));
    }
}