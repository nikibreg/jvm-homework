import java.util.Scanner;
class ClassC {
  int a, b, c;
  
  Scanner scanner = new Scanner(System.in);

  public void Method1(){
    System.out.println("Please enter the integer value of a: ");
    a = scanner.nextInt();
    System.out.println("Please enter the integer value of b: ");
    b = scanner.nextInt();
    System.out.println("Please enter the integer value of c: ");
    c = scanner.nextInt();
  }

  public int Method2(){
    String[] digits = Integer.toString(a).split("");
    int lastDigit = Integer.parseInt(digits[digits.length - 1]); 
    return lastDigit;
  }
  
  public int Method3(){
    String[] digits = Integer.toString(b).split("");
    int firstDigit = Integer.parseInt(digits[0]);
    return firstDigit;
  }

  public int Method4(){
    String[] digits = Integer.toString(c).split("");
    int sum = 0;
    for (String digit : digits)
      sum += Integer.parseInt(digit);
    return sum;
  }

  public int Method5(){
    int product = Method3() * Method4();
    System.out.println(product);
    return product;
  }

  public void Method6(){
    System.out.println(Method3() + Method5());
  }

}