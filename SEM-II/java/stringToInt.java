class stringToInt{
    public static void main(String[] args){
        int no1 = Integer.parseInt(args[0]);
        int no2 = Integer.parseInt(args[1]);
        if(args.length <= 2){
            System.out.println("Addition :- " + (no1 + no2));
            System.out.println("Division :- " + (no1 - no2));
            System.out.println("Multiplication :- " + (no1 * no2));
            System.out.println("Division :- " + (no1 / no2));
        }else{
            System.out.println("plz enter only two values");
        }
    }
}