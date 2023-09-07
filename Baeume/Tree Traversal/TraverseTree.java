public class TraverseTree{
  public String inOrder (pTree BinaryTree<Character>){
    String rückgabe = "";
    if(pTree.getContent == null){
    } else {
      rückgabe = inOrder(pTree.getLeftTree());
      rückgabe.concat(pTree.getContent());
      rückgabe.concat(inOrder(pTree.getRightTree()));
    }
    return (rückgabe);
  }

  public String preOrder(pTree BinaryTree<Character>){
    String rückgabe = "";
    if(pTree.getContent() != null){
      rückgabe = preOrder(pTree.getContent() + "");
      preOrder(pTree.getLeftTree());
      preOrder(pTree.getRightTree());
    }
    return (rückgabe);
  }

  public String postOrder(pTree BinaryTree<Character>){
    String rückgabe = "";
    if (pTree.getContent() != null){
      postOrder(pTree.getLeftTree());
      postOrder(pTree.getRightTree());
      rückgabe = pTree.getContent() + " ";
    }
    return (rückgabe);
  }
}
