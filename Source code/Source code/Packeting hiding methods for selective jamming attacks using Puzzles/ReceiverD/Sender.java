import java.util.*;
import java.net.*;
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
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Sender implements ActionListener {
	Timer timer;
	File curFile;

	public Font f1 = new Font("Times new roman", Font.BOLD, 28);
	public Font f3a = new Font("Times new roman", Font.BOLD, 15);
	public Font f3 = new Font("Times new roman", Font.BOLD, 23);
	public Font f4 = new Font("Copperplate Gothic Bold", Font.BOLD, 35);
	public JLabel T1 = new JLabel(
			"Protecting Location Privacy in Sensor Networks Against a Global Evasdropper");
	public JLabel T2 = new JLabel("Select the File :");

	public JLabel TF = new JLabel();
	public JLabel T3 = new JLabel("File  Path         :");
	public JComboBox TAreu = new JComboBox();
	public JButton btn = new JButton("Send");
	public JButton split = new JButton("Split");
	public JTextArea tf = new JTextArea();
	public JScrollPane pane = new JScrollPane();
	public JButton btn1 = new JButton("Open");
	public JLabel p1 = new JLabel("Packet1-> ");
	public JLabel p2 = new JLabel("Packet2-> ");
	public JLabel p3 = new JLabel("Packet3-> ");
	public JLabel p4 = new JLabel("Packet4-> ");
	public JLabel p5 = new JLabel("Packet5-> ");
	public JLabel p6 = new JLabel("Packet6-> ");
	public JLabel p7 = new JLabel("Packet7-> ");
	public JLabel p8 = new JLabel("Packet8-> ");
	public JLabel p9 = new JLabel("Packet9-> ");
	public JLabel p10 = new JLabel("Packet10-> ");
	
	
	
	public JLabel p11 = new JLabel(" ");
	public JLabel p22 = new JLabel(" ");
	public JLabel p33 = new JLabel(" ");
	public JLabel p44 = new JLabel(" ");
	public JLabel p55 = new JLabel(" ");
	public JLabel p66 = new JLabel(" ");
	public JLabel p77 = new JLabel(" ");
	public JLabel p88 = new JLabel(" ");
	public JLabel p99 = new JLabel(" ");
	public JLabel p100 = new JLabel(" ");
	
	
	public JLabel ip1;
	String path;
	public JFrame jf;
	public Container c;

	static File field;

	Sender() {
		
		JLabel imageLabel = new JLabel();
		ImageIcon ii = new ImageIcon(this.getClass().getResource("ServiceProvider.jpg"));
		imageLabel.setIcon(ii);
		imageLabel.setBounds(-10, 0, 1200, 150);
		

		jf = new JFrame(
				"Protecting Location Privacy in Sensor Networks Against a Global Evasdropper ::SENDER");
		c = jf.getContentPane();
		c.setLayout(null);
		jf.setSize(1200, 800);

		c.setBackground(new Color(100, 239, 200));
		T2.setBounds(270, 140, 250, 45);
		T2.setFont(f3);
		// T2.setForeground(new Color(120,120,0));
		// T2.setForeground(Color.BLUE);
		timer = new Timer(0, null);

		T1.setForeground(Color.MAGENTA);
		T2.setForeground(new Color(10, 120, 7));
		T3.setForeground(new Color(10, 120, 7));
		btn1.setBounds(610, 140, 230, 45);
		btn1.setFont(f3);
		btn1.setForeground(Color.BLACK);

		T1.setBounds(100, 40, 950, 45);

		p1.setBounds(900, 300, 950, 45);
		p2.setBounds(900, 330, 950, 45);
		p3.setBounds(900, 360, 950, 45);
		p4.setBounds(900, 390, 950, 45);
		p5.setBounds(900, 420, 950, 45);
		p6.setBounds(900, 450, 950, 45);
		p7.setBounds(900, 480, 950, 45);
		p8.setBounds(900, 510, 950, 45);
		p9.setBounds(900, 540, 950, 45);
		p10.setBounds(900, 570, 950, 45);
		
		
		p11.setBounds(1000, 300, 950, 45);
		p22.setBounds(1000, 330, 950, 45);
		p33.setBounds(1000, 360, 950, 45);
		p44.setBounds(1000, 390, 950, 45);
		p55.setBounds(1000, 420, 950, 45);
		p66.setBounds(1000, 450, 950, 45);
		p77.setBounds(1000, 480, 950, 45);
		p88.setBounds(1000, 510, 950, 45);
		p99.setBounds(1000, 540, 950, 45);
		p100.setBounds(1000, 570, 950, 45);
		
		

		// T1.setForeground(new Color(170,5,5));
		TAreu.setBounds(550, 550, 200, 35);
		btn.setBounds(450, 620, 130, 45);
		split.setBounds(250, 620, 130, 45);
		T1.setFont(f1);
		btn.setFont(f3);

		TF.setBounds(610, 210, 430, 45);
		TF.setBackground(new Color(223, 225, 245));
		TF.setForeground(Color.BLUE);
		TF.setFont(f3a);
		// T3.setForeground(Color.BLUE);
		T3.setBounds(270, 210, 250, 45);
		T3.setFont(f3);
		btn.setForeground(Color.BLACK);
		TAreu.addItem("Mesh Route");
		TAreu.addItem(" Node ");
		TAreu.setFont(f3);
		TAreu.setBackground(Color.WHITE);
		TAreu.setForeground(Color.BLUE);
		pane.setBounds(275, 300, 560, 200);

		tf.setColumns(20);
		tf.setRows(10);
		tf.setName("tf");
		pane.setName("pane");
		pane.setViewportView(tf);

		btn1.addActionListener(this);
		btn.addActionListener(this);

		btn1.setMnemonic(KeyEvent.VK_B);
		btn.setMnemonic(KeyEvent.VK_S);
		jf.show();
		//c.add(T1);

		c.add(btn);
		c.add(T2);
		c.add(T3);
		c.add(TF);
		c.add(pane, BorderLayout.CENTER);
		c.add(btn1);
		c.add(split);

		c.add(p1);
		c.add(p2);
		c.add(p3);
		c.add(p4);
		c.add(p5);
		c.add(p6);
		c.add(p7);
		c.add(p8);
		c.add(p9);
		c.add(p10);
		
		

		c.add(p11);
		c.add(p22);
		c.add(p33);
		c.add(p44);
		c.add(p55);
		c.add(p66);
		c.add(p77);
		c.add(p88);
		c.add(p99);
		c.add(p100);
		
c.add(imageLabel);
		split.addActionListener(this);
		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent win) {
				System.exit(0);
			}
		});

	}

	/*public File[] split(File source, int noFile, int lsize) {

		int FRG_FSIZE = 0;
		FRG_FSIZE = 1024 * 5;
		File[] fileFragments = new File[noFile];
		String[] frgfName = new String[noFile];
		try {
			String sourceFName = source.getName();
			long sourceFSize = source.length();
			FileInputStream fis = new FileInputStream(source);

			String Fileinfo = new String(sourceFName + ","
					+ String.valueOf(sourceFSize));
			System.out.println(noFile);
			if (lsize != 0) {
				noFile--;
			}
			System.out.println(noFile);
			sourceFName = sourceFName
					.substring(0, sourceFName.lastIndexOf("."));
			int j = 0;
			for (int i = 1; i <= noFile; i++) {

				if (i == 1) {

					frgfName[i - 1] = "temp\\" + sourceFName
							+ String.valueOf(i) + ".java";

					p1.setText(String.valueOf(frgfName));
					c.add(p1);
				}
				frgfName[i - 1] = "temp\\" + sourceFName + String.valueOf(i)
						+ ".java";
				fileFragments[i - 1] = new File(frgfName[i - 1]);

				FileOutputStream fos = new FileOutputStream(
						fileFragments[i - 1]);
				byte[] data = new byte[FRG_FSIZE];
				int count = fis.read(data);
				fos.write(data);
				fos.close();
				String frgFileInfo = new String(frgfName[i - 1]
						+ String.valueOf(FRG_FSIZE));
			}
			if (lsize != 0) {
				System.out.println(noFile);
				frgfName[noFile] = "temp\\" + sourceFName
						+ String.valueOf(noFile + 1) + ".java";
				fileFragments[noFile] = new File(frgfName[noFile]);
				FileOutputStream fos = new FileOutputStream(
						fileFragments[noFile]);
				byte[] data = new byte[lsize];
				int count = fis.read(data);
				fos.write(data);
				fos.close();
				String frgFileInfo = new String(frgfName[noFile]
						+ String.valueOf(lsize));
			}

		} catch (Exception e) {

			System.out.println("Error in Splitting" + e);
			JOptionPane.showMessageDialog(null, "Error in Splitting File \n"
					+ e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			return null;
		}
		return fileFragments;

	}*/

	public void actionPerformed(ActionEvent e)
		 {
			

		    	DataInputStream input;

		    	BufferedInputStream bis;
		    	BufferedOutputStream bos = null;
		    	BufferedWriter writer = null;
		    	int in;
		    	byte[] byteArray;
		    	   		
		    	
			 
			 String strLine = null;
			 String newline = "\n";
			 if (e.getSource()== btn1)
			 {
				 JFileChooser chooser = new JFileChooser();
			    
			    // Set the current directory to the application's current directory
			    try {
			    	
			        // Create a File object containing the canonical path of the
			        // desired file
			        File f = new File(new File("filename.txt").getCanonicalPath());
			        
			        // Set the selected file
			        chooser.setSelectedFile(f);
			        
					
			    } 
			    catch (IOException e1) 
			    {
			    }
			    
			    // Show the dialog; wait until dialog is closed
			    chooser.showOpenDialog(btn1);
			    int retval = chooser.showOpenDialog(btn1);
				if (retval == JFileChooser.APPROVE_OPTION){
					field = chooser.getSelectedFile();
					 path=field.getAbsolutePath();
				   TF.setText(field.getAbsolutePath());
				}		    
			    // Get the currently selected file
			    curFile = chooser.getSelectedFile();
			    

			    try{
				    // Open the file that is the first 
				    // command line parameter
				    FileInputStream fstream = new FileInputStream(curFile);
				    // Get the object of DataInputStream
				    DataInputStream ins = new DataInputStream(fstream);
				        BufferedReader br = new BufferedReader(new InputStreamReader(ins));
				       
			    		
				    StringBuffer buffer = new StringBuffer();
				    
				    while ((strLine = br.readLine()) != null)   {
				      // Print the content on the console
				      System.out.println (strLine);
				      buffer.append(strLine+ "\n");
				          
				      
				    }
				   tf.setText(buffer.toString());
				    
				   
				    
//				   
				    }
			    catch (Exception e1){//Catch exception if any
				      System.err.println("Error: " + e1.getMessage());
				    }
			 }
			 
			 
			 if(e.getSource()== split)
			 {
				 int noFile=10;
				 File source=curFile;
				 int lsize=1024;
				 int FRG_FSIZE=0;
				 String pname;
					FRG_FSIZE = 1024*3;  
			        File[] fileFragments = new File[noFile];  
			        String[] frgfName = new String[noFile];  
			            try{      
			                String sourceFName = source.getName();  
			                long sourceFSize = source.length();  
			                FileInputStream fis = new FileInputStream(source);  
			  
			                String Fileinfo = new String(sourceFName + "," + String.valueOf(sourceFSize));  
			                System.out.println(noFile);  
			                if (lsize != 0) {  
			                    noFile--;  
			                }  
			                System.out.println(noFile);  
			                sourceFName = sourceFName.substring(0, sourceFName.lastIndexOf("."));  
			                int j=0;  
			                
			               
			                for (int i = 1; i<= noFile; i++) {  
			                	 timer.start(); 
			                	if(i==1)
			                	{
			                	
			                    pname=sourceFName + String.valueOf(i)+".java";
			                   
								Thread.sleep(100);
			                    
			                    p11.setText(pname);
			                   
			                    c.add(p11);
			                   
			                    
			                	}
			                	 
			                	if(i==2)
			                	{
			                	
			                    pname=sourceFName + String.valueOf(i)+".java";
			                    
			                    
			                  
								
								Thread.sleep(100);
								p22.setText(pname); 
			                    c.add(p22);
			                   
			                	}
			                	 
			                	if(i==3)
			                	{
			                	
			                    pname=sourceFName + String.valueOf(i)+".java";
			                    
			                    
								Thread.sleep(100);
			                    p33.setText(pname);
			                    
			                    
			                    c.add(p33);
			                   
			                	}
			                	 
			                	if(i==4)
			                	{
			                	
			                    pname=sourceFName + String.valueOf(i)+".java";
			                    
			                   
								Thread.sleep(100);
			                    p44.setText(pname);
			                    
			                    
			                    c.add(p44);
			                   
			                	}
			                	 
			                	if(i==5)
			                	{
			                	
			                    pname=sourceFName + String.valueOf(i)+".java";
			                    
			                   
								Thread.sleep(100);
			                    p55.setText(pname);
			                    
			                    
			                    c.add(p55);
			                    
			                	}
			                	 
			                	if(i==6)
			                	{
			                	
			                    pname=sourceFName + String.valueOf(i)+".java";
			                    
			                 
								Thread.sleep(100);
			                    p66.setText(pname);
			                   
			                    
			                    c.add(p66);
			                   
			                	}
			                	 
			                	if(i==7)
			                	{
			                	
			                    pname=sourceFName + String.valueOf(i)+".java";
			                    
			                    
								Thread.sleep(100);
			                    p77.setText(pname);
			                    
			                    
			                    c.add(p77);
			                   
			                	}
			                	 
			                	if(i==8)
			                	{
			                	
			                    pname=sourceFName + String.valueOf(i)+".java";
			                    
			                
								Thread.sleep(100);
			                    p88.setText(pname);
			                    
			                    
			                    c.add(p88);
			                 
			                	}
			                	 
			                	if(i==9)
			                	{
			                	
			                    pname=sourceFName + String.valueOf(i)+".java";
			                    
			                  
								Thread.sleep(100);
			                    p99.setText(pname);
			                    
			                    
			                    c.add(p99);
			                  
			                	}
			                	 
			                	if(i==10)
			                	{
			                	
			                    pname=sourceFName + String.valueOf(i)+".java";
			                   
								Thread.sleep(100);
			                    
			                    p100.setText(pname);
			                    
			                    
			                    c.add(p100);
			                  
			                	}
			                	
			                    frgfName[i-1] ="temp\\"+sourceFName + String.valueOf(i)+".java";  
			                    fileFragments[i-1] = new File(frgfName[i-1]);  
			                     
			                    FileOutputStream fos = new FileOutputStream(fileFragments[i - 1]);  
			                    byte[] data = new byte[FRG_FSIZE];  
			                    int count = fis.read(data);  
			                    fos.write(data);  
			                    fos.close();  
			                    String frgFileInfo = new String(frgfName[i-1] +  String.valueOf(FRG_FSIZE));  
			                } 
			                timer.stop();
			               
			                if (lsize != 0) {                      
			                    System.out.println(noFile);  
			                    
			                	
			                    pname=sourceFName + String.valueOf(noFile+1)+".java";
			                    
			                    
			                    p100.setText(pname);
			                    c.add(p100);
			                	
			                	
			                    
			                    frgfName[noFile] ="temp\\"+sourceFName + String.valueOf(noFile+1)+".java";  
			                    fileFragments[noFile] = new File(frgfName[noFile]);  
			                    FileOutputStream fos = new FileOutputStream(fileFragments[noFile]);  
			                    byte[] data = new byte[lsize];  
			                    int count = fis.read(data);  
			                    fos.write(data);  
			                    fos.close();  
			                    String frgFileInfo = new String(frgfName[noFile] +  String.valueOf(lsize));  
			                }  
			  
			               } catch (Exception ex) {  
			                        
			                   System.out.println("Error in Splitting"+e);  
			                    JOptionPane.showMessageDialog(null, "Error in Splitting File \n"+ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);  
			                      
			               }  
			    
			               
					
				 
				 
			 }
			 
			 if(e.getSource()== btn)
			 {
			
				 String[] node = { "Select Node", "B", "C", "D", "E" };
					
					
				    String fname = JOptionPane.showInputDialog(null, "Enter the File Name");
				    String rname = (String) JOptionPane.showInputDialog(null,
							"Select Destination Node", "node",
							JOptionPane.QUESTION_MESSAGE, null, node, node[0]);
					
					String ip = JOptionPane.showInputDialog(null, "Please Enter the Receiver IP Address");
				
					Socket client1 = null;
				

					

						Socket socket1;
						DataOutputStream dos1;
						DataInputStream dis;
						
						
						
						try { 
					
							
							
							 FileInputStream fis = new FileInputStream("temp/"
										+ p11.getText());
								byte b[] = new byte[fis.available()];
								fis.read(b);
								String content = new String(b);
								System.out.println(content);
								System.out.println("------1 END HERE");
							 
							
							 
								FileInputStream fis1 = new FileInputStream("temp/"
										+ p22.getText());
								byte b1[] = new byte[fis1.available()];
								fis1.read(b1);
								String content1 = new String(b1);
								System.out.println(content1);
								System.out.println("------2 END HERE");
								
								
								FileInputStream fis2 = new FileInputStream("temp/"
										+ p33.getText());
								byte b2[] = new byte[fis2.available()];
								fis2.read(b2);
								String content2 = new String(b2);
								System.out.println(content2);
								System.out.println("------3 END HERE");
							 
							
							 
								FileInputStream fis3 = new FileInputStream("temp/"
										+ p44.getText());
								byte b3[] = new byte[fis3.available()];
								fis3.read(b3);
								String content3 = new String(b3);
								System.out.println(content3);
								System.out.println("------4 END HERE");
								
								
								 FileInputStream fis4 = new FileInputStream("temp/"
											+ p55.getText());
									byte b4[] = new byte[fis4.available()];
									fis4.read(b4);
									String content4 = new String(b4);
									System.out.println(content4);
									System.out.println("------5 END HERE");
								 
								
								 
									FileInputStream fis5 = new FileInputStream("temp/"
											+ p66.getText());
									byte b5[] = new byte[fis5.available()];
									fis5.read(b5);
									String content5 = new String(b5);
									System.out.println(content5);
									System.out.println("------6 END HERE");
									
									
									FileInputStream fis6 = new FileInputStream("temp/"
											+ p77.getText());
									byte b6[] = new byte[fis6.available()];
									fis6.read(b6);
									String content6 = new String(b6);
									System.out.println(content6);
									System.out.println("------7 END HERE");
								 
								
								 
									FileInputStream fis7 = new FileInputStream("temp/"
											+ p88.getText());
									byte b7[] = new byte[fis7.available()];
									fis7.read(b7);
									String content7 = new String(b7);
									System.out.println(content7);
									System.out.println("------8 END HERE");
									
								
								
									FileInputStream fis8 = new FileInputStream("temp/"
											+ p99.getText());
									byte b8[] = new byte[fis8.available()];
									fis8.read(b8);
									String content8 = new String(b8);
									System.out.println(content8);
									System.out.println("------9 END HERE");
								
									
									FileInputStream fis9 = new FileInputStream("temp/"
											+ p100.getText());
									byte b9[] = new byte[fis9.available()];
									fis9.read(b9);
									String content9 = new String(b9);
									System.out.println(content9);
									System.out.println("------10 END HERE");
								
															
									socket1 = new Socket("localhost", 10000);
									dos1 = new DataOutputStream(socket1.getOutputStream());
									
									dos1.writeUTF(rname);
									dos1.writeUTF(ip);
									dos1.writeUTF(fname);
									dos1.writeUTF(content);
									dos1.writeUTF(content1);
									dos1.writeUTF(content2);
									dos1.writeUTF(content3);
									dos1.writeUTF(content4);
									dos1.writeUTF(content5);
									dos1.writeUTF(content6);
									dos1.writeUTF(content7);
									dos1.writeUTF(content8);
									dos1.writeUTF(content9);
														
						}
							catch(Exception ex) {ex.printStackTrace();
							 
							 }
			
			 }
			 
		 }

	public static void main(String args[]) {
		new Sender();
	}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       