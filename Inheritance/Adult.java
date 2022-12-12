public class Adult extends People
{
    public Adult() {
        health = 75;
        strength = 100;
        if (age < 50 && age >= 18) {
            isAdult = true;
        }
    }
}