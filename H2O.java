package myguidemo3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyGuiDemo3 extends JFrame implements ActionListener {

	private JTextField field1; 
	private JTextField field2;
	private JButton button1;
	private JPanel panel;
	private JLabel label1;
	private JLabel label2;
	
	
	public static void main(String[] args) {
		MyGuiDemo3 frame = new MyGuiDemo3();
		frame.setSize(500, 500);
		frame.createGUI();
		frame.setVisible(true);
		frame.setTitle("Mijn water, noem mij Henk aka Pim"); 
		
	}

	private void createGUI () {
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		Container window = getContentPane();
		window.setLayout(new FlowLayout());
		//window.setBackground(Color.BLACK);
		
		
		
		label1 = new JLabel("Wat is de x");
		field1 = new JTextField("");
		label2 = new JLabel("Wat is de y");
		field2 = new JTextField("");
		field1.setPreferredSize(new Dimension(60,20));
		field2.setPreferredSize(new Dimension(60,20));
		
		window.add(label1);
		window.add(field1);
		window.add(label2);
		window.add(field2);

		field1.setBackground(Color.cyan);
		field2.setBackground(Color.orange);	
		
		button1 = new JButton("KLIK");
		window.add(button1);
				
		button1.addActionListener(this);
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(2000,2000));
		window.add (panel);
		
	}
	
	public void actionPerformed (ActionEvent event) {
		
		Graphics paper = panel.getGraphics();
		
		paper.clearRect(0, 0, getWidth(), getHeight());
		
		int x = Integer.valueOf(field1.getText());
		int y = Integer.valueOf(field2.getText());
		
		int lijnlen = 70;
		int Osize = 100;
		int Hsize = 60;
		
		int Hrad = (int) Hsize/2;

		int water1x = x+lijnlen-Hrad;
		int water2x = x-lijnlen-Hrad;

		int water1y = y+lijnlen-Hrad;
		int water2y = y+lijnlen-Hrad;

		paper.drawLine(x, y, water1x+Hrad, water1y+Hrad);
		paper.drawLine(x, y, water2x+Hrad, water2y+Hrad);


		paper.setColor(Color.RED);

		paper.fillOval(water1x, water1y, Hsize, Hsize);
		paper.fillOval(water2x, water2y, Hsize, Hsize);



		paper.setColor(Color.BLUE);
		paper.fillOval((int) (x-(Osize/2)),(int) (y-(Osize/2)),Osize,Osize);
		
		
		
		//field1.setBackground(Color.yellow);
		//paper.drawLine(10, 10, 60, 60);
		//paper.drawOval(30,  30, 40, 40);
		//paper.setColor(Color.RED);
		//paper.fillOval(10, 35, 60, 60);
		//paper.setColor(Color.BLUE);
		//paper.fillOval(80, 70, 40, 40);
		//paper.fillOval(80, 20, 40, 40);
		//paper.setColor(Color.BLACK);
		
		
		

		
	}
}

