import java.io.*;
import java.util.*;
class FileOperationDemo1{
	public static void main(String[] args) {
		File f = new File(args[0]);
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.isHidden());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.canExecute());
		System.out.println(f.isAbsolute());
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		System.out.println(Math.ceil((float)f.length()/1024) + "KB");
		System.out.println(new Date(f.lastModified()));
	}
}