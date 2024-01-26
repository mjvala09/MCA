class StringDemo3{
	public static void main(String[] args) {
		String s1 = "Atmiya"; // 65
		String s2 = "Atmiya";
		String s3 = "atmiya"; // 97

		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s1));

		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
	}
}