import java.util.*;
class room{
    int length;
    int breadth;
    room(int x,int y){
        length=x;
        breadth=y;
    }
    room(int s){
        length=breadth=s;
    }
    int area(){
        return (length*breadth);
    }
}
class area{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("x= ");
        int x=input.nextInt();
        System.out.print("y= ");
        int y=input.nextInt();
        System.out.print("s= ");
        int s=input.nextInt();
        room rectarea=new room(x,y);
        room sqrarea=new room(s);
        int rectanglearea=rectarea.area();
        int squarearea=sqrarea.area();
        System.out.println("Rectangle Area is: "+rectanglearea);
        System.out.println("Square Area is: "+squarearea);
    }
}
