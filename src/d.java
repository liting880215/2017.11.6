public class d {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.printf("%d比較大",a);
            }
            else{
                System.out.printf("%d比較大",c);
            }
        }
        else{
            if(b>c){
                System.out.printf("%d比較大",b);
            }
            else{
                System.out.printf("%d比比較大",c);
            }
        }
    }
}
