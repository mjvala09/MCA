class DatatypeConversion4{
	public static void main(String[] args) {
		// Character
		char c1 = 'A';
		char c2 = 90;
		System.out.println(c1 + " " + c2);
		System.out.println(c1 + c2);

		// Boolean
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1 + " " + b2);

		// error: bad operand types for binary operator '+'
		// System.out.println(b1 + b2);

		// TRUE
		if(b1){
			System.out.println("True");
		}else{
			System.out.println("False");
		}

		// FALSE
		if(b2){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}
}