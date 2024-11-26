package codewars;

public class Countvowels {
	public static int getCount(String str) {
		int count = 0;
		char[] newWord = str.toCharArray();
		for(char letter : newWord){
			char a = 'a'; 
			char e = 'e'; 
			char i = 'i'; 
			char o = 'o'; 
			char u = 'u';
			if(letter == a || letter ==  e || letter == i || letter == o || letter == u){
				count += 1;
			}
		}
		return count;
	}
	 
	public static int Count(String str) {
		return str.replaceAll("(?i)[^aeiou]", "").length();
    } 
	
	public static void main(String [] args) {
		System.out.print(Count("jona"));
	}

		
}
