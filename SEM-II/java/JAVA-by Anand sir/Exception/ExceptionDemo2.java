class ExceptionDemo2{
	public static void main(String[] args) {
		int a = 20;
		
		try{
			int b = Integer.parseInt(args[0]);
			System.out.println(a/b);
		}catch(ArithmeticException ae){
			System.out.println("Can not Divide by Zero");
		}catch(NumberFormatException nfe){
			System.out.println("Please enter Numeric value only");
		}
	}
}