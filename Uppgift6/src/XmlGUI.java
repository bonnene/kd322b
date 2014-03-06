
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.util.ArrayList;





import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.JEditorPane;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;


public class XmlGUI extends JFrame {

	private ArrayList<String> nnaammnn = new ArrayList<String>();
	private ArrayList<Program> programsList = new ArrayList<Program>();
	private Document doc;
	private Program program;
	private JPanel contentPane;
	final Bargraph bargraph;



	/**
	 * Launch the application.
	 */

	private Document openXmlFile(String fileName) {
		Document doc = null;
		try {
			File fXmlFile = new File(fileName);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doc;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					XmlGUI frame = new XmlGUI();
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
	public XmlGUI() {		

		doc = openXmlFile("C:\\Users\\Emelie\\workspace\\Uppgift6\\src\\ht2013_antagning (1).xml");
		programsList = loadAllPrograms();		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		bargraph = new Bargraph();


		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setText("Antal program:  "+programsList.size());

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setText("Första elementet (rooten):  "+doc.getDocumentElement().getNodeName());

		final JComboBox comboBox = new JComboBox();
		for(Program p:programsList){
			nnaammnn.add(p.getName());			
		}
		comboBox.setModel(new DefaultComboBoxModel(nnaammnn.toArray()));

		final JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setText(programsList.get(comboBox.getSelectedIndex()).getCode());

		final JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setText(programsList.get(comboBox.getSelectedIndex()).getName());


		final JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setText(Integer.toString(programsList.get(comboBox.getSelectedIndex()).getMen()));


		final JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setText(Integer.toString(programsList.get(comboBox.getSelectedIndex()).getWomen()));


		JLabel lblDetaljer = new JLabel("Detaljer");
		lblDetaljer.setFont(new Font("Tahoma", Font.BOLD, 11));

		JLabel lblN = new JLabel("Namn:");

		JLabel lblK = new JLabel("Kod:");

		JLabel lblNewLabel_6 = new JLabel("Sökande (män):");

		JLabel lblNewLabel_7 = new JLabel("Sökande (kvinnor):");


		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(17)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox, Alignment.TRAILING, 0, 402, Short.MAX_VALUE)
								.addComponent(lblDetaljer, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblN, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
										.addGap(10)
										.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(lblK, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
												.addGap(10)
												.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_contentPane.createSequentialGroup()
														.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
														.addGap(10)
														.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_contentPane.createSequentialGroup()
																.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
																.addGap(10)
																.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)))
																.addContainerGap())
																.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(bargraph, GroupLayout.PREFERRED_SIZE, 396, GroupLayout.PREFERRED_SIZE)
																		.addGap(18))
				);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(5)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addGap(3)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addGap(11)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(30)
						.addComponent(lblDetaljer)
						.addGap(11)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblN)
								.addComponent(lblNewLabel_3))
								.addGap(11)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblK)
										.addComponent(lblNewLabel_2))
										.addGap(11)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_6)
												.addComponent(lblNewLabel_4))
												.addGap(11)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(lblNewLabel_7)
														.addComponent(lblNewLabel_5))
														.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
														.addComponent(bargraph, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
														.addContainerGap())
				);

		contentPane.setLayout(gl_contentPane);

		bargraph.updateValues(programsList.get(comboBox.getSelectedIndex()).getWomen(),programsList.get(comboBox.getSelectedIndex()).getMen());


		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_2.setText(programsList.get(comboBox.getSelectedIndex()).getCode());
				lblNewLabel_3.setText(programsList.get(comboBox.getSelectedIndex()).getName());
				lblNewLabel_4.setText(Integer.toString(programsList.get(comboBox.getSelectedIndex()).getMen()));
				lblNewLabel_5.setText(Integer.toString(programsList.get(comboBox.getSelectedIndex()).getWomen()));
				bargraph.updateValues(programsList.get(comboBox.getSelectedIndex()).getWomen(),programsList.get(comboBox.getSelectedIndex()).getMen());

			}
		});		


	}

	private ArrayList<Program> loadAllPrograms() {
		ArrayList<Program> output = new ArrayList<Program>();
		// Hämta alla program
		NodeList programs = doc.getElementsByTagName("Program");
		for (int i = 0; i < programs.getLength(); i++) {
			// Gör om varje nod i listan till ett element
			Node node = programs.item(i);
			Element elm = (Element) node;
			// Hämta data från elementet
			String name = elm.getElementsByTagName("name").item(0).getTextContent();
			// Gör detta för alla fyra olika data! (namn, kod, antal kvinnor, antal män)
			String code = elm.getElementsByTagName("code").item(0).getTextContent();
			int women = Integer.valueOf(elm.getElementsByTagName("women").item(0).getTextContent());
			int men = Integer.valueOf(elm.getElementsByTagName("men").item(0).getTextContent());
			// Skapa programmet och lägg till i listan
			Program program = new Program(name, code, women, men);
			output.add(program);
		}
		return output;
	}
}
