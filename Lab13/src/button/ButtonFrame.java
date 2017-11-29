package button;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class ButtonFrame extends JFrame {
	private JPanel buttonPanel;
	private static final int DEFAULT_WIDTH = 300;

	private static final int DEFAULT_HEIGHT = 200;
    public static int counter = 1;

	public ButtonFrame() {
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

		// create buttons
		JButton ChangeButton = new JButton("Change");
		JButton ResetButton = new JButton("Reset");
		JButton CloseButton = new JButton("Close");

		buttonPanel = new JPanel();

		// add buttons to panel
		buttonPanel.add(ChangeButton);
		buttonPanel.add(ResetButton);
		buttonPanel.add(CloseButton);

		// add panel to frame
		add(buttonPanel);

		// create button actions
		ColorAction ChangeAction = new ColorAction(Color.BLACK);
		ResetAction ResetAction = new ResetAction();
		CloseWindow CloseAction = new CloseWindow();
		

		// associate actions with buttons
		ChangeButton.addActionListener(ChangeAction);
		ResetButton.addActionListener(ResetAction);
		CloseButton.addActionListener(CloseAction);

	}

	/* An action listener that sets the panel's background color */
	private class ColorAction implements ActionListener {
		private Color backgroundColor;

		public ColorAction(Color c) {
			backgroundColor = c;
		}
public void actionPerformed(ActionEvent event) {
if(1%counter==0) {backgroundColor=Color.BLACK;}
else if(2%counter==0) {backgroundColor=Color.green;}
else if(3%counter==0) {backgroundColor=Color.orange;}
else if(4%counter==0) {backgroundColor=Color.pink;}
	
	
	buttonPanel.setBackground(backgroundColor);
			counter++;

		}
	}
}
class CloseWindow implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}

class ResetAction implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		ButtonFrame.counter = 1;
	}
}