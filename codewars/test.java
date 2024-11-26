package codewars;

public class test {
	public static void main(String [] args) {
		String n = "j###o&n*@a";
		String cleanString = n.replaceAll("[^a-zA-Z ]", "");
		
		
		System.out.println(cleanString);
		
	}
}
