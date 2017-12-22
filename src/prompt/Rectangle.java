package prompt;

public class Rectangle extends Figure{
    // protected - приватный метод хотим сделать доступным для потомков (для остальных он закрыт)
    double perimeter;

    Rectangle (double a, double b){
        super(a, b);
        this.perimeter = 2 * (a + b);
    }

    public double area(double a, double b){
        return a * b;
    }
}