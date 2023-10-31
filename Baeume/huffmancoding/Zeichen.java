package Baeume.huffmancoding;

public class Zeichen {
    private char zeichen;
    private int count;

    public Zeichen(char zeichen) {
        this.zeichen = zeichen;
        this.count = 1;
    }

    public char getZeichen() {
        return zeichen;
    }

    public int getCount() {
        return count;
    }

    public void raiseCount() {
        count++;
    }

    @Override
    public String toString() {
        return zeichen + ": " + count;
    }
}