import BinaryTree;
public class TraverseTree{
  public void TraverseTree(){}
  public static String midOrder(pTree BinaryTree<Character>) {
    if (pTree == null) {return "";}

    if(pTree.getContent() != null) {
      return (pTree.getContent() + preOrder(pTree.getLeftTree()) + preOrder(pTree.getRightTree()));
    } else {
      return (preOrder(pTree.getLeftTree()) + preOrder(pTree.getRightTree()));
    }
  }

  public static String preOrder(pTree BinaryTree<Character>) {
    if (pTree == null){ return "";}
    if(pTree.getContent() != null) {
      return (pTree.getContent() + preOrder(pTree.getLeftTree()) + preOrder(pTree.getRightTree()));
    } else {
      return (preOrder(pTree.getLeftTree()) + preOrder(pTree.getRightTree()));
    }
  }

  public static String postOrder(pTree BinaryTree<Character>) {
    if (pTree == null){ return "";}

    if(pTree.getContent() != null) {
      return (preOrder(pTree.getLeftTree()) + preOrder(pTree.getRightTree()) + pTree.getContent());
    } else {
      return (preOrder(pTree.getLeftTree()) + preOrder(pTree.getRightTree()));
    }
  }
}
