import num1.Accountant;
import num1.Director;
import num1.Post;
import num1.Worker;
import num2.Circle;
import num2.Figure;
import num2.Rectangle;
import num2.Triangle;

public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println("Задание 1: ");
        Accountant accountant = new Accountant();
        Director director = new Director();
        Worker worker = new Worker();

        accountant.inf();
        director.inf();
        worker.inf();

        testInterface(accountant);
        testInterface(director);
        testInterface(worker);

        System.out.println();
        System.out.println("Задание 2: ");

        Circle circle = new Circle(0);
        Circle circle1 = new Circle(2);
        Rectangle rectangle = new Rectangle(12,4);
        Triangle triangle = new Triangle(4,5,5);
        Triangle triangle1 = new Triangle(1,1,2);


        Figure[] figures = new Figure[5];
        figures[0]=circle;
        figures[1]=rectangle;
        figures[2]=triangle;
        figures[3]=circle1;
        figures[4]=triangle1;


        for (int i = 0; i < figures.length; i++) {
            figures[i].area();
            figures[i].perimeter();
        }

        System.out.println();
        System.out.println("Задание *: ");

        Clone clone = new Clone();
        clone.x=10;
        clone.y=20;
        System.out.println("x= "+clone.x+" y= "+clone.y);


        for (int i = 0; i < clone.mas.length; i++) {
            System.out.print(clone.mas[i]+ " ");
        }
        Clone cloneClone = (Clone) clone.clone();
        System.out.println("\nКлонированный объект: x= "+cloneClone.x+" y= "+clone.y);
        for (int i = 0; i <cloneClone.mas.length ; i++) {
            System.out.print( cloneClone.mas[i]+" ");
        }


    }
    public static void testInterface(Post post){
        post.inf();
    }
}