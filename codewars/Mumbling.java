/*Examples
* accum("abcd") -> "A-Bb-Ccc-Dddd"
* accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
* accum("cwAt") -> "C-Ww-Aaa-Tttt"
 */

package codewars;

public class Mumbling {
	public static String accum(String s) {
		StringBuilder newAccum = new StringBuilder();
	    char[] newList = s.toCharArray();
	    for(int i = 0; i < newList.length; i++) {
	    	char m = Character.toUpperCase(newList[i]);
	    	newAccum.append(m);
	    	for(int j = 0; j < i; j++) {
	    		m = Character.toLowerCase(newList[i]);
	    		newAccum.append(m);
	    	}
	    	if(i < newList.length -1) {
	    		newAccum.append("-");
	    	}
	    }
	    return newAccum.toString();
	    
    }
	public static void main(String [] args) {
		String n = "aa";
		System.out.print(Mumbling.accum(n));
	}
}
