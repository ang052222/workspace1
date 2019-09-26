package kosta.oop2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame extends Frame implements ActionListener, WindowListener{
	
	public MyFrame() {
		Button b = new Button("button");
		b.addActionListener(this);
		add(b);
		
		addWindowListener(this);
		
		setSize(300, 200);
		setLocation(300, 200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new MyFrame();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button b = (Button)e.getSource();
		String label = b.getLabel();
		System.out.println(label + " 선택됨");
		
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}










