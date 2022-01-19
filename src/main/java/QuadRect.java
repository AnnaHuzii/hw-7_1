class QuadRect implements Shape {

    @Override
    public String shapeName(double[] points, double radius) {
        double point = 4.0D;
        double rad = 0.0D;
        if (point == (double)points.length && radius == rad) {
            double x1 = points[0];
            double y1 = points[1];
            double x2 = points[2];
            double y2 = points[3];
            double vertLine = x2 - x1;
            double horizLine = y2 - y1;
            return vertLine == horizLine ? "Quadrate" : "Rectangle";
        } else {
            return "No such figure";
        }
    }
}