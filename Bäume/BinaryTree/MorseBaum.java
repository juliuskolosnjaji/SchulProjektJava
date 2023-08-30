public class MorseBaum{
    String[] encode_data;
    BinaryTree<Character> myTree;
    
    public MorseBaum(){
        initialize();
        System.out.println(myTree);
    }

    public void initialize(){
        // First Layer
        BinaryTree<Character> hBaum = new BinaryTree<Character>(new Character('h'));
        BinaryTree<Character> vBaum = new BinaryTree<Character>(new Character('v'));
        BinaryTree<Character> fBaum = new BinaryTree<Character>(new Character('f'));
        BinaryTree<Character> lBaum = new BinaryTree<Character>(new Character('l'));
        BinaryTree<Character> pBaum = new BinaryTree<Character>(new Character('p'));
        BinaryTree<Character> jBaum = new BinaryTree<Character>(new Character('j'));
        BinaryTree<Character> bBaum = new BinaryTree<Character>(new Character('b'));
        BinaryTree<Character> xBaum = new BinaryTree<Character>(new Character('x'));
        BinaryTree<Character> cBaum = new BinaryTree<Character>(new Character('c'));
        BinaryTree<Character> zBaum = new BinaryTree<Character>(new Character('z'));
        BinaryTree<Character> qBaum = new BinaryTree<Character>(new Character('q'));
        BinaryTree<Character> yBaum = new BinaryTree<Character>(new Character('y'));

        // Second Layer
        BinaryTree<Character> sBaum = new BinaryTree<Character>(new Character('s'), hBaum, vBaum);
        BinaryTree<Character> uBaum = new BinaryTree<Character>(new Character('u'), fBaum, null);
        BinaryTree<Character> rBaum = new BinaryTree<Character>(new Character('r'), lBaum, null);
        BinaryTree<Character> wBaum = new BinaryTree<Character>(new Character('w'), pBaum, jBaum);
        BinaryTree<Character> dBaum = new BinaryTree<Character>(new Character('d'), bBaum, xBaum);
        BinaryTree<Character> kBaum = new BinaryTree<Character>(new Character('k'), cBaum, yBaum);
        BinaryTree<Character> gBaum = new BinaryTree<Character>(new Character('g'), zBaum, qBaum);
        BinaryTree<Character> oBaum = new BinaryTree<Character>(new Character('o'));

        //Third Layer
        BinaryTree<Character> iBaum = new BinaryTree<Character>(new Character('i'), sBaum, uBaum);
        BinaryTree<Character> aBaum = new BinaryTree<Character>(new Character('a'), rBaum, wBaum);
        BinaryTree<Character> nBaum = new BinaryTree<Character>(new Character('n'), dBaum, kBaum);
        BinaryTree<Character> mBaum = new BinaryTree<Character>(new Character('m'), gBaum, oBaum);
        
        //Fourth Layer
        BinaryTree<Character> eBaum = new BinaryTree<Character>(new Character('e'), iBaum, aBaum);
        BinaryTree<Character> tBaum = new BinaryTree<Character>(new Character('t'), nBaum, mBaum);

        myTree = new BinaryTree<Character>(new Character('/'), eBaum, tBaum);

        System.out.println("Initialized!");
    }

    public String decode(String pCode){return pCode;}

    public String encode(Character pSex){
        System.out.println(myTree == null);
        return encode(pSex, myTree);
    }

	String encode(Character pSex, BinaryTree<Character> pBinaryTree){
        if(pBinaryTree == null){
            return "";
        }

        String r2String = encode(pSex, pBinaryTree.getRightTree());
        String r1String = encode(pSex, pBinaryTree.getLeftTree());

        if(r2String != ""){
            return "-" + r2String;
        }
        if(r1String != ""){
            return "." + r1String;
        }
        
        if(pBinaryTree.getLeftTree() != null && pBinaryTree.getLeftTree().getContent() != null){
            System.out.print("bruh1");
            if(pBinaryTree.getLeftTree().getContent().equals(pSex)) {
                return ".";
            }
        }
        if(pBinaryTree.getRightTree() != null && pBinaryTree.getRightTree().getContent() != null){
            System.out.print("bruh2");
            if(pBinaryTree.getRightTree().getContent().equals(pSex)) {
                return "-";
            }
        }
        return "!";
    }
    public static void main(String args[]){
        MorseBaum Baum = new MorseBaum();
        String encodedBaum = Baum.encode(new Character('t'));
        System.out.println(encodedBaum);
    }
}