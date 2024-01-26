class dataTypeConversion1{
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;

		System.out.println(a+b);// implicit/widening conversion
		// byte sum = a+b;	
		// error: incompatible types: possible lossy conversion from int to byte

		int sum = a+b;
		System.out.println(sum);

		byte c = (byte)(a+b);	// explicit/nerrowing conversion
		System.out.println(c);

		// byte d = (byte)a + (byte)b
		// Error
	}
}