//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
//import java.awt.Graphics;
//import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
//import java.io.DataInputStream;
//import java.io.File;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
//import java.security.InvalidKeyException;
//import java.security.Key;
import java.security.KeyPair;
//import java.security.KeyPairGenerator;
//import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Security;
import java.security.Signature;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicLookAndFeel;


import com.sun.corba.se.impl.ior.ByteBuffer;

public class Queue implements ActionListener {
	Thread t;String cltA=" ",cltB=" ",cltC=" ",cltD=" ",clientAserver;
	String serIP="null",ClientAIP="null",ClientBIP="null",ClientCIP="null",ClientDIP="null";
    public JButton b1 = new JButton("");

	public JButton b2 = new JButton("");
	public JButton b3 = new JButton("");
	public JButton b4 = new JButton("");
	public JButton b5 = new JButton("");
	
	
	public JLabel client = new JLabel("Destination status:");
	public JLabel ipaddr = new JLabel("IP Address:");
	public JLabel trspckt = new JLabel("Dest Received Pckts:");
	public JLabel pckts = new JLabel("File Convert to Packet:");
	public JLabel rcvr = new JLabel("Select The Receiver:");
	public JLabel keygen = new JLabel("Key Generation:");

	
	String lst[]={"*.Client A","*.Client B","*.Client C","*.Client D"};
	public JList list=new JList(lst);
	public JLabel server = new JLabel("Queue ");
	public JLabel c1 = new JLabel("");

	public JLabel c2 = new JLabel("");
	public Font l = new Font("Times New roman", Font.BOLD, 16);
	public Font l2 = new Font("Times New roman", Font.BOLD, 13);
	public Font l1 = new Font("Times New roman", Font.BOLD, 25);
	public Font l3 = new Font("Times New roman", Font.BOLD, 16);
	public Font l4 = new Font("tahoma", Font.BOLD, 23);
	public Font l5 = new Font("tahoma", Font.BOLD, 20);
	
	
	
	public JLabel redimg=new JLabel();
	public JLabel redimg1=new JLabel();
	public JLabel redimg2=new JLabel();
	public JLabel redimg3=new JLabel();
	
	public JLabel grimg=new JLabel();
	public JLabel grimg1=new JLabel();
	public JLabel grimg2=new JLabel();
	public JLabel grimg3=new JLabel();
	
	
	public JLabel ser=new JLabel("Sender");
	public JLabel serst=new JLabel("Sender Status:");
	public JLabel serip=new JLabel("Sender IP Address:");
	public JLabel serpckt=new JLabel("Sender Sending Pckts:");
	
	public JLabel serimg=new JLabel();
	public JLabel seripadd=new JLabel("");
	public JLabel sersenpckt=new JLabel("");
	public JLabel serimggr=new JLabel();
	
	public JFrame jf;
	public Container c;
	public JLabel ftr = new JLabel("FILE TRANSFERRING STATUS");
	
	
	public JLabel clntA = new JLabel("Destination");
	public JLabel clntB = new JLabel("Client B");
	public JLabel clntC = new JLabel("Client C");
	public JLabel clntD = new JLabel("Client D");

	public JLabel ip1=new JLabel("");
    public JLabel ip2=new JLabel("");
    public JLabel ip3=new JLabel("");
    public JLabel ip4=new JLabel("");
    public JLabel pckt1=new JLabel("");
    public JLabel pckt2=new JLabel("");
    public JLabel pckt3=new JLabel("");
    public JLabel pckt4=new JLabel("");

    KeyPair keyPair;



	public JButton test = new JButton();
	public JLabel test1 = new JLabel("Browse");
	public JLabel sen = new JLabel("Send");
	public JLabel tit1;// = new JLabel();
	public JLabel tit2;
	public JLabel tit3;
	public JLabel backgr = new JLabel("Browse");
	public JLabel splt = new JLabel("Split");
	public JLabel con = new JLabel("Key Generate");
	
	public JLabel title = new JLabel("SHCS METHODS" );
			
	public JLabel title1 = new JLabel("  ");
	
	public JLabel nopckts=new JLabel("No.of Packet:");
	public JLabel nopckt = new JLabel("34 packet  ");
	public JLabel ipaddrcon=new JLabel("");
	 int i=0,p1=0,p2=0,p3=0,p4=0;byte[] datasend;
	 String originaldata;Object digitalsigndata;
	 String serrout1,serrout2,serrout2B,serrout2C,serrout2D;
	Queue()
	{
		ImageIcon v1=new ImageIcon(this.getClass().getResource("button.png"));
		
		b1.setIcon(v1);
		b2.setIcon(v1);
		b3.setIcon(v1);
		b4.setIcon(v1);
		ImageIcon red=new ImageIcon(this.getClass().getResource("red.png"));
		
		ImageIcon red1=new ImageIcon(this.getClass().getResource("red1.png"));
		redimg1.setIcon(red1);
		redimg.setIcon(red1);
		redimg2.setIcon(red1);
		redimg3.setIcon(red1);
		
		serimg.setIcon(red1);
		
		
		ImageIcon back=new ImageIcon(this.getClass().getResource("Queue.jpg"));
		backgr.setBounds(0,0,1200,120);
		backgr.setIcon(back);
		
		ImageIcon simg=new ImageIcon(this.getClass().getResource("greenbutton.png"));
		serimggr.setBounds(390,130,300,200);
		serimggr.setIcon(simg);
			
		//serimg.setVisible(false);
		serimggr.setVisible(true);
		
		grimg.setIcon(simg);
		grimg1.setIcon(simg);
		grimg2.setIcon(simg);
		grimg3.setIcon(simg);
		
		
		jf = new JFrame("Packet-Hiding Methods for Preventing Selective Jamming Attacks - Queue");
		
		c = jf.getContentPane();
		c.setLayout(null);
		jf.setSize(1120,500);
		jf.setLocation(50,-10);
		jf.setResizable(false);
			
		TitledBorder leftBorder = BorderFactory.createTitledBorder("Connecting Status of Sender ");
		leftBorder.setTitleJustification(TitledBorder.LEFT);
		tit1 = new JLabel();
		tit1.setBorder(leftBorder);
	   
		tit1.setBounds(110,130,400,270);
	    leftBorder.setTitleColor(Color.white);
		
		
	    TitledBorder leftBorder1 = BorderFactory.createTitledBorder("Connecting Status of Destination");
	    leftBorder.setTitleJustification(TitledBorder.LEFT);
	    tit2 = new JLabel();
	    tit2.setBorder(leftBorder1);
	    //leftBorder.paintBorder(c, g, x, y, width, height)setTitleColor(Color.magenta);
	    //TitledBorder.
	    tit2.setBounds(510,130,400,270);
	    serimg.setBounds(390,130,300,200);
	    redimg.setBounds(680,130,300,200);
	    redimg1.setBounds(410,420,300,200);
	    redimg2.setBounds(550,420,300,200);
	    redimg3.setBounds(680,420,300,200);
	    
	    grimg.setBounds(680,130,300,200);
	    grimg1.setBounds(410,420,300,200);
	    grimg2.setBounds(550,420,300,200);
	    grimg3.setBounds(680,420,300,200);
	    leftBorder1.setTitleColor(Color.WHITE);
	   
	    TitledBorder leftBorder2 = BorderFactory.createTitledBorder("Received Key");
	    leftBorder.setTitleJustification(TitledBorder.LEFT);
	    tit3 = new JLabel();
	    tit3.setBorder(leftBorder2);
	    tit3.setBounds(520,410,400,240);
	    leftBorder2.setTitleColor(Color.WHITE);
	    
	    
	   
	    list.setBounds(380,340,120,90);
	    list.setForeground(Color.BLUE);
	    list.setBackground(new Color(194,249,206));
	    list.setFont(l);
	    //c.add(list);
	    
	    nopckts.setBounds(550,250,200,100);
	    nopckts.setForeground(Color.CYAN);
	    nopckts.setFont(l);
	    nopckt.setBounds(650,250,100,100);
	    nopckt.setForeground(Color.ORANGE);
	    nopckt.setFont(l);
	    
		
	
		title.setForeground(Color.WHITE);
		title.setBounds(70,10,950,50);
		title.setFont(l4);
		
		title1.setForeground(Color.ORANGE);
		title1.setBounds(250,50,950,50);
		title1.setFont(l4);
		
		
		b1.setBounds(380,135,120,30);
		
		b1.setForeground(Color.GREEN);
		b2.setBounds(380,280,120,30);
		splt.setBounds(425,275,120,35);
		splt.setForeground(Color.BLACK);
		splt.setFont(l);
		
		
		b3.setBounds(380,445,120,30);
		b4.setBounds(580,445,120,30);
		b5.setBounds(460,290,120,30);
		
		sen.setBounds(620,442,120,35);
		sen.setForeground(Color.BLACK);
		sen.setFont(l);
		con.setBounds(390,442,220,35);
		con.setForeground(Color.BLACK);
		con.setFont(l);
		
		ser.setBounds(400,150,220,35);
		ser.setForeground(Color.YELLOW);
		ser.setFont(l5);
		
		serst.setBounds(180,220,220,35);
		serst.setForeground(Color.CYAN);
		serst.setFont(l);
		serip.setBounds(180,280,220,35);
		serip.setForeground(Color.CYAN);
		serip.setFont(l);
		serpckt.setBounds(180,330,220,35);
		serpckt.setForeground(Color.CYAN);
		serpckt.setFont(l);
		
		seripadd.setBounds(400,280,220,35);
		seripadd.setForeground(Color.GREEN);
		seripadd.setFont(l);
		sersenpckt.setBounds(400,330,220,35);
		sersenpckt.setForeground(Color.red);
		sersenpckt.setFont(l);
		
		
		
		
		
		client.setBounds(520,180,250,50);
		client.setForeground(Color.CYAN);
		ipaddr.setBounds(520,250,250,50);
		ipaddr.setForeground(Color.CYAN);
		trspckt.setBounds(520,330,250,50);
		trspckt.setForeground(Color.CYAN);
		pckts.setBounds(570,445,380,50);
		pckts.setForeground(Color.CYAN);
		pckts.setFont(l);


				
		
		rcvr.setBounds(170,315,250,50);
		rcvr.setForeground(Color.CYAN);
		rcvr.setFont(l);
		keygen.setBounds(170,435,250,50);
		keygen.setForeground(Color.CYAN);
		keygen.setFont(l);
		
		server.setBounds(380,60,150,50);
		server.setForeground(Color.GREEN);
		
		
		
		clntA.setBounds(520,140,150,50);
		clntA.setFont(l5);
		clntA.setForeground(Color.YELLOW);
		
		
		//clntB.setBounds(410,430,150,50);
		//clntB.setFont(l5);
		//clntB.setForeground(Color.YELLOW);
		
		//clntC.setBounds(550,430,150,50);
		//clntC.setFont(l5);
		//clntC.setForeground(Color.YELLOW);
		
		//clntD.setBounds(680,430,150,50);
		//clntD.setFont(l5);
		//clntD.setForeground(Color.YELLOW);
		
		ip1.setBounds(700,250,250,50);
		ip1.setForeground(Color.GREEN);
		ip1.setFont(l2);
		ip2.setBounds(420,535,200,100);
		ip2.setForeground(Color.GREEN);
		ip2.setFont(l2);
		ip3.setBounds(560,535,200,100);
		ip3.setForeground(Color.GREEN);
		ip3.setFont(l2);
		ip4.setBounds(690,535,200,100);
		ip4.setForeground(Color.GREEN);
		ip4.setFont(l2);
		
		
		pckt1.setBounds(700,330,250,50);
		pckt1.setForeground(Color.red);
		pckt1.setFont(l2);
		pckt2.setBounds(420,585,200,100);
		pckt2.setForeground(Color.RED);
		pckt2.setFont(l2);
		pckt3.setBounds(560,585,200,100);
		pckt3.setForeground(Color.RED);
		pckt3.setFont(l2);
		pckt4.setBounds(690,585,200,100);
		pckt4.setForeground(Color.RED);
		pckt4.setFont(l2);
		
		
		c1.setBounds(320,178,400,35);
		c1.setForeground(Color.RED);
		c2.setBounds(380,225,100,35);
		c2.setFont(l2);
		c2.setForeground(Color.MAGENTA);
	
		ftr.setBounds(650,172,350,35);
		ftr.setForeground(Color.CYAN);
		ftr.setFont(l);
		
		
		c.add(ip1);
		c.add(ip2);
		c.add(ip3);
		c.add(ip4);
		c.add(seripadd);
	//	c.add(pckts);
	///	c.add(keygen);
		///c.add(nopckts);
		//c.add(nopckt);
		c.add(ser);
		c.add(serip);
		c.add(serpckt);
		c.add(serst);
		
		//c.add(title);
		
	    c.add(tit1);
		c.add(tit2);
		c.add(clntA);
		//c.add(clntB);
		//c.add(clntC);
		//c.add(clntD);
		
		
		c.add(client);
		c.add(ipaddr);
	    c.add(trspckt);
		//c.add(rcvr);
		//c.add(server);
		//c.add(c1);
		//c.add(c2);
		c.add(sersenpckt);
		c.add(pckt1);
		c.add(pckt2);
		c.add(pckt3);
		c.add(pckt4);
		client.setFont(l);
		ipaddr.setFont(l);
		trspckt.setFont(l);
		server.setFont(l1);
	
		test1.setBounds(415,132,100,35);
		test.setBounds(500,200,110,35);
		
		test1.setForeground(Color.BLACK);
		test1.setFont(l);
        test.setFocusPainted(true);
        //c.add(splt);
		 b1.setBorderPainted(true);
		 b1.setContentAreaFilled(false);
		 b2.setBorderPainted(true);
		 b2.setContentAreaFilled(false);
		 b3.setBorderPainted(true);
		 b3.setContentAreaFilled(false);
		 b4.setBorderPainted(true);
		 b4.setContentAreaFilled(false);
		 // c.add(test1); 
		 //  c.add(sen);
		 //  c.add(con);
	    //  c.add(b1);
	    //  c.add(b2);
	    //   c.add(b3);
	     //  c.add(b4);
	      // c.add(panel);
		 c.add(serimg);
		 c.add(redimg);
		 //c.add(redimg1);
		 //c.add(redimg2);
		// c.add(redimg3);
		 c.add(serimggr);
		 c.add(grimg);
		// c.add(grimg1);
		// c.add(grimg2);
		// c.add(grimg3);
		 serimggr.setVisible(false);
		 grimg.setVisible(false);
		// grimg1.setVisible(false);
		// grimg2.setVisible(false);
		// grimg3.setVisible(false);
		 
		 
		b1.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent e)
			{
				ImageIcon v2=new ImageIcon(this.getClass().getResource("button.png"));
				
				b1.setIcon(v2);
				
				
			}
			public void mouseExited(MouseEvent e)
			{
				ImageIcon v=new ImageIcon(this.getClass().getResource("button3.png"));
				
				b1.setIcon(v);
				
			}
			public void mouseClicked(MouseEvent e)
			{
				
			}
		
		});
		
		b2.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent e)
			{
				ImageIcon v3=new ImageIcon(this.getClass().getResource("button.png"));
				
				
				b2.setIcon(v3);
				
			}
			public void mouseExited(MouseEvent e)
			{
				ImageIcon v5=new ImageIcon(this.getClass().getResource("button3.png"));
				
				
				b2.setIcon(v5);
				
			}
			public void mouseClicked(MouseEvent e)
			{
				
			}
		
	
		});
		
		b3.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent e)
			{
				ImageIcon v2=new ImageIcon(this.getClass().getResource("button.png"));
				
				b3.setIcon(v2);
				
				
			}
			public void mouseExited(MouseEvent e)
			{
				ImageIcon v=new ImageIcon(this.getClass().getResource("button3.png"));
				
				b3.setIcon(v);
				
				
			}
			public void mouseClicked(MouseEvent e)
			{
				
			}
		
	
		});
		b4.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent e)
			{
				ImageIcon v2=new ImageIcon(this.getClass().getResource("button.png"));
				
				b4.setIcon(v2);
				
				
			}
			public void mouseExited(MouseEvent e)
			{
				ImageIcon v=new ImageIcon(this.getClass().getResource("button3.png"));
				
				b4.setIcon(v);
				
				
			}
			public void mouseClicked(MouseEvent e)
			{
				
			}
		
	
		});
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		jf.show();
	       jf.addWindowListener(new WindowAdapter()
	         {
				public void windowClosing(WindowEvent win)
				{
					System.exit(0);
				}
			});
	       
	       int[] ports = new int[] {1000,2000,2001,2002,2003,5000};

			for (int i = 0; i < 6; i++) {
				
				t = new Thread(new PortListener(ports[i]));
				t.setName("Listener-" + ports[i]);
				t.start();
			}    
		
			 c.add(backgr); 
	        
	}


	public static void main(String args[]) {
		new Queue();
	}

	
	class PortListener implements Runnable {

		BufferedOutputStream bos = null;

		ServerSocket server;
		Socket connection;
		BufferedReader br = null;
		int port;
		
			
		public PortListener(int port) {
			this.port = port;
		}

		public void run() {
			

			if (this.port == 1000) {
				
			
				
				try {
					server = new ServerSocket(1000);
					
				while (true) {
						connection = server.accept();
						
						serrout1="serrouteconnected";
						
						
						br = new BufferedReader(new InputStreamReader(
								new BufferedInputStream(connection
										.getInputStream())));
						
						serimg.setVisible(false);
						serimggr.setVisible(true);
						
						
						String strLine;
						
						StringBuffer buffer = new StringBuffer();
						while ((strLine = br.readLine()) != null)
						{
							buffer.append(strLine + "\n");
						}
						
						String rec=buffer.toString().toString();
							
						if(rec.isEmpty()){
							serimg.setVisible(true);
							serimggr.setVisible(false);
							seripadd.setText("");
						}
						else{
							serimg.setVisible(false);
							serimggr.setVisible(true);
							seripadd.setText(buffer.toString().trim());
							serIP=buffer.toString().trim();
						}
						
						br.close();
						connection.close();
							
					}		
					
				} catch (UnknownHostException e1) {

					e1.printStackTrace();
				} catch (IOException e1) {
				}
				finally {
					if((serrout1.equals("serrouteconnected"))&&(serrout2.equals("clinArouteconnected")))
					{	
						
						serroutcon("clienAservercon");
					}
					if((serrout1.equals("serrouteconnected"))&&(serrout2B.equals("clinBrouteconnected")))
					{							
						serroutcon("clienBservercon");
					} if((serrout1.equals("serrouteconnected"))&&(serrout2C.equals("clinCrouteconnected")))
					{	
						
						serroutcon("clienCservercon");
					} if((serrout1.equals("serrouteconnected"))&&(serrout2D.equals("clinDrouteconnected")))
					{	
							
						
						serroutcon("clienDservercon");
					}	
					
				}
				
	        }
			else if(this.port == 2000){
				
				try {
					server = new ServerSocket(2000);
					
					
				while (true) {
						connection = server.accept();
						   
						
						br = new BufferedReader(new InputStreamReader(
								new BufferedInputStream(connection
										.getInputStream())));

						String strLine;
						serrout2="clinArouteconnected";
						
						
						StringBuffer buffer = new StringBuffer();
						while ((strLine = br.readLine()) != null)
						{
							buffer.append(strLine + "\n");
						}
						
						
						
						String rec=buffer.toString().toString();
						//JOptionPane.showMessageDialog(null,"2000"+rec, "Message Box", 1);
						
						if(rec.trim().equals("1")){
							redimg.setVisible(true);
							grimg.setVisible(false);
							ip1.setText("");
							clientAserver="clientAdisabled";
						}
						else{
							redimg.setVisible(false);
							grimg.setVisible(true);
							
							ip1.setText(buffer.toString().trim());
							ClientAIP=buffer.toString().trim();
							clientAserver="clienAservercon";
							
						}
						

						
						
						
						
						
						br.close();
						connection.close();
						
						if((serrout1.equals("serrouteconnected"))&&(serrout2.equals("clinArouteconnected")))
						{						
							
							serroutcon(clientAserver);
						}
						
					}		
					
				} catch (UnknownHostException e1) {

					e1.printStackTrace();
				} catch (IOException e1) {
				}
				finally {
					
				}
				
	        
			}
			else if(this.port==2001){
				

				try {
					server = new ServerSocket(2001);
					
					while (true) {
						connection = server.accept();

						redimg1.setVisible(false);
						grimg1.setVisible(true);
						
						br = new BufferedReader(new InputStreamReader(
								new BufferedInputStream(connection
										.getInputStream())));

						String strLine;
						serrout2B="clinBrouteconnected";
						
						StringBuffer buffer = new StringBuffer();
						while ((strLine = br.readLine()) != null)
						{
							buffer.append(strLine + "\n");
						}
						String rec=buffer.toString().toString();
						if(rec.trim().equals("1")){
							redimg1.setVisible(true);
							grimg1.setVisible(false);

							ip2.setText("");
							clientAserver="clientBdisabled";
						}
						else{
							redimg1.setVisible(false);
							grimg1.setVisible(true);

							ip2.setText(buffer.toString().trim());
							ClientBIP=buffer.toString().trim();
							clientAserver="clienBservercon";
						}
						
					
						br.close();
						connection.close();
						
						if((serrout1.equals("serrouteconnected"))&&(serrout2B.equals("clinBrouteconnected") ))
						{
							
							serroutcon(clientAserver);
						}
					}		
					
				} catch (UnknownHostException e1) {

					e1.printStackTrace();
				} catch (IOException e1) {
				}
				finally {
					
				}
				
	        
			
			}
			else if(this.port==2002){

				

				try {
					server = new ServerSocket(2002);
					
					while (true) {
						connection = server.accept();
						
						
						br = new BufferedReader(new InputStreamReader(
								new BufferedInputStream(connection
										.getInputStream())));

						String strLine;
						serrout2C="clinCrouteconnected";
						StringBuffer buffer = new StringBuffer();
						while ((strLine = br.readLine()) != null)
						{
							buffer.append(strLine + "\n");
						}
						
						String rec=buffer.toString().toString();
						if(rec.trim().equals("1")){
							redimg2.setVisible(true);
							grimg2.setVisible(false);

							ip3.setText("");
							clientAserver="clientCdisabled";
						}
						else{
							redimg2.setVisible(false);
							grimg2.setVisible(true);

							ip3.setText(buffer.toString().trim());
							ClientCIP=buffer.toString().trim();
							clientAserver="clienCservercon";
						}
						
						br.close();
						connection.close();
						if((serrout1.equals("serrouteconnected"))&&(serrout2C.equals("clinCrouteconnected")))
						{
							serroutcon(clientAserver);
							
						}
					}		
					
				} catch (UnknownHostException e1) {

					e1.printStackTrace();
				} catch (IOException e1) {
				}
				finally {
					
				}
				
	        
			
			
			}
			else if(this.port==2003)
			{

				

				try {
					server = new ServerSocket(2003);

					while (true) {
						connection = server.accept();
						
						
						
						br = new BufferedReader(new InputStreamReader(
								new BufferedInputStream(connection
										.getInputStream())));

						String strLine;
						serrout2D="clinDrouteconnected";

						StringBuffer buffer = new StringBuffer();
						while ((strLine = br.readLine()) != null)
						{
							buffer.append(strLine + "\n");
						}
						
						String rec=buffer.toString().toString();
						if(rec.trim().equals("1")){
							redimg3.setVisible(true);
							grimg3.setVisible(false);

							ip4.setText("");
							clientAserver="clientDdisabled";
						}
						else{
							redimg3.setVisible(false);
							grimg3.setVisible(true);
							clientAserver="clienDservercon";
							ip4.setText(buffer.toString().trim());
							ClientDIP=buffer.toString().trim();
						}
						
						br.close();
						connection.close();
						if( (serrout1.equals("serrouteconnected"))&&(serrout2D.equals("clinDrouteconnected")))
						{
							
							serroutcon(clientAserver);
						}
					}		

				} catch (UnknownHostException e1) {

					e1.printStackTrace();
				} catch (IOException e1) {
				}
				finally {
					
					
				}
				
			}
			else if(this.port==5000){
				
               
				try {
					server = new ServerSocket(5000);
					
					while (true) {
						connection = server.accept();

						
						 ObjectInputStream ois=new ObjectInputStream(connection.getInputStream());
						
						 String clientevent=ois.readUTF();
						 originaldata=ois.readUTF();
						 
						 digitalsigndata=ois.readObject();
						 
						 
						
						String first=clientevent.substring(0,2);
						int flen=Integer.parseInt(first);
						String second=clientevent.substring(2,2+flen);
						
						if(second.substring(0, 4).equals("null"))
						{
							Integer qqq=second.length();
							second=second.substring(4,qqq);
						}
						System.out.println(second);
						
						i++;
					    sersenpckt.setText(Integer.toString(i)+ " Packets");
					    
					  try
						{
							Thread.sleep(500);
						} catch (InterruptedException ejj)
						{ 
						}
						System.out.println("flen"+flen);
						if(flen==14)
						{
							flen=10;
						}
						if(flen==24)
						{
							flen=20;
						}
						if(flen==34)
						{
							flen=30;
						}
						if(flen==44)
						{
							flen=40;
						}
						
						if(flen==10)
						{
						cltA=second.substring(0,10).trim();
						
						}
						if(flen==20)
						{
							cltA=second.substring(0,10).trim();
							cltB=second.substring(10,20).trim();
						
						}
						if(flen==30){
							cltA=second.substring(0,10).trim();
							cltB=second.substring(10,20).trim();
							cltC=second.substring(20,30).trim();
								
						}
						if(flen==40){
							cltA=second.substring(0,10).trim();
							cltB=second.substring(10,20).trim();
							cltC=second.substring(20,30).trim();
							cltD=second.substring(30,40).trim();
						}
							if(cltA.trim().equals("*.Client A"))
						{
						if(ClientAIP=="null"){
							
						}else{
							clientA();
						}
						}else if(cltA.trim().equals("*.Client B"))
						{
							
							if(ClientBIP=="null"){
								
							}else{
								clientB();
							}
						}
						else if(cltA.trim().equals("*.Client C"))
							
						{
							if(ClientCIP=="null"){
								
							}else{
								clientC();
							}
						}else if(cltA.trim().equals("*.Client D"))
						{
							if(ClientDIP=="null"){
								
							}else{
								clientD();
							}
						}
						
						if(cltB.trim().equals("*.Client A"))
						{
							if(ClientAIP=="null"){
								
							}else{
								clientA();
							}
						}else if(cltB.trim().equals("*.Client B"))
						{
							if(ClientBIP=="null"){
								
							}else{
								clientB();
							}
						}
						else if(cltB.trim().equals("*.Client C"))
						{if(ClientCIP=="null"){
							
						}else{
							clientC();
						}
						}else if(cltB.trim().equals("*.Client D"))
						{
							if(ClientDIP=="null"){
								
							}else{
								clientD();
							}
						}
						
						
						if(cltC.trim().equals("*.Client A"))
						{
							if(ClientAIP=="null"){
								
							}else{
								clientA();
							}
						}else if(cltC.trim().equals("*.Client B"))
						{
							if(ClientBIP=="null"){
								
							}else{
								clientB();
							}
						}
						else if(cltC.trim().equals("*.Client C"))
						{
							if(ClientCIP=="null"){
								
							}else{
								clientC();
							}
						}else if(cltC.trim().equals("*.Client D"))
						{
							if(ClientDIP=="null"){
								
							}else{
								clientD();
							}
						}
						
						if(cltD.trim().equals("*.Client A"))
						{
							if(ClientAIP=="null"){
								
							}else{
								clientA();
							}
						}else if(cltD.trim().equals("*.Client B"))
						{
							if(ClientBIP=="null"){
								
							}else{
								clientB();
							}
						}
						
						else if(cltD.trim().equals("*.Client C"))
						{if(ClientCIP=="null"){
							
						}else{
							clientC();
						}
						}else if(cltD.trim().equals("*.Client D"))
						{
							if(ClientDIP=="null"){
								
							}else{
								clientD();
							}
						}
							
						ois.close();
						connection.close();
						 
					}		

				} catch (UnknownHostException e1) {

					e1.printStackTrace();
				} catch (IOException e1) {
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally {
                 
                 
				}
				
				i=0;
				
			}
		}
		}
	
	void clientA()
	{
		byte[] byteArray;
		Socket client = null;
		BufferedOutputStream bos = null;
		try
		{
			Thread.sleep(300);
		} catch (InterruptedException ejj)
		{ 
		}
		try {
       /*******************Client IP Address*******************/
			client = new Socket(ClientAIP.trim(),8000);
				
			ObjectOutputStream oos=new ObjectOutputStream(client.getOutputStream());
			oos.writeUTF(originaldata);
			oos.writeObject(digitalsigndata);
			
				
			oos.flush();
			p1++;
		    pckt1.setText(Integer.toString(p1)+ " Packets");
		    oos.close();
			client.close();
		}

		catch (UnknownHostException e1) {

			e1.printStackTrace();
		} catch (IOException e1) {
		}

		finally {
			
		}
		
	
	}
	void clientB()
	{
		
		byte[] byteArray;
		Socket client = null;
		BufferedOutputStream bos = null;
		try
		{
			Thread.sleep(300);
		} catch (InterruptedException ejj)
		{ 
		}
		try {
       /*******************Client IP Address*******************/
			client = new Socket(ClientBIP,8001);
			
			ObjectOutputStream oos=new ObjectOutputStream(client.getOutputStream());
			oos.writeUTF(originaldata);
			oos.writeObject(digitalsigndata);
			
				
			oos.flush();
			p2++;
		    pckt2.setText(Integer.toString(p2)+ " Packets");
			oos.close();
			client.close();
		}

		catch (UnknownHostException e1) {

			e1.printStackTrace();
		} catch (IOException e1) {
		}

		finally {
			
		}
	
	}void clientC()
	{
		
		byte[] byteArray;
		Socket client = null;
		BufferedOutputStream bos = null;
		try
		{
			Thread.sleep(300);
		} catch (InterruptedException ejj)
		{ 
		}
		try {
       /*******************Client IP Address*******************/
			client = new Socket(ClientCIP,8002);
			
			ObjectOutputStream oos=new ObjectOutputStream(client.getOutputStream());
			oos.writeUTF(originaldata);
			oos.writeObject(digitalsigndata);
			
				
			oos.flush();
		    p3++;
		    pckt3.setText(Integer.toString(p3)+ " Packets");
			oos.close();
			client.close();
		}

		catch (UnknownHostException e1) {

			e1.printStackTrace();
		} catch (IOException e1) {
		}

		finally {
			
		}
		
	
	}void clientD()
	{
		
		byte[] byteArray;
		Socket client = null;
		BufferedOutputStream bos = null;
		try
		{
			Thread.sleep(300);
		} catch (InterruptedException ejj)
		{ 
		}
		try {
       /*******************Client IP Address*******************/
			client = new Socket(ClientDIP,8003);
			ObjectOutputStream oos=new ObjectOutputStream(client.getOutputStream());
			oos.writeUTF(originaldata);
			oos.writeObject(digitalsigndata);
			
				
			oos.flush();
		  
			p4++;
		//	System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq---------------------"+p4);
		    pckt4.setText(Integer.toString(p4)+ " Packets");
			oos.close();
			client.close();
		}

		catch (UnknownHostException e1) {

			e1.printStackTrace();
		} catch (IOException e1) {
		}

		finally {
			
		}
		
	
	}
	void serroutcon(String str){

			byte[] byteArray;
			Socket client = null;
			BufferedOutputStream bos = null;
		
			try {
	       /*******************Client IP Address*******************/
				client = new Socket(serIP,7000);
				bos = new BufferedOutputStream(client
						.getOutputStream());

				byteArray = str.getBytes();
				bos.write(byteArray, 0, byteArray.length);
				bos.flush();
				bos.close();
				client.close();
			}

			catch (UnknownHostException e1) {

				e1.printStackTrace();
			} catch (IOException e1) {
			}

			finally {
				str="";
					

			}
	}
	
	
	
		public void actionPerformed(ActionEvent e) {}
	
	
	
}
