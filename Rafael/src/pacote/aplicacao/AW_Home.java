package pacote.aplicacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AW_Home {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AW_Home window = new AW_Home();
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
	public AW_Home() {
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
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 22);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNovo = new JMenu("Novo");
		menuBar.add(mnNovo);
		
		JMenu mnColaborador = new JMenu("Colaborador");
		mnNovo.add(mnColaborador);
		
		JMenu mnEmpregado = new JMenu("Empregado");
		mnColaborador.add(mnEmpregado);
		mnEmpregado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmEmpregado fe = new frmEmpregado();
				fe.setVisible(true);
			}});
		
		JMenuItem mntmGerente = new JMenuItem("Gerente");
		mnColaborador.add(mntmGerente);
		
		JLabel lblNewLabel = new JLabel("Sistema de Gest\u00E3o de Projetos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(31, 93, 373, 64);
		frame.getContentPane().add(lblNewLabel);
	}

}
