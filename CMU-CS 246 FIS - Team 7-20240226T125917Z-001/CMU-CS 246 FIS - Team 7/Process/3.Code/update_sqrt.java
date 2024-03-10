package linhtinh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class update_sqrt {
	Squareroot.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				double first = Double.parseDouble(t1.getText());
//				double second = Double.parseDouble(t2.getText());
				if(e.getSource() == Squareroot ) {
					double result = Math.sqrt(first);
					t1.setText(""+result);
//					double result2 = Math.sqrt(second);
//					t2.setText(""+result2);
				}
				
			} catch (NumberFormatException ex) {
				t3.setText("Error");
			}
		}
	});
}
