package pacote.aplicacao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import pacote.dao.CadastroDAO;
import pacote.projeto.Cadastro;

public class frmCadastro {

	private JFrame frame;
	private JTextField textCod;
	private JTextField textCodEmp;
	private JTextField textCodProj;
	private JTextField textCodFunc;
	private JTextField textEmp;
	private JTextField textProj;
	private JTextField textFunc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCadastro window = new frmCadastro();
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
	public frmCadastro() {
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
		
		JLabel lblNewLabel = new JLabel("Codigo Cadastro");
		lblNewLabel.setBounds(36, 28, 113, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textCod = new JTextField();
		textCod.setBounds(36, 51, 86, 20);
		frame.getContentPane().add(textCod);
		textCod.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo Empregado");
		lblNewLabel_1.setBounds(36, 82, 113, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textCodEmp = new JTextField();
		textCodEmp.setBounds(36, 107, 86, 20);
		frame.getContentPane().add(textCodEmp);
		textCodEmp.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Codigo Projeto");
		lblNewLabel_2.setBounds(36, 138, 106, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textCodProj = new JTextField();
		textCodProj.setBounds(36, 163, 86, 20);
		frame.getContentPane().add(textCodProj);
		textCodProj.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("C\u00F3digo Fun\u00E7\u00E3o");
		lblNewLabel_3.setBounds(36, 194, 106, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textCodFunc = new JTextField();
		textCodFunc.setBounds(36, 219, 86, 20);
		frame.getContentPane().add(textCodFunc);
		textCodFunc.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Empregado");
		lblNewLabel_4.setBounds(169, 82, 86, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Projeto");
		lblNewLabel_5.setBounds(169, 138, 86, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Fun\u00E7\u00E3o");
		lblNewLabel_6.setBounds(169, 194, 86, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		textEmp = new JTextField();
		textEmp.setBounds(169, 107, 147, 20);
		frame.getContentPane().add(textEmp);
		textEmp.setColumns(10);
		
		textProj = new JTextField();
		textProj.setBounds(169, 163, 147, 20);
		frame.getContentPane().add(textProj);
		textProj.setColumns(10);
		
		textFunc = new JTextField();
		textFunc.setBounds(169, 219, 147, 20);
		frame.getContentPane().add(textFunc);
		textFunc.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Cadastrar Empregado no Projeto");
		lblNewLabel_7.setBounds(169, 28, 186, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				CadastroDAO cadastroDAO = new CadastroDAO();
				
				int cod_cad = Integer.parseInt(textCod.getText());;
				LimparTela();
		        for(Cadastro cad : cadastroDAO.getCadastros(cod_cad)) {
					textCodEmp.setText((String.valueOf(cad.getCod_empregado())));
					textCodProj.setText((String.valueOf(cad.getCod_projeto())));
					textCodFunc.setText((String.valueOf(cad.getId_cargo())));
					textEmp.setText(cad.getNm_nome());
					textProj.setText(cad.getNm_projeto());
					textFunc.setText(cad.getNm_cargo());	
				}
  
			}
		});
		btnConsultar.setBounds(319, 59, 102, 23);
		frame.getContentPane().add(btnConsultar);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastroDAO cadastroDAO = new CadastroDAO();
				int cod_cad = Integer.parseInt(textCod.getText());

				cadastroDAO.DeletarCadastro(cod_cad);

		        LimparTela();
			}
		});
		btnDeletar.setBounds(319, 93, 102, 23);
		frame.getContentPane().add(btnDeletar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cadastro cadastro = new Cadastro();
				CadastroDAO cadastroDAO = new CadastroDAO();
				cadastro.setCod_cadastro(Integer.parseInt(textCod.getText()));
				cadastro.setCod_empregado(Integer.parseInt(textCodEmp.getText()));
				cadastro.setCod_projeto(Integer.parseInt(textCodProj.getText()));
				cadastro.setId_cargo(Integer.parseInt(textCodFunc.getText()));
				cadastro.setNm_nome(textEmp.getText());
				cadastro.setNm_projeto(textProj.getText());
				cadastro.setNm_cargo(textFunc.getText());

				cadastroDAO.Atualizar(cadastro);

		        LimparTela();
			}
		});
		btnAtualizar.setBounds(319, 127, 102, 23);
		frame.getContentPane().add(btnAtualizar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cadastro cadastro = new Cadastro();
				CadastroDAO cadastroDAO = new CadastroDAO();

				cadastro.setCod_empregado(Integer.parseInt(textCodEmp.getText()));
				cadastro.setCod_projeto(Integer.parseInt(textCodProj.getText()));
				cadastro.setId_cargo(Integer.parseInt(textCodFunc.getText()));
				cadastro.setNm_nome(textEmp.getText());
				cadastro.setNm_projeto(textProj.getText());
				cadastro.setNm_cargo(textFunc.getText());

				cadastroDAO.Cadastrar(cadastro);

		        LimparTela();
			}
		});
		btnCadastrar.setBounds(319, 161, 102, 23);
		frame.getContentPane().add(btnCadastrar); 
	}
	
	public void LimparTela()
	{
		textCod.setText("");
		textCodEmp.setText("");
		textCodProj.setText("");
		textCodFunc.setText("");
		textEmp.setText("");
		textProj.setText("");
		textFunc.setText("");
	}

}
