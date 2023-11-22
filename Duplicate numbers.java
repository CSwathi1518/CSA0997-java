import java.util.*;
class dup{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=input.nextInt();
        int i,j;
        int a[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        System.out.println("Duplicate elements are: ");
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    System.out.println(a[j]);
                }
            }
        }
    }
}
