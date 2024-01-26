import java.io.*;
class FileOutputStreamDemo2{
	public static void main(String[] args) {

		String s = "Welcome to File Handling!!!";

		try{
			FileOutputStream fout = new FileOutputStream("f:\\Demo.txt");
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Data write Successfully");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}