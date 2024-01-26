class FibonanciSeries{
	public static void main(String[] args) {
		System.out.println("FIBONANCI SERIES");
		int sum=0;
		int term1 = 0,term2 = 1,nextTerm = 0;
		System.out.print(term1+" + "+term2);
		nextTerm = term1+term2;
		for(int i = 1;i<=10;i++){
			System.out.print(" + "+nextTerm);
			term1 = term2;
			term2 = nextTerm;
			nextTerm = term1+term2;
			// logic for print from 3rd to Nth values
		}
	}
}