//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
//import java.awt.Graphics;
//import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.UnsupportedEncodingException;
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

public class SHCSReceiver implements ActionListener {

	Thread t;
	String ipcn, mescon="null";


	public JLabel server = new JLabel("Destination ");

	public Font l = new Font("Times New roman", Font.BOLD, 18);
	public Font l2 = new Font("Times New roman", Font.BOLD, 13);
	public Font l1 = new Font("Times New roman", Font.BOLD, 25);
	public Font l3 = new Font("Times New roman", Font.BOLD, 16);
	public Font l4 = new Font("tahoma", Font.BOLD, 23);
	public Font l5 = new Font("tahoma", Font.BOLD, 20);

	public JTextArea txt=new JTextArea();
	public JScrollPane scrp=new JScrollPane();



	KeyPair keyPair;
	public JFrame jf;
	public Container c;


	public JButton test = new JButton();
	public JLabel tit1;// = new JLabel();
	public JLabel tit2;
	public JLabel tit3;

	public JLabel title = new JLabel("Packet-Hiding Methods for Preventing Selective Jamming Attacks " );
	public JLabel title1 = new JLabel("");
	public JLabel backgr = new JLabel("  ");
	public JLabel sys=new JLabel();
	public JLabel recvtit=new JLabel("Received File");

	public JLabel encry=new JLabel("Digital Signature Public key :");
	public JLabel decry=new JLabel("Digital Signatured Packets");
	public JLabel Origkey=new JLabel("And Signature verification  :");


	public JLabel packcount=new JLabel("Client A Received No.Of Packets:");

	public JLabel packcountlabel=new JLabel("Couting Packets");
	public JTextArea txt1=new JTextArea();
	public JScrollPane scrp1=new JScrollPane();

	public JTextArea txt2=new JTextArea();
	public JScrollPane scrp2=new JScrollPane();


	public JLabel routip=new JLabel("Queue IP Address:");
	public JLabel connect=new JLabel();
	public JTextField rtfld=new JTextField();
	public JButton btn=new JButton("Connect");



	public JTextField txtfldencry=new JTextField();
	public JTextField txtflddecry=new JTextField();
	public JTextField txtfldorgkey=new JTextField();
	byte[] data;
	byte[] digitalSignature;int p=0;
	SHCSReceiver()
	{
			
		ImageIcon redsys=new ImageIcon(this.getClass().getResource("redsystem.png"));
		sys.setIcon(redsys);
		sys.setBounds(220,30,400,300);
		
		ImageIcon back=new ImageIcon(this.getClass().getResource("darkgreen.jpg"));
		backgr.setBounds(-5,-80,1030,870);
		backgr.setIcon(back);
		
		jf = new JFrame("A Strong Hiding Commitment Scheme (SHCS)");
		
		c = jf.getContentPane();
		c.setLayout(null);
		jf.setSize(880,760);
		jf.setLocation(50,-10);
		jf.setResizable(false);
			
		TitledBorder leftBorder = BorderFactory.createTitledBorder("Key Verification");
		leftBorder.setTitleJustification(TitledBorder.LEFT);
		
		tit1 = new JLabel();
		tit1.setBorder(leftBorder);
	   
		tit1.setBounds(80,280,700,215);
	    leftBorder.setTitleColor(Color.WHITE);
	    tit1.setBackground(Color.WHITE);
		
	    TitledBorder leftBorder1 = BorderFactory.createTitledBorder("Received File");
	    leftBorder.setTitleJustification(TitledBorder.LEFT);
	    tit2 = new JLabel();
	    tit2.setBorder(leftBorder1);
	 
	    tit2.setBounds(80,495,700,218);
	    
	  
	    leftBorder1.setTitleColor(Color.WHITE);
	   
	    TitledBorder leftBorder2 = BorderFactory.createTitledBorder("Received Key");
	    leftBorder.setTitleJustification(TitledBorder.LEFT);
	    tit3 = new JLabel();
	    tit3.setBorder(leftBorder2);
	  
	    tit3.setBounds(520,410,490,240);
	    
	    
	    leftBorder2.setTitleColor(Color.WHITE);
	  
	    
	    
	    
	    TitledBorder rtline = BorderFactory.createTitledBorder("IP Address Connection");
	    rtline.setTitleJustification(TitledBorder.LEFT);
		
	    connect = new JLabel();
	    connect.setBorder(rtline);
	   
	    connect.setBounds(80,330,700,100);
	    rtline.setTitleColor(Color.WHITE);
	    connect.setBackground(Color.BLACK);
		
	    routip.setBounds(150,330,200,100);
	    routip.setForeground(Color.YELLOW);
	    routip.setFont(l3);
	    
	    rtfld.setBounds(330,370,150,23);
	    rtfld.setForeground(new Color(000,111,0));
	    rtfld.setFont(l3);
	    
	    btn.setBounds(530,370,120,25);
	    btn.setForeground(new Color(111,222,0));
	    btn.setFont(l3);
	    
	    encry.setBounds(110,290,220,100);
	    encry.setForeground(Color.WHITE);
	    encry.setFont(l3);
	    
	    decry.setBounds(110,365,200,100);
	    decry.setForeground(Color.WHITE);
	    decry.setFont(l3);
	    
	   Origkey.setBounds(110,385,240,100);
	   Origkey.setForeground(Color.white);
	   Origkey.setFont(l3);
	   
	   packcount.setBounds(110,427,240,100);
	   packcount.setForeground(Color.white);
	   packcount.setFont(l3);
	   
	   packcountlabel.setBounds(420,427,240,100);
	   packcountlabel.setForeground(Color.RED);
	   packcountlabel.setFont(l3);
	   
	   
	   txtfldencry.setBounds(240,372,320,22);
	   txtfldencry.setForeground(Color.BLUE);
	   txtfldencry.setFont(l3);
	   
	   txtflddecry.setBounds(240,398,320,22);
	   txtflddecry.setForeground(Color.BLUE);
	   txtflddecry.setFont(l3);
	   
	   txtfldorgkey.setBounds(240,425,320,22);
	   txtfldorgkey.setForeground(Color.BLUE);
	   txtfldorgkey.setFont(l3);
		title.setForeground(Color.WHITE);
		title.setBounds(40,-4,950,50);
		title.setFont(l4);
		
		title1.setForeground(Color.white);
		title1.setBounds(160,40,950,50);
		title1.setFont(l4);
		
		server.setBounds(360,23,150,50);
		server.setForeground(Color.WHITE);
		
		recvtit.setBounds(350,414,200,200);
		recvtit.setForeground(Color.WHITE);
		recvtit.setFont(l);
		//txt.setBounds(300,400,200,100);
		txt.setForeground(Color.BLUE);
		txt.setFont(l3);
		txt.setColumns(10);
		txt.setRows(10);
		scrp.setViewportView(txt);
		scrp.setBounds(160,530,520,170);
		
		txt1.setForeground(new Color(120,0,0));
		txt1.setFont(l2);
		txt1.setColumns(10);
		txt1.setRows(10);
		scrp1.setViewportView(txt1);
		scrp1.setBounds(335,295,430,95);
		txt2.setForeground(new Color(120,0,0));
		txt2.setFont(l2);
		txt2.setColumns(10);
		txt2.setRows(10);
		scrp2.setViewportView(txt2);
		scrp2.setBounds(335,397,430,67);
		
		
		tit1.setVisible(false);
		encry.setVisible(false);
		decry.setVisible(false);
		Origkey.setVisible(false);
		scrp1.setVisible(false);
		scrp2.setVisible(false);
		packcount.setVisible(false);
		packcountlabel.setVisible(false);
		
		txtfldorgkey.setVisible(false);
		btn.addActionListener(this);
		c.add(btn);
		c.add(routip);
		c.add(connect);
		c.add(rtfld);
		c.add(scrp);
		c.add(scrp1);
		c.add(scrp2);

		c.add(title);
		c.add(title1);
		c.add(sys);
		c.add(recvtit);
		c.add(tit1);
		c.add(tit2);
		c.add(encry);
		c.add(decry);
		c.add(Origkey);
		c.add(packcount);
		c.add(packcountlabel);
		c.add(server);
		server.setFont(l1);
	
		test.setBounds(500,200,110,35);
		
	
        test.setFocusPainted(false);
      
		
		jf.show();
		WindowListener listener = new WindowAdapter() {
	    	   public void windowClosing(WindowEvent evt) {
	    	        Frame frame = (Frame) evt.getSource();
	    	        mescon="null";
	    	        
	    	        ipcn="1"; 
	    	        call2(2000);
	    	        System.exit(0);
	    	      
	    	      }
	       };
	       jf.addWindowListener(listener);
	       int[] ports = new int[] {8000};

			for (int i = 0; i < 1; i++) {
				t = new Thread(new PortListener(ports[i]));
				t.setName("Listener-" + ports[i]);
				t.start();
			}    
			
			
			 c.add(backgr); 
	        
	}


	public static void main(String args[]) {
		new SHCSReceiver();
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
			  txt1.setText("      DSA  Public key");
			txt2.setText("        Digital signatured Packets And Signature verification ");

			if (this.port == 8000) {
				try {
					server = new ServerSocket(8000);
					
					
				while (true) {
						connection = server.accept();
						
						ObjectInputStream ois=new ObjectInputStream(connection.getInputStream());
							
						data=ois.readUTF().getBytes();
						byte[] obj=(byte[]) ois.readObject();
						digitalSignature=obj;
						 
						
						boolean verified;
						Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
						
						
						try {
							keyPair = generateKeyPair(999);
							
							txt1.setText(txt1.getText()+"/-----------------------------------------------/");
							txt1.setText(txt1.getText()+"\n"+"/              Digital Signature Public Key               ");
							txt1.setText(txt1.getText()+"\n"+"/-----------------------------------------------/");
							txt1.setText(keyPair.getPublic().toString());
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						    verified = verifySig(data,keyPair.getPublic(), digitalSignature);
						              
						    p++;
						   
						    txt2.setText(txt2.getText()+"\n"+"        Packets="+Integer.toString(p)+". "+digitalSignature+"                      "+verified);
						    packcountlabel.setText(Integer.toString(p)+"\n"+"Packets");
						    
						   
						    String value = new String(data);
						    
						    
						    txt.setText(txt.getText().trim()+"\n"+value.toString().trim());
						    
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
				
	          }
			}
		}
	
	
	
		public void actionPerformed(ActionEvent e) {
			
			
			if(e.getSource()==btn)
			{mescon="getexception";
			 ipcn=rtfld.getText().trim();
				if(ipcn.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Please give valid IP Address", "Message Box", 1);
				}
				else {
					call1(2000);
				}
			}
		}
	
		
		void call1(int Port){

			
			
			byte[] byteArray;
			Socket client = null;
			BufferedOutputStream bos = null;
		
			try {
	       /*******************Client IP Address*******************/
				client = new Socket(rtfld.getText().trim(), Port);
				bos = new BufferedOutputStream(client
						.getOutputStream());

				ipcn="127.0.0.1";
				byteArray = ipcn.getBytes();
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
					JOptionPane.showMessageDialog(null,"Router Not Availble Please, Run the Router After Connect!", "Message Box", 1);

				}
			}

			finally {
				ipcn="";
					

			}
			
		
		tit1.setVisible(true);
		encry.setVisible(true);
		decry.setVisible(true);
		Origkey.setVisible(true);
		txtfldencry.setVisible(true);
		txtflddecry.setVisible(true);
		txtfldorgkey.setVisible(true);
		packcount.setVisible(true);
		packcountlabel.setVisible(true);
		scrp1.setVisible(true);
		scrp2.setVisible(true);
		
		btn.setVisible(false);
		routip.setVisible(false);
		connect.setVisible(false);
		rtfld.setVisible(false);
		
		}
		
		
		void call2(int Port){

			
			
			byte[] byteArray;
			Socket client = null;
			BufferedOutputStream bos = null;
		
			try {
	       /*******************Client IP Address*******************/
				client = new Socket(rtfld.getText().trim(), Port);
				bos = new BufferedOutputStream(client
						.getOutputStream());

				ipcn="1";
				byteArray = ipcn.getBytes();
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
					JOptionPane.showMessageDialog(null,"Router Not Availble Please, Run the Router After Connect!", "Message Box", 1);

				}
			}

			finally {
				ipcn="";
					

			}
			
		
		tit1.setVisible(true);
		encry.setVisible(true);
		decry.setVisible(true);
		Origkey.setVisible(true);
		txtfldencry.setVisible(true);
		txtflddecry.setVisible(true);
		txtfldorgkey.setVisible(true);
		packcount.setVisible(true);
		packcountlabel.setVisible(true);
		scrp1.setVisible(true);
		scrp2.setVisible(true);
		
		btn.setVisible(false);
		routip.setVisible(false);
		connect.setVisible(false);
		rtfld.setVisible(false);
		
		}
		
	public static boolean verifySig(byte[] data, PublicKey key, byte[] sig) throws Exception {
	    Signature signer = Signature.getInstance("SHA1withDSA");
	    signer.initVerify(key);
	 
	    signer.update(data);
	  
	    return (signer.verify(sig));

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
