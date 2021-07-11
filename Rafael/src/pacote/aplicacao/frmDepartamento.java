package pacote.aplicacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import pacote.dao.DepartamentoDAO;
import pacote.projeto.Departamento;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmDepartamento {

	private JFrame frame;
	private JTextField textCod;
	private JTextField textDepto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmDepartamento window = new frmDepartamento();
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
	public frmDepartamento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 468, 308);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCod = new JLabel("C\u00F3digo Depto");
		lblCod.setBounds(40, 87, 81, 14);
		frame.getContentPane().add(lblCod);
		
		textCod = new JTextField();
		textCod.setBounds(131, 84, 159, 20);
		frame.getContentPane().add(textCod);
		textCod.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome Depto");
		lblNewLabel.setBounds(40, 141, 81, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textDepto = new JTextField();
		textDepto.setBounds(131, 138, 159, 20);
		frame.getContentPane().add(textDepto);
		textDepto.setColumns(10);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				DepartamentoDAO departamentoDAO = new DepartamentoDAO();
				
				int cod_depto = Integer.parseInt(textCod.getText());;
				LimparTela();
		        for(Departamento depto : departamentoDAO.getDepartamentos(cod_depto)) {
					textCod.setText((String.valueOf(depto.getCod_departamento())));
					textDepto.setText(depto.getNm_departamento());
				}
  
			}
		});
		btnConsultar.setBounds(319, 59, 102, 23);
		frame.getContentPane().add(btnConsultar);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DepartamentoDAO departamentoDAO = new DepartamentoDAO();
				int cod_depto = Integer.parseInt(textCod.getText());

		        departamentoDAO.DeletarDepto(cod_depto);

		        LimparTela();
			}
		});
		btnDeletar.setBounds(319, 93, 102, 23);
		frame.getContentPane().add(btnDeletar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Departamento departamento = new Departamento();
				DepartamentoDAO departamentoDAO = new DepartamentoDAO();
				departamento.setCod_departamento(Integer.parseInt(textCod.getText()));
				departamento.setNm_departamento(textDepto.getText());

				departamentoDAO.Atualizar(departamento);

		        LimparTela();
			}
		});
		btnAtualizar.setBounds(319, 127, 102, 23);
		frame.getContentPane().add(btnAtualizar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Departamento departamento = new Departamento();
				DepartamentoDAO departamentoDAO = new DepartamentoDAO();
				departamento.setNm_departamento(textDepto.getText());

		        departamentoDAO.Cadastrar(departamento);

		        LimparTela();
			}
		});
		btnCadastrar.setBounds(319, 161, 102, 23);
		frame.getContentPane().add(btnCadastrar); 
		
		JLabel lblDepto = new JLabel("Cadastrar Novo Departamento");
		lblDepto.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDepto.setBounds(116, 34, 228, 14);
		frame.getContentPane().add(lblDepto);
	}

	public void LimparTela()
	{
		textCod.setText("");
		textDepto.setText("");
	}
}
