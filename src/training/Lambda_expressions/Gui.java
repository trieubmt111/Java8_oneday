package training.Lambda_expressions;

import java.awt.Button;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui extends JFrame  {
	Gui(){
		setLayout(new FlowLayout()) ;
		Button bt1= new Button("Buton1");
		add(bt1);
		bt1.addActionListener(new  ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Click");
			
		}
		});
		
setSize(500, 500);
setLocationRelativeTo(null);
setVisible(true);
	}
	
public static void main(String[] args) {
new Gui();
}
}
