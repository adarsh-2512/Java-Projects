import java.util.Scanner;
public class MorseCode 
{
    public static void morseToText(String morse) 
    {
        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
                "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."};
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String[] morseWords = morse.split("\\s+");
        for (String word : morseWords) 
        {
            for (int j = 0; j < 36; j++) 
            {
                if (word.equals(morseCode[j])) 
                {
                    System.out.print(characters.charAt(j));
                    break;
                }
            }
        }
        System.out.println();
    }
    public static void textToMorse(String text) 
    {
        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
                "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."};
        for (int i = 0; i < text.length(); i++) 
        {
            char c = text.charAt(i);
            if (c == ' ') 
            {
                System.out.print(" ");
            } 
            else if ((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) 
            {
                int j = ((c >= 'A' && c <= 'Z')) ? c - 'A' : ((c >= 'a' && c <= 'z') ? c - 'a' : c - '0' + 26);
                System.out.print(morseCode[j] + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        String text;
        System.out.println("Welcome to Morse Code Converter");
        do 
        {
            System.out.println("Menu");
            System.out.println("1. Text to Morse code");
            System.out.println("2. Morse code to Text");
            System.out.println("3. Exit");
            System.out.print("Enter your choice : ");
            ch = sc.nextInt();
            sc.nextLine(); 
            if (ch == 1) 
            {
                System.out.print("Enter the text: ");
                text = sc.nextLine();
                System.out.print("Morse Code: ");
                textToMorse(text);
            } 
            else if (ch == 2) 
            {
                System.out.print("Enter Morse code (separate characters with spaces): ");
                text = sc.nextLine();
                System.out.print("Decoded Text: ");
                morseToText(text);
            } 
            else if (ch == 3) {
                System.out.println("Thank you for using our code, Hope to see you again soon ");
                System.exit(0);
            } 
            else 
            {
                System.out.println("Invalid choice ");
            }
        } while (ch != 3);
    }
}
