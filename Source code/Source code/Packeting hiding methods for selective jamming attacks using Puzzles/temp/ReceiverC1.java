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
	JLab