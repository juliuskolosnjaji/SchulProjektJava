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
        BinaryTree<Character> iBaum = new BinaryTree<Character>(new Character('i'), sBaum, uBaum);
        BinaryTree<Character> fBaum = new BinaryTree<Character>(new Character('f'));
        BinaryTree<Character> uBaum = new BinaryTree<Character>(new Character('u'), fBaum, null);
        BinaryTree<Character> eBaum = new BinaryTree<Character>(new Character('e'), iBaum, aBaum);
        BinaryTree<Character> aBaum = new BinaryTree<Character>(new Character('a'), rBaum, wBaum);
        BinaryTree<Character> rBaum = new BinaryTree<Character>(new Character('r'), lBaum, null);
        BinaryTree<Character> lBaum = new BinaryTree<Character>(new Character('l'));

    
    }

    public String decode(String pCode){return pCode;}

    public void encode(String pText){}
}
