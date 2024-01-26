class primeOddEven {
    public static void main(String[] s) {
        int no = Integer.parseInt(s[0]);
        int i,j,k=0, flag = 0;

        System.out.print("Prime numbers : ");
        for(i=2;i<=no;i++){
            for(j=1;j<i;j++){
                if(i % j == 0){ 2
                    flag++;
                }
            }
            if(flag == 1){
                System.out.print(i+" ");
            }
            flag = 0;
        }
        System.out.print("\nNon-Prime numbers : ");
        for(i=2;i<=no;i++){
            for(j=1;j<i;j++){
                if(i % j == 0){
                    flag++;
                }
            }
            if(flag >= 2){
                System.out.print(i+" ");
            }
            flag = 0;
        }

        System.out.print("\nEven numbers : ");
        for(i=2;i<=no;i++){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.print("\nOdd numbers : ");
        for(i=2;i<=no;i++){
            if(i % 2 != 0){
                System.out.print(i+" ");
            }
        }
    }
}