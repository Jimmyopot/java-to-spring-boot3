package Youtube;

public class EncapsulationMain {
    public static void main(String[] args) {
        // Encapsulation means capsules from medicine
        // Keeping something inside, close and no one can see the contents
        // This is everything about PRIVACY

        Human human1 = new Human(13, "Julie");
        System.out.println(human1.getAge() + " " +  human1.getName());
    }
}

class Human {
    //Private means you can't access the variables outside this class!
    private int age; // instance variable
    private String name;

    //With this functions however, you can access the age
    // GETTERS AND SETTERS
    public int getAge() {
        return age;
    }
    public void setAge(int age) { //local variable
        this.age = age; // so this.age represents an instance variable, not local
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
}