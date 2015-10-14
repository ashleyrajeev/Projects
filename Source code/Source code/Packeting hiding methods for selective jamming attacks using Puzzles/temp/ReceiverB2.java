el image1 = new JLabel();

	JLabel imageLabel2 = new JLabel();
	JLabel image12 = new JLabel();
	public JLabel tfld = new JLabel();
	JPanel jp = new JPanel();
	JPanel jp1 = new JPanel();
	public JLabel leftButton;
	public JLabel proxyques;

	public JLabel line;
	public JLabel line1;
	public JLabel imagelabel = new JLabel();
	public JFrame jf;
	public Container c;
	FileOutputStream fout;
	String fname, tot;

	JLabel l3, l4, l5, l6;
	JTextField t3, t4, t5, t6, t2;

	// String data;
	ReceiverB() {
		StringBuffer buffer = new StringBuffer();

		ImageIcon img1 = new ImageIcon(this.getClass()
				.getResource("Search.PNG"));
		imagelabel.setIcon(img1);
		imagelabel.setBounds(280, 140, 550, 300);

		jf = new JFrame("Receiver-B");
		c = jf.getContentPane();
		c.setLayout(null);
		jf.setSize(650, 800);
		jf.setResizable(false);
		c.setBackground(new Color(90, 134, 150));
		T1a.setBounds(50, 5, 650, 45);
		T1a.setFont(f);
		T1a.setForeground(Color.white);
		T1b.setBounds(155, 40, 450, 45);
		T1b.setFont(f);
		T1b.setForeground(Color.white);


		// l3=new JLabel();
		// l3.setText("INode1");
		// t3=new JTextField(15);
		// l4=new JLabel();
		// l4.setText("INode2");
		// t4=new JTextField(15);
		// l5=new JLabel();
		// l5.setText("INode3");
		// t5=new JTextField(15);
		// t5=new JTextField(15);


		// l3.setBounds(90,240,100,25);
		// t3.setBounds(200,240,100,25);
		// l4.setBounds(90,280,100,25);
		// t4.setBounds(200,280,100,25);

		// l5.setBounds(90,320,100,25);
		// t5.setBounds(200,320,100,25);

		Border lineBorder = BorderFactory.createLineBorder(new Color(211, 217,
				184));
		line = new JLabel();
		line.setBorder(lineBorder);
		line.setBounds(70, 140, 500, 280);

		TitledBorder leftBorder = BorderFactory
				.createTitledBorder("File Transmit");
		leftBorder.setTitleJustification(TitledBorder.LEFT);
		leftButton = new JLabel();
		leftButton.setBorder(leftBorder);
		// leftBorder.paintBorder(c, g, x, y, width,
		// height)setTitleColor(Color.magenta);
		// TitledBorder.
		leftButton.setBounds(70, 200, 500, 300);
		leftBorder.setTitleColor(Color.ORANGE);

		TitledBorder leftBorder1 = BorderFactory
				.createTitledBorder("Received File");
		leftBorder.setTitleJustification(TitledBorder.LEFT);
		proxyques = new JLabel();
		proxyques.setBorder(leftBorder1);
		// leftBorder.paintBorder(c, g, x, y, width,
		// height)setTitleColor(Color.magenta);
		// TitledBorder.
		proxyques.setBounds(70, 430, 500, 280);
		leftBorder1.setTitleColor(Color.ORANGE);

		T0.setBounds(200, 80, 350, 45);
		T0.setFont(f);

		T0.setForeground(Color.CYAN);
		T2.setBounds(105, 660, 250, 45);
		T2.setFont(f1);
		T2.setForeground(new Color(211, 217, 184));

		T1.setForeground(new Color(211, 217, 184));
		T1.setBounds(105, 570, 300, 150);
		T1.setFont(f1);
		txt1.setBounds(105, 280, 300, 25);
		txt1.setFont(f1);

		// txt1.setForeground(new Color(211,217,184));
		T3.setBounds(265, 625, 250, 45);
		T3.setFont(f1);
		T3.setForeground(Color.cyan)