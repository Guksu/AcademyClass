package org.min.ex;

import javax.swing.JOptionPane;

public class Ex01_if {
	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("정수를 입력하세요"));
		
		if(num >0) {
			JOptionPane.showMessageDialog(null, "양수");
		}
		else if(num == 0) {
			JOptionPane.showMessageDialog(null, "ZERO");
		}
		else {
			JOptionPane.showMessageDialog(null, "음수");
		}
	}
}
