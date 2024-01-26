class calculation{
	int no1;

	void print(int no1){
		this.no1 = no1;
		System.out.println("Int Argument" + no1);
	}
	void print(String no1){
		this.no1 = Integer.parseInt(no1);
		System.out.println("String Argument" + no1);
	}
}
class CalculationDemo2{
	public static void main(String[] args) {
		calculation obj = new calculation();
		obj.print(10);
		obj.print("20");
	}
}