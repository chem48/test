import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HelloWorld {
	public static void main (String[] args) {
	JFrame MainForm = new JFrame("Форма");
	MainForm.setSize(500, 400);

	MainForm.setLayout(new GridBagLayout());
	//GridBagConstraints bag = new GridBagConstraints();
	//bag.gridx = 0;
	//bag.gridy =0;
	//bag.gridheight = 1;
	//bag.gridheight = 1;
	//bag.weightx = 0.0;
	//bag.weighty =0.9;
	//bag.anchor = GridBagConstraints.NORTH;
	//bag.fill = GridBagConstraints.HORIZONTAL;
	//bag.insets = new Insets(20,1,1,1);
	//bag.ipadx = 0;
	//bag.ipady = 0;
	
	
	JButton buttonSw = new JButton("Обмен значениями");
	JButton buttonCancel = new JButton("Закрыть");
	JTextField Field1 = new JTextField(15);
	JLabel Label1 = new JLabel("Первое число");
	JTextField Field2 = new JTextField(15);
	JLabel Label2 = new JLabel("Второе число");
	
	
	MainForm.add(Field1, new GridBagConstraints(1,0,1,1,0.0,0.9,GridBagConstraints.NORTH,
							 GridBagConstraints.HORIZONTAL,new Insets(5,5,5,5),0,0));
	MainForm.add(Label1, new GridBagConstraints(0,0,1,1,0.0,0.9,GridBagConstraints.NORTH,
							 GridBagConstraints.HORIZONTAL,new Insets(5,5,5,5),0,0));
	MainForm.add(Field2, new GridBagConstraints(1,2,1,1,0.0,0.9,GridBagConstraints.NORTH,
							 GridBagConstraints.HORIZONTAL,new Insets(5,5,5,5),0,0));
	MainForm.add(Label2, new GridBagConstraints(0,2,1,1,0.0,0.9,GridBagConstraints.NORTH,
							 GridBagConstraints.HORIZONTAL,new Insets(5,5,5,5),0,0));
	MainForm.add(buttonSw, new GridBagConstraints(0,3,1,1,0.0,0.9,GridBagConstraints.CENTER,
							 GridBagConstraints.HORIZONTAL,new Insets(5,5,5,5),0,0));
	MainForm.add(buttonCancel, new GridBagConstraints(1,3,1,1,0.0,0.9,GridBagConstraints.CENTER,
							 GridBagConstraints.HORIZONTAL,new Insets(5,5,5,5),0,0));
	
    
	//buttonSw.addActionListener(new clickbutton());
	
	
	

	
		
	
	MainForm.setLocationRelativeTo(MainForm);
	MainForm.pack();

	
	MainForm.setVisible(true);
	}
	
	class clickbutton implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			
		}
	}

}
