import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Box extends JPanel {
    Cell cell;

    public Box(int x, int y) {
        super();
        cell = new Cell();
        setBounds(x * Config.SIZE, y * Config.SIZE, Config.SIZE, Config.SIZE);
        setBackground(Config.getColor(Status.NONE));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                cell.turn();
            }
        });
    }

    public void intCell(int x, int y) {

    }

    public void setColor() {
        setBackground(Config.getColor(cell.status));
    }

    void step1() {
        cell.stepOne();
        setColor();
    }

    void step2() {
        cell.stepTwo();
        setColor();
    }
}
