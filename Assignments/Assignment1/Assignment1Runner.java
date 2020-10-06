import java.util.*;


class Assignment1Runner {
    public static void run() {
        ClassC classA = new ClassC();
        classC.Method1();
        classC.Method2();
        classC.Method3();
        classC.Method4();
        classC.Method5();
        classC.Method6();
  
        ClassA classA = new ClassA();
        classA.Method1();
        classA.Method2();
        classA.Method3();
  
        ClassB classB = new ClassB();
        classB.Method4();
        classB.Method5();

        ThirdExercise();
  }

  public static void ThirdExercise(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the number to populate random numbers FROM:");
    int from = scanner.nextInt();
    System.out.println("Please enter the number to populate random numbers TO:");
    int to = scanner.nextInt();
    
    if(to > from){
      int temp = from;
      from = to;
      to = temp;
    }

    Integer[] randomNumbers = new Integer[40];

    for (int i = 0; i < randomNumbers.length; i++) {
      randomNumbers[i] = getRandomNumber(from, to);
    }

    List<Integer> evenNumbers = new ArrayList<Integer>(randomNumbers.length);
    for (int i : randomNumbers){
      if(i % 2 == 0)
        evenNumbers.add(i);
    } 

    List<Integer> oddNumbers =  new ArrayList<Integer>(randomNumbers.length);
    for (int i : randomNumbers) {
      if(i % 2 != 0)
        oddNumbers.add(i);
    }

    System.out.println(String.format("There are %d odd numbers", oddNumbers.size()));
    System.out.println(String.format("There are %d even numbers", evenNumbers.size()));

    int sumOfEvenNumbers = evenNumbers.stream().mapToInt(Integer::intValue).sum();

    int sumOfOddNumbers = oddNumbers.stream().mapToInt(Integer::intValue).sum();

    System.out.println(String.format("The sum of odd numbers is: %d", sumOfOddNumbers));
    System.out.println(String.format("The sum of even numbers is: %d", sumOfEvenNumbers));


    int lowSum, highSum;

    if(sumOfOddNumbers > sumOfEvenNumbers){
      lowSum = sumOfEvenNumbers;
      highSum = sumOfOddNumbers;
    } else {
      lowSum = sumOfOddNumbers;
      highSum = sumOfEvenNumbers;
    }


    for (int i = 0; i < 5; i++) {
      System.out.println(getRandomNumber(lowSum, highSum));
    }
  }

  public static int getRandomNumber(int min, int max) {
    return (int) ((Math.random() * (max - min)) + min);
  }
}
  
  