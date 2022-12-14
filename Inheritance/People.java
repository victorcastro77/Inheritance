public class People {
    public boolean isKid;
    public boolean isAdult;
    public boolean isElder;
    public int age;
    public int health;
    public int strength;
    
    public People() {
        health = 100;
        strength = 0;
    }
    public void eat() {
        health += 10;
    }
    public void workout() {
        strength += 20;
    }
    public void getAgeCategory() {
        if (isKid = true) {
            System.out.println("I am a kid.");
        }
        if (isAdult = true) {
            System.out.println("I am an adult.");
        }
        if (isElder = true) {
            System.out.println("I am an elder.");
        }
    }
    
}
