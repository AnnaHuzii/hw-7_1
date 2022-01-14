public class Shape {
    public Shape() {
    }

    public static void main(String[] args) {
        FigureOutput typeShape = new FigureOutput();
        System.out.println(typeShape.getShape(new double[]{1.0D}, 0.0D));
        System.out.println(typeShape.getShape(new double[]{1.0D, 2.0D}, 0.0D));
        System.out.println(typeShape.getShape(new double[]{1.0D, 2.0D, 3.0D}, 0.0D));
        System.out.println(typeShape.getShape(new double[]{2.0D, 2.0D, 2.0D, 2.0D}, 0.0D));
        System.out.println(typeShape.getShape(new double[]{1.0D, 2.0D, 2.0D, 4.0D}, 0.0D));
        System.out.println(typeShape.getShape(new double[0], 1.0D));
    }
}
