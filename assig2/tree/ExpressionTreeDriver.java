package part3;

public class ExpressionTreeDriver
{
  public static void main(String[] args)
  {
    ValueNode two = new ValueNode(2);
    ValueNode three = new ValueNode(3);
    ValueNode eight = new ValueNode(8);
    OpNode eightTimesThree = new OpNode(eight, "*", three);
    OpNode twoPlusEightTimesThree = new OpNode(two, "+" , eightTimesThree);
    ExpressionTree tree = new ExpressionTree(twoPlusEightTimesThree);
    //System.out.println("print():");
    //tree.print();
    //System.out.println("evaluate");
    //System.out.println("" + tree.evaluate());
    //System.out.println("");

  }
}
