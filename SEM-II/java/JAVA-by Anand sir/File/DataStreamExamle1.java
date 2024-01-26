import java.io.*;
class DataStreamExamle1{
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("f:\\Demo.txt");
			int i = fis.read();
			System.out.println((char)i);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}