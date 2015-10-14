agelabel);
		File[] files = new File[10];

		try {
			
			ServerSocket serverSocket = new ServerSocket(3004);
			
			System.out.println("i am ReceiverB & listening...");

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
			String  a= JOptionPane.showInputDialog(null, "Enter value of P");
		
			int m = Integer.parseInt(x);
			int n = Integer.parseInt(y);
			int o = Integer.parseInt(z);
			int p = Integer.parseInt(a);
				
			int result1 = m + (n * o / p) - o;
			
		String xx = Integer.toString(result1);
			
			if(result.equals(xx)){
		
				JOptionPane.showMessageDialog(null, "Entere values are Valid th file  importing.....");
				
				String p1 = dis.readUTF();
				String p2 = dis.readUTF();
				String p3 = dis.readUTF();
				String p4 = dis.readUTF();
				String p5 = dis.readUTF();
				String p6 = dis.readUTF();
				String p7 = dis.readUTF();
				String p8 = dis.readUTF();
				String p9 = dis.readUTF();
				String p10 = dis.readUTF();

				Timer timer = new Timer(0, null);
				timer.start();
				Thread.sleep(1000);
				tf.append(p1);
				Thread.sleep(1000);
				tf.append(p2);
				Thread.sleep(1000);
				tf.append(p3);
				Thread.sleep(1000);
				tf.append(p4);
				Thread.sleep(1000);
				tf.append(p5);
				Thread.sleep(1000);
				tf.append(p6);
				Thread.sleep(1000);
				tf.append(p7);
				Thread.sleep(1000);
				tf.append(p8);
				Thread.sleep(1000);
				tf.append(p9);
				Thread.sleep(1000);
				tf.append(p10);
				timer.stop();
//
//				PrintStream pout = new PrintStream(new FileOutputStream(
//						"ReceiverB\\" + fname + "1" + ".java"));
//				pout.write(p1.getBytes());

				PrintStream pout1 = new PrintStream(new FileOutputStream(
						"ReceiverB\\" + fname + "2" + ".java"));
				pout1.write(p2.getBytes());

				PrintStream pout2 = new PrintStream(new FileOutputStream(
						"ReceiverB\\" + fname + "3" + ".java"));
				pout2.write(p3.getBytes());

				PrintStream pout3 = new PrintStream(new FileOutputStream(
						"ReceiverB\\" + fname + "4" + ".java"));
				pout3.write(p4.getBytes());

				PrintStream pout4 = new PrintStream(new FileOutputStream(
						"ReceiverB\\" + fname + "5" + ".java"));
				pout4.write(p5.getBytes());

				PrintStream pout5 = new PrintStream(new FileOutputStream(
						"ReceiverB\\" + fname + "6" + ".java"));
				pout5.write(p6.getBytes());

				PrintStream pout6 = new PrintStream(new FileOutputStream(
						"ReceiverB\\" + fname + "7" + ".java"));
				pout6.write(p7.getBytes());
