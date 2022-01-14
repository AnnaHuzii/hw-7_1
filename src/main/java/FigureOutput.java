public class FigureOutput implements Point, Line, Triangle, Quad, Rectangle, Circle {
    public FigureOutput() {
    }

    public String getShape(double[] points, double radius) {
        if (1.0D == (double)points.length && radius == 0.0D) {
            return "Point";
        } else if (2.0D == (double)points.length && radius == 0.0D) {
            return "Line";
        } else if (3.0D == (double)points.length && radius == 0.0D) {
            return "Triangle";
        } else if (4.0D == (double)points.length && radius == 0.0D) {
            double x1 = points[0];
            double y1 = points[1];
            double x2 = points[2];
            double y2 = points[3];
            double vertLine = x2 - x1;
            double horizLine = y2 - y1;
            return vertLine == horizLine ? "Quadrate" : "Rectangle";
        } else {
            return 0.0D == (double)points.length && radius > 0.0D ? "Circle" : "No such figure";
        }
    }
}