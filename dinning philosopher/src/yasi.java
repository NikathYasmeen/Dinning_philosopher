//import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingWorker;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;






//import javax.swing.ImageIcon;
import java.awt.Color;

public class yasi extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel ms[];
	//void getcontentPane().setBackground(Color.red);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					yasi frame = new yasi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//jframe.setBackground(Color.red);
	// public Container getContentPane().setBackground(Color.red);
	 //void getcontentpane().abstract yasi(Color.red); 
	

	 //* Create the frame.
	 //*/
	
	public yasi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(135, 52, 97, 15);
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel.setForeground(Color.magenta);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(33, 96, 107, 15);
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_1.setForeground(Color.gray);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(45, 205, 117, 15);
		lblNewLabel_2.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_2.setForeground(Color.CYAN);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(218, 205, 128, 15);
		lblNewLabel_3.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_3.setForeground(Color.LIGHT_GRAY);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(246, 96, 128, 15);
		lblNewLabel_4.setFont(new Font("Serif", Font.BOLD, 13));
		lblNewLabel_4.setForeground(Color.PINK);
		contentPane.add(lblNewLabel_4);
        JLabel lblNewLabel_5 = new JLabel("P1");
        lblNewLabel_5.setBounds(163, 30, 70, 15);
//JLabel lblNewLabel_5 = new JLabel("1");
        lblNewLabel_5.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_5.setForeground(Color.MAGENTA);
		contentPane.add(lblNewLabel_5);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("P2");
		lblNewLabel_6.setBounds(70, 79, 70, 15);
		lblNewLabel_6.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_6.setForeground(Color.GRAY);
		contentPane.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("P3");
		lblNewLabel_7.setBounds(64, 178, 112, 15);
		lblNewLabel_7.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_7.setForeground(Color.BLUE);
		contentPane.add(lblNewLabel_7);
		JLabel lblNewLabel_8 = new JLabel("P4");
		lblNewLabel_8.setBounds(218, 178, 70, 15);
		lblNewLabel_8.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_8.setForeground(Color.LIGHT_GRAY);
		contentPane.add(lblNewLabel_8);
		JLabel lblNewLabel_9 = new JLabel("P5");
		lblNewLabel_9.setBounds(236, 79, 70, 15);
		lblNewLabel_9.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_9.setForeground(Color.PINK);
		contentPane.add(lblNewLabel_9);
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(106, 0, 413, 260);
		Image img=new ImageIcon(this.getClass().getResource("/1.png")).getImage();
		lblNewLabel_10.setIcon((Icon) new ImageIcon(img));
		contentPane.add(lblNewLabel_10);
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setBounds(96, 12, 70, 72);
		Image img2=new ImageIcon(this.getClass().getResource("/3.png")).getImage();
		lblNewLabel_11.setIcon((Icon) new ImageIcon(img2));
		
	//	Image img1=new ImageIcon(this.getClass().getResource("/3.png")).getImage();
	//	lblNewLabel_10.setIcon((Icon) new ImageIcon(img1));
		contentPane.add(lblNewLabel_11);
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setBounds(45, 123, 70, 59);
		Image img1=new ImageIcon(this.getClass().getResource("/3.png")).getImage();
		lblNewLabel_12.setIcon((Icon) new ImageIcon(img1));
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setBounds(127, 178, 79, 42);
		Image img4=new ImageIcon(this.getClass().getResource("/3.png")).getImage();
		lblNewLabel_13.setIcon((Icon) new ImageIcon(img4));
		contentPane.add(lblNewLabel_13);
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setBounds(276, 108, 70, 42);
		Image img9=new ImageIcon(this.getClass().getResource("/3.png")).getImage();
		lblNewLabel_14.setIcon((Icon) new ImageIcon(img9));
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setBounds(236, 12, 70, 45);
		Image img8=new ImageIcon(this.getClass().getResource("/3.png")).getImage();
		lblNewLabel_15.setIcon((Icon) new ImageIcon(img8));
		contentPane.add(lblNewLabel_15);
		
		
		final JLabel l[]={lblNewLabel, lblNewLabel_1,lblNewLabel_2,lblNewLabel_3,lblNewLabel_4};
	
		ms = new JLabel[] {lblNewLabel_15,lblNewLabel_11,lblNewLabel_12,lblNewLabel_13,lblNewLabel_14};
		class Table {
//			public class Table{
				private boolean[] currentFork;
				public Table(int numberForks) {
				currentFork = new boolean[numberForks];
				
				for(int i = 0; i <currentFork.length; i++)
				{
				currentFork[i] = false;
				}
				}
				private int l(int i) { return i; }
				private int r(int i) {
					int n=5;
					if(i+1 < currentFork.length)
					return (i+1%n);
					else
					return 0;
					}
				public synchronized void takeForks(int place) {
				while(currentFork[l(place)]) {
					//ms[place].setVisible(false);
					try {
					wait();
					} 
					catch(InterruptedException e) {
					
					}
					}
					while(currentFork[r(place)]) {
						try {
						wait();
						} 
					catch(InterruptedException e) 
						
					{}
					}
					currentFork[l(place)] = true;
				//	
					currentFork[r(place)] = true;
				//	System.out.println(l(place));
				//	System.out.println(r(place));
				//	System.out.println(place);
					ms[l(place)].setVisible(false);
					ms[r(place)].setVisible(false);
					}
					public synchronized void putBackForks(int place)
					{//ms[place].setVisible(true)
						currentFork[l(place)] = false;
						//
						currentFork[r(place)] = false;
				ms[l(place)].setVisible(true);
					ms[r(place)].setVisible(true);
						notifyAll();
					}

		}
		     class philosoph extends Thread {
				private Table Table;
				private int place;
				public philosoph(Table Table, int place) {
				this.Table = Table;
				this.place = place;
				start();
				}
				public void run() {
				// life of a philosopher
				while(true) {
				thinking(place);
				//System.out.println(place+" "+"hi");
				Table.takeForks(place);
			//	boolean[] currentFork;
				//[place].setVisible(false);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				eating(place);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Table.putBackForks(place);
				}
				}
				private void thinking(int place) {
			   // l[place].setText("Philosopher"+Integer.toString(place)+":Thinking");
				//l[place].setText("Philosopher"+Integer.toString(place));
				l[place].setText("Thinking");
				try {
				sleep((int)(Math.random() * 10000));
				} catch(InterruptedException e) {
					System.out.println('0');
				}
				}
				private void eating(int place) {
					//l[place].setText("Philosopher"+Integer.toString(place)+":Eating");
					l[place].setText("EATING");
					try {
				sleep((int)(Math.random() * 20000));
				} catch(InterruptedException e) {System.out.println('0');}
					l[place].setText("Done");
					}

		}
		
		JButton btnStart = new JButton("START");
		btnStart.setBounds(22, 235, 117, 25);
		
		btnStart.setForeground(Color.GREEN);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SwingWorker<Object, Object> worker = new SwingWorker<Object, Object>(){

					@Override
					protected Object doInBackground() throws Exception {
						// write code here
						
						
						
							final int numberPhilisophers = 5;
							int numberForks = 5;
							Table Table = new Table(numberForks);
							for(int i = 0; i < numberPhilisophers; i++)
							new philosoph(Table, i);
							
					
						
						
						return null;
					}
					
				};
				worker.execute();
				
			}
		});
		contentPane.add(btnStart);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.setBounds(174, 235, 117, 25);
		btnNewButton.setForeground(Color.red);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);}
		});
		contentPane.add(btnNewButton);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
