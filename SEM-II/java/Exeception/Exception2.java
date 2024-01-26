class Exception2{
    public static void main(String[] args) {
        int a = 20;

        try{
            int b = Integer.parseInt(args[0]);
            System.out.println(a/b);
        }catch(ArithmeticException ae){
            System.out.println(ae);
        }catch(NumberFormatException nfe){
            System.out.println(nfe);
        }catch(ArrayIndexOutOfBoundsException ai){
            System.out.println(ai);
        }
    }
}