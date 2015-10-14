/****************************************************************/
/*                      FECQueue	                            */
/*                                                              */
/****************************************************************/
//package Queue;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;

/**
 * Summary description for FECQueue
 *
 */
public class PacketQueue extends JFrame
{
	// Variables declaration
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JTextArea jTextArea1;
	private JScrollPane jScrollPane1;
	private JPanel contentPane;
	public int i,j;
	private JButton jButton1;
	public int fillen;
	public int fillen1;
	public int intfec[];
	public int intval[];
	public char chfec[];
	public char pakch1[][];
	public char filreord[][];
	public String filtfr;
	public String filfec[];
	String Dest1,Dest2;
	public int ch;
	ServerSocket ss;
	
	Socket so;
	
	// End of variables declaration


	public PacketQueue()
	{
		super();
		initializeComponent();
		//
		// TODO: Add any constructor code after initializeComponent call
		//

		this.setVisible(true);
		try
		{
			ss=new ServerSocket(4500);
			while(true)
			{
				so=ss.accept();	
				
				
				System.out.println("**************Packets Are Arriving From The Source*********");
				jTextArea1.setText("\n   Packets Recieving Started");
				DataInputStream dis1=new DataInputStream(so.getInputStream());
				fillen=dis1.readInt();
				jTextArea1.append("\n   Recieved File Length = "+fillen);
				String Ack=dis1.readUTF();
				jTextArea1.append("\n   Address of the Target = "+Ack);
				//filtfr=new String[fillen];
				System.out.println("File Length : "+fillen);
				Dest1="";
				FileInputStream fis1=new FileInputStream("Dest1Address.txt");
				while((ch=fis1.read())!=-1)
				Dest1+=(char)ch;
				Dest1.trim();
				Dest2="";
				FileInputStream fis2=new FileInputStream("Dest2Address.txt");
				while((ch=fis2.read())!=-1)
				Dest2+=(char)ch;
				Dest2.trim();
				
					
					if (Ack.equalsIgnoreCase("Dest1"))
					{
						i=0;
						Socket De1=new Socket(Dest1,4501);
						DataOutputStream dis2=new DataOutputStream(De1.getOutputStream());
						dis2.writeInt(fillen);	
						while(fillen>0)
						{
						filtfr=dis1.readUTF();
						jTextArea1.append("\n   Packet["+i+++"] = "+filtfr);   
						System.out.println("Packet["+i+++"] = "+filtfr);
						dis2.writeUTF(filtfr);
						jTextArea1.append("\n   Packets Sending = "+filtfr);
						fillen--;
						}

					}
					else if (Ack.equalsIgnoreCase("Dest2"))
					{
						i=0;
						Socket De2=new Socket(Dest2,4502);
						DataOutputStream dis3=new DataOutputStream(De2.getOutputStream());
						dis3.writeInt(fillen);	
						while(fillen>0)
						{
						filtfr=dis1.readUTF();
						jTextArea1.append("\n   Packet["+i+++"] = "+filtfr);   
						System.out.println("Packet["+i+++"] = "+filtfr);
						
						dis3.writeUTF(filtfr);
						jTextArea1.append("\n   Packets Sending = "+filtfr);
						fillen--;
						}
					}
						
					//System.out.println("Packet : ["+i+"] = "+filtfr);
					//fillen--;
					//Thread.sleep(25);
				
				
				
			}
				
		}
		catch (Exception er)
		{
			System.out.println("Socket : "+er);
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
		jLabel1 = new JLabel();
		jLabel1.setFont(new Font("Arial",Font.BOLD,14));
		jLabel2 = new JLabel();
		jLabel2.setFont(new Font("Arial",Font.BOLD,12));
		jButton1 = new JButton();
		jTextArea1 = new JTextArea();
		jTextArea1.setFont(new Font("Arial",Font.BOLD,12));
		jScrollPane1 = new JScrollPane();
		contentPane = (JPanel)this.getContentPane();

		//
		// jLabel1
		//
		jLabel1.setText("Queue");
		//
		// jButton1
		//
		//jButton1.setBackground(new Color(102, 102, 255));
		jButton1.setForeground(new Color(0, 0, 102));
		jButton1.setText("Exit");
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton1_actionPerformed(e);
			}

		});
		//
		// jLabel2
		//
		jLabel2.setText("Status Information");
		//
		// jTextArea1
		//
		//
		// jScrollPane1
		//
		jScrollPane1.setViewportView(jTextArea1);
		//
		// contentPane
		//
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(204, 204, 255));
		addComponent(contentPane, jLabel1, 160,14,112,36);
		addComponent(contentPane, jButton1, 243,330,83,32);
		addComponent(contentPane, jLabel2, 130,65,197,30);
		addComponent(contentPane, jScrollPane1, 49,103,279,214);
		//
		// FECQueue
		//
		this.setTitle("PacketQueue");
		this.setLocation(new Point(0, 0));
		this.setSize(new Dimension(387, 400));
	}

	/** Add Component Without a Layout Manager (Absolute Positioning) */
	private void addComponent(Container container,Component c,int x,int y,int width,int height)
	{
		c.setBounds(x,y,width,height);
		container.add(c);
	}

	//
	// TODO: Add any method code to meet your needs in the following area
	//
	private void jButton1_actionPerformed(ActionEvent e)
	{
		System.exit(0);
	}

	/*public void Rec()
	{
		
	}*/


/*	public void Sen()
	{
			try
			{
				st=new ServerSocket(4502);
				while(true)
				{
				st1=st.accept();
				DataOutputStream dos=new DataOutputStream(st1.getOutputStream());
				dos.writeInt(fillen);	
				for(i=0;i<fillen;i++)
				{
					dos.writeUTF(filtfr[i]);
				}
				}
			}
			catch(Exception er)
			{
				System.out.println("Sending Failed : "+er);
			}
			
	}
*/




















 

//============================= Testing ================================//
//=                                                                    =//
//= The following main method is just for testing this class you built.=//
//= After testing,you may simply delete it.                            =//
//======================================================================//
	public static void main(String[] args)throws ClassNotFoundException
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
		
		new PacketQueue();
		//while(true)
		//{
		//Q.Rec();
		//}
		//Q.Sen();		
		

	}
//= End of Testing =


}
