package prompt;

public class Triangle extends Figure{
    double perimeter;

    Triangle(double a, double b){
        super(a, b);
        this.perimeter = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public double area(double a, double b){
        return a * b / 2;
    }
}
