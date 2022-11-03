import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter your birth month");
    String birthMonth = input.next();

    switch(birthMonth) {
      case "January":
        System.out.println("Your birthday is on a new month.");
        break;
      case "March":
        System.out.println("Happy birthday baby.");
        break;
      case "October":
        System.out.println("Happy birthday to Me yay.");
        break;
    }

    input.close();
  }
}