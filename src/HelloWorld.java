import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HelloWorld {
	public static void main (String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				//createAndShowGUI();
				Form form =new Form();
			}
		});
	}
}
