package tree;
 /**
 * ValueNode is an implementation of TreeNode that has two methods. ValueNodes
 * are the leaves of the ExpressionTree and these only return its value and print
 * it's value when evaluate and print are called respectivly.
 *
 * @author Ahmed Naeem(100602243) and Onyedikachi Kalu(100557846)
 **/
public class ValueNode implements TreeNode
{
  private int value;

  public ValueNode(int _value) {
    value = _value;
  }

  public void print() {
    System.out.println(value);
  }

  public double evaluate() {
    return value;
  }
}
