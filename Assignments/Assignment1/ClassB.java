import java.util.Scanner;

class ClassB extends ClassA {
  int y;
  Scanner scanner = new Scanner(System.in);

  public void Method4(){
    System.out.println("Please enter the integer value of y: ");
    y = scanner.nextInt();
  }

  public int Method5(){
    int sum = x + y;
    System.out.println(sum);
    return sum;
  }
}