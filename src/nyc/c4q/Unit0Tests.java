package nyc.c4q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Unit0Tests {

    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     */
    public static void main (String args[]) {
      // Use main to test your methods
        bonusPrintOutSumOfFirstTenFibonacciNumbers();



    }

    public static void printHelloWorld() {
      System.out.println("Hello World");
    }

    public static boolean returnPrimitiveBooleanTrue() {
      return true;
    }

    public static int returnPrimitiveInt1729() {
      return 1729;
    }

    public static double returnPrimitiveDoubleThreePointOneFour() {
      return 3.14;
    }

    public static char returnPrimitiveCharZ() {
        return 'Z';
    }

    public static void printSumOf1Upto10UsingForLoop() {
        int sum = 0;
        for(int i = 0; i < 10; i++){
            sum+=i;
        }
        System.out.println(sum);
    }

    public static void printSumOf1Upto10000UsingForLoop() {
        int sum = 0;
        for(int i = 0; i < 10000; i++){
            sum+=i;
        }
        System.out.println(sum);
    }

    public static boolean isOdd(int n) {
        return (n % 2 != 0);
    }

    public static boolean isMultipleOfThree(int n) {
        return n % 3 == 0;
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {

        return isOdd(n) && isMultipleOfThree(n);
    }

    public static String repeatStringXTimes(String input, int times) {
        // Given string "input" and a positive integer "times",
        // return a string that is equal to the input string repeated X times.
        // If "times" is 0 negative, return a blank string.
        // For example, repeatStringXTimes("potato", 5) should return "potatopotatopotatopotatopotato".

        String repeatedString = "";
        for(int i = 0; i < times; i++){
            repeatedString += input;
        }
        return repeatedString;
    }

    public static String returnStringUntilQ(String input) {
        // Given string "input", return a string that stops at the first occurrence of the character 'q'.
        // For example, given the string "ubiquitous", return "ubi".
        // If the string does not contain a q, then return the empty string "".

        if(!(input.contains("q"))){
            return "";
        }else{
            int indexOfQ = input.indexOf("q");
            return input.substring(0,indexOfQ);
        }


    }

    public static Person declareAndReturnPersonNamedAda() {

        return new Person("Ada");
    }

    public static Person declareAndReturnPersonNamedAlanTuringFromLondon() {
        Person alan = new Person("Alan Turing");
        alan.setCity("London");
        return alan;
    }

    public static boolean isFromLondon(Person person) {

        if(person.getCity() == null)
            return false;

        return person.getCity().equals("London");
    }

    public static ArrayList<Place> declareAndReturnArrayListOfThreePlaces() {

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("New York City"));  //default long and lat is New York
        places.add(new Place("Chicago", -87.6847,41.8369));
        places.add(new Place("Stockholm", 18.0686, 59.3294));

        return places;
    }

    public static HashMap<String, Person> declareAndReturnHashmapOfAlanTuringAndGraceHopper() {
      // The HashMap should have key-value pairs of:
      // - key: `Alan Turing`, value: instance of Person with name `Alan Turing`
      // - key: `Grace Hopper`, value: instance of Person with name `Grace Hopper`

        HashMap<String,Person> famousCoders = new HashMap<String,Person>();
        Person alan = new Person("Alan Turing");
        alan.setCity("London");
        Person grace = new Person("Grace Hopper");
        grace.setCity("Arlington");

        famousCoders.put("Alan Turing", alan);
        famousCoders.put("Grace Hopper", grace);

      return famousCoders;
    }

    public static void changeTuringsCityToPrinceton(HashMap<String, Person> people) {

        Person alan = people.get("Alan Turing");
        alan.setCity("Princeton");
    }


    // Created an extra method to get nth fibonacci Number
    public static int getFib(int n){
        int currentFib = 1;
        int previousFib = 0;
        int nextFib;

        if( n == 0){
            return previousFib;
        }

        for(int i = 0; i < n - 1; i++){
            nextFib = currentFib + previousFib;
            previousFib = currentFib;
            currentFib = nextFib;
        }

        return currentFib;
    }

    // Bonus Problems
    public static void bonusPrintOutSumOfFirstTenFibonacciNumbers() {
        int sum = getFib(11);
        System.out.println(sum);
    }

    public static void bonusPrintOutSumOfFirstFortyFibonacciNumbers() {

        int sum = getFib(41);
        System.out.println(sum);

    }
}
