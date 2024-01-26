class ExceptionDemo7{
	public static void main(String[] args) {
		int a = 20,b=0;
		
		try{
			b = Integer.parseInt(args[0]);
			System.out.println(a/b);
		}catch(ArrayIndexOutOfBoundsException aie){
			System.out.println("At least one argument is required.");
		}catch(NumberFormatException nfe){
			System.out.println("Please enter Numeric value only");
		}catch(ArithmeticException ae){
			System.out.println("Can not divide by Zero");
		}catch(Exception e){
			System.out.println("Any Other Exception");
		}finally{
			System.out.println("Finally Block will executes always...");	
		}
		System.out.println("End of Main");
	}
}