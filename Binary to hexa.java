import java.util.*;
class bintohex{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        String n=input.nextLine();
        int dec=Integer.parseInt(n,2);
        String hex=Integer.toHexString(dec);
        System.out.print("Hexadecimal number is: "+hex);
    }
}
