package Factory;

public class ShapeFactory {
    public Shape getShape(String str){
        if(str==null){
            return null;
        }
        else if (str.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        else if(str.equalsIgnoreCase(("RECTANGLE"))){
            return new Rectangle();
        }
        else if(str.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
