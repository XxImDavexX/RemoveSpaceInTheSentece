package test;

import java.util.Scanner;

public class RemoveSpacesInTheSentence {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert a sentence here: ");
        String sentence, sentence2;
        sentence = keyboard.nextLine();
        sentence2 = sentence.replaceAll(" ","");
        System.out.println(sentence2);
        
    }
}
