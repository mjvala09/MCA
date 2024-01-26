class bitShift{
	public static void main(String[] args) {
		int no1 = 4;
		int no2 = 6;
		System.out.printf("%-7s %-4d %-7s\n", "shift left : ",(no1 << 1), Integer.toBinaryString(no1 << 1));
        System.out.printf("%-7s %-4d %-7s\n", "shift right :    ",(no1 >> 1), Integer.toBinaryString(no1 >> 1));
	}
}