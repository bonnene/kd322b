import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;


public class AnimalListGUI extends JFrame {
	
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalListGUI frame = new AnimalListGUI();
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
	public AnimalListGUI() {
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		
		animalList.add(new Snake("Ormus Giftus", true));
		animalList.add(new Dogen("Hundus Stupidus", 5, true));
		animalList.add(new Snake("Ormus Snellus", false));
		animalList.add(new Dogen("Hundus Smartus", 6, false));
		animalList.add(new Cat("Kattis Immortalus", 3, 20));
		animalList.add(new Cat("Kattis Doedligus", 2, 1));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 31, 414, 222);
		contentPane.add(textArea);
		
		
		
		JLabel lblNewLabel = new JLabel("Animal list");
		lblNewLabel.setBounds(10, 11, 82, 14);
		contentPane.add(lblNewLabel);
		
		for(Animal a: animalList){
			textArea.append(a.getInfo());
		}
		
	}

}
