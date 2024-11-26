package codewars;

public class Banjo {
	/*
	 * Create a function which answers the question "Are you playing banjo?".
	 *	If your name starts with the letter "R" or lower case "r", you are playing banjo!
	 *	The function takes a name as its only argument, and returns one of the following strings:
	 *		name + " plays banjo" 
	 *		name + " does not play banjo"
	 */
	public static String areYouPlayingBanjo(String name) {
		Character firstLetter = name.charAt(0);
		return (firstLetter.equals('r') || firstLetter.equals('R')) ? 
				name + " plays banjo" : 
				name + " does not play banjo" ;

	  }
	
	
	public static void main(String [] args) {
		System.out.println(Banjo.areYouPlayingBanjo("Roberto"));
		System.out.println(Banjo.areYouPlayingBanjo("Jona"));
		System.out.println(Banjo.areYouPlayingBanjo("Rodric"));
		
	}
}
