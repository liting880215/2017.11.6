public class f {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a==b){
            System.out.println("相等");
        }
        else{
            if(a>b)
                System.out.printf("%d比較大",a);
                else{
                    System.out.printf("%d比較大",b);
            }
        }
    }
}
