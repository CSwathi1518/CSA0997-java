import java.util.*;
class revstr{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("String: ");
        String n=input.nextLine();
        String revstr="";
        for(int i=0;i<n.length();i++){
            revstr=n.charAt(i)+revstr;
        }
        System.out.print("Reverse String: "+revstr);
    }
}
