
				PrintStream pout7 = new PrintStream(new FileOutputStream(
						"ReceiverB\\" + fname + "8" + ".java"));
				pout7.write(p8.getBytes());

				PrintStream pout8 = new PrintStream(new FileOutputStream(
						"ReceiverB\\" + fname + "9" + ".java"));
				pout8.write(p9.getBytes());

				PrintStream pout9 = new PrintStream(new FileOutputStream(
						"ReceiverB\\" + fname + "10" + ".java"));
				pout9.print(p10);

				for (int i = 1; i <= 10; i++) {
					String fname1 = "ReceiverB\\" + fname + String.valueOf(i)
							+ ".java";
					files[i - 1] = new File(fname1);
				}

				File outFile = new File("ReceiverB/" + fname + ".java");

				FileOutputStream fileOS = new FileOutputStream(outFile);

				for (int i = 0; i < files.length; i++) {
					FileInputStream fileIS = new FileInputStream(files[i]);
					byte[] data = new byte[(int) files[i].length()];
					int count = fileIS.read(data);
					fileOS.write(data);
					fileIS.close();

					tf.append(data.toString());
					
				}

				ImageIcon img11 = new ImageIcon(this.getClass().getResource(
						"GreenComputer.PNG"));
				imagelabel.setIcon(img11);
				imagelabel.setBounds(280, 140, 550, 300);

			}

			
			else {
				
				JOptionPane.showMessageDialog(null, "Entered valuea are not valid \n  You are treated as a Attacker...");
				
			}	
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String args[]) {
		new ReceiverE();
	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == Display) {

			try {

				String spack = t1.getText();
				String sip = t2.getText();

				Socket sd = new Socket("localhost", 10003);

				DataOutputStream dos = new DataOutputStream(sd
						.getOutputStream());

				dos.writeUTF(spack);
				dos.writeUTF(sip);

				DataInputStream dis = new DataInputStream(sd.getInputStream());
				String rpack = dis.readUTF();
				String ip = dis.readUTF();

				t2.setText(ip);

			} catch (Exception e) {
				System.out.println(e);

			}

		}

		else if (ae.getSource() == Register) {
			try {

				String uip = t2.getText();
				String pno = "501";
				String Node = "B";

				Socket su = new Socket("localhost", 10001);

				DataOutputStream dos = new DataOutputStream(su
						.getOutputStream());

				dos.writeUTF(t1.getText());
				dos.writeUTF(t2.getText());
				dos.writeUTF(pno);
				dos.writeUTF(Node);

			} catch (Exception e) {
				System.out.println(e);
			}

		}

	}

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        