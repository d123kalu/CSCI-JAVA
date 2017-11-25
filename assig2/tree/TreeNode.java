package tree;
/**
 *TreeNode is the abstract base class that is inherited by OpNode and ValueNode.
 *
 * @author Ahmed Naeem(100602243) and Onyedikachi Kalu(100557846)
**/
public abstract interface TreeNode {

  public abstract void print();
  public abstract double evaluate();
}
