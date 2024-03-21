public class Animal {
    private String name;
    private static int animalCount = 0;
    private static int totalLegs = 0;
    private String type;
    private int legCount;

    public Animal(String name, String type, int legCount) {
        this.name = name;
        this.type = type;
        this.legCount = legCount;
        Animal.animalCount++;
        Animal.totalLegs += legCount;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public static int getTotalLegs() {
        return totalLegs;
    }

    public int getLegCount() {
        return legCount;
    }

    public static int getTypeCount(String type) {
        int count = 0;
        try {
            Class<?> clazz = Class.forName(type);
            count = ((Animal) clazz.newInstance()).getLegCount();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return count;
    }
}
 class Lion extends Animal {
    public Lion() {
        super("Lion", "Feline", 4);
    }
}
 class Tiger extends Animal {
    public Tiger() {
        super("Tiger", "Feline", 4);
    }
}