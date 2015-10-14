import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Security;
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


import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Security;
import java.security.Signature;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;




import com.sun.corba.se.impl.ior.ByteBuffer;

public class SHCSSender implements ActionListener {
	
	 private static int DELAY = 100, p=0; 
		
	
	String ipadd="null",strsend,mescon=null,filetransmit,fletr1=" ",fletr2=" ",fletr3="  ",fletr4=" ",fletr1a=" ",fletr2a=" ",fletr3a="  ",fletr4a=" ";
	public JButton b1 = new JButton("");

	public JButton b2 = new JButton("");
	public JButton b3 = new JButton("");
	public JButton b4 = new JButton("");
	public JButton b5 = new JButton("");

	public JLabel slctfle = new JLabel("Select  the  file :");
	public JLabel flepth = new JLabel("File path         :");
	public JLabel flesze = new JLabel("File Size (Bits)   :");
	public JLabel pckts = new JLabel("File Convert to Packet:");
	public JLabel rcvr = new JLabel("Select The Receiver:");
	public JLabel keygen = new JLabel("Channel Encoder:");
	public JLabel keygen1 = new JLabel("InterLeave Data:");
	public JLabel filesend = new JLabel("File Send:");
	public JLabel brwsedfle = new JLabel("Browsed File");
	public JLabel keys = new JLabel("Keys");

	String lst[]={"*.Client A"};
	public JList list=new JList(lst);
	public JLabel server = new JLabel("A Strong Hiding Commitment Scheme (SHCS) - SENDER ");
	public JLabel c1 = new JLabel("");

	public JLabel c2 = new JLabel("");
	public Font l = new Font("Times New roman", Font.BOLD, 16);
	public Font l2 = new Font("Times New roman", Font.BOLD, 13);
	public Font l1 = new Font("Times New roman", Font.BOLD, 25);
 	public Font l3 = new Font("Times New roman", Font.BOLD, 16);
	public Font l4 = new Font("tahoma", Font.BOLD, 23);
	public Font l5 = new Font("tahoma", Font.BOLD, 20);

	public JLabel clA=new JLabel("Client A Disabled");
	public JLabel clB=new JLabel("Client B Disabled");
	public JLabel clC=new JLabel("Client C Disabled");
	public JLabel clD=new JLabel("Client D Disabled");
	
	public JLabel clA1=new JLabel("");
	public JLabel clB1=new JLabel("");
	public JLabel clC1=new JLabel("");
	public JLabel clD1=new JLabel("");
	
	int intpart;
	int modpart;
	String arr[];
	
	public JLabel redimg=new JLabel();
	public JLabel redimg1=new JLabel();
	public JLabel redimg2=new JLabel();
	public JLabel redimg3=new JLabel();
	
	public JLabel green1=new JLabel();
	public JLabel green2=new JLabel();
	public JLabel green3=new JLabel();
	public JLabel green4=new JLabel();
	public JLabel greenok1=new JLabel();
	public JLabel greenok2=new JLabel();
	public JLabel greenok3=new JLabel();
	public JLabel greenok4=new JLabel();

	public JLabel rutip=new JLabel("QUEUE IP:");
	public JTextField txtfld=new JTextField();
	public JButton bt=new JButton("connect");
	public JPanel ipaddrcon=new JPanel();
	public JLabel panadd = new JLabel();

	public JFrame jf;
	public Container c;
	public JLabel ftr = new JLabel("FILE TRANSFERRING STATUS");


	public JLabel clntA = new JLabel("Destination");
	public JLabel clntB = new JLabel("Client B");
	public JLabel clntC = new JLabel("Client C");
	public JLabel clntD = new JLabel("Client D");


	public JButton test = new JButton();
	public JLabel test1 = new JLabel("Browse");
	public JLabel sen = new JLabel("Interleave");
	public JLabel tit1;// = new JLabel();
	public JLabel tit2;
	public JLabel tit3;
	public JLabel tit4;


	public JLabel backgr = new JLabel("Browse");
	public JLabel splt = new JLabel("Split");
	public JLabel con = new JLabel("Channel Encoder");
	public JLabel con1 = new JLabel("Interleave Data");
	public JLabel con2 = new JLabel("File Send");


	public JLabel title = new JLabel("Packet-Hiding Methods for Preventing Selective Jamming Attacks - SHCS Method" );

	public JLabel title1 = new JLabel("  ");

	public JLabel nopckts=new JLabel("No.of Packet:");
	public JLabel nopckt = new JLabel("");

	public JTextArea txtarea1=new JTextArea();
	public JScrollPane scpne1=new JScrollPane();
	public JTextArea txtarea2=new JTextArea();
	public JScrollPane scpne2=new JScrollPane();

	byte[] data;
	KeyPair keyPair;// = null;
	byte[] digitalSignature;
	Object senddata;
	Object signdata[];
	Object sr,remnpckt,onepacket,onepckts;
	String sendfile,originaldataone,originaldataremain;String[] originaldataarr;
	String Sercon=null;
	int len;
	String remainpacket,sendarray;
	
	Object ste;
	Object text;PublicKey key;
	
	SHCSSender()
				{
					ImageIcon v1=new ImageIcon(this.getClass().getResource("button.png"));
			
					b1.setIcon(v1);
					b2.setIcon(v1);
					b3.setIcon(v1);
					b4.setIcon(v1);
					b5.setIcon(v1);
					ImageIcon gree=new ImageIcon(this.getClass().getResource("greenbutton.png"));
					green1.setIcon(gree);
					green2.setIcon(gree);
					green3.setIcon(gree);
					green4.setIcon(gree);
					
					ImageIcon greeok=new ImageIcon(this.getClass().getResource("grnok.png"));
					greenok1.setIcon(greeok);
					greenok2.setIcon(greeok);
					greenok3.setIcon(greeok);
					greenok4.setIcon(greeok);
				
			
					ImageIcon red1=new ImageIcon(this.getClass().getResource("red1.png"));
					redimg1.setIcon(red1);
					redimg.setIcon(red1);
					redimg2.setIcon(red1);
					redimg3.setIcon(red1);
			
					ImageIcon back=new ImageIcon(this.getClass().getResource("Source1.jpg"));
					backgr.setBounds(0,0,1120,100);
					backgr.setIcon(back);
			
					jf = new JFrame("A Strong Hiding Commitment Scheme (SHCS) - Sender");
			
					c = jf.getContentPane();
					c.setLayout(null);
					jf.setSize(1120,760);
					jf.setLocation(-3,-9);
					jf.setResizable(false);
			
					TitledBorder leftBorder = BorderFactory.createTitledBorder("File Operation");
					leftBorder.setTitleJustification(TitledBorder.LEFT);
					tit1 = new JLabel();
					tit1.setBorder(leftBorder);
			
					tit1.setBounds(80,65,870,280);
					leftBorder.setTitleColor(Color.YELLOW);
			
			
					TitledBorder leftBorder1 = BorderFactory.createTitledBorder("Key Generete");
					leftBorder1.setTitleJustification(TitledBorder.LEFT);
					tit2 = new JLabel();
					tit2.setBorder(leftBorder1);
			
					tit2.setBounds(80,248,870,90);
					leftBorder1.setTitleColor(Color.YELLOW);
			
					TitledBorder leftBorder2 = BorderFactory.createTitledBorder("Key Generete");
					leftBorder.setTitleJustification(TitledBorder.LEFT);
					tit3 = new JLabel();
					tit3.setBorder(leftBorder2);
			
					tit3.setBounds(80,340,870,180);
			
					leftBorder2.setTitleColor(Color.yellow);
			
			
			
					TitledBorder leftBorder4 = BorderFactory.createTitledBorder("File Tranfer Acknowledgement");
					leftBorder.setTitleJustification(TitledBorder.LEFT);
					tit4 = new JLabel();
					tit4.setBorder(leftBorder4);
					tit4.setBounds(80,520,270,180);
			
					TitledBorder leftBorder5 = BorderFactory.createTitledBorder("QUEUE IP Address Connect");
					leftBorder5.setTitleJustification(TitledBorder.LEFT);
			
					ipaddrcon.setBackground(Color.BLUE);
					ipaddrcon.setForeground(Color.BLUE);
					ipaddrcon.setBorder(leftBorder5);
					ipaddrcon.setBounds(550,110,380,180);
					leftBorder5.setTitleColor(Color.yellow);
					
			
					redimg.setBounds(185,520,300,200);
					redimg1.setBounds(370,520,300,200);
					redimg2.setBounds(570,520,300,200);
					redimg3.setBounds(760,520,300,200);
					
					
					green1.setBounds(185,520,300,200);
					green2.setBounds(370,520,300,200);
					green3.setBounds(570,520,300,200);
					green4.setBounds(760,520,300,200);
					
					greenok1.setBounds(185,520,300,200);
					greenok2.setBounds(370,520,300,200);
					greenok3.setBounds(570,520,300,200);
					greenok4.setBounds(760,520,300,200);
					
					
					clA.setBounds(165,570,300,200);
					clA.setForeground(Color.RED);
					clA.setFont(l2);
					
					clB.setBounds(360,570,300,200);
					clB.setForeground(Color.RED);
					clB.setFont(l2);
					
					clC.setBounds(550,570,300,200);
					clC.setForeground(Color.RED);
					clC.setFont(l2);
					
					clD.setBounds(730,570,300,200);
					clD.setForeground(Color.RED);
					clD.setFont(l2);
					
					clA1.setBounds(165,570,300,200);
					clA1.setForeground(Color.GREEN);
					clA1.setFont(l2);
					
					clB1.setBounds(360,570,300,200);
					clB1.setForeground(Color.GREEN);
					clB1.setFont(l2);
					
					clC1.setBounds(550,570,300,200);
					clC1.setForeground(Color.GREEN);
					clC1.setFont(l2);
					
					clD1.setBounds(730,570,300,200);
					clD1.setForeground(Color.GREEN);
					clD1.setFont(l2);
					
					
					leftBorder4.setTitleColor(Color.yellow);
						
					list.setBounds(350,240,100,90);
					list.setForeground(Color.BLUE);
					list.setBackground(new Color(194,249,206));
					list.setFont(l);
						
					nopckts.setBounds(480,150,200,100);
					nopckts.setForeground(Color.CYAN);
					// nopckts.setFont(l);
					nopckt.setBounds(560,150,100,100);
					nopckt.setForeground(Color.ORANGE);
					// nopckt.setFont(l);
			
					title.setForeground(Color.WHITE);
					title.setBounds(90,-4,950,50);
					title.setFont(l4);
			
					title1.setForeground(Color.WHITE);
					title1.setBounds(250,50,950,50);
					title1.setFont(l4);
			
					rutip.setForeground(Color.YELLOW);
					rutip.setBounds(620,100,250,150);
					rutip.setFont(l);
			
					txtfld.setForeground(Color.BLUE);
					txtfld.setBounds(730,160,120,23);
					txtfld.setFont(l);
			
					bt.setForeground(Color.BLUE);
					bt.setBounds(665,220,115,28);
					//bt.setFont(l);
			
			        	b1.setBounds(350,90,100,25);
			
					b1.setForeground(Color.GREEN);
					b2.setBounds(350,190,100,25);
					splt.setBounds(385,185,120,35);
					splt.setForeground(Color.BLACK);
					//	splt.setFont(l);
			
					b3.setBounds(350,375,130,25);
					b4.setBounds(350,420,130,25);
					b5.setBounds(350,470,130,25);
			
					sen.setBounds(360,416,520,35);
					sen.setForeground(Color.RED);
					//sen.setFont(l);
					con.setBounds(365,370,520,35);
					con.setForeground(Color.RED);
					con1.setBounds(365,370,520,35);
					con1.setForeground(Color.RED);
			
					con2.setBounds(365,465,520,35);
					con2.setForeground(Color.RED);
					//con.setFont(l);
			
					slctfle.setBounds(170,75,250,50);
					slctfle.setForeground(Color.CYAN);
					flepth.setBounds(170,108,250,50);
					flepth.setForeground(Color.CYAN);
					flesze.setBounds(170,142,250,50);
					flesze.setForeground(Color.CYAN);
					pckts.setBounds(170,174,250,50);
					pckts.setForeground(Color.CYAN);
					//pckts.setFont(l);
					brwsedfle.setBounds(740,75,250,50);
					brwsedfle.setForeground(Color.CYAN);
			
			
					keys.setBounds(640,333,250,50);
					keys.setForeground(Color.CYAN);
			
					rcvr.setBounds(170,215,250,50);
					rcvr.setForeground(Color.CYAN);
					//rcvr.setFont(l);
					keygen.setBounds(170,365,250,50);
					keygen.setForeground(Color.CYAN);
					//keygen.setFont(l);
					keygen1.setBounds(170,410,250,50);
					keygen1.setForeground(Color.CYAN);
					filesend.setBounds(170,450,250,50);
					filesend.setForeground(Color.CYAN);
			
					server.setBounds(430,24,150,50);
					server.setForeground(Color.WHITE);
				
					clntA.setBounds(180,530,150,50);
					clntA.setFont(l5);
					clntA.setForeground(Color.PINK);
			
					clntB.setBounds(370,530,150,50);
					clntB.setFont(l5);
					clntB.setForeground(Color.PINK);
			
					clntC.setBounds(570,530,150,50);
					clntC.setFont(l5);
					clntC.setForeground(Color.PINK);
			
					clntD.setBounds(760,530,150,50);
					clntD.setFont(l5);
					clntD.setForeground(Color.PINK);
			
					txtarea1.setColumns(10);
					txtarea1.setRows(10);
					txtarea1.setFont(l);
					txtarea1.setForeground(new Color(120,0,0));
					scpne1.setViewportView(txtarea1);
					scpne1.setBounds(625,120,300,170);
			
					txtarea2.setColumns(10);
					txtarea2.setRows(10);
					txtarea2.setFont(l);
					txtarea2.setForeground(new Color(120,0,0));
					scpne2.setViewportView(txtarea2);
					scpne2.setBounds(500,370,430,140);
			
					c1.setBounds(350,118,400,35);
					c1.setForeground(Color.MAGENTA);
					c2.setBounds(350,150,100,35);
					c2.setFont(l2);
					c2.setForeground(Color.MAGENTA);
			
					ftr.setBounds(650,172,350,35);
					ftr.setForeground(Color.CYAN);
					ftr.setFont(l);
						
					c.add(bt);
					c.add(txtfld);
					c.add(rutip);
					c.add(ipaddrcon);
					
					b1.addActionListener(this);
					b2.addActionListener(this);
					b3.addActionListener(this);
					b4.addActionListener(this);
					b5.addActionListener(this);
			
					c.add(pckts);
					c.add(keygen);
					c.add(keygen1);
					c.add(filesend);
					c.add(keys);
					c.add(nopckts);
					c.add(nopckt);
			c.add(clA);
			//c.add(clB);
			//c.add(clC);
			//c.add(clD);
			c.add(clA1);
			c.add(clB1);
			c.add(clC1);
			c.add(clD1);
			
					//c.add(title);
			
					c.add(tit1);
					
					c.add(tit3);
					c.add(tit4);
					c.add(clntA);
					//c.add(clntB);
					//c.add(clntC);
					//c.add(clntD);
			
					c.add(slctfle);
					c.add(flepth);
					c.add(flesze);
					c.add(rcvr);
					//c.add(server);
					c.add(brwsedfle);
					c.add(c1);
					c.add(c2);
					c.add(scpne1);
					c.add(scpne2);
								
					server.setFont(l5);
			
					test1.setBounds(375,85,100,35);
					test.setBounds(500,200,110,35);
			
					test1.setForeground(Color.BLACK);
					//test1.setFont(l);
					test.setFocusPainted(true);
					c.add(splt);
					
					b1.setBorderPainted(true);
					b1.setContentAreaFilled(false);
					b2.setBorderPainted(true);
					b2.setContentAreaFilled(false);
					b3.setBorderPainted(true);
					b3.setContentAreaFilled(false);
					b4.setBorderPainted(true);
					b4.setContentAreaFilled(false);
					b5.setBorderPainted(true);
					b5.setContentAreaFilled(false);
					bt.addActionListener(this);
			
					brwsedfle.setVisible(false);
					scpne1.setVisible(false);
					nopckt.setVisible(false);
					nopckts.setVisible(false);
					green1.setVisible(false);
					green2.setVisible(false);
					green3.setVisible(false);
					green4.setVisible(false);
					greenok1.setVisible(false);
					greenok2.setVisible(false);
					greenok3.setVisible(false);
					greenok4.setVisible(false);
					 
			
					c.add(test1); 
					c.add(sen);
					c.add(con);
					
					c.add(con2);
					c.add(b1);
					c.add(b2);
					c.add(b3);
					c.add(b4);
					c.add(b5);
					
					c.add(redimg);
					//c.add(redimg1);
					//c.add(redimg2);
					//c.add(redimg3);
					c.add(green1);
					//c.add(green2);
					//c.add(green3);
					//c.add(green4);
					c.add(greenok1);
					//c.add(greenok2);
					//c.add(greenok3);
					//c.add(greenok4);
					
					
					c.add(list);
			
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
			
			
			
					b5.addMouseListener(new MouseAdapter()
					{
						public void mouseEntered(MouseEvent e)
						{
							ImageIcon v2=new ImageIcon(this.getClass().getResource("button.png"));
			
							b5.setIcon(v2);
			
			
						}
						public void mouseExited(MouseEvent e)
						{
							ImageIcon v=new ImageIcon(this.getClass().getResource("button3.png"));
			
							b5.setIcon(v);
			
			
						}
						public void mouseClicked(MouseEvent e)
						{
			
						}
			
			
					});
			
					jf.show();
					WindowListener listener = new WindowAdapter() {
						public void windowClosing(WindowEvent evt)
						{      
							     mescon="null";
							     Frame frame = (Frame) evt.getSource();
							     call2(1000);
								 System.exit(0);
								 
						}
					};
					jf.addWindowListener(listener);
					
					int[] ports = new int[] {7000};
			
					for (int i = 0; i < 1; i++) {

						Thread t = new Thread(new PortListener(ports[i]));
						t.setName("Listener-" + ports[i]);
						t.start();
					
					}    
					
					c.add(backgr); 
			
				}


				public static void main(String args[]) {
					
					
					new SHCSSender();
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
			

			if (this.port == 7000) {
				try {
					server = new ServerSocket(7000);
					
					
				while (true) {
					
						connection = server.accept();
						
						br = new BufferedReader(new InputStreamReader(
								new BufferedInputStream(connection
										.getInputStream())));

						String strLine;
						
						StringBuffer buffer = new StringBuffer();
						while ((strLine = br.readLine()) != null)
						{
							buffer.append(strLine + "\n");
						}
						
						String rec=buffer.toString().toString();
						
if(rec.trim().equals("clienAservercon"))
{
	
	green1.setVisible(true);
	redimg.setVisible(false);
	clA.setForeground(Color.GREEN);
	clA.setText("Client A Enabled");
	fletr1="ClientA";
	fletr1a="ClientA";
}if(rec.trim().equals("clienBservercon"))
{
	
	green2.setVisible(true);
	redimg1.setVisible(false);
	clB.setForeground(Color.GREEN);
	clB.setText("Client B Enabled");
	fletr2="ClientB";
	fletr2a="ClientB";
}
if(rec.trim().equals("clienCservercon"))
{
	
	green3.setVisible(true);
	redimg2.setVisible(false);
	clC.setForeground(Color.GREEN);
	clC.setText("Client C Enabled");
	fletr3="ClientC";fletr3a="ClientC";
}	
if(rec.trim().equals("clienDservercon"))
{
	
	green4.setVisible(true);
	redimg3.setVisible(false);
	clD.setForeground(Color.GREEN);
	clD.setText("Client D Enabled");
	fletr4="ClientD";fletr4a="ClientD";
}	

if(rec.trim().equals("clientAdisabled"))
{
	
	green1.setVisible(false);
	redimg.setVisible(true);
	clA.setForeground(Color.RED);
	clA.setText("Client A Disabled");
}if(rec.trim().equals("clientBdisabled"))
{
	
	green2.setVisible(false);
	redimg1.setVisible(true);
	clB.setForeground(Color.RED);
	clB.setText("Client B Disabled");
}
if(rec.trim().equals("clientCdisabled"))
{
	
	green3.setVisible(false);
	redimg2.setVisible(true);
	clC.setForeground(Color.RED);
	clC.setText("Client C Disabled");
}	
if(rec.trim().equals("clientDdisabled"))
{
	
	green4.setVisible(false);
	redimg3.setVisible(true);
	clD.setForeground(Color.RED);
	clD.setText("Client D Disabled");
	
}	




						br.close();
						connection.close();
					}		
					
				} catch (UnknownHostException e1) {

					e1.printStackTrace();
				} catch (IOException e1) {
				}
				finally {

				}
				
	        }
			
		}
		}
	
	
	
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
	public void actionPerformed(ActionEvent e) {
					StringBuffer buffer = null;
					String strline;
			

					if(e.getSource()==bt){
						
						mescon="getexception";
						ipadd=txtfld.getText().trim();
						if(ipadd.isEmpty()){
							JOptionPane.showMessageDialog(null,"Please give valid IP Address", "Message Box", 1);
			
						}else{
							Sercon="connected";
							brwsedfle.setVisible(true);
							scpne1.setVisible(true);
							nopckt.setVisible(true);
							nopckts.setVisible(true);
							rutip.setVisible(false);
							bt.setVisible(false);
							txtfld.setVisible(false);
							ipaddrcon.setVisible(false);
							call1(1000);
			
			
						}
					}
			
					if(e.getSource()==b1){
						if(Sercon=="connected"){
							JFileChooser chooser = new JFileChooser();

							try {

								File f = new File(new File("").getCanonicalPath());

								chooser.setSelectedFile(f);
							} catch (IOException e1) {
							}


							int retval = chooser.showOpenDialog(b1);

							if (retval == JFileChooser.APPROVE_OPTION) {
								File field = chooser.getSelectedFile();
								c1.setForeground(Color.ORANGE);
								c1.setFont(l2);
								c1.setText(field.getAbsolutePath());

							}

							File curFile = chooser.getSelectedFile();
							try {

								FileInputStream fstream = new FileInputStream(curFile);

								DataInputStream ins = new DataInputStream(fstream);
								BufferedReader br = new BufferedReader(new InputStreamReader(
										ins));

								buffer = new StringBuffer();
								while ((strline = br.readLine()) != null) {


									buffer.append(strline + "\n");

								}
								c2.setText(Integer.toString(buffer.length()));
								txtarea1.setText(buffer.toString());


							} catch (Exception e1) {

							}
						}
						else{
			
							JOptionPane.showMessageDialog(null,"Please Server connect To Router!", "Message Box", 1);
			
						}
			
					}
			
			
					if(e.getSource()==b2)
					{
						if(Sercon=="connected"){
							int a=0,b=1000;
							len=txtarea1.getText().trim().length();
							if(len<1000){
								onepacket=txtarea1.getText().trim();
								nopckt.setText(Integer.toString(1)+" Pckts");
							}
							else
							{
								intpart=len/1000;
								modpart=len%1000;
			
								arr=new String[intpart];
								String st=txtarea1.getText().trim();
								String s;
								
			            	if(intpart>0)
								{
									nopckt.setText(Integer.toString(intpart)+" Pckts");
									for(int i=0;i<intpart;i++)
									{
										s=st.substring(a,b);
										arr[i]=s;
										a=b;
										b=a+1000;
									}
								}
			
								if(modpart>0)
								{
									nopckt.setText(Integer.toString(intpart+1)+" Pckts");
									remainpacket=st.substring(a,a+modpart);
			
								}
			
							}	
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Please Server connect To Router!", "Message Box", 1);
			
						}
			
					}
			
					if(e.getSource()==b3){
			
						if(Sercon=="connected")
						{
			
							Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
			            	try {
			            		/*int randx;
			            		Random rando=new Random();
			            		randx=Random.nextInt(100);*/ 
								keyPair = generateKeyPair(999);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						    keys.setText("Keys Genereted");
							txtarea2.setText(keyPair.getPrivate().toString());
							
							
							ste=keyPair.getPublic();
										try {} catch (Exception e1) {
								
							
								e1.printStackTrace();
								System.out.println(e1);
							}	
							
							
							
						}
			
						else{
							JOptionPane.showMessageDialog(null,"Please Server connect To Router!", "Message Box", 1);
			
						}
					}
					if(e.getSource()==b4)
					{
						if(Sercon=="connected")
						{
							if(len<1000)
							 {
			
								txtarea2.setText("");
								txtarea2.setText(txtarea2.getText()+"\n"+"/-----------------------------------------------/");
								txtarea2.setText(txtarea2.getText()+"\n"+"/                Signatured packets               ");
								txtarea2.setText(txtarea2.getText()+"\n"+"/-----------------------------------------------/");
								originaldataone=txtarea1.getText().trim();
								onepacket=txtarea1.getText().trim();
								
								data=onepacket.toString().getBytes();
								try 
								 {
									digitalSignature = signData(data, keyPair.getPrivate());
									onepckts=digitalSignature;
									txtarea2.setText(txtarea2.getText()+"\n"+"Packet = "+1+".  "+digitalSignature.toString());
									
									
								 } catch (Exception e1) 
								  {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								  }
			
							}
							else
							{
								signdata=new Object[intpart];
								originaldataarr=new String[intpart];
								try {
									txtarea2.setText("");
									txtarea2.setText(txtarea2.getText()+"\n"+"/-----------------------------------------------/");
									txtarea2.setText(txtarea2.getText()+"\n"+"/                Signatured packets               ");
									txtarea2.setText(txtarea2.getText()+"\n"+"/-----------------------------------------------/");
									for(int i=0;i<intpart;i++)
									{
										originaldataarr[i]=arr[i];
										data=arr[i].getBytes();
										
										
										
										String b1=new String(data);
										System.out.println("the ORIGINAL DATA="+b1);
										digitalSignature = signData(data, keyPair.getPrivate());
										
										sr=digitalSignature;
										signdata[i]=sr;
			
										txtarea2.setText(txtarea2.getText()+"\n"+"Packet = "+(i+1)+".  "+digitalSignature.toString());
									}
			
									if(modpart>0){
										originaldataremain=remainpacket;
										data=remainpacket.getBytes();
										digitalSignature = signData(data, keyPair.getPrivate());
										
										remnpckt=digitalSignature;
			
										txtarea2.setText(txtarea2.getText()+"\n"+"Packet = "+(intpart+1)+".  "+digitalSignature.toString());
									}
									keys.setText("Signatured On Data");
			
			
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
			
							}
						}
						else{
							JOptionPane.showMessageDialog(null,"Please Server connect To Router!", "Message Box", 1);
			
						}
					}
					if(e.getSource()==b5)
					{	
						
						
						int selected[] = list.getSelectedIndices();
						
						for (int i = 0; i < selected.length; i++) 
						{
							String element = (String) list.getModel().getElementAt(
									selected[i]);
							
							strsend=element;
							
							if(strsend.trim()=="*.Client A"){
								
								if(filetransmit!=null||strsend!=null)
								{
								filetransmit=strsend;
								}
							}
							if(strsend.trim()=="*.Client B"){
								if(filetransmit!=null||strsend!=null)
								{
								filetransmit=filetransmit+strsend;
								}
							}
							if(strsend.trim()=="*.Client C"){
									if(filetransmit!=null||strsend!=null)
								{
								filetransmit=filetransmit+strsend;
								}
							}
							if(strsend.trim()=="*.Client D"){
								if(filetransmit!=null||strsend!=null)
									
								{
								filetransmit=filetransmit+strsend;
								}
							}
							
						}
						int filelen=filetransmit.trim().length();
	                    String total=Integer.toString(filelen);
	                     sendfile=total;
	                    sendfile+=filetransmit;
	                	
						if(Sercon=="connected")
						{	
							
							  
							if(len<1000)
							{
								
								senddata=onepckts;
								sendpacket(sendfile,originaldataone,senddata);
								
							}
							else
							{
								for(int j=0;j<intpart;j++)
								{
									
								
									
									senddata=signdata[j];
									sendarray=originaldataarr[j];
     								sendpacket(sendfile,sendarray,senddata);
									try
									{
										Thread.sleep(700);
									} catch (InterruptedException ejj)
									{ 
									}

								}
								if(modpart>0)
								{
									senddata=remnpckt;
									sendpacket(sendfile,originaldataremain,senddata);
									
								}
			
							}
							
							 try
								{
									Thread.sleep(2000);
								} catch (InterruptedException ejj)
								{ 
								}
							if(fletr1.trim().equals("ClientA"))
							{   
							    greenok1.setVisible(true);
							    green1.setVisible(false);
								clA.setForeground(Color.ORANGE);
							
								clA.setText("Packet Transfered to ClientA");
								
							}
							if(fletr2.trim().equals("ClientB"))
							{
								
						    
								greenok2.setVisible(true);
								green2.setVisible(false);
								clB.setForeground(Color.ORANGE);
								clB.setText("Packet Transfered to ClientB");
								
							}
							if(fletr3.trim().equals("ClientC"))
							{   
						        greenok3.setVisible(true);
						        green3.setVisible(false);
								clC.setForeground(Color.ORANGE);
								clC.setText("Packet Transfered to ClientC");
								
							}
							if(fletr4.trim().equals("ClientD"))
							{   
						        greenok4.setVisible(true);
						        green4.setVisible(false);
								clD.setForeground(Color.ORANGE);
								clD.setText("Packet Transfered to ClientD");
								
							}	
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Please Server connect To Router!", "Message Box", 1);
			
						}
						
					 	    
						  
						
						
					}
				}	
				
	
	void call1(int Port)
	{
		int prt=Port;
		byte[] byteArray;
		Socket client = null;
		BufferedOutputStream bos = null;
		
if(ipadd.trim()=="null"){
	
}
else{
	
		try {
			/*******************Router IP Address*******************/
			client = new Socket(txtfld.getText().trim(), prt);
			bos = new BufferedOutputStream(client
					.getOutputStream());
			ipadd="127.0.0.1";
			
			byteArray = ipadd.getBytes();
			bos.write(byteArray, 0, byteArray.length);
			bos.flush();
			bos.close();
			client.close();
		}

		catch (UnknownHostException e1) {

			e1.printStackTrace();
		} catch (IOException e1) {
			if(mescon.trim()=="null")
			{
			}
			else{
				JOptionPane.showMessageDialog(null,"Router Not Availble Please, Run the Router After Connect!"+mescon, "Message Box", 1);

			}
			
		}

		finally {
			ipadd="";
		}



}

	}

	void call2(int Port)
	{
		int prt=Port;
		byte[] byteArray;
		Socket client = null;
		BufferedOutputStream bos = null;
		
if(ipadd.trim()=="null"){
	
}
else{
	
		try {
			/*******************Router IP Address*******************/
			client = new Socket(txtfld.getText().trim(), prt);
			bos = new BufferedOutputStream(client
					.getOutputStream());
ipadd="";
			byteArray = ipadd.getBytes();
			bos.write(byteArray, 0, byteArray.length);
			bos.flush();
			bos.close();
			client.close();
		}

		catch (UnknownHostException e1) {

			e1.printStackTrace();
		} catch (IOException e1) {
			if(mescon.trim()=="null")
			{
			}
			else{
				JOptionPane.showMessageDialog(null,"Router Not Availble Please, Run the Router After Connect!"+mescon, "Message Box", 1);

			}
			
		}

		finally {
			ipadd="";
		}



}

	}

	void sendpacket(String arg0,String arg1,Object arg2)
	{
String clientdata=arg0;
String originaldata=arg1;	
Object signdata=arg2;
				byte[] byteArray;
				Socket client = null;
				BufferedOutputStream bos = null;
			
				try {
		       /*******************Client IP Address*******************/
					
					
					
					client = new Socket(txtfld.getText().trim(),5000);
			    	 ObjectOutputStream oos=new ObjectOutputStream(client.getOutputStream());
			            
					
					String cut=sendfile.substring(2,6).trim();
				    if(cut.trim().equals("null"))
					{
						
						String fileadd=sendfile.substring(0,2).trim();
						int l=Integer.parseInt(fileadd);
						int s=l-4;
						String add=Integer.toString(s);
						String realdata=sendfile.substring(6,sendfile.length());
						sendfile=add;
						sendfile+=realdata;
						
					}
				   
				    try
					{
						Thread.sleep(1000);
					} catch (InterruptedException ejj)
					{ 
					}
				  oos.writeUTF(clientdata);
				  oos.writeUTF(originaldata);
				  oos.writeObject(signdata);
				    
				  oos.flush();
				  oos.close();
					client.close();
					//JOptionPane.showMessageDialog(null,"kkkk"+fletr1a, "Message Box", 1);

					 
				}

				catch (UnknownHostException e1) {

					e1.printStackTrace();
				} catch (IOException e1) {
				}

				finally {
					filetransmit="";
					 
				}
				
				
				
			
				
			
		
	}
	
	
	 public static byte[] signData(byte[] data, PrivateKey key) throws Exception {
		    Signature signer = Signature.getInstance("SHA1withDSA");
		    signer.initSign(key);
		  
		    signer.update(data);
		    return (signer.sign());
		  }

	 public static KeyPair generateKeyPair(long seed) throws Exception {
		    Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
		    KeyPairGenerator keyGenerator = KeyPairGenerator.getInstance("DSA");
		    SecureRandom rng = SecureRandom.getInstance("SHA1PRNG", "SUN");
		    rng.setSeed(seed);
		    keyGenerator.initialize(1024, rng);

		    return (keyGenerator.generateKeyPair());
		  }
	
	
}
