package assignment_1;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    Operations op = new Operations();
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    int firstNum = myObj.nextInt(); //Get users input for the first number
    int secondNum = myObj.nextInt(); //Get users input for the second number
    myObj.close();
    int res = op.add(firstNum, secondNum);
    System.out.println(res);
  }
}