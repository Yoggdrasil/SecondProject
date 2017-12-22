package prompt;

abstract public class Figure {
    double a, b;

    Figure (double a, double b){
        this.a = a;
        this.b = b;
    }

    abstract double area(double a, double b);
}
