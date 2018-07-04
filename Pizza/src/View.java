import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextArea;

public class View extends JFrame {

	private JPanel contentPane;
	private JTextField tf_margherita;
	private JTextField tf_funghi;
	private JTextField tf_boscaiola;
	private JTextField tf_capricciosa;
	JTextArea textArea;
	
	int margherita=0;
	int funghi=0;
	int boscaiola=0;
	int capricciosa=0;
	int formaggi=0;
	int americana=0;
	int rossa=0;
	int diavola=0;
	double tot=0.0;
	
	double costo_margherita=4;
	double costo_funghi=5;
	double costo_capricciosa=6;
	double costo_boscaiola=5;
	double costo_4formaggi=4;
	double costo_rossa=3;
	double costo_diavola=3.5;
	double costo_americana=6;//costi pizza
	
Double FarinaKG=0.79;//costi al kg
Double MozzarellaKG=10.0;
Double PassataKG=1.0;
Double SalsicciaKG=10.0;
Double FunghiKG=10.0;
Double ProsciuttoKG=15.5;
Double Uovo1=0.20;
Double CarciofiniKG=21.0;


double Farina= 0;//contatore ingredienti usati in ogni pizza incrementato ad ogni click azzerato a cancella
 double Mozzarella=0;
double Passata_pomodoro=0;
double Salsiccia=0;
double Funghi=0;
double Prosciutto=0;
double Uovo=0;
double carciofini=0;

 	
	
	private JTextField tf_4formaggi;
	private JTextField tf_americana;
	private JTextField tf_rossa;
	private JTextField tf_diavola;
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
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
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 575);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMargherita = new JButton("MARGHERITA");
		btnMargherita.setBackground(Color.LIGHT_GRAY);
		btnMargherita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				margherita+=1;
				tf_margherita.setText(""+margherita);
				Farina+=900;
				Mozzarella+=125.0;
				  Passata_pomodoro+= 500;
 
				
				
			}
		});
		btnMargherita.setBounds(35, 28, 117, 29);
		contentPane.add(btnMargherita);
		
		JButton btnFunghi = new JButton("FUNGHI");
		btnFunghi.setBackground(Color.GRAY);
		btnFunghi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funghi+=1;
				tf_funghi.setText(""+funghi);
				Funghi+=100;
				Mozzarella+=500.0;
				  Passata_pomodoro+= 500;
			}
		});
		btnFunghi.setBounds(35, 58, 117, 29);
		contentPane.add(btnFunghi);
		
		JButton btnBoscaiola = new JButton("BOSCAIOLA");
		btnBoscaiola.setBackground(Color.GRAY);
		btnBoscaiola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boscaiola+=1;
				tf_boscaiola.setText(""+boscaiola);
				Salsiccia+=600;
				Mozzarella+=500.0;
				  Passata_pomodoro+= 500;
			}
		});
		btnBoscaiola.setBounds(35, 84, 117, 29);
		contentPane.add(btnBoscaiola);
		
		JButton btnCapricciosa = new JButton("CAPRICCIOSA");
		btnCapricciosa.setBackground(Color.RED);
		btnCapricciosa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				capricciosa+=1;
				tf_capricciosa.setText(""+capricciosa);
				Mozzarella+=500.0;
				  Passata_pomodoro+= 500;
				  Funghi+=100;
				  Prosciutto+=50;
				  Uovo+=1;
				  carciofini+=10;
				  
			}
		});
		btnCapricciosa.setBounds(35, 114, 117, 29);
		contentPane.add(btnCapricciosa);
		
		tf_margherita = new JTextField();
		tf_margherita.setBounds(148, 28, 42, 26);
		contentPane.add(tf_margherita);
		tf_margherita.setColumns(10);
		tf_margherita.setText(""+margherita);
		
		tf_funghi = new JTextField();
		tf_funghi.setColumns(10);
		tf_funghi.setBounds(148, 58, 42, 26);
		contentPane.add(tf_funghi);
		tf_funghi.setText(""+funghi);
		
		tf_boscaiola = new JTextField();
		tf_boscaiola.setColumns(10);
		tf_boscaiola.setBounds(148, 84, 42, 26);
		contentPane.add(tf_boscaiola);
		tf_boscaiola.setText(""+boscaiola);
		
		
		tf_capricciosa = new JTextField();
		tf_capricciosa.setColumns(10);
		tf_capricciosa.setBounds(148, 114, 42, 26);
		contentPane.add(tf_capricciosa);
		tf_capricciosa.setText(""+capricciosa);
		
		JButton btnConferma = new JButton("CONFERMA");
		btnConferma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tot_ingredienti="Farina :"+Farina+"\nMozzarella :"+Mozzarella+"\nPassata :"+Passata_pomodoro+"\nSalsiccia :"+Salsiccia+"\nFunghi :"+Funghi+"\nProsciutto :"+Prosciutto+"\nUovo :"+Uovo+"\nCarciofini :"+carciofini;
Double Costo_ingredienti=FarinaKG/1000*Farina + MozzarellaKG/1000*Mozzarella + PassataKG/1000*Passata_pomodoro+SalsicciaKG/1000*Salsiccia+FunghiKG/1000*Funghi+ProsciuttoKG/1000*Prosciutto+Uovo1*Uovo+CarciofiniKG/1000*carciofini;

				 tot=margherita*4+funghi*5+boscaiola*5+capricciosa*6+formaggi*4+rossa*3+diavola*3.5+americana*6;
				 textArea.setText("Totale :"+tot+"\nIngredienti :"+tot_ingredienti+"\nTOTALE INGREDIENTI :"+Costo_ingredienti);
						 double Farina= 0;
						 
				   Mozzarella=0;
				  Passata_pomodoro=0;
				  Salsiccia=0;
				  Funghi=0;
				  Prosciutto=0;
				  Uovo=0;
				  carciofini=0;

			}
		});
		btnConferma.setBackground(Color.GREEN);
		btnConferma.setBounds(227, 28, 117, 29);
		contentPane.add(btnConferma);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(227, 58, 117, 29);
		contentPane.add(btnExit);
		
		JButton btnCancella = new JButton("CANCELLA");
		btnCancella.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_margherita.setText("0");
				tf_boscaiola.setText("0");
				tf_capricciosa.setText("0");
				tf_funghi.setText("0");
				tf_4formaggi.setText("0");;
				tf_americana.setText("0");;
				tf_rossa.setText("0");;
				tf_diavola.setText("0");;
				
				
				formaggi=0;
				americana=0;
				rossa=0;
				diavola=0;
				margherita=0;
				funghi=0;
				capricciosa=0;
				boscaiola=0;
				  Farina= 0;
				   Mozzarella=0;
				  Passata_pomodoro=0;
				  Salsiccia=0;
				  Funghi=0;
				  Prosciutto=0;
				  Uovo=0;
				  carciofini=0;
				
			}
		});
		btnCancella.setBounds(227, 99, 117, 29);
		contentPane.add(btnCancella);
		
		  textArea = new JTextArea();
		textArea.setBounds(347, 28, 293, 499);
		contentPane.add(textArea);
		
		JButton btnFormaggi = new JButton("4 FORMAGGI");
		btnFormaggi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formaggi+=1;
				tf_4formaggi.setText(""+formaggi);
			}
		});
		btnFormaggi.setBounds(35, 141, 117, 29);
		contentPane.add(btnFormaggi);
		
		tf_4formaggi = new JTextField();
		tf_4formaggi.setText("0");
		tf_4formaggi.setColumns(10);
		tf_4formaggi.setBounds(148, 141, 42, 26);
		contentPane.add(tf_4formaggi);
		
		JButton btnAmericana = new JButton("AMERICANA");
		btnAmericana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				americana+=1;
				tf_americana.setText(""+americana);
			}
		});
		btnAmericana.setBounds(35, 171, 117, 29);
		contentPane.add(btnAmericana);
		
		tf_americana = new JTextField();
		tf_americana.setText("0");
		tf_americana.setColumns(10);
		tf_americana.setBounds(148, 171, 42, 26);
		contentPane.add(tf_americana);
		
		JButton btnRossa = new JButton("ROSSA");
		btnRossa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rossa+=1;
				tf_rossa.setText(""+rossa);
			}
		});
		btnRossa.setBounds(35, 197, 117, 29);
		contentPane.add(btnRossa);
		
		tf_rossa = new JTextField();
		tf_rossa.setText("0");
		tf_rossa.setColumns(10);
		tf_rossa.setBounds(148, 197, 42, 26);
		contentPane.add(tf_rossa);
		
		JButton btnDiavola = new JButton("DIAVOLA");
		btnDiavola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				diavola+=1;
				tf_diavola.setText(""+diavola);
			}
		});
		btnDiavola.setBounds(35, 227, 117, 29);
		contentPane.add(btnDiavola);
		
		tf_diavola = new JTextField();
		tf_diavola.setText("0");
		tf_diavola.setColumns(10);
		tf_diavola.setBounds(148, 227, 42, 26);
		contentPane.add(tf_diavola);
		
		JLabel lblDesignedByLa = new JLabel("Designed by La Selva");
		lblDesignedByLa.setBounds(6, 511, 171, 16);
		contentPane.add(lblDesignedByLa);
		
		JButton btnCambiaPrezzi = new JButton("Cambia Prezzi");
		btnCambiaPrezzi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ModificaPrezzi cambiaprezzi = new ModificaPrezzi();
				cambiaprezzi.setVisible(true);
				
			}
		});
		btnCambiaPrezzi.setBounds(227, 141, 117, 29);
		contentPane.add(btnCambiaPrezzi);
		
		JButton btnInventario = new JButton("Inventario");
		btnInventario.setBounds(227, 183, 117, 29);
		contentPane.add(btnInventario);
		
	}
}
