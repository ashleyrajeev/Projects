f(i) + ".java";

						Thread.sleep(100);
						p77.setText(pname);

						c.add(p77);

					}

					if (i == 8) {

						pname = sourceFName + String.valueOf(i) + ".java";

						Thread.sleep(100);
						p88.setText(pname);

						c.add(p88);

					}

					if (i == 9) {

						pname = sourceFName + String.valueOf(i) + ".java";

						Thread.sleep(100);
						p99.setText(pname);

						c.add(p99);

					}

					if (i == 10) {

						pname = sourceFName + String.valueOf(i) + ".java";

						Thread.sleep(100);

						p100.setText(pname);

						c.add(p100);

					}

					frgfName[i - 1] = "temp\\" + sourceFName
							+ String.valueOf(i) + ".java";
					fileFragments[i - 1] = new File(frgfName[i - 1]);

					FileOutputStream fos = new FileOutputStream(
							fileFragments[i - 1]);
					byte[] data = new byte[FRG_FSIZE];
					int count = fis.read(data);
					fos.write(data);
					fos.close();
					String frgFileInfo = new String(frgfName[i - 1]
							+ String.valueOf(FRG_FSIZE));
				}
				timer.stop();

				if (lsize != 0) {
					System.out.println(noFile);

					pname = sourceFName + String.valueOf(noFile + 1) + ".java";

					p100.setText(pname);
					c.add(p100);

					frgfName[noFile] = "temp\\" + sourceFName
							+ String.valueOf(noFile + 1) + ".java";
					fileFragments[noFile] = new File(frgfName[noFile]);
					FileOutputStream fos = new FileOutputStream(
							fileFragments[noFile]);
					byte[] data = new byte[lsize];
					int count = fis.read(data);
					fos.write(data);
					fos.close();
					String frgFileInfo = new String(frgfName[noFile]
							+ String.valueOf(lsize));
				}

			} catch (Exception ex) {

				System.out.println("Error in Splitting" + e);
				JOptionPane.showMessageDialog(null,
						"Error in Splitting File \n" + ex.getMessage(),
						"Error", JOptionPane.ERROR_MESSAGE);

			}

		}

		if (e.getSource() == puzzlebtn) {

			String A = JOptionPane
					.showInputDialog(null, "Enter the value of M");
			String B = JOptionPane
					.showInputDialog(null, "Enter the value of N");
			String C = JOptionPane
					.showInputDialog(null, "Enter the value of O");
			String D = JOptionPane
					.showInputDialog(null, "Enter the value of P");

			m = Integer.parseInt(A);
			n = Integer.parseInt(B);
			o = Integer.parseInt(C);
			p = Integer.parseInt(D);

			vresult = m + (n * o / p) - o;

			puzzle = " m+n(*o/p)-o ";

			System.out.println(puzzle + "result " + vresult);

			try {

				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection connect = DriverManager
						.getConnection("jdbc:odbc:Puzzle");
				Statement st = connect.createStatement();

				String sql = " insert into Puzzle values" + " ( '" + puzzle
						+ "','" + m + "','" + n + "' ,'" + o + "' ,'" + p
						+ "','" + vresult + "') ";

				st.executeUpdate(sql);

				System.out.println("inserted to db");
			} catch (Exception ex) {
				System.out.println(ex);
			}
		}

		if (e.getSource() == btn)