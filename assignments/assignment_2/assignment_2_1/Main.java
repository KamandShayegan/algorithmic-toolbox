import java.util.Scanner;
import java.util.ArrayList;

public class Main{

  static int fib(int num){
    // int res = 0;
    // if(num ==0) res = 0;
    // if(num == 1) res = 1;
    // if(num>1){
    //   res = fib(num-1) + fib(num-2);
    // }
    // return res;
      int res = 0;
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(0);
      list.add(1);
      if(num==0) res = list.indexOf(0);
      if(num==1) res = list.indexOf(1);
      if(num>1){
        for(int i = 2; i<=num; i++){
          System.out.println(list.indexOf(i-1));
          System.out.println(" + ");
          System.out.println(list.indexOf(i-2));

          int temp = list.indexOf(i-1) + list.indexOf(i - 2);    
        list.add(temp);
      }
      System.out.print(list);
      res = list.indexOf(num);
    }
    return res;
  }
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    int requestedFib = myObj.nextInt(); //Get users input
    myObj.close();
    int res = fib(requestedFib);
    System.out.println(res);
  }
}