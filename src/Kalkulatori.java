import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.Label;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Kalkulatori {

	private JFrame frame;
	private JTextField Result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulatori window = new Kalkulatori();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	double num, ans;
	int calculation;
	
	public Kalkulatori() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 249, 357);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		Result = new JTextField();
		Result.setHorizontalAlignment(SwingConstants.RIGHT);
		Result.setFont(new Font("Times New Roman", Font.BOLD, 23));
		Result.setBounds(10, 35, 220, 49);
		frame.getContentPane().add(Result);
		Result.setColumns(10);
		
		JButton btnClear = new JButton("C");
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result.setText("");
			}
		});
		btnClear.setBounds(10, 95, 51, 42);
		frame.getContentPane().add(btnClear);
		
		JButton btnNR7 = new JButton("7");
		btnNR7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result.setText(Result.getText()+"7");
			}
		});
		btnNR7.setBounds(10, 144, 45, 29);
		frame.getContentPane().add(btnNR7);
		
		JButton btnNR8 = new JButton("8");
		btnNR8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result.setText(Result.getText()+"8");
			}
		});
		btnNR8.setBounds(65, 144, 45, 29);
		frame.getContentPane().add(btnNR8);
		
		JButton btnNR9 = new JButton("9");
		btnNR9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result.setText(Result.getText()+"9");
			}
		});
		btnNR9.setBounds(120, 144, 45, 29);
		frame.getContentPane().add(btnNR9);
		
		JButton btnNR5 = new JButton("5");
		btnNR5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result.setText(Result.getText()+"5");
			}
		});
		btnNR5.setBounds(65, 184, 45, 29);
		frame.getContentPane().add(btnNR5);
		
		JButton btnNR4 = new JButton("4");
		btnNR4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result.setText(Result.getText()+"4");
			}
		});
		btnNR4.setBounds(10, 184, 45, 29);
		frame.getContentPane().add(btnNR4);
		
		JButton btnNR3 = new JButton("3");
		btnNR3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result.setText(Result.getText()+"3");
			}
		});
		btnNR3.setBounds(120, 224, 45, 29);
		frame.getContentPane().add(btnNR3);
		
		JButton btnNR2 = new JButton("2");
		btnNR2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result.setText(Result.getText()+"2");
			}
		});
		btnNR2.setBounds(65, 224, 45, 29);
		frame.getContentPane().add(btnNR2);
		
		JButton btnNR1 = new JButton("1");
		btnNR1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result.setText(Result.getText()+"1");
			}
		});
		btnNR1.setBounds(10, 224, 45, 29);
		frame.getContentPane().add(btnNR1);
		
		JButton btnNR0 = new JButton("0");
		btnNR0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result.setText(Result.getText()+"0");
			}
		});
		btnNR0.setBounds(10, 264, 45, 29);
		frame.getContentPane().add(btnNR0);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(Result.getText());
				calculation =1;
				Result.setText("");
			}
		});
		btnPlus.setBounds(185, 106, 45, 29);
		frame.getContentPane().add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(Result.getText());
				calculation = 2;
				Result.setText("");
			}
		});
		btnMinus.setBounds(185, 144, 45, 29);
		frame.getContentPane().add(btnMinus);
		
		JButton btnHEre = new JButton("X");
		btnHEre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(Result.getText());
				calculation = 3;
				Result.setText("");
			}
		});
		btnHEre.setBounds(185, 184, 45, 29);
		frame.getContentPane().add(btnHEre);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(Result.getText());
				calculation = 4;
				Result.setText("");
				
			}
		});
		btnDivide.setBounds(185, 224, 45, 29);
		frame.getContentPane().add(btnDivide);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arithmetic_operation();
			
				
			}
		});
		btnEqual.setBounds(120, 264, 45, 29);
		frame.getContentPane().add(btnEqual);
		
		JButton btnNR6 = new JButton("6");
		btnNR6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result.setText(Result.getText()+"6");
			}
		});
		btnNR6.setBounds(120, 187, 45, 29);
		frame.getContentPane().add(btnNR6);
		
		JButton btnModulo = new JButton("%");
		btnModulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(Result.getText());
				calculation = 5;
				Result.setText("");
			}
		});
		btnModulo.setBounds(185, 264, 45, 29);
		frame.getContentPane().add(btnModulo);
		
		JButton btnPik = new JButton(".");
		btnPik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result.setText(Result.getText()+".");
			}
		});
		btnPik.setBounds(65, 264, 45, 29);
		frame.getContentPane().add(btnPik);
	}
	public void arithmetic_operation() {
		switch(calculation) {
		case 1: 
			ans = num+Double.parseDouble(Result.getText());
			Result.setText(Double.toString(ans));
			break;
		case 2: 
			ans = num-Double.parseDouble(Result.getText());
			Result.setText(Double.toString(ans));
			break;
		case 3: 
			ans = num*Double.parseDouble(Result.getText());
			Result.setText(Double.toString(ans));
			break;
		case 4: 
			ans = num/Double.parseDouble(Result.getText());
			Result.setText(Double.toString(ans));
			break;
		case 5:
			ans = num%Double.parseDouble(Result.getText());
			Result.setText(Double.toString(ans));
			break;
		}
	}
}
