package pacote.aplicacao;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import pacote.dao.ProjetoDAO;
import pacote.projeto.Projeto;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class frmProjeto {

	private JFrame frame;
	private JTextField textCod;
	private JTextField textProjeto;
	private JTextField textDtInicio;
	private JTextField textDtFim;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmProjeto window = new frmProjeto();
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
	public frmProjeto() {
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
		
		JLabel lblCod = new JLabel("C\u00F3digo Projeto");
		lblCod.setBounds(43, 61, 93, 14);
		frame.getContentPane().add(lblCod);
		
		JLabel lblNewLabel = new JLabel("Nome Projeto");
		lblNewLabel.setBounds(43, 97, 93, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Data Inicio");
		lblNewLabel_1.setBounds(43, 133, 93, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Data Fim");
		lblNewLabel_2.setBounds(43, 170, 93, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textCod = new JTextField();
		textCod.setBounds(146, 58, 159, 20);
		frame.getContentPane().add(textCod);
		textCod.setColumns(10);
		
		textProjeto = new JTextField();
		textProjeto.setBounds(146, 94, 159, 20);
		frame.getContentPane().add(textProjeto);
		textProjeto.setColumns(10);
		
		textDtInicio = new JTextField();
		textDtInicio.setBounds(146, 130, 159, 20);
		frame.getContentPane().add(textDtInicio);
		textDtInicio.setColumns(10);
		
		textDtFim = new JTextField();
		textDtFim.setBounds(146, 167, 159, 20);
		frame.getContentPane().add(textDtFim);
		textDtFim.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Projetos");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(177, 21, 93, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				ProjetoDAO projetoDAO = new ProjetoDAO();
				
				int cod_proj = Integer.parseInt(textCod.getText());;
				LimparTela();
		        for(Projeto proj : projetoDAO.getProjetos(cod_proj)) {
					textCod.setText((String.valueOf(proj.getCod_projeto())));
					textProjeto.setText(proj.getNm_projeto());
					textDtInicio.setText((String.valueOf(proj.getDt_inicio())));
					textDtFim.setText((String.valueOf(proj.getDt_fim())));
				}
  
			}
		});
		btnConsultar.setBounds(319, 59, 102, 23);
		frame.getContentPane().add(btnConsultar);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProjetoDAO projetoDAO = new ProjetoDAO();
				int cod_proj = Integer.parseInt(textCod.getText());

		        projetoDAO.DeletarProjeto(cod_proj);

		        LimparTela();
			}
		});
		btnDeletar.setBounds(319, 93, 102, 23);
		frame.getContentPane().add(btnDeletar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Projeto projeto = new Projeto();
				ProjetoDAO projetoDAO = new ProjetoDAO();
				DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				
				projeto.setCod_projeto(Integer.parseInt(textCod.getText()));
				projeto.setNm_projeto(textProjeto.getText());
				try {
					projeto.setDt_inicio(df.parse(textDtInicio.getText()));
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					projeto.setDt_fim(df.parse(textDtFim.getText()));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				projetoDAO.Atualizar(projeto);

		        LimparTela();
			}
		});

		btnAtualizar.setBounds(319, 127, 102, 23);
		frame.getContentPane().add(btnAtualizar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Projeto projeto = new Projeto();
				ProjetoDAO projetoDAO = new ProjetoDAO();
				DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				
				projeto.setNm_projeto(textProjeto.getText());
				try {
					projeto.setDt_inicio(df.parse(textDtInicio.getText()));
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					projeto.setDt_fim(df.parse(textDtFim.getText()));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				projetoDAO.Cadastrar(projeto);

		        LimparTela();
			}
		});
		btnCadastrar.setBounds(319, 161, 102, 23);
		frame.getContentPane().add(btnCadastrar); 
	}

	public void LimparTela()
	{
		textCod.setText("");
		textProjeto.setText("");
		textDtInicio.setText("");
		textDtFim.setText("");
	}
}
