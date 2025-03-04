package Week00;

public class NumbericVariables {
        public static void main(String[] args) {
            //create some int variables
            int zebras = 4;
            System.out.println("There are + zebras + zebras");
            int cats = 6;
            System.out.println("There are + cats + cats");
            //Some math with these ints
            int animals = cats + zebras;
            System.out.println("There are " + animals + " altogether");
            //Print an empty line
            System.out.println();
            //Create a some double and int variables
            double widgetPrice = 4.57;
            int widgetsNeeded = 56;
            double shippingPrice = 22.33;
            double allWidgetCost = widgetPrice * widgetsNeeded;
            System.out.println("Total widget cost: $" + allWidgetCost);
            double widgetsPlusShipping = allWidgetCost + shippingPrice;
            System.out.println("Total with shipping: $" + widgetsPlusShipping);
        }
}
