
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

	int m, n, o, p, vresult;
	String puzzle;

	Sender() {

		JLabel imageLabel = new JLabel();
		ImageIcon ii = new ImageIcon(this.getClass().getResource(
				"Banner.png"));
		imageLabel.setIcon(ii);
		imageLabel.setBounds(50, 0, 1100, 150);

		jf = new JFrame(
				"Packeting hiding methods for selective jamming attacks Using Puzzles :  SENDER");
		c = jf.getContentPane();
		c.setLayout(null);
		jf.setBounds(35,20,900, 670);

		c.setBackground(Color.PINK);
		T2.setBounds(200, 140, 250, 45);
		T2.setFont(f3);
		// T2.setForeground(new Color(120,120,0));
		// T2.setForeground(Color.BLUE);
		timer = new Timer(0, null);

		T1.setForeground(Color.MAGENTA);
		T2.setForeground(new Color(10, 120, 7));
		T3.setForeground(new Color(10, 120, 7));
		btn1.setBounds(500, 150, 230, 45);
		btn1.setFont(f3);
		btn1.setForeground(Color.BLACK);

		T1.setBounds(100, 40, 950, 45);

		p1.setBounds(700, 270, 950, 45);
		p2.setBounds(700, 300, 950, 45);
		p3.setBounds(700, 330, 950, 45);
		p4.setBounds(700, 360, 950, 45);
		p5.setBounds(700, 390, 950, 45);
		p6.setBounds(700, 420, 950, 45);
		p7.setBounds(700, 450, 950, 45);
		p8.setBounds(700, 480, 950, 45);
		p9.setBounds(700, 510, 950, 45);
		p10.setBounds(700, 540, 950, 45);

		p11.setBounds(800, 270, 950, 45);
		p22.setBounds(800, 300, 950, 45);
		p33.setBounds(800, 330, 950, 45);
		p44.setBounds(800, 360, 950, 45);
		p55.setBounds(800, 390, 950, 45);
		p66.setBounds(800, 420, 950, 45);
		p77.setBounds(800, 450, 950, 45);
		p88.setBounds(800, 480, 950, 45);
		p99.setBounds(800, 510, 950, 45);
		p100.setBounds(800, 540, 950, 45);

		// T1.setForeground(new Color(170,5,5));
		TAreu.setBounds(550, 550, 200, 35);
		btn.setBounds(450, 550, 130, 45);

		puzzlebtn.setBounds(70, 550, 150, 45);
		split.setBounds(250, 550, 130, 45);
		T1.setFont(f1);
		btn.setFont(f3);

		TF.setBounds(400, 210, 430, 45);
		TF.setBackground(new Color(223, 225, 245));
		TF.setForeground(Color.BLUE);
		TF.setFont(f3a);
		// T3.setForeground(Color.BLUE);
		T3.setBounds(200, 210, 250, 45);
		T3.setFont(f3);
		btn.setForeground(Color.BLACK);
		TAreu.addItem("Mesh Route");
		TAreu.addItem(" Node ");
		TAreu.setFont(f3);
		TAreu.setBackground(Color.WHITE);
		TAreu.setForeground(Color.BLUE);
		pane.setBounds(130, 300, 560, 200);

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
		// c.add(T1);

		c.add(btn);
		c.add(T2);
		c.add(T3);
		c.add(TF);
		c.add(pane, BorderLayout.CENTER);
		c.add(btn1);
		c.add(split);
		c.add(puz