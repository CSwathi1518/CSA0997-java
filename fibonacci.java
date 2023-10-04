import java.util.Scanner;
public class fibo{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=input.nextInt();
        int i,n1=0,n2=1,n3;
        System.out.print(n1+","+n2);
        for(i=2;i<n;i++){
            n3=n1+n2;
            System.out.print(","+n3);
            n1=n2;
            n2=n3;
        }
    }
}
