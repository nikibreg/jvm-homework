package Project1;

import java.util.Scanner;

public class ClassC {
  int a, b, c;
  Scanner scanner = new Scanner(System.in);

  public void Method1(){
    System.out.println("Please enter the integer value of a: ");
    a = Integer.parseInt(scanner.nextLine()); 
    System.out.println("Please enter the integer value of b: ");
    b = Integer.parseInt(scanner.nextLine()); 
    System.out.println("Please enter the integer value of c: ");
    c = Integer.parseInt(scanner.nextLine()); 
  }

  public int Method2(){
    String[] digits = Integer.toString(a).split("");
    return Integer.parseInt(digits[digits.length - 1]);
  }

  public int Method3(){
    String[] digits = Integer.toString(a).split("");
    return Integer.parseInt(digits[0]);
  }
  
  public int Method4(){
    String[] digits = Integer.toString(a).split("");
    int sum = 0;
    for (String digit : digits)
      sum += Integer.parseInt(digit);
    return sum;
  }

  public int Method5(){
    int method2Result = Method2();
    int product = method2Result * method2Result;
    System.out.println(product);
    return product;
  }
  
  public void Method6(){
    int method3Result = Method3();
    int method5Result = Method5();
    System.out.println(method3Result + method5Result);
  }
}