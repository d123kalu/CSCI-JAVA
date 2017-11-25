package part3;
import java.util.*;
public class ValueNode implements TreeNode
{
  private double value;
  public ValueNode(double d)
  {
    this.value = d;
  }

  public void print()
  {
    System.out.println(value);
  }

  public double evaluate()
  {
    return value;
  }
}
