class StringDemo2{
	public static void main(String[] args) {
		String s1 = "Atmiya";
		String s2 = "Atmiya";
		String s3 = "Good Morning!";
		String s4 = "ATMIYA";

		/*if(s1.equals(s2)){
			System.out.println("Equals String");			
		}*/

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
	}
}