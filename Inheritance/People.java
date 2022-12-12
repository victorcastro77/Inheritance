public class People {
    public boolean isKid;
    public boolean isAdult;
    public boolean isElder;
    public int age;
    public int health;
    public int strength;
    
    public People() {
        age = 0;
        health = 100;
        strength = 0;
    }
    public void eat() {
        health += 10;
    }
    public int getAge(){
        return age;
    }
    public void ageTenYears() {
        age += 10;
        health -= 10;
    }
    public void workout() {
        strength += 20;
    }
}
