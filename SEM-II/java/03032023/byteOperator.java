class byteValue {
	public static void main(String[] a)
	{
		Byte bObj = new Byte("10");
		byte b = bObj.byteValue();
		System.out.println(b);
		short s = bObj.shortValue();
		System.out.println(s);
		int i = bObj.intValue();
		System.out.println(i);
		float f = bObj.floatValue();
		System.out.println(f);
		double d = bObj.doubleValue();
		System.out.println(d);
		long l = bObj.longValue();
		System.out.println(l);
	}
}