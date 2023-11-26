package num2;

public class Triangle extends Figure{
    private int a;
    private int b;
    private int c;


    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public void perimeter() {
        int per = getA() + getB() + getC();
        if (getA() > 0 && getB() > 0 && getC() > 0) {
            if (getA() + getB() > getC() && getA() + getC() > getB() &&  getC() + getB() > getA()) {
                        System.out.println("Периметр треугольника: " + per);
                    } else {
                        System.out.println("Такого треугольника не существует");
                    }
                } else {
                    System.out.println("Стороны должны быть больше 0");
                }

            }



            @Override
            public void area () {
                double p = (getA() + getB() + getC()) / 2;
                double s0 = p * (p - getA()) * (p - getB()) * (p - getC());
                double s = Math.sqrt(s0);
                if (getA() > 0 && getB() > 0 && getC() > 0) {
                    if (getA() + getB() > getC() && getA() + getC() > getB() &&  getC() + getB() > getA()) {
                                System.out.println("Площадь треугольника: " + s);
                            } else {
                                System.out.println("Такого треугольника не существует");
                            }
                } else {
                    System.out.println("Стороны должны быть больше 0");
                }

            }
        }


