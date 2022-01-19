class Line implements Shape {

    @Override
    public String shapeName(double[] points, double radius) {
        double point = 2.0D;
        double rad = 0.0D;
        if (point == (double)points.length && radius == rad) {
            return "Line";
        } else {
            return "No such figure";
        }
    }
}
