package num2;

public class Circle extends Figure{
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public void perimeter() {
        if(getR()>0) {
            System.out.println("Периметр круга: " + 2 * getR() * Math.PI);
        } else{
            System.out.println("Радиус должен быть больше 0");
        }
    }

    @Override
    public void area() {
        if (getR() > 0) {
            System.out.println("Площадь круга: " + Math.PI * getR() * getR());
        }else{
            System.out.println("Радиус должен быть больше 0");
        }
    }
}
