package org.launchcode.java.exercises.controlandcollections;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        // part 1
//        ArrayList<Integer> integerArrayList = new ArrayList<>();
//        integerArrayList.add(3);
//        integerArrayList.add(6);
//        integerArrayList.add(9);
//        integerArrayList.add(15);
//        integerArrayList.add(12);
//        integerArrayList.add(-4);
//        integerArrayList.add(1);
//        integerArrayList.add(0);
//        integerArrayList.add(42);
//        integerArrayList.add(7);
//        System.out.println(getEvenSum(integerArrayList));
        ArrayList<String> wordArrayList = new ArrayList<>();
        wordArrayList.add("lunch");
        wordArrayList.add("Yankees");
        wordArrayList.add("apple");
        wordArrayList.add("green");
        System.out.println(wordArrayList);
        print5LetterWords(wordArrayList);
    }

    // input: ArrayList of strings
    // output: print each 5 letter word in the list
    public static void print5LetterWords(ArrayList<String> words) {
        for (String word : words) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }

    // input: some ArrayList of integers
    // output: sum of all even integers in ArrayList
    public static int getEvenSum(ArrayList<Integer> numbers) {
        int sum = 0;
        // for(int i = 0; i < numbers.size(); i++)
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }

        return sum;
    }
}
