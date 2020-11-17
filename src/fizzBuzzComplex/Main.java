package fizzBuzzComplex;

import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main (String[] args)
    {
        int start = 0;
        int stop = 100;
        int step = 1;
        Map<Integer, String> conditions = new HashMap<>();
        conditions.put(15, "Testing");
        conditions.put(3, "Software");
        conditions.put(5, "Agile");

        FizzBuzzComplex obj = new FizzBuzzComplex();
        System.out.println(obj.fizzBuzz(start, stop, step, conditions));
    }
}

