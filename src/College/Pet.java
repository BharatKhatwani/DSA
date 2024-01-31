package College;
/*
Create a class to represent a Pet type in java, which should have the following fields:
name. Instance variable of type String that holds the name of a pet.
animal. Instance variable of type String that holds the type of animal that a pet is.
age. Instance variable of type int holds the pet's age.
The Pet class should also have the following methods:
constructor for this class. The constructor should accept an argument for each of the fields.
setName, The setName method stores a value in the name field.
setAnimal. The setAnimal method stores a value in the animal field.
setAge. The setAge method stores a value in the age field.
getName. The getName method returns the value of the name field.
getAnimal. The getAnimal method returns the value of the animal field.
getAge. The getAge method returns the value of the age field.

 */
public class Pet {
    public String name;
    public String animal;
    public int age;

    public void setclass(String name) {
        this.name = name;

    }

    public Pet() {
        this.name = "xyz";
        this.animal = "not defined ";
        this.age = 45;
    }

    public Pet(String name, String animal, int age) {
        this.name = name;
        this.animal = animal;
        this.age = age;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setanimal(String animal) {
        this.animal = animal;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getname()

    {
        return name ;
    }

    public String getAnimal() {
        return animal;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {


        // Create a Pet object and initialize its fields
        Pet myPet = new Pet("Buddy", "Dog", 3);

        // Get and display the pet's information
        System.out.println("Name: " + myPet.getname());
        System.out.println("Animal: " + myPet.getAnimal());
        System.out.println("Age: " + myPet.getAge());

        // Update the pet's name and age
        myPet.setname("Lucky");
        myPet.setAge(4);

        // Display the updated information
        System.out.println("\nUpdated Name: " + myPet.getname());
        System.out.println("Updated Age: " + myPet.getAge());

    }
}