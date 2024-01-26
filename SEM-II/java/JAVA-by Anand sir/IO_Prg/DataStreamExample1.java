/* Reading data from a file - read all characters*/
import java.io.FileInputStream;  
public class DataStreamExample1 
{  
     public static void main(String args[])
	 {    
          try
		  {    
            FileInputStream fin=new FileInputStream("D:\\testout.txt");    
            int i=0;    
            while((i=fin.read())!=-1)
			{    
             System.out.print((char)i);    
			}    
            fin.close();    
          }
		  catch(Exception e)
		  {
			System.out.println(e);
		  }    
         }    
        }  
		
		//https://www.journaldev.com/8848/mapreduce-algorithm-example