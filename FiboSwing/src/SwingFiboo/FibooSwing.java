package SwingFiboo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FibooSwing extends JFrame {

	private JPanel contentPane;
	private JTextField txtIteracion;
	private JTextField txtNumero1;
	private JTextField txtNumero2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FibooSwing frame = new FibooSwing();
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
	public FibooSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JList ListaNumeros = new JList();
		DefaultListModel Numeros = new DefaultListModel();
		ListaNumeros.setBounds(101, 145, 221, 272);
		contentPane.setLayout(null);
		contentPane.add(ListaNumeros);
	
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setBounds(257, 44, 97, 25);
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int Numero1 = 0, Numero2 = 0, Numero3, i=0, Iteracion = 0;
				Numero1 = Integer.parseInt(txtNumero1.getText());
				Numero2 = Integer.parseInt(txtNumero2.getText());
				Iteracion = Integer.parseInt(txtIteracion.getText());
				while(i < Iteracion) {
					Numero3 = Numero1 + Numero2;
					Numeros.addElement("Iteraciones "+ i + "  "+ "  "+ Numero3);
					Numero1 = Numero2;
					Numero2 = Numero3;
					i += 1;
				}
				ListaNumeros.setModel(Numeros);
			}
		});
		contentPane.add(btnImprimir);
		
		JLabel lblIteracion = new JLabel("Iteraciones");
		lblIteracion.setBounds(34, 48, 78, 16);
		contentPane.add(lblIteracion);
		
		JLabel lblNumero1 = new JLabel("Numero 1");
		lblNumero1.setBounds(34, 73, 56, 16);
		contentPane.add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("Numero 2");
		lblNumero2.setBounds(34, 102, 56, 16);
		contentPane.add(lblNumero2);
		
		txtIteracion = new JTextField();
		txtIteracion.setBounds(102, 45, 116, 22);
		contentPane.add(txtIteracion);
		txtIteracion.setColumns(10);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(102, 70, 116, 22);
		contentPane.add(txtNumero1);
		txtNumero1.setColumns(10);
		
		txtNumero2 = new JTextField();
		txtNumero2.setBounds(102, 99, 116, 22);
		contentPane.add(txtNumero2);
		txtNumero2.setColumns(10);
		
		
	}
}