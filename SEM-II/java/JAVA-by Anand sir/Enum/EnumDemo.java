// Enum Type
enum Mobile{
	Samsung(400),Nokia(300),VIVO(500);
	int p;
	Mobile(int p){
		this.p = p;
	}
	int showPrice(){
		return p;
	}
}
class EnumDemo{
	public static void main(String[] args) {
		for(Mobile m : Mobile.values()){
			System.out.println(m + " Costs " + m.showPrice() + " Dollers ");
		}
		Mobile ref = Mobile.VIVO;
		System.out.println("Ordinal : " + ref.ordinal());
		System.out.println("Name : " + ref.name());
		System.out.println("Price : " + ref.showPrice());
	}
}