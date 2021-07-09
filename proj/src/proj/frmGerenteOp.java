package proj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class frmGerenteOp extends JFrame {

	private JFrame frame;
	private JTextField textCargo;
	private JTextField textCodEmp;
	private JTextField textCodPro;
	private JTextField textHoras;
	private JTextField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmGerenteOp window = new frmGerenteOp();
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
	public frmGerenteOp() {
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
		lblNewLabel.setBounds(134, 0, 153, 25);
		frame.getContentPane().add(lblNewLabel);
		
		textCargo = new JTextField();
		textCargo.setBounds(166, 46, 86, 20);
		frame.getContentPane().add(textCargo);
		textCargo.setColumns(10);
		
		textCodEmp = new JTextField();
		textCodEmp.setBounds(166, 83, 86, 20);
		frame.getContentPane().add(textCodEmp);
		textCodEmp.setColumns(10);
		
		textCodPro = new JTextField();
		textCodPro.setBounds(166, 120, 86, 20);
		frame.getContentPane().add(textCodPro);
		textCodPro.setColumns(10);
		
		textHoras = new JTextField();
		textHoras.setBounds(166, 159, 86, 20);
		frame.getContentPane().add(textHoras);
		textHoras.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cargo");
		lblNewLabel_1.setBounds(10, 52, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID do Empregado");
		lblNewLabel_2.setBounds(10, 89, 94, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Id do Projeto");
		lblNewLabel_3.setBounds(10, 126, 69, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Horas");
		lblNewLabel_4.setBounds(10, 165, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.setBounds(335, 25, 89, 23);
		frame.getContentPane().add(btnIncluir);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.setBounds(335, 59, 89, 23);
		frame.getContentPane().add(btnDeletar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(335, 95, 89, 23);
		frame.getContentPane().add(btnAlterar);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(335, 129, 89, 23);
		frame.getContentPane().add(btnPesquisar);
		
		textSenha = new JTextField();
		textSenha.setBounds(166, 230, 86, 20);
		frame.getContentPane().add(textSenha);
		textSenha.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Senha");
		lblNewLabel_5.setBounds(10, 236, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
	}

}
