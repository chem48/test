import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction implements ActionListener {
    JTextField field1;
    JTextField field2;

    public ButtonAction(){};

    public ButtonAction(JTextField field1, JTextField field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Swop field"){
            String oldValue = field1.getText();
            field1.setText(field2.getText());
            field2.setText(oldValue);
        } else if(e.getActionCommand() == "Close") {
            System.exit(0);
        }
    }
}
