package TSPSimulator;

public class Robot {
    private String position = "D4";

    public void setPosition(String x, int y){
        String yPos = String.valueOf(y);
        position = x + yPos;
    }
    public String getPosition(){
        return position;
    }
}
