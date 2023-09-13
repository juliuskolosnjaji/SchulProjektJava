public class BinarySearch extends BinaryTree{
  public void BinarySearch(){

  }
  public void insert(){}
  public void remove(){}
  public void search(){}

  public static List<contentType> postOrder() {
    if (pTree == null){ return "";}
    if(pTree.getContent() != null) {
      return (postOrder(pTree.getLeftTree()) + postOrder(pTree.getRightTree()) + pTree.getContent());
    } else {
      return (postOrder(pTree.getLeftTree()) + postOrder(pTree.getRightTree()));
    }
  }

  public void main(String[] args){

  }
}
