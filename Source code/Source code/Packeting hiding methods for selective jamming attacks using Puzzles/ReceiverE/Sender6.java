    
			                    c.add(p99);
			                  
			                	}
			                	 
			                	if(i==10)
			                	{
			                	
			                    pname=sourceFName + String.valueOf(i)+".java";
			                   
								Thread.sleep(100);
			                    
			                    p100.setText(pname);
			                    
			                    
			                    c.add(p100);
			                  
			                	}
			                	
			                    frgfName[i-1] ="temp\\"+sourceFName + String.valueOf(i)+".java";  
			                    fileFragments[i-1] = new File(frgfName[i-1]);  
			                     
			                    FileOutputStream fos = new FileOutputStream(fileFragments[i - 1]);  
			                    byte[] data = new byte[FRG_FSIZE];  
			                    int count = fis.read(data);  
			                    fos.write(data);  
			                    fos.close();  
			                    String frgFileInfo = new String(frgfName[i-1] +  String.valueOf(FRG_FSIZE));  
			                } 
			                timer.stop();
			               
			                if (lsize != 0) {                      
			                    System.out.println(noFile);  
			                    
			                	
			                    pname=sourceFName + String.valueOf(noFile+1)+".java";
			                    
			                    
			                    p100.setText(pname);
			                    c.add(p100);
			                	
			                	
			                    
			                    frgfName[noFile] ="temp\\"+sourceFName + String.valueOf(noFile+1)+".java";  
			                    fileFragments[noFile] = new File(frgfName[noFile]);  
			                    FileOutputStream fos = new FileOutputStream(fileFragments[noFile]);  
			                    byte[] data = new byte[lsize];  
			                    int count = fis.read(data);  
			                    fos.write(data);  
			                    fos.close();  
			                    String frgFileInfo = new String(frgfName[noFile] +  String.valueOf(lsize));  
			                }  
			  
			               } catch (Exception ex) {  
			                        
			                   System.out.println("Error in Splitting"+e);  
			                    JOptionPane.showMessageDialog(null, "Error in Splitting File \n"+ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);  
			                      
			               }  
			    
			               
					
				 
				 
			 }
			 
			 if(e.getSource()== btn)
			 {
			
				 String[] node = { "Select Node", "B", "C", "D", "E" };
					
					
				    String fname = JOptionPane.showInputDialog(null, "Enter the File Name");
				    String rname = (String) JOptionPane.showInputDialog(null,
							"Select Destination Node", "node",
							JOptionPane.QUESTION_MESSAGE, null, node, node[0]);
					
					String ip = JOptionPane.showInputDialog(null, "Please Ent