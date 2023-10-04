import java.util.Scanner;
public class reverse{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=input.nextInt();
        int i,sum=0;
        for(i=1;i<=n;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println("sum of even digits in a range"+n+"is:"+sum);
    }
}
