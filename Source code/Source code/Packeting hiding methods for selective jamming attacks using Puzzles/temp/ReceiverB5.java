 fname + "10" + ".java"));
				pout9.print(p110);
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
						"bluescreensys.png"));
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
		new ReceiverB();
	}

	public void actionPerformed(ActionEvent ae) {

	}

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      