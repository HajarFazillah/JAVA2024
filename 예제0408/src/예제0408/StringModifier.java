/*
Write a Java program that defines a class StringModifier. In this class, create two static methods:

	1.	replaceVowels(char[] array): This method takes a character array as input and replaces all vowels (a, e, i, o, u) with the '*' character.
	2.	printCharArray(char[] array): This method prints the contents of the character array.
*/

public class StringModifier {

    static void replaceVowels(char[] array){
        for(int i=0; i<array.length; i++){
            if(isVowel(array[i])){
                array[i] = '*';
            }
        }
    }

    static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    static void printCharArray(char[] array){
        for (char c : array){
            System.out.print(c);
        }
        System.out.println();
    }

    public static void main(String[] args){
        char[] c = "Hello Java!";
        printCharArray(c);
        replaceVowels(c);
        printCharArray(c);
    }
}
