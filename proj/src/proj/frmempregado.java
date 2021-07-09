package proj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class frmempregado extends JFrame {

	private JFrame frame;
	private JTextField textId;
	private JTextField textDep;
	private JTextField textNome;
	private JTextField textTel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmempregado window = new frmempregado();
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
	public frmempregado() {
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
		
		JLabel lblNewLabel = new JLabel("\u00C1rea do Empregado");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(118, 0, 176, 51);
		frame.getContentPane().add(lblNewLabel);
		
		textId = new JTextField();
		textId.setBounds(118, 75, 86, 20);
		frame.getContentPane().add(textId);
		textId.setColumns(10);
		
		textDep = new JTextField();
		textDep.setBounds(118, 122, 86, 20);
		frame.getContentPane().add(textDep);
		textDep.setColumns(10);
		
		textNome = new JTextField();
		textNome.setBounds(118, 170, 86, 20);
		frame.getContentPane().add(textNome);
		textNome.setColumns(10);
		
		textTel = new JTextField();
		textTel.setBounds(118, 215, 86, 20);
		frame.getContentPane().add(textTel);
		textTel.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBounds(10, 81, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Departamento");
		lblNewLabel_2.setBounds(10, 128, 77, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nome");
		lblNewLabel_3.setBounds(10, 176, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Telefone");
		lblNewLabel_4.setBounds(10, 221, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnPesquisa = new JButton("Pesquisar");
		btnPesquisa.setBounds(335, 74, 89, 23);
		frame.getContentPane().add(btnPesquisa);
		
		JButton btnConsulta = new JButton("Consultar");
		btnConsulta.setBounds(335, 121, 89, 23);
		frame.getContentPane().add(btnConsulta);
	}
}
