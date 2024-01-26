class ExceptionDemo8{
	public static void main(String[] args) {
		int a = 20,b=0;
		
		try{
			b = Integer.parseInt(args[0]);
			System.exit(0);
		}catch(ArrayIndexOutOfBoundsException aie){
			System.out.println("At least one argument is required.");
		}finally{
			System.out.println("Finally Block will executes always...");	
		}
		System.out.println("End of Main");
	}
}