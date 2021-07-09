package proj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;

public class frmGerenteCon extends JFrame {

	private JFrame frame;
	private JTextField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmGerenteCon window = new frmGerenteCon();
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
	public frmGerenteCon() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u00C1rea do Gerente");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(138, 0, 184, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(25, 58, 105, 192);
		frame.getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(297, 58, 105, 192);
		frame.getContentPane().add(textPane_1);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(167, 89, 89, 23);
		frame.getContentPane().add(btnConsultar);
		
		JLabel lblNewLabel_1 = new JLabel("Projetos");
		lblNewLabel_1.setBounds(25, 31, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Empregados");
		lblNewLabel_2.setBounds(297, 31, 68, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textSenha = new JTextField();
		textSenha.setBounds(167, 178, 86, 20);
		frame.getContentPane().add(textSenha);
		textSenha.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Senha");
		lblNewLabel_3.setBounds(186, 157, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
	}

}
