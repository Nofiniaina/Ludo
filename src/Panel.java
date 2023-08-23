
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class Panel extends JPanel {
    final static int BOX_SIZE = 40;
    Panel(){
        setPreferredSize(new Dimension(680,680));
        setFocusable(true);

    }
    public void homeRect(Graphics2D g2, int x, int y, int colorNumber){
        Color color = null;
        int tempX = x;
        int tempY = y;
        switch (colorNumber){
            case 2 :
                color = new Color(0,176,80);
                break;
            case 1 :
                color = new Color(255,0,0);
                break;
            case 3 :
                color = new Color(255,255,0);
                break;
            case 4 :
                color = new Color(0,176,240);
                break;
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j>0 && j<5){
                    if (i==0 || i==5){
                        g2.setColor(color);
                        g2.fillRect(x,y,BOX_SIZE,BOX_SIZE);
                    }
                }
                else {
                    g2.setColor(color);
                    g2.fillRect(x,y,BOX_SIZE,BOX_SIZE);
                }
                x += BOX_SIZE;
            }
            x = tempX;
            y += BOX_SIZE;
        }
    }
    public void boxLine(Graphics2D g2){
        int xLineO = BOX_SIZE*7;
        int yLineO = BOX_SIZE;
        int xLine = BOX_SIZE*10;
        int yLine = BOX_SIZE;
        for (int i = 0; i < 7; i++) {
            g2.setColor(Color.BLACK);
            g2.drawLine(xLineO, yLineO, xLine, yLine);
            yLineO += BOX_SIZE;
            yLine += BOX_SIZE;
        }
        yLineO += BOX_SIZE*2;
        yLine += BOX_SIZE*2;
        for (int i = 0; i < 7; i++) {
            g2.setColor(Color.BLACK);
            g2.drawLine(xLineO, yLineO, xLine, yLine);
            yLineO += BOX_SIZE;
            yLine += BOX_SIZE;
        }
        xLineO = BOX_SIZE;
        yLineO = BOX_SIZE*7;
        xLine = BOX_SIZE;
        yLine = BOX_SIZE*10;
        for (int i = 0; i < 7; i++) {
            g2.setColor(Color.BLACK);
            g2.drawLine(xLineO, yLineO, xLine, yLine);
            xLineO += BOX_SIZE;
            xLine += BOX_SIZE;
        }
        xLineO += BOX_SIZE*2;
        xLine += BOX_SIZE*2;
        for (int i = 0; i < 7; i++) {
            g2.setColor(Color.BLACK);
            g2.drawLine(xLineO, yLineO, xLine, yLine);
            xLineO += BOX_SIZE;
            xLine += BOX_SIZE;
        }
        xLineO = BOX_SIZE;
        yLineO = BOX_SIZE*7;
        xLine = BOX_SIZE*7;
        yLine = BOX_SIZE*7;
        for (int i = 0; i < 4; i++) {
            g2.setColor(Color.BLACK);
            g2.drawLine(xLineO, yLineO, xLine, yLine);
            yLineO += BOX_SIZE;
            yLine += BOX_SIZE;
        }
        xLineO = BOX_SIZE*10;
        yLineO = BOX_SIZE*7;
        xLine = BOX_SIZE*16;
        yLine = BOX_SIZE*7;
        for (int i = 0; i < 4; i++) {
            g2.setColor(Color.BLACK);
            g2.drawLine(xLineO, yLineO, xLine, yLine);
            yLineO += BOX_SIZE;
            yLine += BOX_SIZE;
        }
        xLineO = BOX_SIZE*8;
        yLineO = BOX_SIZE;
        xLine = BOX_SIZE*8;
        yLine = BOX_SIZE*7;
        for (int i = 0; i < 2; i++) {
            g2.setColor(Color.BLACK);
            g2.drawLine(xLineO, yLineO, xLine, yLine);
            xLineO += BOX_SIZE;
            xLine += BOX_SIZE;
        }
        xLineO = BOX_SIZE*8;
        yLineO = BOX_SIZE*10;
        xLine = BOX_SIZE*8;
        yLine = BOX_SIZE*16;
        for (int i = 0; i < 2; i++) {
            g2.setColor(Color.BLACK);
            g2.drawLine(xLineO, yLineO, xLine, yLine);
            xLineO += BOX_SIZE;
            xLine += BOX_SIZE;
        }
    }
    public void eachRectColor(Graphics2D g2){
        g2.setColor(new Color(255,0,0));
        g2.fillRect(BOX_SIZE*2,BOX_SIZE*7,BOX_SIZE,BOX_SIZE);
        g2.setColor(new Color(0,176,80));
        g2.fillRect(BOX_SIZE*9,BOX_SIZE*2,BOX_SIZE,BOX_SIZE);
        g2.setColor(new Color(255,255,0));
        g2.fillRect(BOX_SIZE*14,BOX_SIZE*9,BOX_SIZE,BOX_SIZE);
        g2.setColor(new Color(0,176,240));
        g2.fillRect(BOX_SIZE*7,BOX_SIZE*14,BOX_SIZE,BOX_SIZE);

        int tempx = BOX_SIZE*2;
        int tempy = BOX_SIZE*8;
        for (int i = 0; i < 5; i++) {
            g2.setColor(new Color(255,0,0));
            g2.fillRect(tempx,tempy,BOX_SIZE,BOX_SIZE);
            tempx += BOX_SIZE;
        }
        tempx = BOX_SIZE*10;
        for (int i = 0; i < 5; i++) {
            g2.setColor(new Color(255,255,0));
            g2.fillRect(tempx,tempy,BOX_SIZE,BOX_SIZE);
            tempx += BOX_SIZE;
        }
        tempx = BOX_SIZE*8;
        tempy = BOX_SIZE*2;
        for (int i = 0; i < 5; i++) {
            g2.setColor(new Color(0,176,80));
            g2.fillRect(tempx,tempy,BOX_SIZE,BOX_SIZE);
            tempy += BOX_SIZE;
        }
        tempy = BOX_SIZE*10;
        for (int i = 0; i < 5; i++) {
            g2.setColor(new Color(0,176,240));
            g2.fillRect(tempx,tempy,BOX_SIZE,BOX_SIZE);
            tempy += BOX_SIZE;
        }
    }
    public void circleColor(Graphics2D g2){
        int x = BOX_SIZE*2+BOX_SIZE/2;
        int y = BOX_SIZE*2+BOX_SIZE/2;
        for (int i = 0; i < 2; i++) {
            g2.setColor(new Color(255,0,0));
            g2.fillOval(x,y,BOX_SIZE,BOX_SIZE);
            x += BOX_SIZE*2;
        }
        x = BOX_SIZE*11 + BOX_SIZE/2;
        for (int i = 0; i < 2; i++) {
            g2.setColor(new Color(0,176,80));
            g2.fillOval(x,y,BOX_SIZE,BOX_SIZE);
            x += BOX_SIZE*2;
        }
        y += BOX_SIZE*2;
        x = BOX_SIZE*2+BOX_SIZE/2;
        for (int i = 0; i < 2; i++) {
            g2.setColor(new Color(255,0,0));
            g2.fillOval(x,y,BOX_SIZE,BOX_SIZE);
            x += BOX_SIZE*2;
        }
        x = BOX_SIZE*11 + BOX_SIZE/2;
        for (int i = 0; i < 2; i++) {
            g2.setColor(new Color(0,176,80));
            g2.fillOval(x,y,BOX_SIZE,BOX_SIZE);
            x += BOX_SIZE*2;
        }
        x = BOX_SIZE*2+BOX_SIZE/2;
        y = BOX_SIZE*11 + BOX_SIZE/2;
        for (int i = 0; i < 2; i++) {
            g2.setColor(new Color(0,176,240));
            g2.fillOval(x,y,BOX_SIZE,BOX_SIZE);
            x += BOX_SIZE*2;
        }
        x = BOX_SIZE*11 + BOX_SIZE/2;
        for (int i = 0; i < 2; i++) {
            g2.setColor(new Color(255,255,0));
            g2.fillOval(x,y,BOX_SIZE,BOX_SIZE);
            x += BOX_SIZE*2;
        }
        y += BOX_SIZE*2;
        x = BOX_SIZE*2+BOX_SIZE/2;
        for (int i = 0; i < 2; i++) {
            g2.setColor(new Color(0,176,240));
            g2.fillOval(x,y,BOX_SIZE,BOX_SIZE);
            x += BOX_SIZE*2;
        }
        x = BOX_SIZE*11 + BOX_SIZE/2;
        for (int i = 0; i < 2; i++) {
            g2.setColor(new Color(255,255,0));
            g2.fillOval(x,y,BOX_SIZE,BOX_SIZE);
            x += BOX_SIZE*2;
        }
    }
    public void draw(Graphics2D g2){
        // color : 1 RED, 2 GREEN, 3 YELLOW, 4 BLUE

        homeRect(g2, BOX_SIZE, BOX_SIZE, 1);
        homeRect(g2, BOX_SIZE*10, BOX_SIZE, 2);
        homeRect(g2, BOX_SIZE*10, BOX_SIZE*10, 3);
        homeRect(g2, BOX_SIZE, BOX_SIZE*10, 4);
        // draw box unit
        boxLine(g2);
    }
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        Graphics2D g2 = (Graphics2D) g;
        draw(g2);
        eachRectColor(g2);
        circleColor(g2);

        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHints(rh);

        Path2D.Double triangle1 = new Path2D.Double();
        g2.setColor(new Color(255,0,0));
        triangle1.moveTo(BOX_SIZE*7,BOX_SIZE*7);
        triangle1.lineTo((BOX_SIZE*7)+(BOX_SIZE*3)/2, (BOX_SIZE*7)+(BOX_SIZE*3)/2);
        triangle1.lineTo(BOX_SIZE*7,BOX_SIZE*10);
        triangle1.closePath();
        g2.fill(triangle1);
        Path2D.Double triangle2 = new Path2D.Double();
        g2.setColor(new Color(0,176,80));
        triangle2.moveTo(BOX_SIZE*7,BOX_SIZE*7);
        triangle2.lineTo((BOX_SIZE*7)+(BOX_SIZE*3)/2, (BOX_SIZE*7)+(BOX_SIZE*3)/2);
        triangle2.lineTo(BOX_SIZE*10,BOX_SIZE*7);
        triangle2.closePath();
        g2.fill(triangle2);
        Path2D.Double triangle3 = new Path2D.Double();
        g2.setColor(new Color(255,255,0));
        triangle3.moveTo(BOX_SIZE*10,BOX_SIZE*7);
        triangle3.lineTo((BOX_SIZE*7)+(BOX_SIZE*3)/2, (BOX_SIZE*7)+(BOX_SIZE*3)/2);
        triangle3.lineTo(BOX_SIZE*10,BOX_SIZE*10);
        triangle3.closePath();
        g2.fill(triangle3);
        Path2D.Double triangle4 = new Path2D.Double();
        g2.setColor(new Color(0,176,240));
        triangle4.moveTo(BOX_SIZE*7,BOX_SIZE*10);
        triangle4.lineTo((BOX_SIZE*7)+(BOX_SIZE*3)/2, (BOX_SIZE*7)+(BOX_SIZE*3)/2);
        triangle4.lineTo(BOX_SIZE*10,BOX_SIZE*10);
        triangle4.closePath();
        g2.fill(triangle4);
    }
}

