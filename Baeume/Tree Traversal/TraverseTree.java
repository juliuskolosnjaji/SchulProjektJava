public class TraverseTree{
  public void TraverseTree(){}
  public static String midOrder(BinaryTree<Character> pTree) {
    if (pTree == null) {return "";}

    if(pTree.getContent() != null) {
      return (pTree.getContent() + preOrder(pTree.getLeftTree()) + preOrder(pTree.getRightTree()));
    } else {
      return (preOrder(pTree.getLeftTree()) + preOrder(pTree.getRightTree()));
    }
  }

  public static String preOrder(BinaryTree<Character> pTree) {
    if (pTree == null){ return "";}
    if(pTree.getContent() != null) {
      return (pTree.getContent() + preOrder(pTree.getLeftTree()) + preOrder(pTree.getRightTree()));
    } else {
      return (preOrder(pTree.getLeftTree()) + preOrder(pTree.getRightTree()));
    }
  }

  public static String postOrder(BinaryTree<Character> pTree) {
    if (pTree == null){ return "";}

    if(pTree.getContent() != null) {
      return (preOrder(pTree.getLeftTree()) + preOrder(pTree.getRightTree()) + pTree.getContent());
    } else {
      return (preOrder(pTree.getLeftTree()) + preOrder(pTree.getRightTree()));
    }
  }
}
