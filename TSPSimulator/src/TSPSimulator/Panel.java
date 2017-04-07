package TSPSimulator;

import java.awt.FlowLayout;
import javax.swing.JFrame;

public class Panel extends JFrame {

    public Panel(Square s) {
        setSize(400, 300);
        setTitle("De Kast");
        setLayout(new FlowLayout());

        PanelPaint pp = new PanelPaint();

        add(pp);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
