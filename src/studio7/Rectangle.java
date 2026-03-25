public class Rectangle {
    private double length;
    private double width;
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    public boolean isItASquare(){
        if (length==width){
            return true;
        }
        else {
            return false;
        }
    }
    public double perimeter(){
        return (length*2 + width*2);
    }
    public double area(){
        return(length*width);
    }
    public boolean isItBigger(Rectangle r){
        if(length*width > r.area()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Rectangle r1 = new Rectangle(3,3);
        Rectangle r2 = new Rectangle(2,5);
        System.out.println(r1.isItASquare());
        System.out.println(r2.isItASquare());
        System.out.println(r1.isItBigger(r2));
    }
}
