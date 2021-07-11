package pacote.aplicacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextField;
import pacote.dao.EmpregadoDAO;
import pacote.projeto.Empregado;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class frmEmpregado extends JFrame {

	private JFrame frame;
	private JTextField textNome;
	private JTextField textSalario;
	private JTextField textEndereco;
	private JTextField textTelefone;
	private JTextField textDepto;
	private JTextField textCod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmEmpregado window = new frmEmpregado();
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
	public frmEmpregado() {
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
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 452, 22);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNovo = new JMenu("Novo");
		menuBar.add(mnNovo);
		
		JMenu mnColaborador = new JMenu("Colaborador");
		mnNovo.add(mnColaborador);
		
		JMenuItem mntmEmpregado = new JMenuItem("Empregado");
		mnColaborador.add(mntmEmpregado);
		
		JMenuItem mntmGerente = new JMenuItem("Gerente");
		mnColaborador.add(mntmGerente);
		
		JLabel lblId = new JLabel("Departamento");
		lblId.setBounds(24, 99, 85, 14);
		frame.getContentPane().add(lblId);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(24, 133, 46, 14);
		frame.getContentPane().add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(137, 130, 171, 20);
		frame.getContentPane().add(textNome);
		textNome.setColumns(10);
		
		textSalario = new JTextField();
		textSalario.setBounds(137, 161, 171, 20);
		frame.getContentPane().add(textSalario);
		textSalario.setColumns(10);
		
		JLabel lblSalario = new JLabel("Salario");
		lblSalario.setBounds(24, 164, 67, 14);
		frame.getContentPane().add(lblSalario);
		
		textEndereco = new JTextField();
		textEndereco.setBounds(137, 192, 171, 20);
		frame.getContentPane().add(textEndereco);
		textEndereco.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endereco");
		lblEndereco.setBounds(24, 195, 85, 14);
		frame.getContentPane().add(lblEndereco);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(137, 223, 171, 20);
		frame.getContentPane().add(textTelefone);
		textTelefone.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(24, 226, 67, 14);
		frame.getContentPane().add(lblTelefone);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Empregado empregado = new Empregado();
				EmpregadoDAO empregadoDAO = new EmpregadoDAO();
				empregado.setDepartamento(Integer.parseInt(textDepto.getText()));
				empregado.setNome(textNome.getText());
				empregado.setSalario(Double.parseDouble(textSalario.getText()));
				empregado.setEndereco(textEndereco.getText());
				empregado.setTelefone(Integer.parseInt(textTelefone.getText()));

		        empregadoDAO.Cadastrar(empregado);

		        LimparTela();
			}
		});
		btnCadastrar.setBounds(322, 204, 114, 23);
		frame.getContentPane().add(btnCadastrar); 
		
		JLabel lblNewLabel = new JLabel("Cadastrar Novo Empregado");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(93, 33, 183, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textDepto = new JTextField();
		textDepto.setBounds(137, 96, 171, 20);
		frame.getContentPane().add(textDepto);
		textDepto.setColumns(10);
		
		JLabel lblCod = new JLabel("C\u00F3digo");
		lblCod.setBounds(24, 68, 46, 14);
		frame.getContentPane().add(lblCod);
		
		textCod = new JTextField();
		textCod.setBounds(137, 65, 171, 20);
		frame.getContentPane().add(textCod);
		textCod.setColumns(10);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				EmpregadoDAO empregadoDAO = new EmpregadoDAO();
				
				int cod_emp = Integer.parseInt(textCod.getText());;
				LimparTela();
		        for(Empregado emp : empregadoDAO.getEmpregados(cod_emp)) {
					textCod.setText((String.valueOf(emp.getCod_empregado())));
					textDepto.setText((String.valueOf(emp.getDepartamento())));
					textNome.setText(emp.getNome());
					textSalario.setText((String.valueOf(emp.getSalario())));
					textEndereco.setText(emp.getEndereco());
					textTelefone.setText((String.valueOf(emp.getTelefone())));
				}
  
			}
		});
		btnConsultar.setBounds(322, 78, 114, 23);
		frame.getContentPane().add(btnConsultar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Empregado empregado = new Empregado();
				EmpregadoDAO empregadoDAO = new EmpregadoDAO();
				empregado.setCod_empregado(Integer.parseInt(textCod.getText()));
				empregado.setDepartamento(Integer.parseInt(textDepto.getText()));
				empregado.setNome(textNome.getText());
				empregado.setSalario(Double.parseDouble(textSalario.getText()));
				empregado.setEndereco(textEndereco.getText());
				empregado.setTelefone(Integer.parseInt(textTelefone.getText()));

		        empregadoDAO.Atualizar(empregado);

		        LimparTela();
			}
		});
		btnAtualizar.setBounds(322, 160, 114, 23);
		frame.getContentPane().add(btnAtualizar);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EmpregadoDAO empregadoDAO = new EmpregadoDAO();
				int cod_empregado = Integer.parseInt(textCod.getText());

		        empregadoDAO.DeletarPeloCod(cod_empregado);

		        LimparTela();
			}
		});
		btnDeletar.setBounds(322, 124, 114, 23);
		frame.getContentPane().add(btnDeletar);
	}
	
	public void LimparTela()
	{
		textCod.setText("");
		textDepto.setText("");
		textNome.setText("");
		textSalario.setText("");
		textTelefone.setText("");
		textEndereco.setText("");
	}

}
