package Project1;

import java.util.Scanner;

public class ClassB {
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

  public void Method2(){
     if(a > b && a > c)
      {
          System.out.println(a);
      }
      else if(b > c)
      {
          System.out.println(b);
      }
      else
      {
          System.out.println(c);
      }
  }

  public void Method3(){
    int min = a;
    if (min > b) min = b;
    if (min  > c) min = c;
    System.out.println(min);
  }
}