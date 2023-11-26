package num2;

public class Rectangle extends Figure{
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void perimeter() {
        if (getA()>0 && getB()>0) {
            System.out.println("Периметр прямоугольника: " + 2 * (getA() + getB()));
        } else{
            System.out.println("Стороны должны быть больше 0");
        }

    }

    @Override
    public void area() {
        if (getA()>0 && getB()>0) {
            System.out.println("Площадь прямоугольника: " + getA() * getB());
        }else{
            System.out.println("Стороны должны быть больше 0");
        }
    }
}
