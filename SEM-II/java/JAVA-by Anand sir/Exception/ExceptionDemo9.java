class ExceptionDemo9{
	public static void main(String[] args) {
		int a = 20,b=0;
		
		try{
			b = Integer.parseInt(args[0]);
			//System.exit(0);
		}catch(ArithmeticException ar){
			System.out.println("Enter valid value");
		}
	
		System.out.println("End of Main");
	}
}