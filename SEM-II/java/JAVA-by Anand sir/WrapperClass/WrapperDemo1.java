class WrapperDemo1{
	public static void main(String[] args) {
		int no = 12345;
		//Integer iNo = new Integer(no);
		Integer iNo = no; // AutoBoxing
		System.out.println(iNo);

		String sNo = iNo.toString();
		System.out.println(sNo);
	}
}