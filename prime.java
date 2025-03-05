public class prime{
    public static void main(String[] args) {
        int num = 17;
        int count =0;
       if(num<=1){
        System.out.println("not a prime");
       }
       else{
       for(int i=2;i<=num;i++){
        if(num%i==0){
            count++;
        }

       if(count>1){
        System.out.println("not a prime");
       }
       else{
        System.out.println("prime");
       }
    }
    }
        System.out.println("First Commit");
}
}
