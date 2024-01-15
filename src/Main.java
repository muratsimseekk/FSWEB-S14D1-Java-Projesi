import com.workintech.model.Circle;
import com.workintech.model.Cuboid;
import com.workintech.model.Cylinder;
import com.workintech.model.Rectangle;

public class Main {
    public static void main(String[] args) {

        System.out.println("*********** Silindir icin **********");

        Circle circle = new Circle(3.75) ;

        System.out.println("Circle Radius = " + circle.getRadius());
        System.out.println("Circle area = " +circle.getArea());

        Cylinder cylinder = new Cylinder(5.55 , 7.25);

        System.out.println("Cylinder Radius = " + cylinder.getRadius());
        System.out.println("Cylinder Height = " + cylinder.getHeight());
        System.out.println("Cylinder Area = " + cylinder.getArea());
        System.out.println("Cylinder Volume = " + cylinder.getVolume());

        System.out.println("*********** Havuz Icin **********");

        Rectangle rectangle = new Rectangle(5,10);

        System.out.println("Rectangle width = " + rectangle.getWidth());
        System.out.println("Rectangle length = " + rectangle.getLength());
        System.out.println("Rectangle area = " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("Cuboid width = " + cuboid.getWidth());
        System.out.println("Cuboid length = " + cuboid.getLength());
        System.out.println("Cuboid Area = " + cuboid.getArea());
        System.out.println("Cuboid Height = " + cuboid.getHeight());
        System.out.println("Cuboid Volume = " + cuboid.getVolume());


    }
}