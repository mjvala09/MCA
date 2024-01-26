class ExceptionDemo10{
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			System.out.println("MCA - JAVA");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){
				System.out.println("InterruptedException Caught");
			}
		}
	}
}