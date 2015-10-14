import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.*;


public class Destination  {
	
	 JFrame jf;
	Container c;
	JTextArea ta;
	JScrollPane sp;
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JButton Submit,Reset;
	
	JLabel imageLabel=new JLabel();
	public Destination(){
		
		jf=new JFrame();
		jf.setTitle("Receiver::Destination");
		
		c=jf.getContentPane();
		jf.setSize(850, 500);
		
		c.setLayout(null);
		c.setBackground(new Color(100, 100, 150));
		sp = new JScrollPane();
	
	    l1=new JLabel();
		l1.setText("Fie Name");
		t1=new JTextField(15);
		
		l2=new JLabel();
		l2.setText("Secret Key");
		t2 = new JTextField(15);
		
		l3 = new JLabel("Recieved File");
		
		ta=new JTextArea();
		ta.setRows(20);
		ta.setColumns(30);
		
		
		ImageIcon ii = new ImageIcon(this.getClass().getResource("Receiver.jpg"));
		imageLabel.setIcon(ii);
		imageLabel.setBounds(0, 0, 1200, 100);
		
		
		
		sp.setBounds(200,110,450,350);
		
		sp.setViewportView(ta);
		
		Submit=new JButton("Submit");
		Reset=new JButton("Reset");
		
		l1.setBounds(40, 50, 100, 25);
		t1.setBounds(130, 50, 150, 25);
		
		l2.setBounds(40, 100, 200, 25);
		t2.setBounds(130, 100, 150, 25);
		
		
		
		
		Submit.setBounds(50, 170, 100, 25);
		Reset.setBounds(175, 170, 100, 25);
		//c.add(l1);
		//c.add(l2);
		//c.add(t1);
		//c.add(t2);
		c.add(sp,BorderLayout.CENTER);
		//c.add(Submit);
		c.add(l3);
		c.add(imageLabel);
		
		
				
	
		
		jf.show();
		
		int[] ports = new int[]{1002};
		for(int i=0;i<1;i++)
		{
			Thread t = new Thread(new PortListener(ports[i]));
			t.start();
		}
		
		
	}
	
	public static void main(String[] args) {
		
		new Destination();

		
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

		if(this.port==1002){
			
			try {
				server = new ServerSocket(1002);
				
			while(true)
			{
				
				ENCDEC dec=new ENCDEC();
			  con = server.accept();
			  DataInputStream dis = new DataInputStream(con.getInputStream());
			  
			  String data = dis.readUTF();
			  System.out.println("reciever");
              ta.setText(dec.decrypt(data));			
              
              
			  System.out.println(data+"Data received at reciver");
			  
		    }
			}catch (Exception e) {
				// TODO: handle exception
			}
		
	}
}
	}
}
