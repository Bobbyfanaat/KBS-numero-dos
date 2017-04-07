package TSPSimulator;

public class Simulator {

    public static void main(String[] args){
        Robot r = new Robot();
        System.out.println(r.getPosition());
        r.setPosition("A", 3);
        System.out.println(r.getPosition());
    }

}
