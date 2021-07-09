package proj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Aw_Projeto {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aw_Projeto window = new Aw_Projeto();
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
	public Aw_Projeto() {
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
		
		TextField textField = new TextField();
		textField.setEditable(false);
		textField.setFont(new Font("Arial", Font.PLAIN, 25));
		textField.setText("Sistema de Gest\u00E3o de Projetos");
		textField.setBounds(38, 85, 358, 57);
		frame.getContentPane().add(textField);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		mnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuBar.add(mnMenu);
		
		JMenu mntmempregado = new JMenu("Empregado");
		mntmempregado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmempregado em = new frmempregado();
			}
		});
		mnMenu.add(mntmempregado);
		
		JMenu mntmProjetos = new JMenu("Projetos");
		mntmProjetos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmProjetos p = new frmProjetos();
			}
		});
		mnMenu.add(mntmProjetos);
		
		JMenu mnGerente = new JMenu("Gerente");
		mnMenu.add(mnGerente);
		
		JMenu mntmConsultarG = new JMenu("Consultar");
		mnGerente.add(mntmConsultarG);
		
		JMenu mntmOperacoes = new JMenu("Opera\u00E7\u00F5es");
		mnGerente.add(mntmOperacoes);
	}
}
