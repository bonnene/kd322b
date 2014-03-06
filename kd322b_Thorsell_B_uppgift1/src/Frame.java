import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class Frame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblEfternamn = new JLabel("Efternamn");
	private JTextField txtBenjamin;
	private JTextField txtAlmThorsell;
	private JTextField textField;
	private JTextField txtBenjaminmailcom;
	private JTextField textField_1;
	private JTextField txtSegevngsgatanb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
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
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 533, 21);
		contentPane.add(menuBar);
		
		JMenu menu = new JMenu("Arkiv");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("Skriv ut...");
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("Avsluta");
		menu.add(menuItem_1);
		
		JMenu menu_1 = new JMenu("Medlem");
		menuBar.add(menu_1);
		
		JMenuItem menuItem_2 = new JMenuItem("Ny medlem...");
		menu_1.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("Hitta medlem...");
		menu_1.add(menuItem_3);
		
		JMenu menu_2 = new JMenu("Hj\u00E4lp");
		menuBar.add(menu_2);
		
		JMenuItem menuItem_4 = new JMenuItem("Hj\u00E4lp");
		menu_2.add(menuItem_4);
		
		JMenuItem menuItem_5 = new JMenuItem("Om programmet");
		menu_2.add(menuItem_5);
		
		JLabel lblFrnamn = new JLabel("F\u00F6rnamn");
		lblFrnamn.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFrnamn.setForeground(new Color(255, 51, 0));
		lblFrnamn.setBounds(10, 202, 72, 14);
		contentPane.add(lblFrnamn);
		lblEfternamn.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEfternamn.setForeground(new Color(255, 51, 0));
		lblEfternamn.setBounds(10, 227, 72, 14);
		contentPane.add(lblEfternamn);
		
		JLabel lblNewLabel = new JLabel("Tel.nr");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setForeground(new Color(255, 51, 0));
		lblNewLabel.setBounds(10, 252, 72, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("E-mail");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setForeground(new Color(255, 51, 0));
		lblNewLabel_1.setBounds(10, 277, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Personnr.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setForeground(new Color(255, 51, 0));
		lblNewLabel_2.setBounds(10, 302, 72, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Adress");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setForeground(new Color(255, 51, 0));
		lblNewLabel_3.setBounds(10, 327, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtBenjamin = new JTextField();
		txtBenjamin.setText("Benjamin");
		txtBenjamin.setBounds(77, 199, 212, 20);
		contentPane.add(txtBenjamin);
		txtBenjamin.setColumns(10);
		
		txtAlmThorsell = new JTextField();
		txtAlmThorsell.setText("Alm\u00F6 Thorsell");
		txtAlmThorsell.setBounds(77, 224, 212, 20);
		contentPane.add(txtAlmThorsell);
		txtAlmThorsell.setColumns(10);
		
		textField = new JTextField();
		textField.setText("070-01234567");
		textField.setBounds(77, 249, 212, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtBenjaminmailcom = new JTextField();
		txtBenjaminmailcom.setText("benjamin@mail.com");
		txtBenjaminmailcom.setBounds(77, 274, 212, 20);
		contentPane.add(txtBenjaminmailcom);
		txtBenjaminmailcom.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("19920827-4895");
		textField_1.setBounds(77, 299, 212, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		txtSegevngsgatanb = new JTextField();
		txtSegevngsgatanb.setText("Segev\u00E5ngsgatan 17B, 212 27, Malm\u00F6");
		txtSegevngsgatanb.setBounds(75, 324, 214, 20);
		contentPane.add(txtSegevngsgatanb);
		txtSegevngsgatanb.setColumns(10);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.setBounds(371, 249, 89, 23);
		contentPane.add(btnSpara);
		
		JLabel lblNewLabel_4 = new JLabel("Bild");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setForeground(new Color(255, 51, 0));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(80, 65, 101, 92);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(Frame.class.getResource("/Images/_46514357_arnie.jpg")));
		lblNewLabel_5.setBounds(-44, -11, 577, 366);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBackground(Color.WHITE);
		lblNewLabel_6.setBounds(36, 51, 46, 14);
		contentPane.add(lblNewLabel_6);
	}
}
