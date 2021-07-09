package proj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class frmProjetos extends JFrame {

	private JFrame frame;
	private JTextField textIDp;
	private JTextField textNomeP;
	private JTextField textDataI;
	private JTextField textDataF;
	private JTextField textStat;
	private JTextField textCont;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmProjetos window = new frmProjetos();
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
	public frmProjetos() {
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
		
		JLabel lblNewLabel = new JLabel("Projetos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(177, 0, 73, 25);
		frame.getContentPane().add(lblNewLabel);
		
		textIDp = new JTextField();
		textIDp.setBounds(164, 46, 86, 20);
		frame.getContentPane().add(textIDp);
		textIDp.setColumns(10);
		
		textNomeP = new JTextField();
		textNomeP.setBounds(164, 76, 86, 20);
		frame.getContentPane().add(textNomeP);
		textNomeP.setColumns(10);
		
		textDataI = new JTextField();
		textDataI.setBounds(164, 107, 86, 20);
		frame.getContentPane().add(textDataI);
		textDataI.setColumns(10);
		
		textDataF = new JTextField();
		textDataF.setBounds(164, 138, 86, 20);
		frame.getContentPane().add(textDataF);
		textDataF.setColumns(10);
		
		textStat = new JTextField();
		textStat.setBounds(164, 169, 86, 20);
		frame.getContentPane().add(textStat);
		textStat.setColumns(10);
		
		textCont = new JTextField();
		textCont.setBounds(164, 200, 86, 20);
		frame.getContentPane().add(textCont);
		textCont.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ID Projeto");
		lblNewLabel_1.setBounds(10, 52, 61, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome");
		lblNewLabel_2.setBounds(10, 82, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("In\u00EDcio");
		lblNewLabel_3.setBounds(10, 113, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fim");
		lblNewLabel_4.setBounds(10, 144, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Status");
		lblNewLabel_5.setBounds(10, 175, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Contratante");
		lblNewLabel_6.setBounds(10, 206, 61, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JButton btnRegistrarSitu = new JButton("Situa\u00E7\u00E3o");
		btnRegistrarSitu.setBounds(335, 82, 89, 23);
		frame.getContentPane().add(btnRegistrarSitu);
	}

}
