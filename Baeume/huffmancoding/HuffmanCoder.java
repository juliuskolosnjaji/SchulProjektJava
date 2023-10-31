package Baeume.huffmancoding;

import java.util.HashMap;
import java.util.PriorityQueue;

public class HuffmanCoder {
    private HashMap<Character, String> huffmanCodes;
    private List<BinaryTree<Character>> huffmanTreeList;

    private class HuffmanNode implements Comparable<HuffmanNode>{
        char data;
        int frequency;
        HuffmanNode left, right;

        public HuffmanNode(char data, int frequency){
            this.data = data;
            this.frequency = frequency;
            left = right = null;
        }

        @Override
        public int compareTo(HuffmanNode node){
            return this.frequency - node.frequency;
        }
    }

    public List<BinaryTree<Zeichen>> createTree(String pInput) {
        huffmanCodes = new HashMap<>();
        PriorityQueue<HuffmanNode> queue = new PriorityQueue<>();
        huffmanTreeList = new List<>();


        HashMap<Character, Zeichen> freqMap = new HashMap<>();
        for (char c : pInput .toCharArray()) {
            if (freqMap.containsKey(c)) {
                freqMap.get(c).raiseCount();
            } else {
                freqMap.put(c, new Zeichen(c));
            }
        }
        for (Zeichen zeichen : freqMap.values()) {
            HuffmanNode node = new HuffmanNode(zeichen, zeichen.getCount());
            queue.add(node);
            huffmanTreeList.append(new BinaryTree<>(node));
        }

    }
    public String zipText(String pInput){
        String result;
        result = "";
        
        return result;

    }
    public void unzipText(String pText){

    }
}
