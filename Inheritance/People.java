public class People {
    private int age;
    private int health;
    private int strength;
    private String theirname;
    
    public People() {
        age = 0;
        health = 100;
        strength = 0;
    }
    public String name(String name) {
        theirname = name;
        return "your name is: " +name;
    }
    public String getName() {
        return theirname;
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
public class Kid extends People {
      public Kid() {
          health = 100;
      }
}