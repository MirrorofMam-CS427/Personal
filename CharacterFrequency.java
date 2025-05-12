// Problem Statement: Write a Java program that takes a string as input 
// and prints the frequency of each character (excluding spaces) in that string. 
// The output should display characters in the order of their first appearance.

// Constraints:
// Input will be a single string (may contain spaces and punctuation).
// Ignore spaces; consider uppercase and lowercase characters as different.

// Example:

// Input:  "handcrafted art"
// Output:
// h: 1  
// a: 2  
// n: 1  
// d: 2  
// c: 1  
// r: 2  
// f: 1  
// t: 2  
// e: 1  
// ": 1

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Store frequency with insertion order preserved
        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        // Count characters
        for (char ch : input.toCharArray()) {
            if (ch == ' ') continue; // Ignore spaces

            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Output result
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}