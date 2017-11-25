package part3;
import java.util.*;
public class OpNode implements TreeNode
{
  private String value;
  private TreeNode leftOp;
  private TreeNode rightOp;

  public OpNode(TreeNode left, String d, TreeNode right)
  {
    value = d;
    leftOp = left;
    rightOp = right;
  }


  public double evaluate()
  {
    if (value == "/")
    {
      return (leftOp.evaluate()/rightOp.evaluate());
    }
    else if (value == "+")
    {
      return (leftOp.evaluate()+rightOp.evaluate());
    }
    else if (value == "-")
    {
      return (leftOp.evaluate()-rightOp.evaluate());
    }
    else
    {
      return (leftOp.evaluate()*rightOp.evaluate());
    }
  }
}
