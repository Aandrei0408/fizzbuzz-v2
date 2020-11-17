package fizzBuzzSimple;

/*

Task: Write a program in Python or Java that counts backwards
      from 100 to 1 and prints: “Agile” if the number is divisible by 5,
      “Software” if the number is divisible by 3, “Testing” if the number
      is divisible by both, or prints just the number if none of those cases are true.

Solution: iterate the "1 - 100" range backwards and at each step decide what
          to print based on mutually exclusive checks of the given divisibility criteria;
          the 3 & 5 case has priority (otherwise it would never be matched);
          if no criterion is matched, then print just the number.

*/

public class FizzBuzzSimple
{
    public static void main(String[] args)
    {
        for (int number = 100; number > 0; --number)
        {
            if (number % 5 == 0 && number % 3 == 0)
            {
                System.out.println("Testing");
            }
            else if (number % 5 == 0)
            {
                System.out.println("Agile");
            }
            else if (number % 3 == 0)
            {
                System.out.println("Software");
            }
            else
            {
                System.out.println(number);
            }
        }
    }
}
