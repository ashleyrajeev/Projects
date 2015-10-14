ath());

				// Set the selected file
				chooser.setSelectedFile(f);

			} catch (IOException e1) {
			}

			// Show the dialog; wait until dialog is closed
			chooser.showOpenDialog(btn1);
			int retval = chooser.showOpenDialog(btn1);
			if (retval == JFileChooser.APPROVE_OPTION) {
				field = chooser.getSelectedFile();
				path = field.getAbsolutePath();
				TF.setText(field.getAbsolutePath());
			}
			// Get the currently selected file
			curFile = chooser.getSelectedFile();

			try {
				// Open the file that is the first
				// command line parameter
				FileInputStream fstream = new FileInputStream(curFile);
				// Get the object of DataInputStream
				DataInputStream ins = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(new InputStreamReader(
						ins));

				StringBuffer buffer = new StringBuffer();

				while ((strLine = br.readLine()) != null) {
					// Print the content on the console
					System.out.println(strLine);
					buffer.append(strLine + "\n");

				}
				tf.setText(buffer.toString());

				//				   
			} catch (Exception e1) {// Catch exception if any
				System.err.println("Error: " + e1.getMessage());
			}
		}

		if (e.getSource() == split) {
			int noFile = 10;
			File source = curFile;
			int lsize = 1024;
			int FRG_FSIZE = 0;
			String pname;
			FRG_FSIZE = 1024 * 3;
			File[] fileFragments = new File[noFile];
			String[] frgfName = new String[noFile];
			try {
				String sourceFName = source.getName();
				long sourceFSize = source.length();
				FileInputStream fis = new FileInputStream(source);

				String Fileinfo = new String(sourceFName + ","
						+ String.valueOf(sourceFSize));
				System.out.println(noFile);
				if (lsize != 0) {
					noFile--;
				}
				System.out.println(noFile);
				sourceFName = sourceFName.substring(0, sourceFName
						.lastIndexOf("."));
				int j = 0;

				for (int i = 1; i <= noFile; i++) {
					timer.start();
					if (i == 1) {

						pname = sourceFName + String.valueOf(i) + ".java";

						Thread.sleep(100);

						p11.setText(pname);

						c.add(p11);

					}

					if (i == 2) {

						pname = sourceFName + String.valueOf(i) + ".java";

						Thread.sleep(100);
						p22.setText(pname);
						c.add(p22);

					}

					if (i == 3) {

						pname = sourceFName + String.valueOf(i) + ".java";

						Thread.sleep(100);
						p33.setText(pname);

						c.add(p33);

					}

					if (i == 4) {

						pname = sourceFName + String.valueOf(i) + ".java";

						Thread.sleep(100);
						p44.setText(pname);

						c.add(p44);

					}

					if (i == 5) {

						pname = sourceFName + String.valueOf(i) + ".java";

						Thread.sleep(100);
						p55.setText(pname);

						c.add(p55);

					}

					if (i == 6) {

						pname = sourceFName + String.valueOf(i) + ".java";

						Thread.sleep(100);
						p66.setText(pname);

						c.add(p66);

					}

					if (i == 7) {

						pname = sourceFName + String.valueO