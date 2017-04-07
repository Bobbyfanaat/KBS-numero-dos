package TSPSimulator;

public class Square {
    private static int height = 5;
    private static int width = 5;
    private String xPosition;
    private int yPosition;
    private boolean filled = false;

    public Square(String xPos, int yPos){
        xPosition = xPos;
        yPosition = yPos;
    }

    public void setFill(){
        this.filled = true;
    }

    public String toString(){
        String yPos = String.valueOf(yPosition);
        return xPosition + yPos;
    }
}
