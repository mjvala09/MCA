class datatyperange_1{
    public static void main(String[] args){
        System.out.println("           Min value             Max value   BIT     Byte    Type");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%20d  %20d  %4d  %6d  %7s\n",
            Byte.MIN_VALUE,Byte.MAX_VALUE,Byte.SIZE,((Byte.SIZE)/8),Byte.TYPE);
        System.out.printf("%20d  %20d  %4d  %6d  %7s\n",
            Integer.MIN_VALUE,Integer.MAX_VALUE,Integer.SIZE,((Integer.SIZE)/8),Integer.TYPE);
        System.out.printf("%20d  %20d  %4d  %6d  %7s\n",
            Long.MIN_VALUE,Long.MAX_VALUE,Long.SIZE,((Long.SIZE)/8),Long.TYPE);
        System.out.printf("%20d  %20d  %4d  %6d  %7s\n",
            Short.MIN_VALUE,Short.MAX_VALUE,Short.SIZE,((Short.SIZE)/8),Short.TYPE);
        System.out.printf("%20e %21e  %4d  %6d  %7s\n",
            Float.MIN_VALUE,Float.MAX_VALUE,Float.SIZE,((Float.SIZE)/8),Float.TYPE);
        System.out.printf("%20e  %20e  %4d  %6d  %7s\n",
            Double.MIN_VALUE,Double.MAX_VALUE,Double.SIZE,((Double.SIZE)/8),Double.TYPE);
    } 
}