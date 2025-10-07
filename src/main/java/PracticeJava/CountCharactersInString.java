package PracticeJava;

public class CountCharactersInString {

	
	public static void main(String[] args) {
		
	String str = "Akash Todewale";
    String strnew = str.toLowerCase().replace(" ", "");
    int[] freq = new int[256]; // ASCII characters

    for (int i = 0; i < strnew.length(); i++) {
        freq[strnew.charAt(i)]++;
    }

    System.out.println("Character frequencies:");
    for (int i = 0; i < 256; i++) {
        if (freq[i] > 0) {
            System.out.println((char) i + " = " + freq[i]);
        }
    }

	}
}
