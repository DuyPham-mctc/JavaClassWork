package Week00;

public class PizzaRoll {
    public static void main(String[] args) {
        // Sharing pizza rolls fairly between people
        double pizzaRolls = 40; // Number of pizza rolls in a packet
        int people = 7;
        double rollsPerPerson = pizzaRolls / people;
        System.out.println("Each person gets " + rollsPerPerson + " pizza rolls.");
    }
}
