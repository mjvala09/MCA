class BitwiseOperator{
    public static void main(String[] args){
        int no1 = 4;
        int no2 = 6;


        System.out.printf("%-7s %-4d %-7s\n", "no1 = ",no1, Integer.toBinaryString(no1));
        System.out.printf("%-7s %-4d %-7s\n", "no2 = ",no2, Integer.toBinaryString(no2));
/*
        1 0 0 = 4
       &1 1 0 = 6
        -----
        1 0 0 = 4   if both bits are 1, it gives 1, else it gives 0
*/
        System.out.printf("%-7s %-4d %-7s\n", "& : ",(no1 & no2), Integer.toBinaryString(no1 & no2));
/*
        1 0 0 = 4
       |1 1 0 = 6
        -----
        1 1 0 = 6   if either any bits are 1, it gives 1, else it gives 0
*/
        System.out.printf("%-7s %-4d %-7s\n", "| : ",(no1 | no2), Integer.toBinaryString(no1 | no2));
/*
        1 0 0 = 4
       ^1 1 0 = 6
        -----
        0 1 0 = 2   if bits are different, it gives 1, else it gives 0
*/
        System.out.printf("%-7s %-4d %-7s\n", "^ : ",(no1 ^ no2), Integer.toBinaryString(no1 ^ no2));
//=======================================================================================


        System.out.printf("%-7s %-4d %-7s\n", "shift left : ",(no1 << 1), Integer.toBinaryString(no1 << 1));
        System.out.printf("%-7s %-4d %-7s\n", "shift right :    ",(no1 >> 1), Integer.toBinaryString(no1 >> 1));
    }
}
