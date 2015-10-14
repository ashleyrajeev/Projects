;

		T4.setBounds(255, 660, 350, 45);
		T4.setFont(f1);
		T4.setForeground(Color.RED);

		T5.setBounds(125, 590, 250, 45);
		T5.setFont(f3);
		T5.setForeground(new Color(211, 217, 184));
		txt2.setBounds(220, 595, 250, 30);
		txt2.setForeground(Color.BLUE);
		txt2.setFont(f1);
		// T6.setBounds(760, 70, 400,35);
		// T6.setFont(f2);
		// T6.setForeground(Color.RED);

		// T7.setBounds(760, 110, 400,35);
		// T7.setFont(f2);
		// T7.setForeground(Color.MAGENTA);

		btn.setBounds(220, 720, 220, 30);
		btn.setFont(f3);
		btn.setForeground(new Color(120, 0, 0));
		btn1.setBounds(420, 277, 120, 30);
		btn1.setFont(f3);
		btn1.setForeground(new Color(120, 0, 0));
		btn2.setBounds(420, 650, 120, 30);
		btn2.setFont(f3);
		btn2.setForeground(new Color(120, 0, 0));

		jp.setBounds(85, 110, 850, 550);
		jp.setBackground(new Color(211, 217, 184));

		jp1.setBounds(80, 105, 860, 560);
		// jp1.setBackground(Color.BLACK);

		receive.setBounds(445, 720, 250, 45);
		receive.setForeground(Color.RED);

		txt.setBounds(260, 150, 180, 25);
		txt.setForeground(Color.BLUE);
		txt.setFont(f1);
		TAreu.setBounds(650, 550, 200, 35);

		TAreu.addItem("Mesh Route");
		TAreu.addItem(" Node ");
		TAreu.setFont(f3);
		// TAreu.setBackground(Color.WHITE);
		TAreu.setForeground(Color.BLUE);
		TAreu.setFont(f);
		pane.setBounds(115, 470, 400, 200);

		tf.setColumns(20);

		tf.setForeground(Color.MAGENTA);
		tf.setFont(f1);
		tf.setRows(10);
		tf.setName("tf");
		pane.setName("pane");
		pane.setViewportView(tf);
		tfld.setBounds(410, 160, 200, 30);
		tfld.setFont(f2);
		tfld.setForeground(new Color(120, 0, 0));
		// btn1.addActionListener(this);
		btn.addActionListener(this);

		btn1.setMnemonic(KeyEvent.VK_B);
		btn.setMnemonic(KeyEvent.VK_S);
		jf.show();

		c.add(T1a);
		c.add(T1b);
		// c.add(T1);
		// c.add(T2);
		c.add(line);
		c.add(receive);
		// c.add(btn);
		// c.add(T3);
		// c.add(T4);
	

		// c.add(l3);c.add(t3);
		// c.add(l4);c.add(t4);
		// c.add(l5);c.add(t5);

		c.add(pane, BorderLayout.CENTER);

		c.add(T0);
		c.add(proxyques);

		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent win) {
				System.exit(0);
			}
		});

		c.add(imagelabel);
		File[] files = new File[10];

		try {
			
			ServerSocket serverSocket = new ServerSocket(10000);
			
			System.out.println("i am Receiver B & listening...");

			while (true) {
				socket = serverSocket.accept();
				DataInputStream dis = new DataInputStream(socket
						.getInputStream());
				String fname = dis.readUTF();
				String puzzle = dis.readUTF();
				String result= dis.readUTF();
	
			JOptionPane.showMessageDialog(null, "The Puzzle sent by Surce is  :'"+puzzle+"' \n and Result is='"+result+"' ");
			
			String  x= JOptionPane.showInputDialog(null, "Enter value of M");
			String  y= JOptionPane.showInputDialog(null, "Enter value of N");
			String  z= JOptionPane.showInputDialog(null, "Enter value of O");
			String  a= JOptionPane.sho