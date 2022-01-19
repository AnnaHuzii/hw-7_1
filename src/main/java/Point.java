class Point implements Shape {

    @Override
    public String shapeName(double[] points, double radius) {
        double point = 1.0D;
        double rad = 0.0D;
        if (point == (double) points.length && radius == rad) {
            return "Point";
        }else {
            return "No such figure";
        }
    }
}