public class Kid extends People {
      private int n;
      public Kid() {
          super();
          n = age;
          health = 100;
          strength = 50;
          if (age < 18) {
              isKid = true;
          } else if(age >= 18) {
              isKid = false;
              isAdult = true;
          }
      }
}