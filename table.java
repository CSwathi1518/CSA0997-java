import java.util.Scanner;
public class multiplicationtable{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=input.nextInt();
        Scanner range=new Scanner(System.in);
        System.out.print("enter the range :");
        int r=range.nextInt();
        for(int i=1;i<=r;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}
