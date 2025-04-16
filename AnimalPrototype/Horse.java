package AnimalPrototype;
// Concrete Prototype: Horse
public class Horse implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String color;

    public Horse(int legs, String sound, String food, String color) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.color = color;
    }

    // Copy constructor
    public Horse(Horse otherHorse) {
        this.legs = otherHorse.legs;
        this.sound = otherHorse.sound;
        this.food = otherHorse.food;
        this.color = otherHorse.color;
    }

    @Override
    public Horse clone() {
        return new Horse(this);
    }

    @Override
    public void makeSound() {
        System.out.println("Horse says " +sound);
    }

    @Override
    public String getType() {
        return "Horse";
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}