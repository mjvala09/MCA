class dataTypeConversion2{
	public static void main(String[] args){
		byte a = 100;
		System.out.println(a);

		// byte b = 130;
		// error: incompatible types: possible lossy conversion from int to byte
		
		byte b = (byte)130;
		System.out.println(b);		// -126

		byte c = (byte)256;
		byte d = (byte)256;
		System.out.println(c+d);	// 0
	}
}