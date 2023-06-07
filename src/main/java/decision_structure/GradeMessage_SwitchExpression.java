package decision_structure;

import java.util.Scanner;

public class GradeMessage_SwitchExpression {

    public static void main(String[] args){

    System.out.println("Enter your letter grade");
    Scanner scanner = new Scanner(System.in);

    String grade = scanner.next();
    scanner.close();

    String message = switch(grade){

        case "A" -> "Excellent job!";
        case "B" -> "Good job!";
        case "C" -> "Do better";
        case "D" -> "Unacceptable";
        case "F" -> "You suck!";
        default -> "Error. Invalid grade";
    };

    System.out.println(message);
  }
}
