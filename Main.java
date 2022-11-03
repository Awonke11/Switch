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
    }

    input.close();
  }
}