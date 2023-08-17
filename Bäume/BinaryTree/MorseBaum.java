public class MorseBaum{
    BinaryTree<Character> myTree;
    public MorseBaum(){
        initialize();
    }

    public void initialize(){
        //create Tre
        BinaryTree<Character> hBaum = new BinaryTree<Character>(new Character('h'));
        BinaryTree<Character> vBaum = new BinaryTree<Character>(new Character('v'));
        BinaryTree<Character> sBaum = new BinaryTree<Character>(new Character('s'), hBaum, vBaum);
    }

    public String decode(String pCode){return pCode;}

    public void encode(String pText){}
}
