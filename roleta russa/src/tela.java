import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;
import java.awt.event.ActionEvent;

public class tela {

	private JFrame frame;
	private JTextField txtField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
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
	public tela() {
		initialize();
	}
	public void removerArquivos(File f) {
		if(f.isDirectory()) {
			File[] files = f.listFiles();
			for(File file:files) {
				file.delete();
			}
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 288, 171);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite um número de 1 a 10");
		lblNewLabel.setBounds(69, 29, 145, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtField = new JTextField();
		txtField.setBounds(47, 54, 187, 20);
		frame.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random random = new Random();
				int aleatorio = random.nextInt(10);
				String aleatorio2 = txtField.getText();
				int aleatorio3= Integer.parseInt(aleatorio2);
				if(aleatorio3!=aleatorio) {
					String nome = "";
					File f = new File(nome);
					f.delete();
				}else {
					JOptionPane.showMessageDialog(null, "você acetou","resposta",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(93, 98, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
