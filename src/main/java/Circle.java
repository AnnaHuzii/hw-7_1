class Circle implements Shape{
    @Override
    public String shapeName(double[] points, double radius) {

        double point = 0.0D;
        double rad = 0.0D;
        return 0.0D == (double)points.length && radius > 0.0D ? "Circle" : "No such figure";
    }
}
