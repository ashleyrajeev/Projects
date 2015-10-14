am fis9 = new FileInputStream("temp/"
						+ p100.getText());
				byte b9[] = new byte[fis9.available()];
				fis9.read(b9);
				String content9 = new String(b9);
				System.out.println(content9);
				System.out.println("------10 END HERE");

				ENCDEC enc = new  ENCDEC();
				
				String content11=enc.encrypt(content);
				String content22 = enc.encrypt(content1);
				String content33 = enc.encrypt(content2);
				String content44 = enc.encrypt(content3);
				String content55 = enc.encrypt(content4);
				String content66 = enc.encrypt(content5);
				String content77 = enc.encrypt(content6);
				String content88 = enc.encrypt(content7);
				String content99 = enc.encrypt(content8);
				String content110 = enc.encrypt(content9);
				
				if (rname.equals("B")) {
					socket1 = new Socket("localhost", 10000);
					dos1 = new DataOutputStream(socket1.getOutputStream());

					dos1.writeUTF(fname);
					dos1.writeUTF(puzzle);
					dos1.writeUTF(result);
					dos1.writeUTF(content11);
					dos1.writeUTF(content22);
					dos1.writeUTF(content33);
					dos1.writeUTF(content44);
					dos1.writeUTF(content55);
					dos1.writeUTF(content66);
					dos1.writeUTF(content77);
					dos1.writeUTF(content88);
					dos1.writeUTF(content99);
					dos1.writeUTF(content110);

				}
				if (rname.equals("C")) {
					socket1 = new Socket("localhost", 3002);
					dos1 = new DataOutputStream(socket1.getOutputStream());

					dos1.writeUTF(fname);
					dos1.writeUTF(puzzle);
					dos1.writeUTF(result);
					dos1.writeUTF(content11);
					dos1.writeUTF(content22);
					dos1.writeUTF(content33);
					dos1.writeUTF(content44);
					dos1.writeUTF(content55);
					dos1.writeUTF(content66);
					dos1.writeUTF(content77);
					dos1.writeUTF(content88);
					dos1.writeUTF(content99);
					dos1.writeUTF(content110);
					
				}
				if (rname.equals("D")) {
					socket1 = new Socket("localhost", 3003);
					dos1 = new DataOutputStream(socket1.getOutputStream());

					dos1.writeUTF(fname);
					dos1.writeUTF(puzzle);
					dos1.writeUTF(result);
					dos1.writeUTF(content11);
					dos1.writeUTF(content22);
					dos1.writeUTF(content33);
					dos1.writeUTF(content44);
					dos1.writeUTF(content55);
					dos1.writeUTF(content66);
					dos1.writeUTF(content77);
					dos1.writeUTF(content88);
					dos1.writeUTF(content99);
					dos1.writeUTF(content110);
				}

				if (rname.equals("E")) {

					socket1 = new Socket("localhost", 3004);
					dos1 = new DataOutputStream(socket1.getOutputStream());

					dos1.writeUTF(fname);
					dos1.writeUTF(puzzle);
					dos1.writeUTF(result);
					dos1.writeUTF(content11);
					dos1.writeUTF(content22);
					dos1.writeUTF(content33);
					dos1.writeUTF(content44);
					dos1.writeUTF(content55);
					dos1.writeUTF(content66);
					dos1.writeUTF(content77);
					dos1.writeUTF(content88);
					dos1.writeUTF(content99);
					dos1.writeUTF(content110);

				}

			} catch (Exception ex) {
				ex.printStackTrace();

			}

		}