package linhtinh;

public class tét {
	private void bbackspaceActionPerformed(java.awt.event.ActionEvent evt) {
	    String currentText = t1.getText();
	    if (!currentText.isEmpty()) {
	        t1.setText(currentText.substring(0, currentText.length() - 1));
	    }
	}
}
