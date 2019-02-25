	import java.io.File;
	import java.io.FileNotFoundException;
	import java.text.SimpleDateFormat;
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;
	import java.util.concurrent.CopyOnWriteArrayList;
	import java.util.Date;
public class Main {

		

		public static void main(String args[]) throws Exception {
		
		
		CopyOnWriteArrayList<Admin> adminList =new CopyOnWriteArrayList<Admin>();
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		ArrayList<Technician> techList = new ArrayList<Technician>();
		ArrayList<Person> adtechList = new ArrayList<Person>(); 
		//ArrayList<Item> itemList = new ArrayList<Item>();
		ArrayList<Campaign> cmpList = new ArrayList<Campaign>();
		ArrayList<ShoppingCart> cartList = new ArrayList<ShoppingCart>();
		ArrayList<Orders> orderList = new ArrayList<Orders>();
		CopyOnWriteArrayList<Item> itemList =new CopyOnWriteArrayList<Item>();
		
		int customerID = 0;
		Customer.Status status=Customer.Status.CLASSIC;
		
		//Read user inputs
		try {
			
			Scanner read_file = new Scanner(new File(args[0]));
			while(read_file.hasNextLine()){
			String line = read_file.nextLine();
			String[] sKey = line.split("\t");
			if(new String("ADMIN").equals(sKey[0])){
				
					Admin admin = new Admin(sKey[1],sKey[2],sKey[3],Double.parseDouble(sKey[4]),sKey[5]);
					adminList.add(admin);	
					adtechList.add(admin);
					
					
			}
			else if(new String("CUSTOMER").equals(sKey[0])){
				
					customerID++;
					Customer cst = new Customer(sKey[1],sKey[2],sKey[3],customerID,Double.parseDouble(sKey[4]),sKey[5],status);
					customerList.add(cst);
					
					
				
			}
			else if(new String("TECH").equals(sKey[0])){
				
				Technician tech = new Technician(sKey[1],sKey[2],sKey[3],Double.parseDouble(sKey[4]),Integer.parseInt(sKey[5]));
				techList.add(tech);
				adtechList.add(tech);
				
					
			}
			
			}
			read_file.close();
			} catch (FileNotFoundException ex) {
			System.out.println("No File Found!");
			return;
			
			
			}
		
		//Items ID
		int itemID=0;
		//Stocks of items
		int stockBook=0;
		int stockCDDVD=0;
		int stockLaptop=0;
		int stockDesktop=0;
		int stockTV=0;
		int stockTablet=0;
		int stockSmartphone=0;
		int stockHair=0;
		int stockSkin=0;
		int stockPerfume=0;
		

		
		
		
		//Read items input
		try {
			
			Scanner read_file1 = new Scanner(new File(args[1]));
			while(read_file1.hasNextLine()){
			String line1 = read_file1.nextLine();
			String[] sKey1 = line1.split("\t");
			if(new String("BOOK").equals(sKey1[0])){
				
				//Stock and Item ID increased one
				stockBook++;
				itemID++;
			
				Book book = new Book("BOOK",itemID,Double.parseDouble(sKey1[1]),stockBook,
						Integer.parseInt(sKey1[2]), sKey1[3],sKey1[4],sKey1[5],Integer.parseInt(sKey1[6]));
				itemList.add(book);
					
							
			}
			else if(new String("CDDVD").equals(sKey1[0])){
				
				
				//Stock and Item ID increased one
				stockCDDVD++;
				itemID++;
				
				CDDVD cddvd = new CDDVD("CDDVD",itemID,Double.parseDouble(sKey1[1]),stockCDDVD,
						Integer.parseInt(sKey1[2]), sKey1[3],sKey1[4],sKey1[5]);
				itemList.add(cddvd);
				
			}
			else if(new String("DESKTOP").equals(sKey1[0])){
				
				//Stock and Item ID increased one
				stockDesktop++;
				itemID++;
				
				Desktop dsktp = new Desktop("DESKTOP",itemID, Double.parseDouble(sKey1[1]), stockDesktop, sKey1[2], sKey1[3], Integer.parseInt(sKey1[4]),
						Integer.parseInt(sKey1[5]), sKey1[6], sKey1[7], Integer.parseInt(sKey1[8]), Integer.parseInt(sKey1[9]), sKey1[10]);
				itemList.add(dsktp);
						
			}
			else if(new String("LAPTOP").equals(sKey1[0])){
				
				//Stock and Item ID increased one
				stockLaptop++;
				itemID++;
				
				Laptop laptop = new Laptop("LAPTOP",itemID, Double.parseDouble(sKey1[1]), stockLaptop, sKey1[2], sKey1[3], Integer.parseInt(sKey1[4]),
						Integer.parseInt(sKey1[5]), sKey1[6], sKey1[7],
						Integer.parseInt(sKey1[8]), Integer.parseInt(sKey1[9]), Integer.parseInt(sKey1[10]));
				itemList.add(laptop);
						
			}
			else if(new String("TABLET").equals(sKey1[0])){
				
				//Stock and Item ID increased one
				stockTablet++;
				itemID++;
				
				Tablet tablet = new Tablet("TABLET",itemID, Double.parseDouble(sKey1[1]), stockTablet, sKey1[2], sKey1[3], Integer.parseInt(sKey1[4]),
						Integer.parseInt(sKey1[5]), sKey1[6], sKey1[7], Integer.parseInt(sKey1[8]), 
						Integer.parseInt(sKey1[9]), Integer.parseInt(sKey1[10]));
				itemList.add(tablet);
						
			}
			else if(new String("TV").equals(sKey1[0])){
				
				//Stock and Item ID increased one
				stockTV++;
				itemID++;
				
				TV tv = new TV("TV",itemID, Double.parseDouble(sKey1[1]), stockTV, sKey1[2], sKey1[3], Integer.parseInt(sKey1[4]),
						Integer.parseInt(sKey1[5]), Integer.parseInt(sKey1[6]));
				itemList.add(tv);
						
			}
			else if(new String("SMARTPHONE").equals(sKey1[0])){
				
				//Stock and Item ID increased one
				stockSmartphone++;
				itemID++;
				
				Smartphone sp = new Smartphone("SMARTPHONE",itemID, Double.parseDouble(sKey1[1]), stockSmartphone, sKey1[2], sKey1[3], Integer.parseInt(sKey1[4]),
						Integer.parseInt(sKey1[5]),sKey1[6]);
				itemList.add(sp);
						
			}
			else if(new String("HAIRCARE").equals(sKey1[0])){
				
				//Stock and Item ID increased one
				stockHair++;
				itemID++;
				
				HairCare hc = new HairCare("HAIRCARE",itemID, stockHair, Double.parseDouble(sKey1[1]), sKey1[2], sKey1[3], Integer.parseInt(sKey1[4]),
						Integer.parseInt(sKey1[5]),Integer.parseInt(sKey1[6]),Integer.parseInt(sKey1[7]));
				itemList.add(hc);
						
			}
			else if(new String("SKINCARE").equals(sKey1[0])){
				
				//Stock and Item ID increased one
				stockSkin++;
				itemID++;
				
				SkinCare sc = new SkinCare("SKINCARE",itemID, stockSkin, Double.parseDouble(sKey1[1]), sKey1[2], sKey1[3], Integer.parseInt(sKey1[4]),
						Integer.parseInt(sKey1[5]),Integer.parseInt(sKey1[6]),Integer.parseInt(sKey1[7]));
				itemList.add(sc);
						
			}
			else if(new String("PERFUME").equals(sKey1[0])){
				
				//Stock and Item ID increased one
				stockPerfume++;
				itemID++;
				
				Perfume prfm = new Perfume("PERFUME",itemID, stockPerfume, Double.parseDouble(sKey1[1]), sKey1[2], sKey1[3], Integer.parseInt(sKey1[4]),
						Integer.parseInt(sKey1[5]),Integer.parseInt(sKey1[6]),Integer.parseInt(sKey1[7]));
				itemList.add(prfm);
						
			}
			
			
			
			
			}
			read_file1.close();
			} catch (FileNotFoundException ex) {
			System.out.println("No File Found!");
			return;
			
			
			}
		try {
				
				Scanner read_file2 = new Scanner(new File(args[2]));
				while(read_file2.hasNextLine()){
				String line2 = read_file2.nextLine();
				String[] sKey2 = line2.split("\t");
				
				
				if(new String("ADDADMIN").equals(sKey2[0])){
					System.out.println("");
					System.out.println("COMMAND TEXT: <"+sKey2[0]+"\t"+sKey2[1]+"\t"+sKey2[2]+"\t"+sKey2[3]+"\t"+
				sKey2[4]+"\t"+sKey2[5]+"\t"+sKey2[6]+">");
					System.out.println("");
					int adminExit=0;
					for(Admin admins: adminList){
						if(new String(admins.getName()).equals(sKey2[1])){
							adminExit=1;
							
							
						
							Admin admin = new Admin(sKey2[2],sKey2[3],sKey2[4],Double.parseDouble(sKey2[5]),sKey2[6]);
							adminList.add(admin);	
							
							
							}
						
							
					}
					if(adminExit==0){
						System.out.println("No admin person named "+sKey2[1]+" exists!");
						
						
					}

				}
					
				else if(new String("ADDCUSTOMER").equals(sKey2[0])){
					System.out.println("");
					System.out.println("COMMAND TEXT: <"+sKey2[0]+"\t"+sKey2[1]+"\t"+sKey2[2]+"\t"+sKey2[3]+"\t"+
				sKey2[4]+"\t"+sKey2[5]+"\t"+sKey2[6]+">");
					System.out.println("");
					int adminExit=0;
					for(int i=0; i < adminList.size();i++){
						if(sKey2[1].equals(adminList.get(i).name)){
							adminExit=1;
							customerID++;
							Customer cst = new Customer(sKey2[2],sKey2[3],sKey2[4],customerID,Double.parseDouble(sKey2[5]),sKey2[6],status);
							customerList.add(cst);
							
						
				
						}
					}
					if(adminExit==0){
						System.out.println("No admin person named "+sKey2[1]+" exists!");
					}
							
				}
				else if(new String("ADDTECH").equals(sKey2[0])){
					
					System.out.println("");
					System.out.println("COMMAND TEXT: <"+sKey2[0]+"\t"+sKey2[1]+"\t"+sKey2[2]+"\t"+sKey2[3]+"\t"+
				sKey2[4]+"\t"+sKey2[5]+"\t"+sKey2[6]+">");
					System.out.println("");
					int adminExit=0;
					for(int i=0; i < adminList.size();i++){
						if(sKey2[1].equals(adminList.get(i).name)){
							adminExit=1;
							Technician tech = new Technician(sKey2[2],sKey2[3],sKey2[4],Double.parseDouble(sKey2[5]),Integer.parseInt(sKey2[6]));
							techList.add(tech);
							adtechList.add(tech);
						}	
					}
					if(adminExit==0){
						System.out.println("No admin person named "+sKey2[1]+" exists!");
					}
							
				}
				else if(new String("SHOWCUSTOMER").equals(sKey2[0])){
					System.out.println("");
					System.out.println("COMMAND TEXT: <"+sKey2[0]+"\t"+sKey2[1]+"\t"+sKey2[2]+">");
					System.out.println("");
					int adminExit=0;
					for(int a=0; a < adminList.size();a++){
						
						if(adminList.get(a).name.equals(sKey2[1])){
							adminExit=1;
							
							SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
							String dateInString = customerList.get(Integer.parseInt(sKey2[2])-1).getDoB();
							Date date = sdf.parse(dateInString);
							
							System.out.println("Customer name: "+customerList.get(Integer.parseInt(sKey2[2])-1).getName()+" ID: "+
						customerList.get(Integer.parseInt(sKey2[2])-1).getCustomerID()+
									" e-mail: "+customerList.get(Integer.parseInt(sKey2[2])-1).getEmail()+ 
									" Date of Birth: "+date+
									" Status: "+customerList.get(Integer.parseInt(sKey2[2])-1).getStatus());
						
						}
			
					}	
					if(adminExit==0){
						System.out.println("No admin person named "+sKey2[1]+" exists!");
					}
				
				}
				
				else if(new String("SHOWCUSTOMERS").equals(sKey2[0])){
					
					System.out.println("");
					System.out.println("COMMAND TEXT: <"+sKey2[0]+"\t"+sKey2[1]+">");
					System.out.println("");
					boolean bol = false;
					for(Admin admin: adminList){
						
						if(admin.getName().equals(sKey2[1])){
							bol=true;
						
							for(int b=0;b<customerList.size();b++){
								
								SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
								String dateInString = customerList.get(b).getDoB();
								Date date = sdf.parse(dateInString);
							
							System.out.println("Customer name: "+customerList.get(b).getName()+"\tID: "+
						customerList.get(b).getCustomerID()+
									"\te-mail: "+customerList.get(b).getEmail()+"\tDate of Birth: "
									+date+ "\tStatus: "+customerList.get(b).getStatus());
		
							}
							
						}
						
		
					}	
					if(bol==false){
						System.out.println("No admin person named "+sKey2[1]+" exists!");
						}
				}
				
				else if(new String("SHOWADMININFO").equals(sKey2[0])){
					
					System.out.println("");
					System.out.println("COMMAND TEXT: <"+sKey2[0]+"\t"+sKey2[1]+">");
					System.out.println("");
					int adminExit=0;
					for(int a=0; a < adminList.size();a++){
						
						if(adminList.get(a).name.equals(sKey2[1])){
							adminExit=1;
							System.out.println("----------- Admin info -----------");
							System.out.println("Admin name: "+adminList.get(a).name);
							System.out.println("Admin e-mail: "+adminList.get(a).email);
							System.out.println("Admin date of birth: "+adminList.get(a).DoB);
							System.out.println("");
						
						}
						
		
					}	
					if(adminExit==0){
						System.out.println("No admin person named "+sKey2[1]+" exists!");
					}
				}
				else if(new String("SHOWVIP").equals(sKey2[0])){
								
								System.out.println("");
								System.out.println("COMMAND TEXT: <"+sKey2[0]+"\t"+sKey2[1]+">");
								System.out.println("");
								int adminExit=0;
								for(int a=0; a < adtechList.size();a++){
									
									if(adtechList.get(a).name.equals(sKey2[1])){
										adminExit=1;
										for(Customer cst:customerList){
											if(cst.status.equals(Customer.Status.GOLDEN)){
												SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
												String dateInString = customerList.get(Integer.parseInt(sKey2[2])-1).getDoB();
												Date date = sdf.parse(dateInString);
												
												System.out.println("Customer name: "+customerList.get(Integer.parseInt(sKey2[2])-1).getName()+" ID: "+
											customerList.get(Integer.parseInt(sKey2[2])-1).getCustomerID()+
														" e-mail: "+customerList.get(Integer.parseInt(sKey2[2])-1).getEmail()+ 
														" Date of Birth: "+date+
														" Status: "+customerList.get(Integer.parseInt(sKey2[2])-1).getStatus());
											}
										}
											
										
										
										
									}
									
								}
								if(adminExit==0){
									System.out.println("No admin or technician person named "+sKey2[1]+" exists!");
								}
								}
				else if(new String("DEPOSITMONEY").equals(sKey2[0])){
					
					System.out.println("");
					System.out.println("COMMAND TEXT: <"+sKey2[0]+"\t"+sKey2[1]+"\t"+sKey2[2]+">");
					System.out.println("");
					int cstExit=0;
					for(Customer cst:customerList){
						
						if(cst.getCustomerID()==Integer.parseInt(sKey2[1])){
							cstExit=1;
							cst.setBalance(cst.getBalance()+Double.parseDouble(sKey2[2]));
						}
					}
					if(cstExit==0){
						System.out.println("No customer with ID number "+sKey2[1]+" exists!");
					}
					
				}
				else if(new String("CHPASS").equals(sKey2[0])){
								
								System.out.println("");
								System.out.println("COMMAND TEXT: <"+sKey2[0]+"\t"+sKey2[1]+"\t"+sKey2[2]+"\t"+sKey2[3]+">");
								System.out.println("");
								int cstExit=0;
								int passExit=0;
								for(Customer cst:customerList){
									
									if(cst.getCustomerID()==Integer.parseInt(sKey2[1])){
										cstExit=1;
										if(cst.getPassword().equals(sKey2[2])){
											passExit=1;
											cst.setPassword(sKey2[3]);
											System.out.println("The password has been successfully changed.");
										}
										
									}
								}
								if(cstExit==0){
									System.out.println("No customer with ID number "+sKey2[1]+" exists!");
								}
								else if(passExit==0){
									System.out.println("The given password does not match the current password. Please try again.");
								}
								
							}
				
				else if(new String("LISTITEM").equals(sKey2[0])){
					
					System.out.println("");
					System.out.println("COMMAND TEXT: <"+sKey2[0]+"\t"+sKey2[1]+">");
					System.out.println("");
					int adminExit=0;
					for(int a=0; a < adtechList.size();a++){
						if(adtechList.get(a).name.equals(sKey2[1])){
							adminExit=1;	
							for(Item items: itemList){
								if(items.getClass().equals(Book.class)){
									System.out.println(items.toString());
								}
								else if(items.getClass().equals(CDDVD.class)){
									System.out.println(items.toString());
								}
								else if(items.getClass().equals(Desktop.class)){
									System.out.println(items.toString());
								}
								else if(items.getClass().equals(Laptop.class)){
									System.out.println(items.toString());
								}
								else if(items.getClass().equals(Tablet.class)){
									System.out.println(items.toString());
								}
								else if(items.getClass().equals(TV.class)){
									System.out.println(items.toString());
								}
								else if(items.getClass().equals(Smartphone.class)){
									System.out.println(items.toString());
								}
								else if(items.getClass().equals(HairCare.class)){
									System.out.println(items.toString());
								}
								else if(items.getClass().equals(Perfume.class)){
									System.out.println(items.toString());
								}
								else if(items.getClass().equals(SkinCare.class)){
									System.out.println(items.toString());
								}
			
						}
						}
					
		
					}	
					if(adminExit==0){
						System.out.println("No admin person named "+sKey2[1]+" exists!");
					}
						
				
				}
				else if(new String("DISPITEMSOF").equals(sKey2[0])){
					
					System.out.println("");
					System.out.println("COMMAND TEXT: <"+sKey2[0]+"\t"+sKey2[1]+"\t"+sKey2[2]+">");
					System.out.println("");
					int adminExit=0;
					for(int a=0; a < adtechList.size();a++){
						if(adtechList.get(a).name.equals(sKey2[1])){
							adminExit=1;
					
							String[] splitted=sKey2[2].split(":");
					
							for(int e=0;e<splitted.length;e++){
								if(splitted[e].equals("BOOK")){
									for(Item items: itemList){
										if(items.getClass().equals(Book.class)){
											System.out.println(items.toString());
										}
								}
							  }
							}
							for(int e=0;e<splitted.length;e++){
								if(splitted[e].equals("CDDVD")){
									for(Item items: itemList){
										if(items.getClass().equals(CDDVD.class)){
											System.out.println(items.toString());
										}
								}
							  }
							}
							for(int e=0;e<splitted.length;e++){
								if(splitted[e].equals("DESKTOP")){
									for(Item items: itemList){
										if(items.getClass().equals(Desktop.class)){
											System.out.println(items.toString());
										}
								}
							  }
							}
							for(int e=0;e<splitted.length;e++){
								if(splitted[e].equals("LAPTOP")){
									for(Item items: itemList){
										if(items.getClass().equals(Laptop.class)){
											System.out.println(items.toString());
										}
								}
							  }
							}
							for(int e=0;e<splitted.length;e++){
								if(splitted[e].equals("TABLET")){
									for(Item items: itemList){
										if(items.getClass().equals(Tablet.class)){
											System.out.println(items.toString());
										}
								}
							  }
							}
							for(int e=0;e<splitted.length;e++){
								if(splitted[e].equals("TV")){
									for(Item items: itemList){
										if(items.getClass().equals(TV.class)){
											System.out.println(items.toString());
										}
								}
							  }
							}
							for(int e=0;e<splitted.length;e++){
								if(splitted[e].equals("SMARTPHONE")){
									for(Item items: itemList){
										if(items.getClass().equals(Smartphone.class)){
											System.out.println(items.toString());
										}
								}
							  }
							}
							for(int e=0;e<splitted.length;e++){
								if(splitted[e].equals("HAIRCARE")){
									for(Item items: itemList){
										if(items.getClass().equals(HairCare.class)){
											System.out.println(items.toString());
										}
								}
							  }
							}
							for(int e=0;e<splitted.length;e++){
								if(splitted[e].equals("PERFUME")){
									for(Item items: itemList){
										if(items.getClass().equals(Perfume.class)){
											System.out.println(items.toString());
										}
								}
							  }
							}
							for(int e=0;e<splitted.length;e++){
								if(splitted[e].equals("SKINCARE")){
									for(Item items: itemList){
										if(items.getClass().equals(SkinCare.class)){
											System.out.println(items.toString());
										}
								}
							  }
							}
						}
					
						
		
					}	
					if(adminExit==0){
						System.out.println("No admin person named "+sKey2[1]+" exists!");
					}
					

					
				}
				else if(new String("ADDITEM").equals(sKey2[0])){	
								System.out.println("");
								System.out.println("COMMAND TEXT: <"+sKey2[0]+"\t"+sKey2[1]+"\t"+sKey2[2]+">");
								System.out.println("");
								int adminExit=0;
								for(int a=0; a < techList.size();a++){
									if(techList.get(a).name.equals(sKey2[1])){
										adminExit=1;
										String[] parts=sKey2[2].split(":");
										if(parts[0].equals("BOOK")){
											itemID++;
											stockBook++;
											Book book = new Book("BOOK",itemID,Double.parseDouble(parts[1]),stockBook,
													Integer.parseInt(parts[2]), parts[3],parts[4],parts[5],Integer.parseInt(parts[6]));
											itemList.add(book);
										}
										else if(parts[0].equals("CDDVD")){
											stockCDDVD++;
											itemID++;
											
											CDDVD cddvd = new CDDVD("CDDVD",itemID,Double.parseDouble(parts[1]),stockCDDVD,
													Integer.parseInt(parts[2]), parts[3],parts[4],parts[5]);
											itemList.add(cddvd);
										}
										else if(parts[0].equals("DESKTOP")){
											stockDesktop++;
											itemID++;
											
											Desktop dsktp = new Desktop("DESKTOP",itemID, Double.parseDouble(parts[1]), stockDesktop, parts[2], parts[3], Integer.parseInt(parts[4]),
													Integer.parseInt(parts[5]), parts[6], parts[7], Integer.parseInt(parts[8]), Integer.parseInt(parts[9]), parts[10]);
											itemList.add(dsktp);
										}
										else if(parts[0].equals("LAPTOP")){
											stockLaptop++;
											itemID++;
											
											Laptop laptop = new Laptop("LAPTOP",itemID, Double.parseDouble(parts[1]), stockLaptop, parts[2], parts[3], Integer.parseInt(parts[4]),
													Integer.parseInt(parts[5]), parts[6], parts[7],
													Integer.parseInt(parts[8]), Integer.parseInt(parts[9]), Integer.parseInt(parts[10]));
											itemList.add(laptop);
										}
										else if(parts[0].equals("TABLET")){
											stockTablet++;
											itemID++;
											
											Tablet tablet = new Tablet("TABLET",itemID, Double.parseDouble(parts[1]), stockTablet, parts[2], parts[3], Integer.parseInt(parts[4]),
													Integer.parseInt(parts[5]), parts[6], parts[7], Integer.parseInt(parts[8]), 
													Integer.parseInt(parts[9]), Integer.parseInt(parts[10]));
											itemList.add(tablet);
										}
										else if(parts[0].equals("TV")){
											stockTV++;
											itemID++;
											
											TV tv = new TV("TV",itemID, Double.parseDouble(parts[1]), stockTV, parts[2], parts[3], Integer.parseInt(parts[4]),
													Integer.parseInt(parts[5]), Integer.parseInt(parts[6]));
											itemList.add(tv);
										}
										else if(parts[0].equals("SMARTPHONE")){
											stockSmartphone++;
											itemID++;
											
											Smartphone sp = new Smartphone("SMARTPHONE",itemID, Double.parseDouble(parts[1]), stockSmartphone, parts[2], parts[3], Integer.parseInt(parts[4]),
													Integer.parseInt(parts[5]),parts[6]);
											itemList.add(sp);
										}
										else if(parts[0].equals("HAIRCARE")){
											stockHair++;
											itemID++;
											
											HairCare hc = new HairCare("HAIRCARE",itemID, stockHair, Double.parseDouble(parts[1]), parts[2], parts[3], Integer.parseInt(parts[4]),
													Integer.parseInt(parts[5]),Integer.parseInt(parts[6]),Integer.parseInt(parts[7]));
											itemList.add(hc);
										}
										else if(parts[0].equals("SKINCARE")){
											stockSkin++;
											itemID++;
											
											SkinCare sc = new SkinCare("SKINCARE",itemID, stockSkin, Double.parseDouble(parts[1]), parts[2], parts[3], Integer.parseInt(parts[4]),
													Integer.parseInt(parts[5]),Integer.parseInt(parts[6]),Integer.parseInt(parts[7]));
											itemList.add(sc);
										}
										else if(parts[0].equals("PERFUME")){
											stockPerfume++;
											itemID++;
											
											Perfume prfm = new Perfume("PERFUME",itemID, stockPerfume, Double.parseDouble(parts[1]), parts[2], parts[3], Integer.parseInt(parts[4]),
													Integer.parseInt(parts[5]),Integer.parseInt(parts[6]),Integer.parseInt(parts[7]));
											itemList.add(prfm);
										}
										else {
											System.out.println("No item type " + parts[0] + " found");

										}
								
									}
								}
								if(adminExit==0){
									System.out.println("No admin person named "+sKey2[1]+" exists!");
								}
								
				}
				else if(new String("SHOWITEMSLOWONSTOCK").equals(sKey2[0])){
					
					System.out.println("");
					System.out.println("COMMAND TEXT: <"+sKey2[0]+"\t"+sKey2[1]+">");
					System.out.println("");
					int adminExit=0;
					for(int a=0; a < adtechList.size();a++){
						if(adtechList.get(a).name.equals(sKey2[1])){
							adminExit=1;
							if(sKey2.length==2){
						
								System.out.println("Book : "+stockBook+
										"\nCDDVD : "+stockCDDVD+
										"\nDesktop : "+stockDesktop+
										"\nLaptop : "+stockLaptop+
										"\nTablet : "+stockTablet+
										"\nTV : "+stockTV+
										"\nSmartPhone : "+stockSmartphone+
										"\nHairCare : "+stockHair+
										"\nPerfume : "+stockPerfume+
										"\nSkinCare : "+stockSkin);
								
							}
							else if(sKey2.length==3){
								Map<String, Integer> stockDict = new HashMap<String, Integer>();
								stockDict.put("Book", stockBook);
								stockDict.put("CDDVD", stockCDDVD);
								stockDict.put("Laptop", stockLaptop);
								stockDict.put("Desktop", stockDesktop);
								stockDict.put("TV", stockTV);
								stockDict.put("Tablet", stockTablet);
								stockDict.put("SmartPhone", stockSmartphone);
								stockDict.put("HairCare", stockHair);
								stockDict.put("Perfume", stockPerfume);
								stockDict.put("SkinCare", stockSkin);
								
								System.out.println("");
								System.out.println("COMMAND TEXT: <"+sKey2[0]+"\t"+sKey2[1]+"\t"+sKey2[2]+">");
								System.out.println("");
								for( String key: stockDict.keySet()){
									if(stockDict.get(key)<Integer.parseInt(sKey2[2])){
										
									  System.out.println(key + ": " + stockDict.get(key));
									}
								
								}
								
								
							}
						}
					
						}
					if(adminExit==0){
						System.out.println("No admin person named "+sKey2[1]+" exists!");
					}
					
				}
					
			else if(new String("CREATECAMPAIGN").equals(sKey2[0])){
				
				System.out.println("");
				System.out.println("COMMAND TEXT: <"+sKey2[0]+"\t"+sKey2[1]+"\t"+
						sKey2[2]+"\t"+sKey2[3]+"\t"+sKey2[4]+"\t"+sKey2[5]+">");
				System.out.println("");
				int adminExit=0;		
				int rateExit=0;
				for(Admin admins:adminList){
									
					if(new String(admins.getName()).equals(sKey2[1])){
						adminExit=1;
						
						SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
						String dateInString = sKey2[3];
						Date lastDate = sdf.parse(dateInString);
						
						Date currentDate = new Date();
						
						if(Integer.parseInt(sKey2[5])<=50){
							rateExit=1;
							Campaign cmp = new Campaign(sKey2[4],sKey2[3],Integer.parseInt(sKey2[5]));
							
							if(lastDate.compareTo(currentDate)>=0){
								
								cmpList.add(cmp);
								for(Item items:itemList){
									if(items.getItemType().equals(sKey2[4])){
										items.price-=(items.price*Integer.parseInt(sKey2[5]))/100;				
									}
									
								}
								
							}
							else{
								cmpList.remove(cmp);
								for(Item items:itemList){
									if(items.getItemType().equals(sKey2[4])){
										items.price=(items.price/(100-Integer.parseInt(sKey2[5])))*100;				
									}
									
								}
							}
							
							
						}	
									}
					
					
								}
				if(adminExit==0){
					System.out.println("No admin person named "+sKey2[1]+" exists!");
					
				}
				else if(rateExit==0){
					System.out.println("Campaign was not created. Discount rate exceeds maximum rate of 50%.");
				}
				
			
				
							}		
								
			else if(new String("SHOWCAMPAIGNS").equals(sKey2[0])){
				System.out.println("");
				System.out.println("COMMAND TEXT: <"+sKey2[0]+"\t"+sKey2[1]+">");
				System.out.println("");
				int adminExit=0;
				int cmpExit=0;
				for(int z=0;z<customerList.size();z++){	
					if(customerList.get(z).customerID==Integer.parseInt(sKey2[1])){
						adminExit=1;
						if(cmpList.size()!=0){
							cmpExit=1;
							System.out.println("Active campaigns:");
							for(Campaign cmps:cmpList){
								System.out.println(cmps.toString());
							}
							
						}
						
							
					}
				
				}
				if(adminExit==0){
					System.out.println("No admin person named "+sKey2[1]+" exists!");	
				}
				else if(cmpExit==0){
					System.out.println("No campaign has been created so far!");
				}
				
			}
			else if(new String("SHOWORDERS").equals(sKey2[0])){
				System.out.println("");
				System.out.println("COMMAND TEXT: <"+sKey2[0]+"\t"+sKey2[1]+">");
				System.out.println("");
				int techExit=0;
				int seniorExit=0;
				for(Technician tech:techList){	
					if(tech.getName().equals(sKey2[1])){
						techExit=1;
						if(tech.getSenior()==1){
							seniorExit=1;
							System.out.println("Order History:");
							for(Orders order:orderList){
								System.out.println(order.toString());
							}
							
						}
						
							
					}
				
				}
				if(techExit==0){
					System.out.println("No technician person named "+sKey2[1]+" exists!");	
				}
				else if(seniorExit==0){
					System.out.println(sKey2[1]+"is not authorized to display orders!");
				}
				
			}	
				
			else if(new String("ADDTOCART").equals(sKey2[0])){
				System.out.println("");
				System.out.println("COMMAND TEXT: <"+sKey2[0]+"\t"+sKey2[1]+"\t"+sKey2[2]+">");
				System.out.println("");
				
				int fExit= 0;
				int sExit=0;
				for(Customer customer:customerList){	
					if((customer.customerID==Integer.parseInt(sKey2[1]))){
						
						fExit=1;
						for(Item items:itemList){	
							if(items.getID()==Integer.parseInt(sKey2[2])){
							
								sExit=1;
								
								if(items.itemType.equals("BOOK")&&stockBook!=0){
									
									boolean cExit=false;
									for(ShoppingCart cartz : cartList){
										if(cartz.getID()==Integer.parseInt(sKey2[1])){
											
											cExit=true;
											cartz.shopList.add(Integer.parseInt(sKey2[2]));	
										}
									}
										if(cExit==false){
											
											ShoppingCart  cart = new ShoppingCart(Integer.parseInt(sKey2[1]),Integer.parseInt(sKey2[2]));
											cartList.add(cart);
											
											
										}
									System.out.println(
											"The item " + items.getItemType() + " has been successfully added to your cart.");
									
								}
								else if(items.itemType.equals("CDDVD")&&stockCDDVD!=0){
									
									boolean cExit=false;
									for(ShoppingCart cartz : cartList){
										if(cartz.getID()==Integer.parseInt(sKey2[1])){
										
											cExit=true;
											cartz.shopList.add(Integer.parseInt(sKey2[2]));	
										}
									}
										if(cExit==false){
											
											ShoppingCart  cart = new ShoppingCart(Integer.parseInt(sKey2[1]),Integer.parseInt(sKey2[2]));
											cartList.add(cart);
											
											
										}
									System.out.println(
											"The item " + items.getItemType() + " has been successfully added to your cart.");
								}
								else if(items.itemType.equals("DESKTOP")&&stockDesktop!=0){
									
									boolean cExit=false;
									for(ShoppingCart cartz : cartList){
										if(cartz.getID()==Integer.parseInt(sKey2[1])){
											
											cExit=true;
											cartz.shopList.add(Integer.parseInt(sKey2[2]));	
										}
									}
										if(cExit==false){
											
											ShoppingCart  cart = new ShoppingCart(Integer.parseInt(sKey2[1]),Integer.parseInt(sKey2[2]));
											cartList.add(cart);
											
											
										}
									System.out.println(
											"The item " + items.getItemType() + " has been successfully added to your cart.");
								}
								else if(items.itemType.equals("LAPTOP")&&stockLaptop!=0){
									
									boolean cExit=false;
									for(ShoppingCart cartz : cartList){
										if(cartz.getID()==Integer.parseInt(sKey2[1])){
											
											cExit=true;
											cartz.shopList.add(Integer.parseInt(sKey2[2]));	
										}
									}
										if(cExit==false){
											
											ShoppingCart  cart = new ShoppingCart(Integer.parseInt(sKey2[1]),Integer.parseInt(sKey2[2]));
											cartList.add(cart);
											
											
										}
									System.out.println(
											"The item " + items.getItemType() + " has been successfully added to your cart.");
								}
								else if(items.itemType.equals("TABLET")&&stockTablet!=0){
									
									boolean cExit=false;
									for(ShoppingCart cartz : cartList){
										if(cartz.getID()==Integer.parseInt(sKey2[1])){
											
											cExit=true;
											cartz.shopList.add(Integer.parseInt(sKey2[2]));	
										}
									}
										if(cExit==false){
											
											ShoppingCart  cart = new ShoppingCart(Integer.parseInt(sKey2[1]),Integer.parseInt(sKey2[2]));
											cartList.add(cart);
											
											
										}
									System.out.println(
											"The item " + items.getItemType() + " has been successfully added to your cart.");
								}
								else if(items.itemType.equals("TV")&&stockTV!=0){
									
									boolean cExit=false;
									for(ShoppingCart cartz : cartList){
										if(cartz.getID()==Integer.parseInt(sKey2[1])){
											
											cExit=true;
											cartz.shopList.add(Integer.parseInt(sKey2[2]));	
										}
									}
										if(cExit==false){
											
											ShoppingCart  cart = new ShoppingCart(Integer.parseInt(sKey2[1]),Integer.parseInt(sKey2[2]));
											cartList.add(cart);
											
											
										}
									System.out.println(
											"The item " + items.getItemType() + " has been successfully added to your cart.");
								}
								else if(items.itemType.equals("HAIRCARE")&&stockHair!=0){
									
									boolean cExit=false;
									for(ShoppingCart cartz : cartList){
										if(cartz.getID()==Integer.parseInt(sKey2[1])){
										
											cExit=true;
											cartz.shopList.add(Integer.parseInt(sKey2[2]));	
										}
									}
										if(cExit==false){
										
											ShoppingCart  cart = new ShoppingCart(Integer.parseInt(sKey2[1]),Integer.parseInt(sKey2[2]));
											cartList.add(cart);
											
											
										}
									System.out.println(
											"The item " + items.getItemType() + " has been successfully added to your cart.");
								}
								else if(items.itemType.equals("SKINCARE")&&stockSkin!=0){
									
									boolean cExit=false;
									for(ShoppingCart cartz : cartList){
										if(cartz.getID()==Integer.parseInt(sKey2[1])){
											
											cExit=true;
											cartz.shopList.add(Integer.parseInt(sKey2[2]));	
										}
									}
										if(cExit==false){
											
											ShoppingCart  cart = new ShoppingCart(Integer.parseInt(sKey2[1]),Integer.parseInt(sKey2[2]));
											cartList.add(cart);
											
											
										}
									System.out.println(
											"The item " + items.getItemType() + " has been successfully added to your cart.");
								}
								else if(items.itemType.equals("SMARTPHONE")&&stockSmartphone!=0){
									
									boolean cExit=false;
									for(ShoppingCart cartz : cartList){
										if(cartz.getID()==Integer.parseInt(sKey2[1])){
											
											cExit=true;
											cartz.shopList.add(Integer.parseInt(sKey2[2]));	
										}
									}
										if(cExit==false){
										
											ShoppingCart  cart = new ShoppingCart(Integer.parseInt(sKey2[1]),Integer.parseInt(sKey2[2]));
											cartList.add(cart);
											
											
										}
									System.out.println(
											"The item " + items.getItemType() + " has been successfully added to your cart.");
								}
								else if(items.itemType.equals("PERFUME")&&stockPerfume!=0){
									
									boolean cExit=false;
									for(ShoppingCart cartz : cartList){
										if(cartz.getID()==Integer.parseInt(sKey2[1])){
											
											cExit=true;
											cartz.shopList.add(Integer.parseInt(sKey2[2]));	
										}
									}
										if(cExit==false){
										
											ShoppingCart  cart = new ShoppingCart(Integer.parseInt(sKey2[1]),Integer.parseInt(sKey2[2]));
											cartList.add(cart);
											
											
										}
									System.out.println(
											"The item " + items.getItemType() + " has been successfully added to your cart.");
								}
								else{
									System.out.println("We are sorry. The item is temporarily unavailable.");
									break;
								}
								
								
						}
							
				
						}
						
						
					}
					
							
						
					}
				if(fExit==0){
					System.out.println("No customer with ID number "+sKey2[1]+" exists!");
					
					
				
				}
				else if(fExit==1&sExit==0){
					System.out.println("Invalid item ID");
					
				
			}
				
				
				}
			else if(new String("EMPTYCART").equals(sKey2[0])){
				System.out.println("");
				System.out.println("COMMAND TEXT: <"+sKey2[0]+"\t"+sKey2[1]+">");
				int custEx=0;
				for(Customer cst:customerList){		
					if(cst.getCustomerID()==Integer.parseInt(sKey2[1])){
						custEx=1;
						for(ShoppingCart cartz: cartList){
							if(cartz.getID()==(Integer.parseInt(sKey2[1]))){
								cartz.shopList.clear();
								System.out.println("The cart has been emptied.");
							}
						}
					}
				
				}
				if(custEx==0){
					System.out.println("No customer with ID number "+sKey2[1]+" exists!");
				}
			}
			
		
			else if(new String("ORDER").equals(sKey2[0])){
				System.out.println("");
				System.out.println("COMMAND TEXT: <"+sKey2[0]+"\t"+sKey2[1]+"\t"+sKey2[2]+">");
				System.out.println("");
				
				int idExit=0;
				int passExit=0;
				int balanceExit=0;
				int emptyExit=0;
				double total=0;
				int itemNumber=0;
				
				for(Customer cst:customerList){			
					if(cst.getCustomerID()==Integer.parseInt(sKey2[1])){	
						
						idExit=1;
						if(cst.getPassword().equals(sKey2[2])){	
							
							passExit=1;
							for(ShoppingCart cartz : cartList){
								
								if(cartz.getID()==Integer.parseInt(sKey2[1])){
									
									
									for(int itemno : cartz.shopList){
										if(cartz.shopList.size()!=0){
											emptyExit=1;
										for(Item items:itemList){
											if(itemno==items.getID()){
												total+=items.getPrice();
												itemNumber++;
											}
										}
										}
									}
									for(Item delItem:itemList){


										if(cst.status==Customer.Status.CLASSIC){
											
											if(cst.getBalance()>=total){
												balanceExit=1;
												if(total<1000){
													System.out.println("You need to spend "+(1000-total)+" more TL to become a "+Customer.Status.SILVER+" MEMBER.");
													cst.setBalance(cst.getBalance()-total);
													cartz.shopList.clear();
													System.out.println("Done! Your order will be delivered as soon as possible. Thank you!");
													itemList.remove(delItem);
													
													Date date=new Date();
													Orders order=new Orders(Integer.parseInt(sKey2[1]), date, itemNumber,total);
													orderList.add(order);	
												
													if(delItem.itemType.equals("BOOK")){
														stockBook--;
													}
													else if(delItem.itemType.equals("DESKTOP")){
														stockDesktop--;
													}
													else if(delItem.itemType.equals("LAPTOP")){
														stockLaptop--;
													}
													else if(delItem.itemType.equals("TABLET")){
														stockTablet--;
													}
													else if(delItem.itemType.equals("SMARTPHONE")){
														stockSmartphone--;
													}
													else if(delItem.itemType.equals("CDDVD")){
														stockCDDVD--;
													}
													else if(delItem.itemType.equals("TV")){
														stockTV--;
													}
													else if(delItem.itemType.equals("PERFUME")){
														stockPerfume--;
													}
													else if(delItem.itemType.equals("HAIRCARE")){
														stockHair--;
													}
													else if(delItem.itemType.equals("SKINCARE")){
														stockSkin--;
													}
													break;
												}
												else if(total<5000){
													System.out.println("Congratulations! You have been upgraded to a "+Customer.Status.SILVER+" MEMBER! You have earned a discount of "+10+"% on all purchases.");
													System.out.println("You need to spend "+(5000-total)+" more TL to become a "+Customer.Status.GOLDEN+" MEMBER.");
													cst.setBalance(cst.getBalance()-total);
													cartz.shopList.clear();
													itemList.remove(delItem);
													System.out.println("Done! Your order will be delivered as soon as possible. Thank you!");
													
													Date date=new Date();
													Orders order=new Orders(Integer.parseInt(sKey2[1]), date, itemNumber,total);
													orderList.add(order);
													
													if(delItem.itemType.equals("BOOK")){
														stockBook--;
													}
													else if(delItem.itemType.equals("DESKTOP")){
														stockDesktop--;
													}
													else if(delItem.itemType.equals("LAPTOP")){
														stockLaptop--;
													}
													else if(delItem.itemType.equals("TABLET")){
														stockTablet--;
													}
													else if(delItem.itemType.equals("SMARTPHONE")){
														stockSmartphone--;
													}
													else if(delItem.itemType.equals("CDDVD")){
														stockCDDVD--;
													}
													else if(delItem.itemType.equals("TV")){
														stockTV--;
													}
													else if(delItem.itemType.equals("PERFUME")){
														stockPerfume--;
													}
													else if(delItem.itemType.equals("HAIRCARE")){
														stockHair--;
													}
													else if(delItem.itemType.equals("SKINCARE")){
														stockSkin--;
													}
													break;
												}
												else if(total>5000){
													System.out.println("Congratulations! You have been upgraded to a "+Customer.Status.GOLDEN+" MEMBER! You have earned a discount of "+15+"% on all purchases.");
													cst.setBalance(cst.getBalance()-total);
													cartz.shopList.clear();
													itemList.remove(delItem);
													System.out.println("Done! Your order will be delivered as soon as possible. Thank you!");
													
													Date date=new Date();
													Orders order=new Orders(Integer.parseInt(sKey2[1]), date, itemNumber,total);
													orderList.add(order);
													
													if(delItem.itemType.equals("BOOK")){
														stockBook--;
													}
													else if(delItem.itemType.equals("DESKTOP")){
														stockDesktop--;
													}
													else if(delItem.itemType.equals("LAPTOP")){
														stockLaptop--;
													}
													else if(delItem.itemType.equals("TABLET")){
														stockTablet--;
													}
													else if(delItem.itemType.equals("SMARTPHONE")){
														stockSmartphone--;
													}
													else if(delItem.itemType.equals("CDDVD")){
														stockCDDVD--;
													}
													else if(delItem.itemType.equals("TV")){
														stockTV--;
													}
													else if(delItem.itemType.equals("PERFUME")){
														stockPerfume--;
													}
													else if(delItem.itemType.equals("HAIRCARE")){
														stockHair--;
													}
													else if(delItem.itemType.equals("SKINCARE")){
														stockSkin--;
													}
													break;
												}
												
												
												
														
											}
											
										}
										else if(cst.status==Customer.Status.SILVER){
											total-=total*10/100;
											if(cst.getBalance()>=total){
												balanceExit=1;
												
												if(total<5000){
													System.out.println("You need to spend "+(5000-total)+" more TL to become a "+Customer.Status.GOLDEN+" MEMBER.");
													cst.setBalance(cst.getBalance()-total);
													cartz.shopList.clear();
													itemList.remove(delItem);
													System.out.println("Done! Your order will be delivered as soon as possible. Thank you!");
													
													Date date=new Date();
													Orders order=new Orders(Integer.parseInt(sKey2[1]), date, itemNumber,total);
													orderList.add(order);
													
													if(delItem.itemType.equals("BOOK")){
														stockBook--;
													}
													else if(delItem.itemType.equals("DESKTOP")){
														stockDesktop--;
													}
													else if(delItem.itemType.equals("LAPTOP")){
														stockLaptop--;
													}
													else if(delItem.itemType.equals("TABLET")){
														stockTablet--;
													}
													else if(delItem.itemType.equals("SMARTPHONE")){
														stockSmartphone--;
													}
													else if(delItem.itemType.equals("CDDVD")){
														stockCDDVD--;
													}
													else if(delItem.itemType.equals("TV")){
														stockTV--;
													}
													else if(delItem.itemType.equals("PERFUME")){
														stockPerfume--;
													}
													else if(delItem.itemType.equals("HAIRCARE")){
														stockHair--;
													}
													else if(delItem.itemType.equals("SKINCARE")){
														stockSkin--;
													}
													break;
												}
												else if(total>5000){
													System.out.println("Congratulations! You have been upgraded to a "+Customer.Status.GOLDEN+" MEMBER! You have earned a discount of "+15+"% on all purchases.");
													cst.setBalance(cst.getBalance()-total);
													cartz.shopList.clear();
													itemList.remove(delItem);
													System.out.println("Done! Your order will be delivered as soon as possible. Thank you!");
													
													Date date=new Date();
													Orders order=new Orders(Integer.parseInt(sKey2[1]), date, itemNumber,total);
													orderList.add(order);
													
													if(delItem.itemType.equals("BOOK")){
														stockBook--;
													}
													else if(delItem.itemType.equals("DESKTOP")){
														stockDesktop--;
													}
													else if(delItem.itemType.equals("LAPTOP")){
														stockLaptop--;
													}
													else if(delItem.itemType.equals("TABLET")){
														stockTablet--;
													}
													else if(delItem.itemType.equals("SMARTPHONE")){
														stockSmartphone--;
													}
													else if(delItem.itemType.equals("CDDVD")){
														stockCDDVD--;
													}
													else if(delItem.itemType.equals("TV")){
														stockTV--;
													}
													else if(delItem.itemType.equals("PERFUME")){
														stockPerfume--;
													}
													else if(delItem.itemType.equals("HAIRCARE")){
														stockHair--;
													}
													else if(delItem.itemType.equals("SKINCARE")){
														stockSkin--;
													}
													break;
												}
												
														
											}
										}
										else if(cst.status==Customer.Status.GOLDEN){
											total-=total*15/100;
											if(cst.getBalance()>=total){
												balanceExit=1;
												
												if(total>5000){
													cst.setBalance(cst.getBalance()-total);
													cartz.shopList.clear();
													itemList.remove(delItem);
													System.out.println("Done! Your order will be delivered as soon as possible. Thank you!");
													
													Date date=new Date();
													Orders order=new Orders(Integer.parseInt(sKey2[1]), date, itemNumber,total);
													orderList.add(order);
													
													if(delItem.itemType.equals("BOOK")){
														stockBook--;
													}
													else if(delItem.itemType.equals("DESKTOP")){
														stockDesktop--;
													}
													else if(delItem.itemType.equals("LAPTOP")){
														stockLaptop--;
													}
													else if(delItem.itemType.equals("TABLET")){
														stockTablet--;
													}
													else if(delItem.itemType.equals("SMARTPHONE")){
														stockSmartphone--;
													}
													else if(delItem.itemType.equals("CDDVD")){
														stockCDDVD--;
													}
													else if(delItem.itemType.equals("TV")){
														stockTV--;
													}
													else if(delItem.itemType.equals("PERFUME")){
														stockPerfume--;
													}
													else if(delItem.itemType.equals("HAIRCARE")){
														stockHair--;
													}
													else if(delItem.itemType.equals("SKINCARE")){
														stockSkin--;
													}
													break;
												}
												
														
											}
										}
										
									}
												
														
											}
										}
										
			
						}
						}	
					
					
				}
				if(idExit==0){
					System.out.println("No customer with ID number "+sKey2[1]+" exists!");
				}
				else if(idExit==1&passExit==0){
					System.out.println("Order could not be placed. Invalid password.");
				}
				else if(idExit==1 & passExit==1 & emptyExit==0){
					System.out.println("You should add some items to your cart before order request!");
				}
				else if(idExit==1 & passExit==1 & balanceExit==0){
					System.out.println("Order could not be placed. Insufficient funds.");
				}
				
				
			}
		
						
							
						
							
						
							
				
					
			
				

				
				
				}
				read_file2.close();
				} catch (FileNotFoundException ex) {
				System.out.println("No File Found!");
				return;
				
				
				}
			
			}
	}


