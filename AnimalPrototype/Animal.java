package AnimalPrototype;
//interface
// Prototype Interface
public interface Animal extends Cloneable {
    Animal clone();
    void makeSound();
    String getType();
}