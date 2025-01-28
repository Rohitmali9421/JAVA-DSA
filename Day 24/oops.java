public class oops {
    public static void main(String args[]){
        Pen p1=new Pen();
        System.out.println(p1.color);
    }
}
class Pen{
    String color="red";
    int tip=5;

    void setColor(String color){
        this.color=color;
    }
    void setTip(int tip){
        this.tip=tip;
    }
}
