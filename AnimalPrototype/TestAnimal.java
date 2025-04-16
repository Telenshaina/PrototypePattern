package AnimalPrototype;
// Client
public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal sheep1 = registry.createSheep();
        System.out.println("Sheep 1 (cloned): Type = " + sheep1.getType());
        sheep1.makeSound();

        Animal cow1 = registry.createCow();
        System.out.println("Cow 1 (cloned): Type = " + cow1.getType());
        cow1.makeSound();

        Animal horse1 = registry.createHorse();
        System.out.println("Horse 1 (cloned): Type = " + horse1.getType());
        horse1.makeSound();

        Animal sheep2 = registry.createSheep("Bella");
        System.out.println("Sheep 2 (cloned and modified): Type = " + sheep2.getType() + ", Name = " + ((Sheep) sheep2).getName());
        sheep2.makeSound();
    }
}