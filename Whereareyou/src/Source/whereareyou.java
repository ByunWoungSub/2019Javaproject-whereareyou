package Source;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
class Window extends JFrame implements ActionListener {
	Window() {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.white);

		setTitle("Where are you?");
		this.setLayout(new FlowLayout());

		JButton StudentOut = new JButton(new ImageIcon("./downmark.png"));
		StudentOut.setBorderPainted(false);
		StudentOut.setFocusPainted(true);
		StudentOut.setContentAreaFilled(false);

		StudentOut.addActionListener(this);

		this.add(StudentOut);
		JButton StudentIn = new JButton("In");
		this.add(StudentIn);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 700);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}

public class whereareyou {
	public static void main(String[] args) {
		new Window();
	}
}
