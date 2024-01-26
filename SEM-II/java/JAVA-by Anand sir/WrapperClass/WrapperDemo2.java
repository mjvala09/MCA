class WrapperDemo2{
	public static void main(String[] args) {
		byte b = 10;
		short s = 20;
		char c = 'A';
		int i = 100;
		long l = 300l;
		float f = 3.14f;
		double d = 3.18;
		boolean bool = true;	

		Byte bObj = b; // AutoBoxing			
		Short sObj = s; // AutoBoxing			
		Character cObj = c; // AutoBoxing			
		Integer iObj = i; // AutoBoxing			
		Long lObj = l; // AutoBoxing			
		Float fObj = f; // AutoBoxing			
		Double dObj = d; // AutoBoxing			
		Boolean bolObj = bool; // AutoBoxing	

		System.out.println(b + " " + bObj.byteValue());
		System.out.println(s + " " + sObj);
		System.out.println(c + " " + cObj);
		System.out.println(i + " " + iObj.intValue());
		System.out.println(l + " " + lObj);
		System.out.println(f + " " + fObj);
		System.out.println(d + " " + dObj);
		System.out.println(b + " " + bolObj);
	}
}