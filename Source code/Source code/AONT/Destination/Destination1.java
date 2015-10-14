/****************************************************************/
/*                      Destination	                            */
/*                                                              */
/****************************************************************/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
/**
 * Summary description for FECClient
 *
 */
public class Destination1 extends JFrame
{
	// Variables declaration
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JTextField jTextField1;
	private JTextArea jTextArea1;
	private JScrollPane jScrollPane1;
	private JProgressBar jProgressBar1;
	//private JButton jButton1;
	private JButton jButton2;
	private JButton jButton3;
	private JButton jButton4;
	private JButton jButton5;
	private JPanel contentPane;
	public String Fien="";
	public String Dest1="";
	public int i,j;
	public int ch;
	public static int fillen;
	public int intfec[];
	public int intval[];
	public char chfec[];
	public char pakch1[][];
	public char filreord[][];
	public String[] filtfr;
	public String filfec[];
	ServerSocket ss;
	Socket so;
	//ServerSocket ss1;
	//Socket so1;
	public float codrt;
	public float bklen;
	public float intdth,orgblk,Per,Effy;
	public float k,Probjn,n,ENI,PLReff;
	// End of variables declaration

	public ImageIcon im,im1,im2,im3;
	public JLabel image,image1,mf,image2,image3;

	//String rec="";
	public Destination1()
	{
		super();
		initializeComponent();
		//
		// TODO: Add any constructor code after initializeComponent call
		//
		
		this.setVisible(true);
		try
		{
			ss=new ServerSocket(4501);
			while(true)
			{
				so=ss.accept();
				jTextArea1.setText("\n   Packets Recieving Started");
				DataInputStream dis=new DataInputStream(so.getInputStream());
				fillen=dis.readInt();
				filtfr=new String[fillen];
				intval=new int[fillen];
				intfec=new int[fillen];
				chfec=new char[fillen+25];
				pakch1=new char[fillen+25][100];
				filreord=new char[fillen+25][100];
				filfec=new String[fillen];
				jTextField1.setText("//Destination 1/Result1.txt");
				
				System.out.println("File Length : "+fillen);
				 for(i=0;i<fillen;i++)
				 {
					 filtfr[i]=dis.readUTF();
					 System.out.println("Packet : ["+i+"] = "+filtfr[i]);
					 //Thread.sleep(25);
				 }
				System.out.println("**********Packets Recieved From The Source***********");
				jTextArea1.append("\n\n   Packets Received");Per=100;
				System.out.println("File Length : "+fillen);			
			}
			

		}
		catch (Exception er)
		{
			System.out.println(er);
		}
				
	
	}
	

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always regenerated
	 * by the Windows Form Designer. Otherwise, retrieving design might not work properly.
	 * Tip: If you must revise this method, please backup this GUI file for JFrameBuilder
	 * to retrieve your design properly in future, before revising this method.
	 */
	private void initializeComponent()

	{



im1 = new ImageIcon(this.getClass().getResource("Destination1.jpg"));
		
		image1 = new JLabel();
		image1.setIcon(im1);
		

		jLabel1 = new JLabel();
		jLabel1.setFont(new Font("Arial",Font.BOLD,14));
		jLabel2 = new JLabel();
		jLabel2.setFont(new Font("Arial",Font.BOLD,12));
		jLabel3 = new JLabel();
		jLabel3.setFont(new Font("Arial",Font.BOLD,12));
		jLabel4 = new JLabel();
		jLabel4.setFont(new Font("Arial",Font.BOLD,12));
		jTextField1 = new JTextField();
		jTextField1.setFont(new Font("Arial",Font.BOLD,12));
		jTextArea1 = new JTextArea();
		jTextArea1.setFont(new Font("Arial",Font.BOLD,12));
		jScrollPane1 = new JScrollPane();
		jProgressBar1 = new JProgressBar();
		//jButton1 = new JButton();
		jButton2 = new JButton();//((new ImageIcon("bu1.gif")));
		jButton3 = new JButton();//((new ImageIcon("bu1.gif")));
		jButton4 = new JButton();//((new ImageIcon("bu1.gif")));
		jButton5 = new JButton();//((new ImageIcon("bu1.gif")));
		contentPane = (JPanel)this.getContentPane();

		//
		// jLabel1
		//
		jLabel1.setForeground(new Color(0, 0, 102));
		jLabel1.setText("An AONT-based Hiding Scheme");
		//
		// jLabel2
		//
		jLabel2.setForeground(new Color(0, 0, 102));
		jLabel2.setText("Status Information");
		//
		// jLabel3
		//
		jLabel3.setForeground(new Color(0, 0, 102));
		jLabel3.setText("Recieved File Location : ");
		//
		// jLabel4
		//
		jLabel4.setForeground(new Color(0, 0, 102));
		jLabel4.setText("");
		//
		// jTextField1
		//
		jTextField1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jTextField1_actionPerformed(e);
			}

		});
		//
		// jTextArea1
		//
		//
		// jScrollPane1
		//
		jScrollPane1.setViewportView(jTextArea1);
		//
		// jProgressBar1
		//
		//
		// jButton1
		//
		//jButton1.setBackground(new Color(102, 102, 255));
		/*jButton1.setForeground(new Color(0, 0, 102));
		jButton1.setText("Browse");
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton1_actionPerformed(e);
			}

		});*/
		//
		// jButton2
		//
		//jButton2.setBackground(new Color(102, 102, 255));
		jButton2.setForeground(new Color(0, 0, 102));
		jButton2.setText("De-Interleaving");
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton2_actionPerformed(e);
			}

		});
		//
		// jButton3
		//
		//jButton3.setBackground(new Color(102, 102, 255));
		jButton3.setForeground(new Color(0, 0, 102));
		jButton3.setText("Channel Decoding");
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton3_actionPerformed(e);
			}

		});
		//
		// jButton4
		//
		//jButton4.setBackground(new Color(102, 102, 255));
		jButton4.setForeground(new Color(0, 0, 102));
		jButton4.setText("Result");
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton4_actionPerformed(e);
			}

		});
		//
		// jButton5
		//
		//jButton5.setBackground(new Color(102, 102, 255));
		jButton5.setForeground(new Color(0, 0, 102));
		jButton5.setText("Exit");
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton5_actionPerformed(e);
			}

		});
		//
		// contentPane
		//




		im2 = new ImageIcon(this.getClass().getResource("PHA.jpg"));
		
		image2 = new JLabel();
		image2.setIcon(im2);


		im3 = new ImageIcon(this.getClass().getResource("PHMA1.jpg"));
		
		image3 = new JLabel();
		image3.setIcon(im3);







		contentPane.setLayout(null);
		contentPane.setBackground(new Color(150, 150, 155));
		contentPane.setForeground(new Color(51, 51, 51));
		addComponent(contentPane, jLabel1, 380,120,245,40);
		addComponent(contentPane, jLabel2, 380,270,184,18);
		addComponent(contentPane, jLabel3, 27,188,240,30);
		addComponent(contentPane, jLabel4, 27,560,200,20);
		addComponent(contentPane, jTextField1, 27,231,240,30);
		addComponent(contentPane, jScrollPane1, 320,300,400,300);
		//addComponent(contentPane, jProgressBar1, 27,430,600,20);
		//addComponent(contentPane, jButton1, 276,230,83,32);
		addComponent(contentPane, jButton2, 390,230,220,30);
		addComponent(contentPane, jButton3, 90,320,220,30);
		addComponent(contentPane, jButton4, 90,370,220,30);
		addComponent(contentPane, jButton5, 90,420,220,30);

		addComponent(contentPane,image1,0,0,1125,100);

		//addComponent(contentPane,image2,550,200,600,400);
		//addComponent(contentPane,image3,510,470,600,400);






		//
		// Client
		//
		this.setTitle("Destination 1");
		this.setLocation(new Point(0, 0));
		this.setSize(new Dimension(1000, 650));
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	//	this.setVisible(true);
		
	}
	/** Add Component Without a Layout Manager (Absolute Positioning) */
	private void addComponent(Container container,Component c,int x,int y,int width,int height)
	{
		c.setBounds(x,y,width,height);
		container.add(c);
	}

	//
	// TODO: Add any appropriate code in the following Event Handling Methods
	//
	private void jTextField1_actionPerformed(ActionEvent e)
	{
		System.out.println("\njTextField1_actionPerformed(ActionEvent e) called.");
		// TODO: Add any handling code here
		

	}

	/*private void jButton1_actionPerformed(ActionEvent e)
	{
		System.out.println("\njButton1_actionPerformed(ActionEvent e) called.");
		// TODO: Add any handling code here

	}*/

	private void jButton2_actionPerformed(ActionEvent e)
	{
		System.out.println("\n***************De-Interleaving Started***************");
		// TODO: Add any handling code here
		
		//System.out.println("fillen = "+fillen);
		jTextArea1.append("\n\n   De-Interleaving Process Started");
		for(i=0;i<fillen;i++)
		{
			for(j=0;j<filtfr[i].length();j++)
			{
				pakch1[i][j]=filtfr[i].charAt(j);
			}
		}
		//Printing the values
		k=(float)(Math.random()*2);
		for(i=0;i<fillen;i++)
		{
			for(j=0;j<filtfr[i].length();j++)
			{
				System.out.print(pakch1[i][j]+" ");
			}
			System.out.print("\n");
			try
				{
					Thread.sleep(2);
				}
				catch (Exception er)
				{
					System.out.println("Sleep Disturbed : "+er);
				}
		}
		
		//De-Interleaving
		for(i=0;i<fillen;i++)
		{
			for(j=0;j<1;j++)
			{
				if((filtfr[i].length())==21)
				{
				bklen=filtfr[i].length();
				filreord[i][0]=pakch1[i][8];
				filreord[i][1]=pakch1[i][10];
				filreord[i][2]=pakch1[i][18];
				filreord[i][3]=pakch1[i][15];
				filreord[i][4]=pakch1[i][9];
				filreord[i][5]=pakch1[i][0];
				filreord[i][6]=pakch1[i][4];
				filreord[i][7]=pakch1[i][13];
				filreord[i][8]=pakch1[i][6];
				filreord[i][9]=pakch1[i][3];
				filreord[i][10]=pakch1[i][5];
				filreord[i][11]=pakch1[i][2];
				filreord[i][12]=pakch1[i][1];
				filreord[i][13]=pakch1[i][12];
				filreord[i][14]=pakch1[i][20];
				filreord[i][15]=pakch1[i][17];
				filreord[i][16]=pakch1[i][14];
				filreord[i][17]=pakch1[i][16];
				filreord[i][18]=pakch1[i][19];
				filreord[i][19]=pakch1[i][11];
				filreord[i][20]=pakch1[i][7];
				}
				else if((filtfr[i].length())==18)
				{
				filreord[i][0]=pakch1[i][7];
				filreord[i][1]=pakch1[i][9];
				filreord[i][2]=pakch1[i][16];
				filreord[i][3]=pakch1[i][13];
				filreord[i][4]=pakch1[i][8];
				filreord[i][5]=pakch1[i][0];
				filreord[i][6]=pakch1[i][4];
				filreord[i][7]=pakch1[i][11];
				filreord[i][8]=pakch1[i][6];
				filreord[i][9]=pakch1[i][3];
				filreord[i][10]=pakch1[i][5];
				filreord[i][11]=pakch1[i][2];
				filreord[i][12]=pakch1[i][1];
				filreord[i][13]=pakch1[i][15];
				filreord[i][14]=pakch1[i][17];
				filreord[i][15]=pakch1[i][10];
				filreord[i][16]=pakch1[i][12];
				filreord[i][17]=pakch1[i][14];
				}
				else
				{
				filreord[i][0]=pakch1[i][7];
				filreord[i][1]=pakch1[i][9];
				filreord[i][2]=pakch1[i][5];
				filreord[i][3]=pakch1[i][10];
				filreord[i][4]=pakch1[i][8];
				filreord[i][5]=pakch1[i][0];
				filreord[i][6]=pakch1[i][4];
				filreord[i][7]=pakch1[i][11];
				filreord[i][8]=pakch1[i][6];
				filreord[i][9]=pakch1[i][3];
				filreord[i][10]=pakch1[i][2];
				filreord[i][11]=pakch1[i][1];
				//System.out.println("Packets Lost");
				}

			}
		}
		//Printing the values
		for(i=0;i<fillen;i++)
		{
			for(j=0;j<filtfr[i].length();j++)
			{
				System.out.print(filreord[i][j]+" ");
			}
			System.out.print("\n");
			try
				{
					Thread.sleep(2);
				}
				catch (Exception er)
				{
					System.out.println("Sleep Disturbed : "+er);
				}
		}
		jTextArea1.append("\n\n   De-Interleaving Process Completed");
		System.out.println("\n***************De-Interleaving Completed***************");
	}

	private void jButton3_actionPerformed(ActionEvent e)
	{
		System.out.println("\n**************Channel Decoding Stsrted********************");
		// TODO: Add any handling code here
			orgblk=7;
		
		jTextArea1.append("\n\n   Channel Decoding Process Started");
		for(i=0;i<fillen;i++)
		{
			filfec[i]="";
			for(j=0;j<filtfr[i].length();j++)
			{
				
				if(filreord[i][j+2]!='\0')
				{
					filfec[i]+=""+filreord[i][j+2];
					j+=2;
				}
				else if(filreord[i][j+1]!='\0')
				{
					filfec[i]+=""+filreord[i][j+1];
					j+=2;
				}
				else if(filreord[i][j]!='\0')
				{
					filfec[i]+=""+filreord[i][j];
					j+=2;
				}
			}
		}
		
		//Printing after  Decoding
		for(i=0;i<fillen;i++)
		{
			
			System.out.println(filfec[i]);
			try
				{
					Thread.sleep(2);
				}
				catch (Exception er)
				{
					System.out.println("Sleep Disturbed : "+er);
				}
		}
		
		//Conersion of Binary Values to String
		jTextArea1.append("\n\n   Conerting Binary to String");
		for(i=0;i<fillen;i++)
		{
			intval[i]= Integer.parseInt(filfec[i],2);
			chfec[i]=(char)intval[i];
		}
		try
		{
			Fien="";
			FileOutputStream fw=new FileOutputStream("Output File/Output1.txt");
			for(i=0;i<fillen;i++)
			{
			Fien+=Character.toString(chfec[i]);
			fw.write(chfec[i]);
			}
		}
		catch (Exception er)
		{
			er.printStackTrace();
		}
		
		jTextArea1.append("\n\n   Recieved Packets Processing Completed");
		System.out.println("\n\n******************Channel Decoding Process Completed***********************");
		
		jTextArea1.append("\n\n   Channel Decoding  Process Completed");
		//System.out.println("\nOutput : "+Fien);
		//FileOutputStream fwtr=new FileOutputStream("F:/Hector/FEC/Destination/Result.txt");
		//fwtr.writeUTF(Fien);

	}

	private void jButton4_actionPerformed(ActionEvent e)
	{
		
		
		System.out.println("\nOpening Recieved File");
		// TODO: Add any handling code here
		Result1 re=new Result1();
		re.show();
		re.jTextArea1.setText(" ");
		
 		re.jTextArea1.setText(Fien);
		intdth=bklen-orgblk;
		System.out.println("InterLeaving Depth : "+intdth);
		codrt=intdth/bklen;
		System.out.println("Coding Rate : "+codrt);
		n=bklen;
		System.out.println("k = "+k);
		System.out.println("n = "+n);
		//System.out.println("Probjn = "+Probjn);
		for(j=((int)(n-7)+1);j<n+1;j++)
		{
			//System.out.println("j = "+j);
			ENI=ENI+(j*(k/n));
		}
		System.out.println("ENI = "+ENI);

		PLReff=ENI/n;
		Effy=Per-PLReff;
		System.out.println("PLReff = "+PLReff);
		System.out.println("Effy = "+Effy);
		re.jTextField1.setText(""+Effy);
		re.jTextField2.setText(""+bklen);
		re.jTextField3.setText(""+codrt);
		re.jTextField4.setText(""+intdth);
		Effy=0;
		ENI=0;
		PLReff=0;

	}

	private void jButton5_actionPerformed(ActionEvent e)
	{
		System.out.println("\nExit");
		// TODO: Add any handling code here
		System.exit(0);

	}

	//
	// TODO: Add any method code to meet your needs in the following area
	//
	


























 

//============================= Testing ================================//
//=                                                                    =//
//= The following main method is just for testing this class you built.=//
//= After testing,you may simply delete it.                            =//
//======================================================================//
	public static void main(String[] args)
	{
		/*JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch (Exception ex)
		{
			System.out.println("Failed loading L&F: ");
			System.out.println(ex);
		}*/
		new Destination1();
		
	}
//= End of Testing =


}
