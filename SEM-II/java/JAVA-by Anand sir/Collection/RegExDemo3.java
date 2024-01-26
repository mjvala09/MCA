import java.util.regex.*;
class RegExDemo3{
	public static void main(String[] args) {
		String s = args[0];
		Pattern p = Pattern.compile("((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@%#$]).{8,20})");
		Matcher m = p.matcher(s);
		System.out.println(m.matches());
	}
}