/* 
 * 1.1
 * 
 * a) public House(int_year,int_size){}
 * 
 * b) private int year;
 *    private int size;
 *    
 * c) private static int nbrOfHouses;
 *    public static final int MIN_SIZE=10;
 * 
 * d) public static int getNbrHouses(){
 *      return nbrOfHouses;
 *      }
 * 
 * e) public int getYear(){}
 *    public int getSize(){}
 *    
 * f) Varibeln kan inte ändras/skrivas om.
 * 
 * g) -------
 *    House
 *    -------
 *    - year:int
 *    - size:int
 *    - nbrOfHouses:int
 *    - MIN_SIZE:int
 *    -------
 *    House(year:int,size:int)
 *    getNbrHouses():int
 *    getYear():int
 *    getSize():int
 *    -------
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class HouseGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 394, 155);
		contentPane.add(textArea);
		House house1 = new House(1950, 200);
		House house2 = new House(1900, 300);
		House house3 = new House(1980, 5);
		House[] houseArray = new House[10];
		houseArray[0] = house1;
		houseArray[1] = house2;
		houseArray[2] = house3;
		for (int i = 0; i < houseArray.length; i++) {
			if (houseArray[i] != null) {
				textArea.append("Ett hus som är byggt "
						+ houseArray[i].getYear() + " och är "
						+ houseArray[i].getSize() + " kvm stort.\n");
			}
		}
		textArea.append("Det finns " + House.getNbrHouses() + " hus.");
	}
}
