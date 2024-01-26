// Ways to Create a String
class StringDemo1{
	public static void main(String[] args) {
		char c[] = {'J','A','V','A'};
		String s1 = new String(c);
		String s2 = new String(s1);
		String s3 = "JAVA";

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}