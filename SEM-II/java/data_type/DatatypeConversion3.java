class DatatypeConversion3{
	public static void main(String[] args) {
		byte b = 50;
		int i = b;	// Implicit conversion
		byte b1 = (byte)b; // Explicit conversion
		System.out.print("b ="+b+"\ni ="+ i+"\nb1 ="+b1+"\n");

		float f = 3.14f;
		long l = 1000;
		l = (long)f;
		System.out.println("l = "+l);	// 3
	}
}