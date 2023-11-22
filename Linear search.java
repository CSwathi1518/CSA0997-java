import java.util.Scanner;
public class ascending{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n=input.nextInt();
        int i;
        int a[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the element to be searched: ");
        int d=sc.nextInt();
        for(i=0;i<n;i++){
            if(a[i]==d){
                break;
            }
        }
        if(i<n){
            System.out.println("element "+d+" found at the location: "+(i+1));
        }
        else{
            System.out.println("element not found");
        }
    }
}
