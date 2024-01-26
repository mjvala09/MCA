import java.util.regex.*;
class RegExDemo1{
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[7-9]{5}");
		Matcher m = p.matcher(args[0]);
		System.out.println(m.matches());
	}
}