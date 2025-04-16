package AnimalPrototype;
// Concrete Prototype: Sheep
public class Sheep implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Sheep(int legs, String sound, String food, String name) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.name = name;
    }

    // Copy constructor (for creating a new Sheep from an existing one)
    public Sheep(Sheep otherSheep) {
        this.legs = otherSheep.legs;
        this.sound = otherSheep.sound;
        this.food = otherSheep.food;
        this.name = otherSheep.name;
    }

    @Override
    public Sheep clone() {
        // Using the copy constructor for a deep copy
        return new Sheep(this);
        // Alternatively, you could manually create a new instance and copy fields:
        // Sheep clonedSheep = new Sheep(this.legs, this.sound, this.food, this.name);
        // return clonedSheep;
    }

    @Override
    public void makeSound() {
        System.out.println(name +" says "+sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
