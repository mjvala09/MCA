class methodShort {
	public static void main(String[] args){
		Short sObj1 = new Short("100");
		System.out.println(sObj1);
		String str = "100";
		Short sObj2 = Short.valueOf(str);
		System.out.println(sObj2);
	}
}