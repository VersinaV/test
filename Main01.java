import java.util.Scanner;

public class Main01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double sum = 0;
    double count = 0;

    while (true) {
      double number = scanner.nextDouble();

      if (number == 0) {
        break;
      }

      sum += number;
      count++;
    }

    if (count > 0) {
      double average = sum / count;
      System.out.println("Average of the entered numbers: " + average);
    }

    scanner.close();
  }
}

