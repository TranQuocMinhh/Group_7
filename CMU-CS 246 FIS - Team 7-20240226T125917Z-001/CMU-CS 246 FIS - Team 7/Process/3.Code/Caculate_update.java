package Pack_pr;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.lang.*;


public class Caculate_update {
	public static void main(String[] args) {
		final JFrame f = new JFrame("CACULATOR");
		JLabel m1, m2;
		final JTextField t1, t2, t3;
		final JButton plus;
		final JButton sub;
		final JButton multi;
		final JButton divide;
		final JButton divide2;
		final JButton Ac;
		
		
		m1 = new JLabel("Nhập số ");
		t1 = new JTextField();
		m1.setBounds(50, 30, 200, 30);
		t1.setBounds(50, 70, 150, 20);
		
		m2 = new JLabel("Nhập số ");
		t2 = new JTextField();
		m2.setBounds(50, 110, 200, 30);
		t2.setBounds(50, 150, 150, 20);
		
		
		t3 = new JTextField();
		t3.setBounds(50, 200, 150, 50);
		
		plus = new JButton("+");
		sub = new JButton("-");
		multi = new JButton("x");
		divide = new JButton("/");
		divide2 = new JButton("%");
		Ac = new JButton("AC");
		
		plus.setBounds(50, 270, 50, 50);
		sub.setBounds(100, 270, 50, 50);
		multi.setBounds(150, 270, 50, 50);
		divide.setBounds(50, 320, 50, 50);
		divide2.setBounds(100, 320, 50, 50);
		Ac.setBounds(150, 320, 50, 50);
		
		f.add(m1);
		f.add(t1);
		
		f.add(m2);
		f.add(t2);
		f.add(t3);
		
		f.add(plus);
		f.add(sub);
		f.add(multi);
		f.add(divide2);
		f.add(divide);
		f.add(Ac);
		
		
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double first = Double.parseDouble(t1.getText());
					double second = Double.parseDouble(t2.getText());
					double res = first + second;
					t3.setText(""+(float) res);
					
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Lỗi Giá trị", "Lỗi", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double first = Double.parseDouble(t1.getText());
					double second = Double.parseDouble(t2.getText());
					double res = first - second;
					t3.setText(""+res);
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Lỗi Giá trị", "Lỗi", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double first = Double.parseDouble(t1.getText());
					double second = Double.parseDouble(t2.getText());
					double res = first * second;
					t3.setText(""+(float) res);
					
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Lỗi Giá trị", "Lỗi", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double first = Double.parseDouble(t1.getText());
					double second = Double.parseDouble(t2.getText());
					double res = first / second;
					if (first == 0 || second == 0) {
						JOptionPane.showMessageDialog(null, "Phép tính không thể thực hiện", "Thông báo", JOptionPane.ERROR_MESSAGE);
					}
					else {
						t3.setText(""+(int) res);
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,"Lỗi Giá trị", "Lỗi", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		divide2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double first = Double.parseDouble(t1.getText());
					double second = Double.parseDouble(t2.getText());
					double res = first % second;
					if ((first < second) || (first == 0 || second == 0)) {
						JOptionPane.showMessageDialog(null, "Phép tính không thể thực hiện", "Thông báo", JOptionPane.ERROR_MESSAGE);
					}
					else {
						t3.setText(""+res);
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,"Lỗi Giá trị", "Lỗi", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		Ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					t3.setText("");
					t1.setText("");
					t2.setText("");
					
				} catch (NumberFormatException ex) {
					
				}
			}
		});
		
		
		
		
		f.getContentPane().setBackground(Color.gray);
		f.setSize(300, 500);
		f.setLayout(null);
		f.setVisible(true);
	}
}
