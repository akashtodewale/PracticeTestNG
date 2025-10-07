package PracticeJava;

public class qualysInterview {

    public static void main(String[] args) {
		
		String str = "abcd";
		StringBuilder sb = new StringBuilder();

    for (int i = 0; i < str.length(); i++) 
    	{
			char ch = str.charAt(i);

			sb.append(Character.toUpperCase(ch));
			
	for (int j = 0; j < i; j++) 
			{
				sb.append(Character.toLowerCase(ch));

			}
			
		}
		
		System.out.println(sb);
		//should print - ABbCccDddd
		
	}
}
