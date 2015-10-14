import java.awt.BorderLayout;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.DriverManager;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.io.*;
import java.awt.event.*;
import java.sql.*;

public class ReceiverC extends JFrame implements ActionListener {

	BufferedInputStream bis;
	BufferedOutputStream bos;
	byte[] data;
	Socket socket;
	ServerSocket serverSocket;
	int in;
	BufferedReader inm = null;
	PrintWriter outm = null;

	String dd;
	String lenString1;
	String lenString2;
	String lenString3;
	String lenString4;
	String len3;
	String len4;

	StringBuffer buffer = new StringBuffer();
	public JLabel T1a = new JLabel("");
	public JLabel T1b = new JLabel(" ");
	public Font f = new Font("Times new roman", Font.BOLD, 22);
	public Font f1 = new Font("Times new roman", Font.BOLD, 15);
	public Font f2 = new Font("Arial", Font.BOLD, 17);
	public Font f3 = new Font("Times new roman", Font.BOLD, 18);
	public JLabel T0 = new JLabel(" RECEIVER C");
	public JLabel T1 = new JLabel("File Receiving Path:");
	public JLabel T2 = new JLabel("Server Status     :");
	public JLabel T3 = new JLabel("File receive path ");
	public JLabel T4 = new JLabel("running and waiting");
	public JLabel T5 = new JLabel("Answer    :");

	public JCheckBox chk1 = new JCheckBox("");
	public JComboBox TAreu = new JComboBox();

	public JButton btn = new JButton("View Routing Table");

	public JTextArea tf = new JTextArea();
	public JScrollPane pane = new JScrollPane();
	public JButton btn1 = new JButton("Open");
	public JButton btn2 = new JButton("Send");

	public JTextField txt = new JTextField();
	public JTextField txt1 = new JTextField();
	public JTextField txt2 = new JTextField();
	JLabel imageLabel = new JLabel();

	JLabel receive = new JLabel();

	JLabel image = new JLabel();
	JLabel imageLabel1 = new JLabel();
	JLabel image1 = new JLabel();

	JLabel imageLabel2 = new JLabel();
	JLabel image12 = new JLabel();
	public JLabel tfld = new JLabel();
	JPanel jp = new JPanel();
	JPanel jp1 = new JPanel();
	public JLabel leftButton;
	public JLabel proxyques;

	public JLabel line;
	public JLabel line1;
	public JLabel imagelabel = new JLabel();
	public JFrame jf;
	public Container c;
	FileOutputStream fout;
	String fname, tot;

	JLabel   l3, l4, l5, l6;
	JTextField t3, t4, t5, t6, t2;

	// String data;
	ReceiverC() {
		StringBuffer buffer = new StringBuffer();

		ImageIcon img1 = new ImageIcon(this.getClass()
				.getResource("Search.PNG"));
		imagelabel.setIcon(img1);
		imagelabel.setBounds(200, 140, 550, 350);

		jf = new JFrame("Receiver-C");
		c = jf.getContentPane();
		c.setLayout(null);
		jf.setSize(650, 800);
		jf.setResizable(false);
		c.setBackground(Color.PINK);
		T1a.setBounds(50, 5, 650, 45);
		T1a.setFont(f);
		T1a.setForeground(Color.white);
		T1b.setBounds(155, 40, 450, 45);
		T1b.setFont(f);
		T1b.setForeground(Color.white);



		// l3=new JLabel();
		// l3.setText("INode1");
		// t3=new JTextField(15);
		// l4=new JLabel();
		// l4.setText("INode2");
		// t4=new JTextField(15);
		// l5=new JLabel();
		// l5.setText("INode3");
		// t5=new JTextField(15);
		// t5=new JTextField(15);

		// l3.setBounds(90,240,100,25);
		// t3.setBounds(200,240,100,25);
		// l4.setBounds(90,280,100,25);
		// t4.setBounds(200,280,100,25);

		// l5.setBounds(90,320,100,25);
		// t5.setBounds(200,320,100,25);

		Border lineBorder = BorderFactory.createLineBorder(new Color(211, 217,
				184));
		line = new JLabel();
		line.setBorder(lineBorder);
		line.setBounds(70, 140, 500, 280);

		TitledBorder leftBorder = BorderFactory
				.createTitledBorder("File Transmit");
		leftBorder.setTitleJustification(TitledBorder.LEFT);
		leftButton = new JLabel();
		leftButton.setBorder(leftBorder);
		// leftBorder.paintBorder(c, g, x, y, width,
		// height)setTitleColor(Color.magenta);
		// TitledBorder.
		leftButton.setBounds(70, 200, 500, 300);
		leftBorder.setTitleColor(Color.ORANGE);

		TitledBorder leftBorder1 = BorderFactory
				.createTitledBorder("Received File");
		leftBorder.setTitleJustification(TitledBorder.LEFT);
		proxyques = new JLabel();
		proxyques.setBorder(leftBorder1);
		// leftBorder.paintBorder(c, g, x, y, width,
		// height)setTitleColor(Color.magenta);
		// TitledBorder.
		proxyques.setBounds(70, 430, 500, 280);
		leftBorder1.setTitleColor(Color.ORANGE);

		T0.setBounds(200, 80, 350, 45);
		T0.setFont(f);

		T0.setForeground(Color.CYAN);
		T2.setBounds(105, 660, 250, 45);
		T2.setFont(f1);
		T2.setForeground(new Color(211, 217, 184));

		T1.setForeground(new Color(211, 217, 184));
		T1.setBounds(105, 570, 300, 150);
		T1.setFont(f1);
		txt1.setBounds(105, 280, 300, 25);
		txt1.setFont(f1);

		// txt1.setForeground(new Color(211,217,184));
		T3.setBounds(265, 625, 250, 45);
		T3.setFont(f1);
		T3.setForeground(Color.cyan);

		T4.setBounds(255, 660, 350, 45);
		T4.setFont(f1);
		T4.setForeground(Color.RED);

		T5.setBounds(125, 590, 250, 45);
		T5.setFont(f3);
		T5.setForeground(new Color(211, 217, 184));
		txt2.setBounds(220, 595, 250, 30);
		txt2.setForeground(Color.BLUE);
		txt2.setFont(f1);
		// T6.setBounds(760, 70, 400,35);
		// T6.setFont(f2);
		// T6.setForeground(Color.RED);

		// T7.setBounds(760, 110, 400,35);
		// T7.setFont(f2);
		// T7.setForeground(Color.MAGENTA);

		btn.setBounds(220, 720, 220, 30);
		btn.setFont(f3);
		btn.setForeground(new Color(120, 0, 0));
		btn1.setBounds(420, 277, 120, 30);
		btn1.setFont(f3);
		btn1.setForeground(new Color(120, 0, 0));
		btn2.setBounds(420, 650, 120, 30);
		btn2.setFont(f3);
		btn2.setForeground(new Color(120, 0, 0));

		jp.setBounds(85, 110, 850, 550);
		jp.setBackground(new Color(211, 217, 184));

		jp1.setBounds(80, 105, 860, 560);
		// jp1.setBackground(Color.BLACK);

		receive.setBounds(445, 720, 250, 45);
		receive.setForeground(Color.RED);

		txt.setBounds(260, 150, 180, 25);
		txt.setForeground(Color.BLUE);
		txt.setFont(f1);
		TAreu.setBounds(650, 550, 200, 35);

		TAreu.addItem("Mesh Route");
		TAreu.addItem(" Node ");
		TAreu.setFont(f3);
		// TAreu.setBackground(Color.WHITE);
		TAreu.setForeground(Color.BLUE);
		TAreu.setFont(f);
		pane.setBounds(115, 470, 400, 200);

		tf.setColumns(20);

		tf.setForeground(Color.MAGENTA);
		tf.setFont(f1);
		tf.setRows(10);
		tf.setName("tf");
		pane.setName("pane");
		pane.setViewportView(tf);
		tfld.setBounds(410, 160, 200, 30);
		tfld.setFont(f2);
		tfld.setForeground(new Color(120, 0, 0));
		// btn1.addActionListener(this);
		btn.addActionListener(this);

		btn1.setMnemonic(KeyEvent.VK_B);
		btn.setMnemonic(KeyEvent.VK_S);
		jf.show();

		c.add(T1a);
		c.add(T1b);
		// c.add(T1);
		// c.add(T2);
		c.add(line);
		c.add(receive);
		// c.add(btn);
		// c.add(T3);
		// c.add(T4);
		// c.add(l3);c.add(t3);
		// c.add(l4);c.add(t4);
		// c.add(l5);c.add(t5);
	

		c.add(pane, BorderLayout.CENTER);

		c.add(T0);
		c.add(proxyques);

		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent win) {
				System.exit(0);
			}
		});

		c.add(imagelabel);
		File[] files = new File[10];

		try {
			
			ServerSocket serverSocket = new ServerSocket(3002);
			
			System.out.println("i am Receiver C & listening...");

			while (true) {
				socket = serverSocket.accept();
				DataInputStream dis = new DataInputStream(socket
						.getInputStream());
				String fname = dis.readUTF();
				String puzzle = dis.readUTF();
				String result= dis.readUTF();
	
			JOptionPane.showMessageDialog(null, "The Puzzle sent by Surce is  :'"+puzzle+"' \n and Result is='"+result+"' ");
			
			String  x= JOptionPane.showInputDialog(null, "Enter value of M");
			String  y= JOptionPane.showInputDialog(null, "Enter value of N");
			String  z= JOptionPane.showInputDialog(null, "Enter value of O");
			String  a= JOptionPane.showInputDialog(null, "Enter value of P");
		
			int m = Integer.parseInt(x);
			int n = Integer.parseInt(y);
			int o = Integer.parseInt(z);
			int p = Integer.parseInt(a);
				
			int result1 = m + (n * o / p) - o;
			
		String xx = Integer.toString(result1);
			
			if(result.equals(xx)){
		
				JOptionPane.showMessageDialog(null, "Puzzle Solved Successfully !!! File is Accessing......");
				
				String p1 = dis.readUTF();
				String p2 = dis.readUTF();
				String p3 = dis.readUTF();
				String p4 = dis.readUTF();
				String p5 = dis.readUTF();
				String p6 = dis.readUTF();
				String p7 = dis.readUTF();
				String p8 = dis.readUTF();
				String p9 = dis.readUTF();
				String p10 = dis.readUTF();

				ENCDEC dec = new ENCDEC();
				
				String p11= dec.decrypt(p1);
				String p21= dec.decrypt(p2);
				String p31= dec.decrypt(p3);
				String p41= dec.decrypt(p4);
				String p51= dec.decrypt(p5);
				String p61= dec.decrypt(p6);
				String p71= dec.decrypt(p7);
				String p81= dec.decrypt(p8);
				String p91= dec.decrypt(p9);
				String p110= dec.decrypt(p10);
				
				
				Timer timer = new Timer(0, null);
				timer.start();
				Thread.sleep(1000);
				tf.append(p11);
				Thread.sleep(1000);
				tf.append(p21);
				Thread.sleep(1000);
				tf.append(p31);
				Thread.sleep(1000);
				tf.append(p41);
				Thread.sleep(1000);
				tf.append(p51);
				Thread.sleep(1000);
				tf.append(p61);
				Thread.sleep(1000);
				tf.append(p71);
				Thread.sleep(1000);
				tf.append(p81);
				Thread.sleep(1000);
				tf.append(p91);
				Thread.sleep(1000);
				tf.append(p110);
				timer.stop();
				
				ImageIcon img11 = new ImageIcon(this.getClass().getResource(
				"bluescreensys.png"));
		imagelabel.setIcon(img11);
		imagelabel.setBounds(150, 140, 550, 300);
				
//
//				PrintStream pout = new PrintStream(new FileOutputStream(
//						"ReceiverB\\" + fname + "1" + ".java"));
//				pout.write(p1.getBytes());

				PrintStream pout1 = new PrintStream(new FileOutputStream(
						"ReceiverB\\" + fname + "2" + ".java"));
				pout1.write(p21.getBytes());

				PrintStream pout2 = new PrintStream(new FileOutputStream(
						"ReceiverB\\" + fname + "3" + ".java"));
				pout2.write(p31.getBytes());

				PrintStream pout3 = new PrintStream(new FileOutputStream(
						"ReceiverB\\" + fname + "4" + ".java"));
				pout3.write(p41.getBytes());

				PrintStream pout4 = new PrintStream(new FileOutputStream(
						"ReceiverB\\" + fname + "5" + ".java"));
				pout4.write(p51.getBytes());

				PrintStream pout5 = new PrintStream(new FileOutputStream(
						"ReceiverB\\" + fname + "6" + ".java"));
				pout5.write(p61.getBytes());

				PrintStream pout6 = new PrintStream(new FileOutputStream(
						"ReceiverB\\" + fname + "7" + ".java"));
				pout6.write(p71.getBytes());

				PrintStream pout7 = new PrintStream(new FileOutputStream(
						"ReceiverB\\" + fname + "8" + ".java"));
				pout7.write(p81.getBytes());

				PrintStream pout8 = new PrintStream(new FileOutputStream(
						"ReceiverB\\" + fname + "9" + ".java"));
				pout8.write(p91.getBytes());

				PrintStream pout9 = new PrintStream(new FileOutputStream(
						"ReceiverB\\" + fname + "10" + ".java"));
				pout9.print(p110);

				for (int i = 1; i <= 10; i++) {
					String fname1 = "ReceiverB\\" + fname + String.valueOf(i)
							+ ".java";
					files[i - 1] = new File(fname1);
				}

				File outFile = new File("ReceiverB/" + fname + ".java");

				FileOutputStream fileOS = new FileOutputStream(outFile);

				for (int i = 0; i < files.length; i++) {
					FileInputStream fileIS = new FileInputStream(files[i]);
					byte[] data = new byte[(int) files[i].length()];
					int count = fileIS.read(data);
					fileOS.write(data);
					fileIS.close();

					tf.append(data.toString());
					
				}

		
			}

			
			else {
				
				JOptionPane.showMessageDialog(null, "Puzzle Solved FAIL \n  You are a File Attacker...");
				
			}	
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String args[]) {
		new ReceiverC();
	}

	public void actionPerformed(ActionEvent ae) {

	}

}
