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


public class XmlGUI extends JFrame {
	
	private ArrayList<String> nnaammnn = new ArrayList<String>();
	private ArrayList<Program> programsList = new ArrayList<Program>();
	private Document doc;
	private Program program;
	private JPanel contentPane;

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
		
		doc = openXmlFile("C:\\Users\\Emelie\\workspace\\Uppgift5\\src\\ht2013_antagning (1).xml");
				
		programsList = loadAllPrograms();	
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(22, 35, 263, 22);
		contentPane.add(lblNewLabel);
		lblNewLabel.setText("Antal program:  "+programsList.size());
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(22, 10, 263, 22);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setText("Första elementet (rooten):  "+doc.getDocumentElement().getNodeName());
		
		final JComboBox comboBox = new JComboBox();
		
		comboBox.setBounds(22, 68, 402, 20);
		contentPane.add(comboBox);
		for(Program p:programsList){
			nnaammnn.add(p.getName());			
		}
		comboBox.setModel(new DefaultComboBoxModel(nnaammnn.toArray()));
		
		final JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(139, 168, 260, 14);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setText(programsList.get(comboBox.getSelectedIndex()).getCode());
		
		final JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(139, 143, 260, 14);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setText(programsList.get(comboBox.getSelectedIndex()).getName());

		
		final JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(139, 218, 260, 14);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setText(Integer.toString(programsList.get(comboBox.getSelectedIndex()).getMen()));

		
		final JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(139, 193, 260, 14);
		contentPane.add(lblNewLabel_5);
		lblNewLabel_5.setText(Integer.toString(programsList.get(comboBox.getSelectedIndex()).getWomen()));

		
		JLabel lblDetaljer = new JLabel("Detaljer");
		lblDetaljer.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDetaljer.setBounds(22, 118, 109, 14);
		contentPane.add(lblDetaljer);
		
		JLabel lblN = new JLabel("Namn:");
		lblN.setBounds(22, 143, 107, 14);
		contentPane.add(lblN);
		
		JLabel lblK = new JLabel("Kod:");
		lblK.setBounds(22, 168, 107, 14);
		contentPane.add(lblK);
		
		JLabel lblNewLabel_6 = new JLabel("Sökande (kvinnor):");
		lblNewLabel_6.setBounds(22, 193, 107, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Sökande (män):");
		lblNewLabel_7.setBounds(22, 218, 107, 14);
		contentPane.add(lblNewLabel_7);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						lblNewLabel_2.setText(programsList.get(comboBox.getSelectedIndex()).getCode());
						lblNewLabel_3.setText(programsList.get(comboBox.getSelectedIndex()).getName());
						lblNewLabel_4.setText(Integer.toString(programsList.get(comboBox.getSelectedIndex()).getMen()));
						lblNewLabel_5.setText(Integer.toString(programsList.get(comboBox.getSelectedIndex()).getWomen()));
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
