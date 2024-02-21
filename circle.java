public class circle {
    private double radius;
    public circle(){
        radius = 0.00;
    }
    public circle(double r){
        if(r<0)
        {
            radius = 0.00;
        }
        else
        radius =r;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double circum(){
        return Math.PI*2*radius;
    }
    //tosting() method to output circle object
    public String toString(){
        return String.format("Circle(%.2f):Area:%.2f,Circumference:%.2f",circum(),area(),radius);
    }
   
}
