import java.util.Scanner;
class ClassA {
  int x;
  Scanner scanner = new Scanner(System.in);
  
  public void ClassA(){
    System.out.println("Hello");
  }

  public void Method1(){
    System.out.println("Please enter the integer value of x: ");
    x = scanner.nextInt();
  }

  public int Method2(){
    int sum = x + 12;
    System.out.println(sum);
    return sum;
  }

  public void Method3(){
    System.out.println(x % 2 == 0 ? "x is an even number" : "x is an odd number");
  }
}