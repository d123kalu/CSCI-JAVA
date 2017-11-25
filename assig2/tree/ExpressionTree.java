package tree;
/*
 * ExpressionTree is the tree to be evaluated and consists of TreeNode. It has
 * two methods, evaluate and print which call on TreeNodes.
 *
 * @author Ahmed Naeem(100602243) and Onyedikachi Kalu(100557846)
*/

public class ExpressionTree implements TreeNode
{
  public TreeNode root;

  public ExpressionTree(TreeNode _root)
  {
    root = _root;
  }

  public double evaluate()
  {
    return root.evaluate();
  }
  public void print()
  {
    root.print();
  }
}
