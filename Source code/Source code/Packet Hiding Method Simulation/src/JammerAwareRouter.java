import java.awt.Container;
import java.awt.*;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JammerAwareRouter extends JFrame implements ActionListener {

	Timer timer;
	JFrame jf;
	Container c;
	public JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
	
	
	//l1 = new JLabel("MULTI-HOP ROUTER");
	JLabel img1 = new JLabel();
	JLabel img11 = new JLabel();
	JLabel img2 = new JLabel();
	JLabel img3 = new JLabel();
	JLabel img4 = new JLabel();
	JLabel img5 = new JLabel();
	JLabel img6 = new JLabel();
	JLabel img7 = new JLabel();
	JLabel img8 = new JLabel();
	JLabel img9 = new JLabel();
	
	JLabel t1;
	JLabel t0;
	JLabel t2;
	JLabel t3;
	JLabel t4;
	JLabel t5;
	
	JLabel tag1=new JLabel();
	JLabel tag=new JLabel();
	JLabel tag2=new JLabel();
	JLabel tag3=new JLabel();
	JLabel tag4=new JLabel();
	JLabel tag5=new JLabel();
	
	JLabel L1 = new JLabel();
	JLabel L2= new JLabel();
	JLabel L13 = new JLabel();
	JLabel L14 = new JLabel();
	
	JLabel L24 = new JLabel();
	JLabel L25 = new JLabel();
	
	JLabel L34 = new JLabel();
	JLabel L45 = new JLabel();
	
	JLabel L36 = new JLabel();
	JLabel L46 = new JLabel();
	
	JLabel L47 = new JLabel();
	JLabel L57 = new JLabel();
	JLabel D6 = new JLabel();
	JLabel D7 = new JLabel();
	
	JButton btn = new JButton("View BandWidth");
	
	MenuBar mbr;
	Menu file;
	MenuItem bw;
	
	JLabel imageLabel=new JLabel();
	
	
	public JammerAwareRouter() {

		
		jf = new JFrame("Router");
		c = jf.getContentPane();
		c.setLayout(null);
        
		
		mbr=new MenuBar();
		
		setMenuBar(mbr);
		file=new Menu("File");
		
		bw=new MenuItem("View BandWidth");
		
		file.add(bw);
		
		mbr.add(file);
		
		
		
		
	    ImageIcon snode = new ImageIcon(this.getClass().getResource("sn.png"));
	    ImageIcon activeNode = new ImageIcon(this.getClass().getResource("active.png"));
		ImageIcon Node = new ImageIcon(this.getClass().getResource("mag3.png"));
		ImageIcon ConFree = new ImageIcon(this.getClass().getResource("mag1.png"));
		ImageIcon CNode = new ImageIcon(this.getClass().getResource("mag2.png"));
		ImageIcon Dest = new ImageIcon(this.getClass().getResource("sn.png"));
		
		//NODE ICONS
		ImageIcon node1 = new ImageIcon(this.getClass().getResource("s1.png"));
		ImageIcon node11 = new ImageIcon(this.getClass().getResource("n1b.png"));
		ImageIcon node2 = new ImageIcon(this.getClass().getResource("n2b.png"));
		ImageIcon node3 = new ImageIcon(this.getClass().getResource("n3b.png"));
		ImageIcon node4 = new ImageIcon(this.getClass().getResource("n4b.png"));
		ImageIcon node5 = new ImageIcon(this.getClass().getResource("n5b.png"));
		ImageIcon node6 = new ImageIcon(this.getClass().getResource("n6b.png"));
		ImageIcon node7 = new ImageIcon(this.getClass().getResource("n7b.png"));
		//ImageIcon node8 = new ImageIcon(this.getClass().getResource("n8b.png"));
		ImageIcon node9 = new ImageIcon(this.getClass().getResource("d1.png"));
		
		//LINE ICONS
		ImageIcon s11 = new ImageIcon(this.getClass().getResource("b11.png"));
		ImageIcon s12 = new ImageIcon(this.getClass().getResource("b12.png"));
		ImageIcon s13 = new ImageIcon(this.getClass().getResource("b13.png"));
		ImageIcon s14 = new ImageIcon(this.getClass().getResource("b14.png"));
		
		ImageIcon s24 = new ImageIcon(this.getClass().getResource("b24.png"));
		ImageIcon s25 = new ImageIcon(this.getClass().getResource("b25.png"));
		
		ImageIcon s34 = new ImageIcon(this.getClass().getResource("b34.png"));
		ImageIcon s45 = new ImageIcon(this.getClass().getResource("b45.png"));
		
		ImageIcon s36 = new ImageIcon(this.getClass().getResource("b36.png"));
		ImageIcon s46 = new ImageIcon(this.getClass().getResource("b46.png"));
		ImageIcon s47 = new ImageIcon(this.getClass().getResource("b47.png"));
		ImageIcon s57 = new ImageIcon(this.getClass().getResource("b56.png"));
		ImageIcon sd6 = new ImageIcon(this.getClass().getResource("b6d.png"));
		ImageIcon sd7 = new ImageIcon(this.getClass().getResource("b7d.png"));
		

		
		t1 = new JLabel("SourceNode");
		t0 = new JLabel("ActiveNode");
		t2 = new JLabel("Nodes");
		t3 = new JLabel("ActiveCongFree");
		t4 = new JLabel("PacketJammerNode");
		t5 = new JLabel("Destination");
		
		
	    tag1.setIcon(snode);
	    tag.setIcon(activeNode);
	    tag2.setIcon(Node);
	    tag3.setIcon(ConFree);
	    tag4.setIcon(CNode);
	    tag5.setIcon(Dest);
		
	    ImageIcon ii = new ImageIcon(this.getClass().getResource("MultihopRouter.jpg"));
		imageLabel.setIcon(ii);
		imageLabel.setBounds(0, 2, 1200, 100);
		
		
		img1.setIcon(node1);
		img11.setIcon(node11);
		img2.setIcon(node2);
		img3.setIcon(node3);
		img4.setIcon(node4);
		img5.setIcon(node5);
		img6.setIcon(node6);
		img7.setIcon(node7);
		//img8.setIcon(node8);
		img9.setIcon(node9);
		
		L1.setIcon(s11);
		L2.setIcon(s12);
		L13.setIcon(s13);
		L14.setIcon(s14);
		L24.setIcon(s24);
		L25.setIcon(s25);
		L34.setIcon(s34);
		L45.setIcon(s45);
		L57.setIcon(s57);
		L36.setIcon(s36);
		L46.setIcon(s46);
		L47.setIcon(s47); 
		D6.setIcon(sd6);
		D7.setIcon(sd7);
		
		
		img1.setBounds(350, 45, 250, 172);
		img11.setBounds(230, 161, 250, 160);
		img2.setBounds(460, 196, 250, 80);
		img3.setBounds(170, 330, 250, 80);
		img4.setBounds(350, 325, 250, 110);
		img5.setBounds(525, 290, 250, 160);
		img6.setBounds(232, 350, 250, 300);
		img7.setBounds(464, 450, 240, 100);
		img8.setBounds(384, 246, 240, 200);
		img9.setBounds(350, 490, 240, 200);
		
		L1.setBounds(230,154,200,60);
		L2.setBounds(344,153,200,60);
		L13.setBounds(175,263,180,80);
		L14.setBounds(220,265,180,95);
		L24.setBounds(358,256,180,95);
		L25.setBounds(460,265,160,80);
		L34.setBounds(228,366,120,30);
		L45.setBounds(410,361,110,30);
		L57.setBounds(480,400,200,70);
		L36.setBounds(170,398,115,80);
		L46.setBounds(224,401,150,75);
		L47.setBounds(350,400,140,78);
		D6.setBounds(240,520,120,50);
		D7.setBounds(379,525,100,50);
		
		t1.setBounds(700, 400, 100, 100);
		t0.setBounds(700, 430, 100, 100);
		t2.setBounds(700, 460, 100, 100);
		t3.setBounds(700, 490, 100, 100);
		t4.setBounds(700, 520, 150, 100);
		t5.setBounds(700, 550, 100, 100);
		
		tag1.setBounds(650, 400, 100, 100);
		tag.setBounds(650, 430, 100, 100);
		tag2.setBounds(650, 460, 100, 100);
		tag3.setBounds(650, 490, 100, 100);
		tag4.setBounds(650, 520, 100, 100);
		tag5.setBounds(650, 550, 100, 100);
		
		btn.setBounds(350, 630, 200, 20);
		
		jf.setBounds(25, 25, 850, 700);
		jf.show();
		jf.setResizable(false);
		c.add(img1);
		c.add(img11);
		c.add(img2);
		c.add(img3);
		c.add(img4);
		c.add(img5);
		c.add(img6);
		c.add(img7);
		c.add(img8);
		c.add(img9);
		
		
		c.add(L1);
		c.add(L2);
		c.add(L13);
		c.add(L14);
		c.add(L24);
		c.add(L25);
		c.add(L34);
		c.add(L45);
		c.add(L36);
		c.add(L46);
		c.add(L47);
		c.add(L57);
		c.add(D6);
		c.add(D7);
		
		c.add(t1);
		c.add(t0);
		c.add(t2);
		c.add(t3);
		c.add(t4);
		c.add(t5);
		
		c.add(tag1);
		c.add(tag);
		c.add(tag2);
		c.add(tag3);
		c.add(tag4);
		c.add(tag5);
		c.add(btn);
		c.add(imageLabel);
		timer=new Timer(15,null);

		int[] ports = new int[] { 1000, 1001 };

		for (int i = 0; i < 2; i++) {
			Thread t = new Thread(new PortListener(ports[i]));
			t.setName("Listener-" + ports[i]);
			t.start();

		}

		btn.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getSource()==btn)
		{
			ViewBandWidth bw=new ViewBandWidth();
			
		bw.setSize(600,600);
		bw.setVisible(true);
		}
		
	}
	
	public static void main(String[] args) {
		new JammerAwareRouter();

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

		public void run() {

			if(this.port==1000){
		
				try{
				
					server = new ServerSocket(1000);
					
				
				while(true){
					
					con = server.accept();
					JOptionPane.showConfirmDialog(jf, "DO U WANT TO CONNECT TO MULTI-HOP SOURCE");
					
					ImageIcon Gn1 = new ImageIcon(this.getClass().getResource("sg.png"));
					img1.setIcon(Gn1);
					img1.setBounds(350, 45, 250, 172);
					
					System.out.println("connected");
					DataInputStream dis = new DataInputStream(con.getInputStream());
				 
					String r = dis.readUTF();					
					String data = dis.readUTF();
					
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection connect = DriverManager.getConnection("jdbc:odbc:Topology11");
                    
					
					//NODE FROM s1---n1 /// s1---n2
					String sql1 = "select * from Bwidth where unique='A'";					
					Statement st1 = connect.createStatement();
					ResultSet rs1 = st1.executeQuery(sql1);
					
					String sql2 = "select * from Bwidth where unique='B'";					
					Statement st2 = connect.createStatement();
					ResultSet rs2 = st2.executeQuery(sql2);
					
					
					System.out.println("###################");
					int s1n1 = 0;
					int s1n2 = 0;
					
				
					
					
					while(rs1.next()==true)
					{
						s1n1 = rs1.getInt(4);
					}
					while(rs2.next()==true)
					{
						s1n2 = rs2.getInt(4);
					}
						if(s1n1<s1n2)
						{
							timer.start();
							Thread.sleep(2000);
							ImageIcon lines1 = new ImageIcon(this.getClass().getResource("LG11.png"));
							L1.setIcon(lines1);
							L1.setBounds(230,154,200,60);
							
							timer.start();
							Thread.sleep(4000);
							ImageIcon n1g = new ImageIcon(this.getClass().getResource("n1g.png"));
							img11.setIcon(n1g);
							img11.setBounds(230, 161, 250, 160);
						//}
					
						
						//NODE FROM 1---3 /// 1---4
						String sql13 = "select * from Bwidth where unique='C'";					
						Statement st3 = connect.createStatement();
						ResultSet rs3 = st1.executeQuery(sql13);
						
						String sql14 = "select * from Bwidth where unique='D'";					
						Statement st4 = connect.createStatement();
						ResultSet rs4 = st2.executeQuery(sql14);
						
						int n1n3 =0;
						int n1n4=0 ;
						
						System.out.println("###################");
						
						while(rs3.next()==true)
						{
							n1n3 = rs3.getInt(4);
						}
						while(rs4.next()==true)
						{
							n1n4 = rs4.getInt(4);
						}
						
						if(n1n3<n1n4)
						{
							timer.start();
							Thread.sleep(2000);
							ImageIcon line13 = new ImageIcon(this.getClass().getResource("con13.png"));
							L13.setIcon(line13);
							L13.setBounds(175,263,180,80);
							
							timer.start();
							Thread.sleep(4000);
							ImageIcon n3 = new ImageIcon(this.getClass().getResource("cong3.png"));
							img3.setIcon(n3);
							img3.setBounds(170, 330, 250, 80);
						
							timer.start();
							Thread.sleep(2000);
							ImageIcon line14 = new ImageIcon(this.getClass().getResource("LG14.png"));
							L14.setIcon(line14);
							L14.setBounds(220,265,180,95);
							
							timer.start();
							Thread.sleep(4000);
							ImageIcon n4 = new ImageIcon(this.getClass().getResource("n4g.png"));
							img4.setIcon(n4);
							img4.setBounds(350, 325, 250, 110);
						}
							 
						
						//NODE FROM 4---6 /// 4---7
						String sql46 = "select * from Bwidth where unique='I'";					
						Statement st5 = connect.createStatement();
						ResultSet rs5 = st5.executeQuery(sql46);
						
						String sql47 = "select * from Bwidth where unique='J'";					
						Statement st6 = connect.createStatement();
						ResultSet rs6 = st6.executeQuery(sql47);
						
						
						System.out.println("@@@@@@@@@@@@@@@@@");
						int n4n6 = 0;
						int n4n7 = 0;
						int n5n7=0;
						
						
						while(rs5.next()==true)
						{
							n4n6 = rs5.getInt(4);
						}
						while(rs6.next()==true)
						{
							n4n7 = rs6.getInt(4);
						}
						
						
						
						
						if(n4n6<n4n7)
							{
								
								timer.start();
								Thread.sleep(2000);
							    ImageIcon line46 = new ImageIcon(this.getClass().getResource("LG46.png"));
								L46.setIcon(line46);
								L46.setBounds(224,401,150,75);
								
								timer.start();
								Thread.sleep(4000);
								ImageIcon n6 = new ImageIcon(this.getClass().getResource("n6g.png"));
								img6.setIcon(n6);
								img6.setBounds(232, 350, 250, 300);
							}
							else 
							{
								timer.start();
								Thread.sleep(2000);
								ImageIcon line47 = new ImageIcon(this.getClass().getResource("LG47.png"));
								L47.setIcon(line47);
								L47.setBounds(350,400,140,78);
								
								timer.start();
								Thread.sleep(4000);
								ImageIcon n2g = new ImageIcon(this.getClass().getResource("n7g.png"));
								img7.setIcon(n2g);
								img7.setBounds(464, 450, 240, 100);
							}
						
						//NODE FROM 6---D /// 7---D
						String sql6d = "select * from Bwidth where unique='K'";					
						Statement st7 = connect.createStatement();
						ResultSet rs7 = st7.executeQuery(sql6d);
						
						String sql7d = "select * from Bwidth where unique='L'";					
						Statement st8 = connect.createStatement();
						ResultSet rs8 = st8.executeQuery(sql7d);
						
						
						System.out.println("@@@@@@@@@@@@@@@@@");
						int n6d = 0;
						int n7d = 0;
						
						while(rs7.next()==true)
						{
							n6d = rs7.getInt(4);
						}
						while(rs8.next()==true)
						{
							n7d = rs8.getInt(4);
						}
				
						
						ImageIcon sd6 = new ImageIcon(this.getClass().getResource("G6d.png"));
						D6.setIcon(sd6);
						D6.setBounds(240,520,120,50);
						
						ImageIcon node9 = new ImageIcon(this.getClass().getResource("dg.png"));
						img9.setIcon(node9);
						img9.setBounds(350, 490, 240, 200);
						
						Socket socket = new Socket("localhost", 1002);
					    DataOutputStream ds = new DataOutputStream(socket.getOutputStream());
	                   
					    ds.writeUTF(data);
					}
						///////////////////////////////
						else if(s1n1>s1n2)  {
							
								timer.start();
								Thread.sleep(2000);
								ImageIcon lines2 = new ImageIcon(this.getClass().getResource("LG12.png"));
								L2.setIcon(lines2);
								L2.setBounds(344,153,200,60);
								
								timer.start();
								Thread.sleep(4000);
								ImageIcon n2g = new ImageIcon(this.getClass().getResource("n2g.png"));
								img2.setIcon(n2g);
								img2.setBounds(460, 196, 250, 80);
								
								
								String sql22 = "select * from Bwidth where unique='E'";					
								Statement st22 = connect.createStatement();
								ResultSet rs33 = st22.executeQuery(sql22);
								
								String sql44 = "select * from Bwidth where unique='F'";					
								Statement st44 = connect.createStatement();
								ResultSet rs44 = st44.executeQuery(sql44);
								
								
								int n2n4 =0;
								int n2n5=0 ;
								
								while(rs33.next()==true)
								{
									n2n4 = rs33.getInt(4);
								}
								while(rs44.next()==true)
								{
									n2n5 = rs44.getInt(4);
								}
								if(n2n4<n2n5)
								{
									//timer.start();
									//Thread.sleep(2000);
									ImageIcon line224 = new ImageIcon(this.getClass().getResource("con24.png"));
									L24.setIcon(line224);
									L24.setBounds(358,256,180,95);
									
									
									//timer.start();
									//Thread.sleep(4000);
									ImageIcon n3 = new ImageIcon(this.getClass().getResource("n4red.png"));
									img4.setIcon(n3);
									img4.setBounds(350, 325, 250, 110);
									
									
									//timer.start();
									//Thread.sleep(2000);
									ImageIcon line25 = new ImageIcon(this.getClass().getResource("LG25.png"));
									L25.setIcon(line25);
									L25.setBounds(460,265,160,80);
									
									//timer.start();
									//Thread.sleep(4000);
									ImageIcon n33 = new ImageIcon(this.getClass().getResource("n5g.png"));
									img5.setIcon(n33);
									img5.setBounds(525, 290, 250, 160);
								
								}
								String sql01 = "select * from Bwidth where unique='E'";					
								Statement st002 = connect.createStatement();
								ResultSet rs101 = st002.executeQuery(sql01);
								
								String sql02 = "select * from Bwidth where unique='F'";					
								Statement st003 = connect.createStatement();
								ResultSet rs102 = st003.executeQuery(sql02);
								
								timer.start();
								Thread.sleep(2000);
								ImageIcon s57 = new ImageIcon(this.getClass().getResource("LG57.png"));
								L57.setIcon(s57);							
								L57.setBounds(480,400,200,70);
								
								timer.start();
								Thread.sleep(4000);
								ImageIcon node7 = new ImageIcon(this.getClass().getResource("n7g.png"));
								img7.setIcon(node7);
								img7.setBounds(464, 450, 240, 100);
								
								timer.start();
								Thread.sleep(4000);
								ImageIcon sd7 = new ImageIcon(this.getClass().getResource("G7d.png"));
								D7.setIcon(sd7);
								D7.setBounds(379,525,100,50);
								
								ImageIcon node9 = new ImageIcon(this.getClass().getResource("dg.png"));
								img9.setIcon(node9);
								img9.setBounds(350, 490, 240, 200);
								
								JOptionPane.showMessageDialog(null, "Data has been sent");
								
								Socket socket = new Socket("localhost", 1002);
							    DataOutputStream ds = new DataOutputStream(socket.getOutputStream());
			                   
							    ds.writeUTF(data);
								
						}
						
						
				
				}
				}
				
			catch(Exception ex){
				System.out.println(ex);
			}
			
			}
			
			
		}

	}

}
