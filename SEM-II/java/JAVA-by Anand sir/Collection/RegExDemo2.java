import java.util.regex.*;
class RegExDemo2{
	public static void main(String[] args) {
		String s = args[0];
		Pattern p = Pattern.compile("[A-Za-z0-9_-]{5,10}");
		Matcher m = p.matcher(s);
		System.out.println(m.matches());
	}
}