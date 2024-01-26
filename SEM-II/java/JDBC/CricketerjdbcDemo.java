import java.io.*;
import java.util.Scanner;
class CricketerjdbcDemo{
    public static void main(String[] args) throws Exception{
        DBconnection con = new DBconnection();
        Scanner s = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int choice = -1;
        do{
            System.out.println("1. Display All Record");
            System.out.println("2. insert new Record");
            System.out.println("3. update  Record:");
            System.out.println("4. delete the Record");
            System.out.println("5. sort");
            System.out.println("0. close");


            choice = Integer.parseInt(br.readLine());
            switch(choice){
                case 1:
                    con.display();
                    break;
                case 2:
                    System.out.println("INSERT INTO CRICKETER");
                    System.out.println("(NAME, CODE, SCORE) VALUES(");
                    String name = br.readLine();
                    System.out.println(",");
                    int code = Integer.parseInt(br.readLine());
                    System.out.println(",");
                    int score = Integer.parseInt(br.readLine());
                    System.out.println(");");
                    
                    con.insert(code, score, name);
                    break;
                case 3:
                    System.out.println("UPDATE CRICKETER SET ");
                    System.out.print("NAME = ");
                    name = br.readLine();
                    System.out.print("CODE = ");
                    code = Integer.parseInt(br.readLine());
                    System.out.print("SCORE = ");
                    score = Integer.parseInt(br.readLine());
                    System.out.print("WHERE NAME = ");
                    String uname = br.readLine();
                    con.update(code, score, name, uname);
                    break;
                case 4:
                    System.out.print("DELETE FROM CRICKETER WHERE CODE = ");
                    code = Integer.parseInt(br.readLine());
                    con.deleteByCode(code);
                    break;
                case 5:
                    // System.out.print("SELECT * FROM CRICKETER ORDER BY ");
                    // String columnName=s.next();
                    // con.sort(columnName);
                    con.sort();
                case 0:
                    con.close();
                    break;    
                
            }

        }while(choice != 0);
    }
}