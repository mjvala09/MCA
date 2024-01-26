class byteValue {
	public static void main(String[] args)
	{
		Byte bObj = new Byte("10");
		byte b = bObj.byteValue();
		
		short s = bObj.shortValue();
		System.out.println(bObj+""+b+""+s);
	}
}