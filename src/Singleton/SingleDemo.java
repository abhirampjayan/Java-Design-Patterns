package Singleton;

public class SingleDemo {
    public static void main(String[] args) {
        SingleObject singleObject=SingleObject.getInstance();
        singleObject.showMessage();
    }
}
