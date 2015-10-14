import java.awt.BorderLayout;
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
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.sound.sampled.AudioFormat.Encoding;
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

public class Source implements ActionListener {
	public Font f = new Font("Times new roman", Font.BOLD, 35);
	public Font f1 = new Font(" Times new roman", Font.BOLD, 18);
	public Font f2 = new Font("Times new roman", Font.BOLD, 18);
	public Font f3 = new Font("Times new roman", Font.BOLD, 16);
	public JLabel T0 = new JLabel("Server");
	public JLabel T1 = new JLabel("Select the Method");
	public JLabel T2 = new JLabel("Select the File    :");
	public JLabel T3 = new JLabel("File Path            :");
	public JLabel T4 = new JLabel();
	public JLabel T5 = new JLabel("Select The Route");
	public JLabel T6 = new JLabel("FA    -Foriegn Agent");
	public JLabel T7 = new JLabel("GFA   -Gateway Foriegn Agent");

	public JCheckBox chk1 = new JCheckBox("");
	public JComboBox TAreu = new JComboBox();
	public JButton btn = new JButton("Submit");
	public JTextArea tf = new JTextArea();
	public JScrollPane pane = new JScrollPane();
	public JButton btn1 = new JButton("Browse");

	JLabel imageLabel = new JLabel();
	JLabel image = new JLabel();
	JLabel imageLabel1 = new JLabel();
	JLabel image1 = new JLabel();

	JLabel imageLabel2 = new JLabel();
	JLabel image12 = new JLabel();

	JPanel jp = new JPanel();
	JPanel jp1 = new JPanel();

	public JFrame jf;
	public Container c;

	Source() {
		jf = new JFrame("SOURCE::Jamming Simulation");
		c = jf.getContentPane();
		c.setLayout(null);
		jf.setSize(1000, 700);
		// c.setBackground(Color.DARK_GRAY);
		c.setBackground(new Color(10, 100, 120));
		T0.setBounds(450, 30, 350, 45);
		T0.setFont(f);

		T0.setForeground(Color.GREEN);
		T2.setBounds(205, 150, 250, 45);
		T2.setFont(f2);
		T2.setForeground(Color.BLUE);

		T3.setBounds(205, 210, 250, 45);
		T3.setFont(f2);
		T3.setForeground(Color.BLUE);

		T4.setBounds(400, 210, 950, 45);
		T4.setFont(f2);
		T4.setForeground(new Color(120, 0, 0));

		T5.setBounds(660, 145, 300, 45);
		T5.setFont(f2);
		T5.setForeground(Color.CYAN);

		T6.setBounds(760, 70, 400, 35);
		T6.setFont(f2);
		T6.setForeground(Color.RED);

		T7.setBounds(760, 110, 400, 35);
		T7.setFont(f2);
		T7.setForeground(Color.MAGENTA);

		btn1.setBounds(590, 153, 150, 33);
		btn1.setFont(f2);
		// btn1.setBackground(Color.WHITE);
		btn1.setForeground(new Color(120, 0, 0));

		jp.setBounds(105, 126, 719, 450);
		jp.setBackground(new Color(0, 146, 187));
		// jp1.setBackground(new Color(120,0,0));
		jp1.setBounds(103, 124, 723, 453);

		T1.setBounds(300, 550, 250, 45);
		TAreu.setBounds(650, 550, 200, 35);
		btn.setBounds(440, 520, 150, 33);
		T1.setFont(f3);
		T1.setForeground(new Color(0, 120, 0));
		btn.setFont(f2);
		// btn.setBackground(Color.WHITE);
		btn.setForeground(new Color(120, 0, 0));
		TAreu.addItem("Mesh Route");
		TAreu.addItem(" Node ");
		TAreu.setFont(f3);
		TAreu.setBackground(Color.WHITE);
		TAreu.setForeground(Color.BLUE);
		TAreu.setFont(f);
		pane.setBounds(385, 280, 400, 200);

		tf.setColumns(20);

		tf.setForeground(Color.MAGENTA);
		tf.setFont(f2);
		tf.setRows(10);
		tf.setName("tf");
		pane.setName("pane");
		pane.setViewportView(tf);
		
		
		ImageIcon ii = new ImageIcon(this.getClass().getResource("Source.jpg"));
		imageLabel.setIcon(ii);
		imageLabel.setBounds(0, 2, 1200, 100);
		
		
		

		btn1.addActionListener(this);
		btn.addActionListener(this);

		btn1.setMnemonic(KeyEvent.VK_B);
		btn.setMnemonic(KeyEvent.VK_S);
		jf.show();

		c.add(btn);
		c.add(T2);
		c.add(T3);
		c.add(T4);

		c.add(pane, BorderLayout.CENTER);
		c.add(btn1);
		//c.add(T0);

		c.add(imageLabel1);

		c.add(jp);
		c.add(jp1);
		c.add(imageLabel);
		
		
		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent win) {
				System.exit(0);
			}
		});

	}

	public void actionPerformed(ActionEvent e) {
		
		BufferedOutputStream bos = null;
		
		String str = "MobileTerminal,Foriegn Agent  A,Gateway FA  A";
		byte[] byteArray = str.getBytes();
		String strLine = null;
		if (e.getSource() == btn1) 
		{

			JFileChooser chooser = new JFileChooser();

			try {

				File f = new File(new File("filename.txt").getCanonicalPath());

				chooser.setSelectedFile(f);
			} catch (IOException e1) {
			}

			chooser.showOpenDialog(btn1);
			int retval = chooser.showOpenDialog(btn1);

			if (retval == JFileChooser.APPROVE_OPTION) {
				File field = chooser.getSelectedFile();
				T4.setText(field.getAbsolutePath());
			}

			File curFile = chooser.getSelectedFile();
			try {

				FileInputStream fstream = new FileInputStream(curFile);

				DataInputStream ins = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(new InputStreamReader(
						ins));

				StringBuffer buffer = new StringBuffer();

				while ((strLine = br.readLine()) != null) {

					buffer.append(strLine + "\n");
				}

				tf.setText(buffer.toString());

			} catch (Exception e1) {
				System.err.println("Error: " + e1.getMessage());
			}
			Socket client = null;

		}
		if (e.getSource() == btn) {

			String[] Router = { "Select", "Do u want to connect to Router",};
			String SRouter = (String) JOptionPane.showInputDialog(null,
					"Select Router", "Select", JOptionPane.QUESTION_MESSAGE,
					null, Router, Router[0]);
      
			Socket client = null;
            int[] ports = new int[] {1000 };
				
            
            ENCDEC enc =new ENCDEC();
            
           
            
				try 
				{
					client = new Socket("localhost", 1000);
					String d = tf.getText();
                    byte b[] = d.getBytes();
                    
                    String data= enc.encrypt(d);
                    
                    System.out.println(data+"encypted data");
                    
                    System.out.println(d.getBytes("utf8").length);
                    DataOutputStream dout = new DataOutputStream(client.getOutputStream());
                   
                    dout.writeUTF(SRouter);
                    dout.writeUTF(data);
					dout.flush();
					dout.close();
				} 
				catch (Exception ex) 
				{
					// TODO: handle exception
				}

			}
			
		}
	public static void main(String args[]) {
		new Source();
	}
	}

	class PortListener implements Runnable {
		
		BufferedOutputStream bos = null;

		ServerSocket server;
		Socket con;
		BufferedReader br = null;
		int port;

		public PortListener(int port) {
			this.port = port;
		}
		@Override
		public void run() {

		}
	

	
}
