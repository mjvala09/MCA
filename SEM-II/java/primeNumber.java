class primeNumber {
  public static void main(String[] s) {
    int flag = 0;
    int no = Integer.parseInt(s[0]);
    for (int i = 2; i < no; i++) {
      if (no % i == 0) {
        flag = 1;
        break;
      }
    }
    if (flag == 1) {
      System.out.print("Number is NON-PRIME ");
    } else {
      //  print   out the number  itself
      System.out.print("Number is PRIME "); 
    }
    System.out.print(no);
  }
}
