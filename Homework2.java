import java.util.Arrays; 
import java.util.Collections;

public class Homework2 {
  public static void Run() {
    System.out.println("სავარჯიშო 1");
    Exercise1();
    System.out.println("სავარჯიშო 2");
    Exercise2(10, 7);
    System.out.println("სავარჯიშო 3");
    Exercise3(10, 7);
    System.out.println("სავარჯიშო 4");
    Exercise4(123);
    System.out.println("სავარჯიშო 5");
    Exercise5(123);
    System.out.println("სავარჯიშო 6");
    Exercise6(123);
    System.out.println("სავარჯიშო 7");
    Exercise7(7, 8);
    System.out.println("სავარჯიშო 8");
    Exercise8(100, 105);
    System.out.println("სავარჯიშო 9");
    Exercise9();
    System.out.println("სავარჯიშო 10");
    Exercise10();
    System.out.println("სავარჯიშო 11");
    Exercise11();
    System.out.println("სავარჯიშო 12");
    Exercise12();
  }

  // 1. გამოიტანეთ დაპროგრამების ენების სახელები ცალ–ცალკე ხაზზე( C++, C#,
  // java, pascal, php, JavaScropt, ActionScript).
  public static void Exercise1() {
    System.out.println("C++");
    System.out.println("java");
    System.out.println("pascal");
    System.out.println("php");
    System.out.println("JavaScript");
    System.out.println("ActionScript");
  }

  // 2. დავწეროთ კოდი რომელიც გამოიტანს შეტანილი ორი მთელი რიცხვის
  // შემთხვევაში, პირველის მეორეზე გაყოფის შედეგად მიღებულ მთელ შედეგს
  // და მეორის პირველზე გაყოფის შედეგად მიღებულ ნაშთს. (ფორმატის
  // გათვალისწინებით).
  public static void Exercise2(int a, int b) {
    System.out.println(a / b);
    System.out.println(b % a);
  }

  // 3. შეიტანეთ სამი მთელი რიცხვი, გამოიტანეთ მათი ჯამი და ნამრავლი.
  public static void Exercise3(int a, int b) {
    System.out.println(a + b);
    System.out.println(b * a);
  }

  // 4. შეიტანეთ სამნიშნა მთელი რიცხვი, დაბეჭდეთ რიცხვის ციფრები ცალ-ცალკე
  // ხაზზე.
  public static void Exercise4(int a) {
    String[] digits = Integer.toString(a).split("");
    for (String digit : digits)
      System.out.println(digit);
  }

  // 5. შეიტანეთ ოთხნიშნა მთელი რიცხვი, დაბეჭდეთ რიცხვის ციფრთა ჯამი.
  public static void Exercise5(int a) {
    String[] digits = Integer.toString(a).split("");
    int sum = 0;
    for (String digit : digits)
      sum += Integer.parseInt(digit);
    System.out.println(sum);

  }

  // 6. შეიტანეთ ნებისმიერი მთელი რიცხვი, დაბეჭდეთ რიცხვის ციფრთა ჯამი.
  public static void Exercise6(int a) {
    String[] digits = Integer.toString(a).split("");
    int sum = 0;
    for (String digit : digits)
      sum += Integer.parseInt(digit);
    System.out.println(sum);

  }

  // 7. იპოვეთ ორი მთელი რიცხვის უდიდესი საერთო გამყოფი და უმცირესი
  // საერთო ჯერადი.(ევკლიდეს ალგორითმი).
  public static int gcd(int a, int b) {
    if (a == 0)
      return b;
    return gcd(b % a, a);
  }

  public static int lcm(int a, int b) {
    return (a * b) / gcd(a, b);
  }

  public static void Exercise7(int a, int b) {
    System.out.println(gcd(a, b));
    System.out.println(lcm(a, b));
  }

  // 8. დაბეჭდეთ მთელი რიცხვები M-დან N-მდე.
  public static int[] Range(int low, int high) {
    int[] a = new int[high - low];
    for (int i = 0, j = low; i < high - low; i++, j++) {
      a[i] = j;
    }
    return a;
  }

  public static void Exercise8(int M, int N) {
    for (int digit : Range(M, N))
      System.out.println(digit);
  }

  // 9. განსაზღვრეთ 8 ელემენტიანი ნამდვილ რიცხვთა მასივი, დაბეჭდეთ მასივის
  // ელემენტები, მასივის უდიდესი და უმცირესი ელემენტი.
  public static void Exercise9() {
    int[] realNumbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    Arrays.sort(realNumbers);
    System.out.println(realNumbers[0]);
    System.out.println(realNumbers[realNumbers.length - 1]);
  }

  // 10. განსაზღვრეთ 8 ელემენტიანი ნამდვილ რიცხვთა მასივი, დაალაგეთ მასივი
  // ზრდადობით, დაბეჭდეთ მასივი.
  public static void Exercise10() {
    int[] realNumbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    Arrays.sort(realNumbers);
    System.out.println(Arrays.toString(realNumbers));
  }

  // 11. განსაზღვრეთ 8 ელემენტიანი ნამდვილ რიცხვთა მასივი, ჩაწერეთ მასში
  // შემთხვევითი რიცხვები, დაბეჭდეთ მასივი.
  public static void Exercise11() {
    int[] realNumbers = new int[8];
    for (int i = 0; i < realNumbers.length; i++) {
      realNumbers[i] = (int) (Math.random() * 100);
    }

    Arrays.sort(realNumbers);
    System.out.println(Arrays.toString(realNumbers));
  }

  // 12. განსაზღვრეთ 8 ელემენტიანი მთელ რიცხვთა მასივი, ჩაწერეთ მასში
  // შემთხვევითი რიცხვები, დაალაგეთ მასივი კლებადობით, დაბეჭდეთ მასივი.
  public static void Exercise12() {
    Integer[] realNumbers = new Integer[8];
    for (int i = 0; i < realNumbers.length; i++) {
      realNumbers[i] = (int) (Math.random() * 100);
    }

    Arrays.sort(realNumbers, Collections.reverseOrder());
    System.out.println(Arrays.toString(realNumbers));
  }

}