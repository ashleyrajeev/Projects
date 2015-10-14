uzzle = dis.readUTF();
				String result = dis.readUTF();

				JOptionPane.showMessageDialog(null,
						"The Puzzle sent by Surce is  :'" + puzzle
								+ "' \n and Result is='" + result + "' ");

				String x = JOptionPane
						.showInputDialog(null, "Enter value of M");
				String y = JOptionPane
						.showInputDialog(null, "Enter value of N");
				String z = JOptionPane
						.showInputDialog(null, "Enter value of O");
				String a = JOptionPane
						.showInputDialog(null, "Enter value of P");

				int m = Integer.parseInt(x);
				int n = Integer.parseInt(y);
				int o = Integer.parseInt(z);
				int p = Integer.parseInt(a);

				int result1 = m + (n * o / p) - o;

				String xx = Integer.toString(result1);

				if (result.equals(xx)) {

					JOptionPane.showMessageDialog(null,
							"Puzzle Solved Successfully !!! File is Accessing......");

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

					ENCDEC dec = new ENCDEC();
					
					String p11= dec.decrypt(p1);
					String p21= dec.decrypt(p2);
					String p31= dec.decrypt(p3);
					String p41= dec.decrypt(p4);
					String p51= dec.decrypt(p5);
					String p61= dec.decrypt(p6);
					String p71= dec.decrypt(p7);
					String p81= dec.decrypt(p8);
					String p91= dec.decrypt(p9);
					String p110= dec.decrypt(p10);
					
					
					Timer timer = new Timer(0, null);
					timer.start();
					Thread.sleep(1000);
					tf.append(p11);
					Thread.sleep(1000);
					tf.append(p21);
					Thread.sleep(1000);
					tf.append(p31);
					Thread.sleep(1000);
					tf.append(p41);
					Thread.sleep(1000);
					tf.append(p51);
					Thread.sleep(1000);
					tf.append(p61);
					Thread.sleep(1000);
					tf.append(p71);
					Thread.sleep(1000);
					tf.append(p81);
					Thread.sleep(1000);
					tf.append(p91);
					Thread.sleep(1000);
					tf.append(p110);
					timer.stop();
					
					
					ImageIcon img11 = new ImageIcon(this.getClass().getResource(
					"bluescreensys.png"));
			imagelabel.setIcon(img11);
			imagelabel.setBounds(150, 140, 550, 300);
	//
//					PrintStream pout = new PrintStream(new FileOutputStream(
//							"ReceiverB\\" + fname + "1" + ".java"));
//					pout.write(p1.getBytes());

					PrintStream pout1 = new PrintStream(new FileOutputStream(
							"ReceiverB\\" + fname + "2" + ".java"));
					pout1.write(p21.getBytes());

					PrintStream pout2 = new PrintStream(new FileOutputStream(
							"ReceiverB\\" + fname + "3" + ".java"));
					pout2.write(p31.getBytes());

					PrintStream pout3 = new PrintStream(new FileOutputStream(
							"ReceiverB\\" + fname + "4" + ".java"));
					pout3.write(p41.getBytes());

					PrintStream pout4 = new PrintStream(new FileOutputStream(
							"ReceiverB\