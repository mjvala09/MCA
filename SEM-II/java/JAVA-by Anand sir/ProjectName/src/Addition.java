package pack;
class Addition{
	int no1, no2;
	Addition(int no1, int no2){
		this.no1 = no1;
		this.no2 = no2;
	}
	void sum(){
		System.out.println("Sum = " + (no1+no2));
	}
}
class Test{
	public static void main(String[] args) {
		Addition a = new Addition(10,20);
		a.sum();
	}
}