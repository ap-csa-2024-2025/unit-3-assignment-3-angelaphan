import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // TODO: Problem 1
    Problem3();
    // TODO: Problem 2


    // TODO: Problem 3
  }
  public static void Problem1()
  {
    System.out.println("give an int: ");
    Scanner scan = new Scanner(System.in);
    int int1 = scan.nextInt();
    System.out.println("give another int: ");
    int int2 = scan.nextInt();
    if (int2==0)
    {
      System.out.println("Cannot divide by zero");
    }
    else
    {
      double num = int1 / int2; 
      if (num>1 && num<=8)
      {
        System.out.println("Ratio OK");
      }
    }
  
    }

    public static void Problem2()
  {
    System.out.println("give an int: ");
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    System.out.println("give another int: ");
    int b = scan.nextInt();
    if (b==0)
    {
      System.out.println("Cannot divide by zero");
    }
    else
    {
      if (a%b==0)
      {
        System.out.println("Is a factor");
      }
    }
  
    }

    public static void Problem3()
    {
      System.out.println("enter a number in the fifties: ");
      Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
      if (num>=50 && num<=59)
      {
        System.out.println("Your number is "+num);
      }
      else
      {
        System.out.println("Thats not in the fifties");
        System.out.println("Your number is "+num);
      }
    }

  // TODO: In-class assignment
  // Create a method that takes in two Rectangles and returns
  // true if they are equal, and false otherwise.  Two
  // Rectangles are considered equal if their widths are equal,
  // and if their lengths are equal.
  // public static boolean rectEqual(Rectangle r1, Rectangle r2)
  // {
  //   // implement solution here

  //   return false;
  // }
}
