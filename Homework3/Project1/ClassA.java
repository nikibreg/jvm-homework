package Project1;

import java.util.Scanner;

public class ClassA {
  int a, b;
  Scanner scanner = new Scanner(System.in);

  public void Method1(){
    System.out.println("Please enter the integer value of a: ");
    a = Integer.parseInt(scanner.nextLine()); 
    System.out.println("Please enter the integer value of b: ");
    b = Integer.parseInt(scanner.nextLine()); 
  }

  public void Method2(){
    System.out.println(a + b);
  }

  public void Method3(){
    System.out.println(a * b);
  }
}