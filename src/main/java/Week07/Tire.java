package Week07;

public class Tire {
        private String name;
        private double price;
        private int warrantyMiles;

        public Tire(String name, double price, int warrantyMiles) {
            this.name = name;
            this.price = price;
            this.warrantyMiles = warrantyMiles;

        }

        public double pricePer1000Miles() {
            /* Calculates price per 1000 miles, assuming the tire will last the number of miles it is warrantied for */
            return (price / (double) warrantyMiles ) * 1000;
        }

        public double costForSet() {
            /* Returns how much 4 tires cost */
            return price * 4;
        }

        @Override
        public String toString() {
            return String.format("%s costs %.2f and has a warranty of %d miles. Cost per 1000 miles is $%.2f", name, price, warrantyMiles, pricePer1000Miles());
        }

}
