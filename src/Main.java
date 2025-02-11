import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        String party = "";

    System.out.print("Enter your party affiliation (D - Democrat, R - Republication, I - Independent): ");

    if (in.hasNext()) {
        party = in.next().toUpperCase(); //Convert input to uppercase for consistency
    }

    if (party.equals("D")) {
        System.out.println("You get a Democratic Donkey.");
    }   else if (party.equals("R")) {
        System.out.println("You get a Republican Elephant.");
    } else if (party.equals("I"))  {
        System.out.println("You get an Independent Person.");
    } else {
        System.out.println("You get other");
    }
    in.close();
    }
}