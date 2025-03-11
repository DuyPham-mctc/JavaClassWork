package Week02;

public class Arrays {
    public static void main(String[] args) {
        // Create an array called scores
        // to store 10 int variables
        int[] scores = new int[10];
        scores[0] = 98;
        scores[7] = 76;
        scores[4] = 54; //Can edit in any order
        scores[9] = 98; // The last element
        scores[10] = 87; //ERROR
        scores[-1] = 92; //ERROR
        //Or, you can also create the array this way
        //The previous version is more common
        int credits[] = new int[10];
        //Create an array called data to store 3 ints
        int[] data = new int[3];
        data[0] = 10;
        data[1] = 15;
        data[2] = 8;
        //Print first element
        System.out.println("first element= " +
                data[0]);
        //Store second element in another variable
        int secondElement = data[1];
        //Store last element in another variable
        int lastElement = data[2];
        //Use a variable to specify the size of array
        int size = 10;
        int[] moreData = new int[size];
        //Create an array called names to store 100 Strings
        String[] names = new String[100];
        //Create an array called prices to store 70 doubles
        double[] prices = new double[70];
        //Put your data in curly brackets, separated by commas
        String[] languages = {"Java", "Python", "C#"};

        //Use arrayname.length to measure an array
        //The length is an int value
        // Create a string array, initialized with data
        String[] classrooms = { "T3010", "T3020", "T3030", "T3040", "T3050", "T3080"};
        // How many elements in the array? What's the size or length of the array? -
        int numberOfClassrooms = classrooms.length;
        System.out.println("There are "+ numberOfClassrooms +" classrooms");

        //Use a loop to print all of the data from the array
        //Notice how the loop counter is used
        for (int x = 0; x < 6; x++) {
            System.out.println(classrooms [x]);
        }

        //Printing an entire array
        // Example int array
        int[] classroomNumbers = { 3010, 3020, 3030, 3040, 3050, 3080 };
        // Try to print array
        System.out.println(classroomNumbers);
        // Oh no! What does this print?
        //If you want the array data, use this, System.out.println(Arrays.toString(classroomNumbers));
        // You can also use a loop to print all of an array
        for (int x = 0; x < classroomNumbers.length; x++) {
            System.out.println(classroomNumbers[x]);
        }
    }
}
