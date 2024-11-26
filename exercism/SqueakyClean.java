package exercism;

public class SqueakyClean {
	static String clean(String identifier) {
        String cleanString = deleteNonLetters(identifier);
        cleanString = leetspeakToNormalText(cleanString);
        cleanString = replaceSpaces(cleanString);
        cleanString = toCamelCase(cleanString);

        return cleanString;
      
    }
	private static String replaceSpaces(String s) {
		StringBuilder wordWithoutSpaces = new StringBuilder();
		for(Character n: s.toCharArray()) {
			if(n.isWhitespace(0)) {
				wordWithoutSpaces.append('_');
			}else {
				wordWithoutSpaces.append(n);
			}
		}
		return wordWithoutSpaces.toString();
		
	}
	
	private static String toCamelCase(String p) {
		StringBuilder wordToCamelCase = new StringBuilder();
		boolean capitalizeNext = false;
		for(Character n : p.toCharArray()) {
			if(n == '-') {
				capitalizeNext = true;
				continue;
			}
			
			wordToCamelCase.append(capitalizeNext ? Character.toUpperCase(n) : n );
			capitalizeNext = false;
		}
		
		return wordToCamelCase.toString();
		
	}
	
	public static String leetspeakToNormalText(String n) {
		StringBuilder normalText = new StringBuilder();
		for(Character i : n.toCharArray()) {
			switch(i) {
			case '0' :
				normalText.append('o');
				break;
			case '3' :
				normalText.append('e');
				break;
			case '1' :
				normalText.append('i');
				break;
			case '4' :
				normalText.append('a');
				break;
			case '7':
				normalText.append('t');
				break;
			default:
				normalText.append(i);
				break;
			}
				
		}
		return normalText.toString();
		
	}
	public static String deleteNonLetters(String a) {
		String cleanString = a.replaceAll("[^a-zA-Z ]", "");
		return cleanString;
	}
	
} 
