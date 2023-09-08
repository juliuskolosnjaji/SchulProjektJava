public class TraverseTree{
  public void TraverseTree(){
    MorseBaum Baum = new MorseBaum();
    System.out.println(midOrder(Baum.myTree));
    System.out.println(preOrder(Baum.myTree));
    System.out.println(postOrder(Baum.myTree));
  }
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
  public static void main(String args[]){
    TraverseTree();
  }
}
