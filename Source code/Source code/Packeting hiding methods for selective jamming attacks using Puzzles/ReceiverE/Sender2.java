JLabel ip1;
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
		c.