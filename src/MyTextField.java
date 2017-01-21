import javax.swing.*;
import java.awt.*;


public class MyTextField extends JTextField {

    private String hint;

    public MyTextField(String hint) {
        this.hint = hint;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(getText().isEmpty()) {
            g.setColor(Color.blue);
            g.drawString(hint, 5, 18);
        }
    }
}
