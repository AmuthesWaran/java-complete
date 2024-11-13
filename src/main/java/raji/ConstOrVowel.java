package raji;

import java.util.Scanner;

public class ConstOrVowel {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single character:");

        char ch = scanner.next().charAt(0);
        if (!Character.isLetter(ch)) {
            System.out.println("Error: Input is not a letter.");
        } else {
            switch (Character.toLowerCase(ch)) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    System.out.println("Vowel");
                    break;
                default:
                    System.out.println("Consonant");
                    break;
            }
        }
    }
}
