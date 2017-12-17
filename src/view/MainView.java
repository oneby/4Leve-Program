package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import controller.Controller;

public class MainView {
	private JPanel panel;
	private Controller controller;
	private JButton btn_on, btn_off, btn_undo, btn_toHot, btn_low, btn_mid, btn_high;

	public MainView() {
		// TODO Auto-generated constructor stub
		controller = new Controller();

		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JPanel leftView = new JPanel();
		JPanel rightView = new JPanel();
		leftView.setLayout(new BorderLayout());
		rightView.setLayout(new GridLayout(7, 1));

		ButtonListener listener = new ButtonListener();
		UndoButtonListener undoListener = new UndoButtonListener();
		leftView.add(controller.getObservers().getMe());
		rightView.add(btn_on = new JButton("ON"));
		rightView.add(btn_off = new JButton("OFF"));
		rightView.add(btn_toHot = new JButton("加热"));
		rightView.add(btn_low = new JButton("一档"));
		rightView.add(btn_mid = new JButton("二档"));
		rightView.add(btn_high = new JButton("三档"));
		rightView.add(btn_undo = new JButton("撤销"));
		btn_on.addActionListener(listener);
		btn_off.addActionListener(listener);
		btn_toHot.addActionListener(listener);
		btn_low.addActionListener(listener);
		btn_mid.addActionListener(listener);
		btn_high.addActionListener(listener);
		btn_undo.addActionListener(undoListener);

		panel.add("Center", leftView);
		panel.add("East", rightView);
	}

	public class UndoButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == btn_undo) {
				controller.getRc().undo();
			}
		}

	}

	public class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton btn = (JButton) e.getSource();
			if (btn == btn_on) {
				controller.getRc().turnOn();
			} else if (btn == btn_off) {
				controller.getRc().turnOff();
			} else if (btn == btn_toHot) {
				controller.getRc().toHot();
			} else if (btn == btn_low) {
				controller.getRc().lowSpeed();
			} else if (btn == btn_mid) {
				controller.getRc().midSpeed();
			} else if (btn == btn_high) {
				controller.getRc().highSpeed();
			}
		}

	}

	public JPanel getView() {
		return panel;
	}
}
