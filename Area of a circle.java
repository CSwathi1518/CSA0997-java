import java.util.Scanner;
class circle{
    double radius;
    void getdata(float r){
        radius=r;
    }
    double circlearea(){
        double area;
        area=(3.14*radius*radius);
        return (area);
    }
}
class circlearea{
    public static void main(String[] args){
        double a1,a2;
        circle cir1=new circle();
        cir1.getdata(6);
        a1=cir1.circlearea();
        circle cir2=new circle();
        cir2.getdata(8);
        a2=cir2.circlearea();
        System.out.println("Area of the circle: "+a1);
        System.out.println("Area of the circle: "+a2);
        
    }
}
