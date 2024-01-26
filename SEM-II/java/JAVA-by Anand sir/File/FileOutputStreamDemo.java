// Write Data into the file
import java.io.*;
class FileOutputStreamDemo{
	public static void main(String[] args) {
		try{
			FileOutputStream fos = new FileOutputStream("f:\\demo.txt");
			fos.write(65);
			fos.write(66);
			fos.write(67);
			fos.write(68);
			fos.close();
			System.out.println("File Write Operation is Succesfull");
		}
		catch(Exception e){

		}
	}
}