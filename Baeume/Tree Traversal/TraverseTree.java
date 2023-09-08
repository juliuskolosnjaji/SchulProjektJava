public class TraverseTree{
  public static void TraverseTree(){
    MorseBaum Baum = new MorseBaum();
    System.out.println(midOrder(Baum.myTree));
    System.out.println(preOrder(Baum.myTree));
    System.out.println(postOrder(Baum.myTree));
  }
  public static String midOrder(BinaryTree<Character> pTree) {
    if (pTree == null) {return "";}
    if(pTree.getContent() != null) {
      return (midOrder(pTree.getLeftTree()) + pTree.getContent() + midOrder(pTree.getRightTree()));
    } else {
      return (midOrder(pTree.getLeftTree()) + midOrder(pTree.getRightTree()));
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
      return (postOrder(pTree.getLeftTree()) + postOrder(pTree.getRightTree()) + pTree.getContent());
    } else {
      return (postOrder(pTree.getLeftTree()) + postOrder(pTree.getRightTree()));
    }
  }
  public static void main(String args[]){
    TraverseTree();
  }
}
