package org.launchcode.java.studios.countingcharacters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main (String[] args) {
        //needed to take in the user string
        Scanner input = new Scanner(System.in);
     //asking the user what string
        System.out.println("Enter a string to count:");
        String myString = input.nextLine();
        input.close();
HashMap<Character, Integer> characters = new HashMap<>();
        char[] charactersInString = myString.toCharArray();
  //      System.out.println(charactersInString.length);

        for (char i : charactersInString) {
            if (!characters.containsKey(i)) {
                characters.put(i, 1);
            } else {
                Integer currentCount = characters.get(i) + 1;
                characters.replace(i, currentCount);
            }

    }
        for (Map.Entry<Character, Integer> character : characters.entrySet()){
            System.out.println(character.getKey() + " : " + character.getValue());
        }
    }
}
