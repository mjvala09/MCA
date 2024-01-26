class StringDemo4{
	public static void main(String[] args) {
		String str = "Hello All, How are you? I hope you all are fine and well...";

		System.out.println(str);
		System.out.println(str.indexOf('e'));
		System.out.println(str.lastIndexOf('e'));
		System.out.println(str.length());
		System.out.println(str.indexOf("All"));
		System.out.println(str.lastIndexOf("all"));
		System.out.println(str.indexOf("e",4));
	}
}