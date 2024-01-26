// ANONYMOUS INNER CLASS
/*class Atmiya{
	public void display(){
		System.out.println("Hello from Atmiya");			
	}
} */
class AnonymousInnerClass{
	public static void main(String[] args) {
		Atmiya t = new Atmiya(){
			public void display(){
				System.out.println("Hello from Anonymous");			
			}
		};
		t.display();	
	}
}