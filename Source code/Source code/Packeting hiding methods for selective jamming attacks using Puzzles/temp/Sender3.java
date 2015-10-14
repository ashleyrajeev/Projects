zlebtn);

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
		c.add(p88);
		c.add(p99);
		c.add(p100);

		c.add(imageLabel);
		split.addActionListener(this);
		puzzlebtn.addActionListener(this);
		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent win) {
				System.exit(0);
			}
		});

	}

	/*
	 * public File[] split(File source, int noFile, int lsize) {
	 * 
	 * int FRG_FSIZE = 0; FRG_FSIZE = 1024 * 5; File[] fileFragments = new
	 * File[noFile]; String[] frgfName = new String[noFile]; try { String
	 * sourceFName = source.getName(); long sourceFSize = source.length();
	 * FileInputStream fis = new FileInputStream(source);
	 * 
	 * String Fileinfo = new String(sourceFName + "," +
	 * String.valueOf(sourceFSize)); System.out.println(noFile); if (lsize != 0)
	 * { noFile--; } System.out.println(noFile); sourceFName = sourceFName
	 * .substring(0, sourceFName.lastIndexOf(".")); int j = 0; for (int i = 1; i
	 * <= noFile; i++) {
	 * 
	 * if (i == 1) {
	 * 
	 * frgfName[i - 1] = "temp\\" + sourceFName + String.valueOf(i) + ".java";
	 * 
	 * p1.setText(String.valueOf(frgfName)); c.add(p1); } frgfName[i - 1] =
	 * "temp\\" + sourceFName + String.valueOf(i) + ".java"; fileFragments[i -
	 * 1] = new File(frgfName[i - 1]);
	 * 
	 * FileOutputStream fos = new FileOutputStream( fileFragments[i - 1]);
	 * byte[] data = new byte[FRG_FSIZE]; int count = fis.read(data);
	 * fos.write(data); fos.close(); String frgFileInfo = new String(frgfName[i
	 * - 1] + String.valueOf(FRG_FSIZE)); } if (lsize != 0) {
	 * System.out.println(noFile); frgfName[noFile] = "temp\\" + sourceFName +
	 * String.valueOf(noFile + 1) + ".java"; fileFragments[noFile] = new
	 * File(frgfName[noFile]); FileOutputStream fos = new FileOutputStream(
	 * fileFragments[noFile]); byte[] data = new byte[lsize]; int count =
	 * fis.read(data); fos.write(data); fos.close(); String frgFileInfo = new
	 * String(frgfName[noFile] + String.valueOf(lsize)); }
	 * 
	 * } catch (Exception e) {
	 * 
	 * System.out.println("Error in Splitting" + e);
	 * JOptionPane.showMessageDialog(null, "Error in Splitting File \n" +
	 * e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); return null; }
	 * return fileFragments;
	 * 
	 * }
	 */

	public void actionPerformed(ActionEvent e) {

		DataInputStream input;

		BufferedInputStream bis;
		BufferedOutputStream bos = null;
		BufferedWriter writer = null;
		int in;
		byte[] byteArray;

		String strLine = null;
		String newline = "\n";
		if (e.getSource() == btn1) {
			JFileChooser chooser = new JFileChooser();

			// Set the current directory to the application's current directory
			try {

				// Create a File object containing the canonical path of the
				// desired file
				File f = new File(new File("filename.txt").getCanonicalP