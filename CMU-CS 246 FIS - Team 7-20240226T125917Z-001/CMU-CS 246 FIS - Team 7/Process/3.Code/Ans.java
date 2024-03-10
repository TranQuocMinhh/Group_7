package Pack_pr;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ans {
	Ans.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				String Text1 = t1.getText();
				if(!t1.getText().isEmpty() && t2.getText().isEmpty()) {
					t1.setText(t3.getText());
				}
				else {
					t1.setText(t3.getText());
					t2.setText(null);
				}
				
			} catch (NumberFormatException ex) {
				t3.setText("Error");
			}
		}
	});
}
