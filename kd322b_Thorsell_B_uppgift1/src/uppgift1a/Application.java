package uppgift1a;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Application {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
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
	public Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 539, 327);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 523, 270);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Benjamin", "Alm\u00F6 Thorsell", "070-01234567", "benjamin@mail.com"},
				{"Niklas", "Svanberg", "070-12345678", "niklas@mail.com"},
				{"Jesper", "S\u00F6derberg", "070-23456789", "jesper@mail.com"},
				{"Olle", "Ollesson", "070-34567890", "olle@mail.com"},
				{"Per", "Persson", "070-45678901", "per@mail.com"},
				{"Bengt", "Bengtsson", "070-56789012", "bengt@mail.com"},
				{"Anders", "Andersson", "070-67890123", "anders@mail.com"},
				{"Pelle", "Pellesson", "070-78901234", "pelle@mail.com"},
				{"Sven", "Svensson", "070-89012345", "sven@svensson.com"},
				{null, null, null, null},
				{null, null, null, ""},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"F\u00F6rnamn", "Efternamn", "Tel.nr", "E-mail"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(82);
		table.getColumnModel().getColumn(1).setPreferredWidth(95);
		table.getColumnModel().getColumn(2).setPreferredWidth(95);
		table.getColumnModel().getColumn(3).setPreferredWidth(141);
		scrollPane.setViewportView(table);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Arkiv");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv ut...");
		mnNewMenu.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnNewMenu.add(mntmAvsluta);
		
		JMenu mnMedlem = new JMenu("Medlem");
		menuBar.add(mnMedlem);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny medlem...");
		mnMedlem.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta medlem...");
		mnMedlem.add(mntmHittaMedlem);
		
		JMenu mnNewMenu_1 = new JMenu("Hj\u00E4lp");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmHjlp = new JMenuItem("Hj\u00E4lp");
		mnNewMenu_1.add(mntmHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om programmet");
		mnNewMenu_1.add(mntmOmProgrammet);
	}

}
