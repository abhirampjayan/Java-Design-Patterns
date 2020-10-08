package abstactFactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory factory=FactoryProducer.getFactory(false);
        Shape shape1=factory.getShape("RECTANGLE");
        shape1.draw();
        Shape shape2=factory.getShape("SQUARE");
        shape2.draw();
        AbstractFactory factory1=FactoryProducer.getFactory(true);
        Shape shape3=factory1.getShape("RECTANGLE");
        shape3.draw();
        Shape shape4=factory1.getShape("SQUARE");
        shape4.draw();
    }
}