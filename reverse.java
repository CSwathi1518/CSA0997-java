import java.util.Scanner;
public class reverse{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=input.nextInt();
        int r,rev=0;
        while(n!=0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.print("reverse numbers are:"+rev);
    }
}
