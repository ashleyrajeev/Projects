\" + fname + "5" + ".java"));
					pout4.write(p51.getBytes());

					PrintStream pout5 = new PrintStream(new FileOutputStream(
							"ReceiverB\\" + fname + "6" + ".java"));
					pout5.write(p61.getBytes());

					PrintStream pout6 = new PrintStream(new FileOutputStream(
							"ReceiverB\\" + fname + "7" + ".java"));
					pout6.write(p71.getBytes());

					PrintStream pout7 = new PrintStream(new FileOutputStream(
							"ReceiverB\\" + fname + "8" + ".java"));
					pout7.write(p81.getBytes());

					PrintStream pout8 = new PrintStream(new FileOutputStream(
							"ReceiverB\\" + fname + "9" + ".java"));
					pout8.write(p91.getBytes());

					PrintStream pout9 = new PrintStream(new FileOutputStream(
							"ReceiverB\\" + fname + "10" + ".java"));
					pout9.print(p110);
					for (int i = 1; i <= 10; i++) {
						String fname1 = "ReceiverB\\" + fname
								+ String.valueOf(i) + ".java";
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

				}

				else {

					JOptionPane
							.showMessageDialog(null,
									"Puzzle Solved FAIL \n  You are a File Attacker...");

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String args[]) {
		new ReceiverD();
	}

	public void actionPerformed(ActionEvent ae) {

	}

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             