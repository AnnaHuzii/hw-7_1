public class FigureName{
    String printPoint(Shape shape){
      return shape.shapeName(new double[]{1.0D}, 0.0D);
    }
    String printLine(Shape shape){
        return shape.shapeName(new double[]{1.0D,2.0D}, 0.0D);
    }
    String printTriangle(Shape shape){
        return shape.shapeName(new double[]{1.0D,2.0D,3.0D}, 0.0D);
    }
    String printQuadRect(Shape shape){
        return shape.shapeName(new double[]{2.0D,2.0D,2.0D,2.0D}, 0.0D);
    }
    String printCircle(Shape shape){
        return shape.shapeName(new double[]{}, 1.0D);
    }
}
