class TypeConversion{
	//  Double to float,long,int,char,short,byte
	//  Float to long,int,char,short,byte
	//  Lont to int,cahr,short,buyte
	//  Int to char,short,byte
	//  Chat to short,byte
	//  Short to byte

	
	public static void main(String[] args) {
		double d = 100;
		float f = 3.14f;
		long l = 10;
		int i = 12;
		char c = 'A';
		short s = 1;

		byte b = (byte)c;
		System.out.println(b);

		b = (byte)i;
		System.out.println(b);

		b = (byte)l;
		System.out.println(b);

		b = (byte)f;
		System.out.println(b);

		b = (byte)d;
		System.out.println(b);

	}
}