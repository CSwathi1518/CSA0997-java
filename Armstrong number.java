import java.util.Scanner;
public class arm{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int n1=input.nextInt();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the ending number: ");
        int n2=sc.nextInt();
        System.out.println("Armstrongs numbers in between "+n1+" to "+n2+" are: ");
        for(int i=n1;i<=n2;i++){
             int n,sum=0,r;
             n=i;
             while(n!=0){
                  r=n%10;
                  sum=sum+(r*r*r);
                  n=n/10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}
