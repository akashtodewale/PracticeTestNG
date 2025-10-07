package PracticeJava;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Hello World Akash";
		String reversed = "";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			// reversed = reversed + str.charAt(i);
			reversed += str.charAt(i);

		}
		System.out.println("Original: " + str);
		System.out.println("Reversed: " + reversed);

		// Second approach to reverse a string ------->
		for (int i = 0; i < str.length(); i++) {

			// to ignore the spaces below if block can be used---->
			if (str.charAt(i) == ' ') {
				continue;
			}
			rev = str.charAt(i) + rev;

		}
		System.out.println("Original string: " + str);
		System.out.println("Reversed string: " + rev);

	}
}
