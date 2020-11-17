package fizzBuzzComplex;

import java.util.*;

/*

Task: Write a program in Python or Java that counts backwards
      from 100 to 1 and prints: “Agile” if the number is divisible by 5,
      “Software” if the number is divisible by 3, “Testing” if the number
      is divisible by both, or prints just the number if none of those cases are true.

Solution: use a HashMap to store all conditions as key-value pairs;
          iterate the "start-stop" range backwards;
          at each step iterate through the condition's pairs and add to a list the key's value correspondent,
          based on mutually exclusive checks of the given divisibility criteria between the number and the key;
          if no criterion is matched, just add the number as a String to the list;
          The usage of a map as a methdod parameter makes the solution to be more extensible;

*/

public class FizzBuzzComplex
{
    public List<String> fizzBuzz(int start, int stop, int step, Map<Integer, String> conditions)
    {
        List<String> values = new ArrayList<String>();
        for (int value = stop; value > start; value -= step)
        {
            boolean hasAnyCriteriaMatched = false;
            for (Map.Entry<Integer, String> condition : conditions.entrySet())
            {
                if (value % condition.getKey() == 0)
                {
                    hasAnyCriteriaMatched = true;
                    values.add(condition.getValue());
                }
            }

            if (hasAnyCriteriaMatched == false)
            {
                values.add(String.valueOf(value));
            }
        }

        return values;
    }
}
