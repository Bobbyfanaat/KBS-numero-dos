package TSPSimulator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelPaint extends JPanel {
    private Board b;

    public PanelPaint(){
        setPreferredSize(new Dimension(310, 250 ));
        setBackground(Color.BLACK);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.WHITE);

    }
}
