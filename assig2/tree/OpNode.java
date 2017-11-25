package tree;
/**
 * OpNode is an implementation of TreeNode and has two methods. One is
 * evaluate which recursively evaluates it's node. The other is print which
 * prints its operation and recursively prints it's children
 *
 * @author Ahmed Naeem(100602243) and Onyedikachi Kalu(100557846)
**/

public class OpNode implements TreeNode
{
  private String operation;
  private TreeNode left;
  private TreeNode right;

  public OpNode(TreeNode _left, String _operation, TreeNode _right)
  {
    left = _left;
    operation = _operation;
    right = _right;
  }
  
  public void print() {
    System.out.println(operation);
    left.print();
    right.print();
  }

  public double evaluate()
  {
    if (operation == "/")
    {
      return (left.evaluate()/right.evaluate());
    }
    else if (operation == "+")
    {
      return (left.evaluate()+right.evaluate());
    }
    else if (operation == "-")
    {
      return (left.evaluate()-right.evaluate());
    }
    else
    {
      return (left.evaluate()*right.evaluate());
    }
  }
}
