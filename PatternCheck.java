import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 */

/**
 * @author Prosenjit Ghosh Chowdhury
 *
 */
public class PatternCheck {

	/**
	 * @param args only
	 */
	public static void main(String[] args) {
		String name = "GHOSH CHOWDHURY CD PROsenjit De";
		String lName;
		String fName;
		
		StringBuilder sb = new StringBuilder();

		Pattern p = Pattern.compile("\\b[A-Z]{1,}\\b");
		Matcher m = p.matcher(name);
		while (m.find()) {
		    String word = m.group();
		    sb.append(word + " ");		    
		};
		//last Name
		lName = sb.toString().trim();
		System.out.println(lName);
		int position;
		position = lName.length();
		System.out.println(position);
		//fName = name.substring(name.lastIndexOf(str) + 1);
		fName = name.substring(position + 1).trim();
		System.out.println(fName);
		

	}

}
