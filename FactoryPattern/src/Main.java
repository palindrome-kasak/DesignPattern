public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ShapeFactory s = new ShapeFactory();
        Shape obj = s.getShape("SQUARE");
        obj.draw();
    }
}