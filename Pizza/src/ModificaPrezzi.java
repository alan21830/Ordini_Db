import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModificaPrezzi extends JFrame {

	private JPanel contentPane;
	private JTextField tfnome_prodotto;
	private JTextField tf_prezzoprodotto;
	String nome_prodotto="";
	double prezzo_prodotto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificaPrezzi frame = new ModificaPrezzi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ModificaPrezzi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblFarina = new JLabel("Inserisci il nome del prodotto");
		lblFarina.setBounds(17, 6, 372, 16);
		contentPane.add(lblFarina);
		
		tfnome_prodotto = new JTextField();
		tfnome_prodotto.setBounds(17, 22, 372, 26);
		contentPane.add(tfnome_prodotto);
		tfnome_prodotto.setColumns(10);
		
		
		JButton btnAggiornaPrezzi = new JButton("Aggiorna prezzi");
		btnAggiornaPrezzi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nome_prodotto=tfnome_prodotto.getText();
				View view=new View();
				prezzo_prodotto=Double.parseDouble(tf_prezzoprodotto.getText());
				view.costo_margherita=prezzo_prodotto;
				contentPane.setVisible(false);
		
				
				
				
				
				
				//view.costo_margherita=
						
				
			}
		});
		btnAggiornaPrezzi.setBounds(6, 141, 275, 29);
		contentPane.add(btnAggiornaPrezzi);
		
		JLabel lblNewLabel = new JLabel("il nuovo prezzo del prodotto");
		lblNewLabel.setBounds(17, 60, 314, 16);
		contentPane.add(lblNewLabel);
		
		tf_prezzoprodotto = new JTextField();
		tf_prezzoprodotto.setColumns(10);
		tf_prezzoprodotto.setBounds(17, 94, 372, 26);
		contentPane.add(tf_prezzoprodotto);
	}
}
