import java.util.*;
class VarArgdemo2{

	void display(Object... oa){

		System.out.println("Before Sorting");

		for(Object o : oa){
			System.out.println(o + "\t");			
		}
		System.out.println();


		System.out.println("After Sorting");

		Arrays.sort(oa);

		for(Object o : oa){
			System.out.println(o + "\t");			
		}
		System.out.println();
	}

	public static void main(String[] args) {
		VarArgdemo2 va1 = new VarArgdemo2();
		va1.display(32,45,78,10,50,69,74,85,74);
		va1.display("MCA","BBA","BCOM","PHD","BCA","PGDCA");
		va1.display('M','C','A');
	}
}