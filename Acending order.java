import java.util.Scanner;
public class ascending{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n=input.nextInt();
        int i,j,temp;
        int a[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Ascending order is: ");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
