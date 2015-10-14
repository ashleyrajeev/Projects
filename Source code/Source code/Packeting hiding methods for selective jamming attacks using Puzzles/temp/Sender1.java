import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
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
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
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
	public JButton puzzlebtn = new JButton("Assign Puzzle");

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