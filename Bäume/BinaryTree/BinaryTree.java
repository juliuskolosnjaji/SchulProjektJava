public class BinaryTree<contentType> {

    BinaryTree<contentType> leftTree;
    BinaryTree<contentType> rightTree;
    contentType content;

    public BinaryTree() {
        this.leftTree = null;
        this.rightTree = null;
        this.content = null;
    }

    public BinaryTree(contentType pContent) {
        this.leftTree = new BinaryTree<contentType>();
        this.rightTree = new BinaryTree<contentType>();
        this.content = pContent;
    }

    public BinaryTree(contentType pContent, BinaryTree<contentType> pLeftTree, BinaryTree<contentType> pRightTree) {
        this.leftTree = pLeftTree;
        this.rightTree = pRightTree;
        this.content = pContent;
    }

    public void setContent(contentType pContent) {
        if(content == null){
            leftTree = new BinaryTree<contentType>();
            rightTree = new BinaryTree<contentType>();
        }
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
        rightTree = pTree;
    }

    public void setLeftTree(BinaryTree<contentType> pTree){
        leftTree = pTree;
    }

}