package hackerrank;

import java.util.*;
import java.util.regex.*;


public class TagContenExtractor {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.println("numero?: ");
		int testCases = Integer.parseInt(in.nextLine());
		System.out.println("text?: ");
		while(testCases>0){
			String line = in.nextLine();
          	Pattern regex = Pattern.compile("<([^>]+)>(.*?)</\\1>");
			Matcher matcher = regex.matcher(line);
			testCases--;
			while(matcher.find()) {
				System.out.println(matcher.group(2));
				
			}
		}
	}
}
