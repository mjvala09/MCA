class Calulation{
	int no1;// Instance Variable
	int no2;// Instance Variable

	void sum(){
		no1 = 10;
		no2 = 20;
		System.out.println("Sum = " + (no1+no2));
	}
	void sum(int no1){
		this.no1 = no1;
		System.out.println("Sum with 1 parameter = " + (no1+no2));
	}
	void sum(int no1, int no2){ // Method Overloading
		this.no1 = no1;
		this.no2 = no2;
		System.out.println("Sum with 2 parameter = " + (no1+no2));
	}
}
class MethodOverloadingDemo{
	public static void main(String[] args) {
		Calulation obj = new Calulation();
		obj.sum();
		obj.no2 = 30;
		obj.sum(50);
		obj.sum(10,20);
	}
}