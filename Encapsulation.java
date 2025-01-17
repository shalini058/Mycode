package OOPs; //A package in java is used to group related classes like a folder in a file directory.

//Encapsulation:- where data in binded , like data stored in a capsule form. Only show necessary things.
class User {
    private String name; //private access modifier to do it private and only accessible in same class
    private int age;

    // Constructor to initialize name and age
    public User(String name, int age) {
        this.name = name; // using this keyword we are able to refer the current objects.
        this.age = age;
    }

    // Getter method for return the variable name.
    public String getName() {
        return name;
    }

    // Setter method for set the value of name;
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age can't be negative");
        }
    }

    // Method to display user details
    public void showUserDetails() {
        System.out.println("User Name: " + name);
        System.out.println("User Age: " + age);
    }
}

public class Encapsulation { //It is main class which has a name Encapsulation.
    public static void main(String[] args) {
        // Initialize User object with name and age in the constructor
        User obj = new User("Ram",25);
        
        // Set age (if necessary)
        obj.setAge(25);
        

        // Display user details
        obj.showUserDetails();
    }
}
