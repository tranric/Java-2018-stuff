public class Card {
    private int faceValue;
    private int suitValue;

    public Card(int faceValue, int suitValue) {
        this.faceValue = faceValue;
        this.suitValue = suitValue;
    }

    public int getFaceValue() {
        return faceValue;
    }
    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public int getSuitValue() {
        return suitValue;
    }
    public void setSuitValue(int suitValue) {
        this.suitValue = suitValue;
    }
}
