// Local Inner Class

class LocalInnerDemo{
	private int data = 30;
	void display(){
		class Local{
			void msg(){
				System.out.println("Local Inner Class : " + data);
			}
		}			
		Local l = new Local();
		l.msg();
	}
	public static void main(String[] args) {
		LocalInnerDemo LID = new LocalInnerDemo();
		LID.display();			
	}
}