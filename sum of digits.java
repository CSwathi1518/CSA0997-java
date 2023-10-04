import java.util.Scanner;
public class sumofdigits{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=input.nextInt();
        int r,sum=0;
        while(n!=0){
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.print("sum of digits is:"+sum);
    }
}
