package Test;
//Animal class
class Animal {
 public void makeSound() {
     System.out.println("The animal makes a sound");
 }
}

//Dog class, subclass of Animal
class Dog extends Animal {
 @Override
 public void makeSound() {
     System.out.println("The dog barks");
 }
}

//Cat class, subclass of Animal
class Cat extends Animal {
 @Override
 public void makeSound() {
     System.out.println("The cat meows");
 }
}

//Cow class, subclass of Animal
class Cow extends Animal {
 @Override
 public void makeSound() {
     System.out.println("The cow mooes");
 }
}

//Main class to test the functionality
public class AnimalTest {
 public static void main(String[] args) {
     Animal animal1 = new Dog();
     Animal animal2 = new Cat();
     Animal animal3 = new Cow();

     animal1.makeSound();  // Output: The dog barks
     animal2.makeSound();  // Output: The cat meows
     animal3.makeSound();  // Output: The cow mooes
 }
}
