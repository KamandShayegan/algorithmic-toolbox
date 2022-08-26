package assignment_1;
import java.util.Scanner;

public class Main{

  static int add(int num1, int num2){
    return num1 + num2;
  }
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    int firstNum = myObj.nextInt(); //Get users input for the first number
    int secondNum = myObj.nextInt(); //Get users input for the second number
    myObj.close();
    int res = add(firstNum, secondNum);
    System.out.println(res);
  }
}