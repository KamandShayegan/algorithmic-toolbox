import java.util.Scanner;

public class Main{

  static int fib(int num){
  
    int res = 0;
 int[] list = {0,1};
    if(num==0) res = list[0];
    if(num==1) res = list[1];
    if(num>1){
      for(int i = 2; i<=num; i++){
        int temp = list[i-1] + list[i-2];
        
        // list.add(temp);
        // list[i] = temp;
      }
      System.out.print(list);
      res = list[num];
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