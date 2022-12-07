public class People {
    private int age;
    private int strength;
    String name;
    
    public People() {
        age = 0;
        strength = 0;
    }
    public void eat() {
        strength += 10;
    }
    public int getAge(){
        return age;
    }
    public void ageTenYears() {
        age += 10;
    }
    public void workout() {
        strength += 20;
        
    }
}