
class Invoice{
	String partNumber;
	String partInformation;
	int partQuantity;
	double partPrice;

	Invoice(String partNumber, String partInformation, int partQuantity, double partPrice){
		this.partNumber = partNumber;
		this.partInformation = partInformation;
		this.partQuantity = partQuantity;
		this.partPrice = partPrice;
	}
	public void setPartNumber(String partNumber){
		this.partNumber = partNumber;
	}
	public void setPartInformation(String partInformation){
		this.partInformation = partInformation;
	}
	public void setPartQuantity(int partQuantity){
		this.partQuantity = partQuantity;
	}
	public void setPartPrice(double partPrice){
		this.partPrice = partPrice;
	}
	public double getInvoiceAmount(){
		if(partPrice <= 0){
			this.partPrice = 0;
		}
		if(partQuantity <= 0){
			this.partQuantity = 0;
		}
		double InvoiceAmount = this.partQuantity * this.partPrice;
		return InvoiceAmount;	
	}
}
class InvoiceTest{
	public static void main(String[] args) {
		Invoice in1 = new Invoice("101","wheel",3,300);
		System.out.println("Invoice");
		System.out.println("part number : "+ in1.partNumber);
		System.out.println("part information : "+ in1.partInformation);
		System.out.println("part quantity : "+ in1.partQuantity);
		System.out.println("part price : "+ in1.partPrice);
		System.out.println("invoice amount : "+ in1.getInvoiceAmount());
	}
}