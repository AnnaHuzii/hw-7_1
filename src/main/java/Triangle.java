class Triangle implements Shape{
      @Override
    public String shapeName(double[] points, double radius) {
          double point = 3.0D;
          double rad = 0.0D;
        if (point == (double)points.length && radius == rad) {
            return "Triangle";
        } else {
            return "No such figure";
        }
    }
}
