// Prototype Registry
public class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry() {
        sheepPrototype = new Sheep(4, "Baa", "Grass", "Dolly");
        cowPrototype = new Cow(4, "Moo", "Hay");
        horsePrototype = new Horse(4, "Neigh", "Oats", "Brown");
    }

    public Animal createSheep() {
        return sheepPrototype.clone();
    }

    public Animal createCow() {
        return cowPrototype.clone();
    }

    public Animal createHorse() {
        return horsePrototype.clone();
    }

    public Animal createSheep(String name) {
        Sheep clonedSheep = (Sheep) sheepPrototype.clone();
        clonedSheep.setName(name);
        return clonedSheep;
    }
}