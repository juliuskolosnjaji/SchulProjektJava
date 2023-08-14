public class BinaryTree<contentType> {

    BinaryTree<contentType> leftTree;
    BinaryTree<contentType> rightTree;
    contentType content;

    public void BinaryTree() {

    }

    public BinaryTree(contentType pContent) {

    }

    public BinaryTree(contentType pContent, BinaryTree<contentType> pLeftTree, BinaryTree<contentType> pRightTree) {
        this.leftTree = pLeftTree;
        this.rightTree = pLeftTree;
        this.content = pContent;
    }

    public void setContent(contentType pContent) {
        this.content = pContent;
    }

    public contentType getContent(){
        return this.content;
    }

    public BinaryTree getLeftTree() {
        return this.leftTree;
    }

    public BinaryTree getRightTree() {
        return this.rightTree;

    }

    public void setRightTree(BinaryTree<contentType> pTree) {

    }

}