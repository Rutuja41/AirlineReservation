package mypack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AirLine
{

	public static void main(String[] args) throws IOException
	{
		//using BufferReader->use the default size for an input buffer
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String user;
		String password;
		String YesorNo;
		String search,again,choice;
		int a=0,z=0,end=0;
		int Seatavailable[]=new int[6];
		int no_of_passengers[][]=new int [100][3];
		String name[][]=new String[100][3];
		double rupees[][]=new double[100][3];
		double pay[]=new double[20];
		double Balance[]=new double[20];
		for(int i=1;i<4;)
		{
			System.out.println("");
			System.out.println("***************WELCOME TO AIRLINE SERVICE********************");
			System.out.println("   ");
			System.out.println("Enter your name");
			user=in.readLine();
			System.out.println("   ");
			System.out.println("Enter Password   ");
			password=in.readLine();
			for(int j=1;j<=5;j++)
			{
				Seatavailable[j]=20;
			}
			if(user.equals("admin")&&password.equals("123"))
			{
				
					for(int x=1; x==1;)
				{
					//the main menu
					System.out.println("Press 1 for:DESTINATION");
					System.out.println("Press 2 for:BUY TICKET");
					System.out.println("Press 3 for:TRANSACTION");
					System.out.println("Press 4 for:VIEW DETAILS");
					
					System.out.println("Press 5 for:EXIT");
					System.out.println("<^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^>");
					for(x=1; x==1;)
					{
						System.out.println("Enter your choice:");
						choice=in.readLine();
						if(choice.equals("1"))
						{
							System.out.println("*****DESTINATION********");
							System.out.println("1.CHENNAI-SINGAPORE   RUPEES: 30000   SEAT:"+Seatavailable[1]);
							System.out.println("2.BANGLORE-SINGAPORE   RUPEES: 30000   SEAT:"+Seatavailable[2]);
							System.out.println("3.BANGLORE-KUWAIT   RUPEES: 35000   SEAT:"+Seatavailable[3]);
							System.out.println("4.BANGLORE-MALASIA   RUPEES: 40000   SEAT:"+Seatavailable[4]);
							System.out.println("5.HYDERBAD-AUSTRALIA  RUPEES: 45000   SEAT:"+Seatavailable[5]);
							System.out.println("NOTE:STUDENTS AND SENIOR CITIZEN 20% DISCOUNT!!!\n");
							x=0;
						}
						else if(choice.equals("2"))
						{
							int print=1;
							System.out.println("*****DESTINATION********");
							System.out.println("1.CHENNAI-SINGAPORE  FARE: 30000   SEAT:"+Seatavailable[1]);
							System.out.println("2.BANGLORE-SINGAPORE    FARE: 30000   SEAT:"+Seatavailable[2]);
							System.out.println("3.BANGLORE-KUWAIT   FARE: 35000   SEAT:"+Seatavailable[3]);
							System.out.println("4.BANGLORE-MALASIA    FARE: 40000   SEAT:"+Seatavailable[4]);
							System.out.println("5.HYDERBAD-AUSTRALIA  FARE: 45000   SEAT:"+Seatavailable[5]);
							System.out.println("***********************************************\n");
							System.out.println("NOTE:STUDENTS AND SENIOR CITIZEN 20% DISCOUNT!!!\n");
							if((Seatavailable[1]==0)&&(Seatavailable[2]==0)&&(Seatavailable[3]==0)&&(Seatavailable[4]==0)&&(Seatavailable[5]==0))
							{
	    						System.out.println("SORRY, SEATS NOT AVAILABLE!");
	    						x=0;
							}
							else
							{
	    					   for(x=1; x==1;)
	    					   {
	    						  System.out.print("\nENTER PASSENGER'S NAME: ");
	    						  name[z][0] = in.readLine();
								  x=0;
								
								  for(int l=0; l<z; l++)
								  {
									//=user name
	    							if(name[l][0]!=(name[z][0]))
	    							{
	    								System.out.println("SORRY, PASSENGER NAME IS ALREADY USED!");
	    								x=1;
	    							}
	    						 }
	    					   }
							
							  for( x=1;x==1;)
							  {
								System.out.println("\n Enter Your Destination[Number like1,2,3,4,5...]:");
								a=Integer.parseInt(in.readLine());
								//parseInt is used to convert String to integer
								if(a<1||a>5)
								{
									System.out.println("Sorry!!!INVALID INPUT");
									x=1;
								}
								//checking Seat availability
								for(int d=1; d<=5; d++)
								{
	    							if(a==d)
	    							{
	    								if(Seatavailable[a]==0)
	    								{
	    									System.out.println("SORRY, SEAT IS NOT AVAILABLE!");
	    									x=1;
	    								}
	    								x=0;
	    							}
	    						}
	    					  }
	    					
							//tickets[z][1]
							String dest[]= {"  ","CHENNAI-SINGAPORE",".BANGLORE-SINGAPORE","BANGLORE-KUWAIT","BANGLORE-MALASIA","HYDERBAD-AUSTRALIA"};
							int amt[]= {0,30000,30000,35000,40000,45000};
							//Converting Integer to String,Transfer to storage array
							name[z][1] = dest[a];
	    					rupees[z][0] = amt[a];
	    					
	    					//inputing for Number of Passenger's//
	    					for(x=1; x==1;)
	    				  {
	    					System.out.print("HOW MANY PASSENGERS ARE YOU?: ");
	    					no_of_passengers[z][0] = Integer.parseInt(in.readLine());
	    		
	    						//subtract the available seat by the the number inputed//
	    						for(int p=1; p<=5; p++)
	    						{
	    							if(a==p)
	    							{
	    								print=1;
	    								Seatavailable[a] = Seatavailable[a]-no_of_passengers[z][0];
	    								if(Seatavailable[a]<0)
	    								{
	    									System.out.print("SORRY, SEAT NOT AVAILABLE " +no_of_passengers[z][0] +" person\n");
	    									Seatavailable[a] = Seatavailable[a]+no_of_passengers[z][0];
	    									System.out.print("ONLY " +Seatavailable[a] +" SEATS ARE AVAILABLE\n");
	    									x=1;
	    									print=0;
	    								}
	    								else
	    								{
	    									x=0;
	    								}
	    							}
	    						 }
	    		
	    					}
	    					for(x=1;x==1;)
	    					{
	    						System.out.print("HOW MANY PASSENGERS HAVE DISCOUNT?: ");
	    						no_of_passengers[z][1] = Integer.parseInt(in.readLine());
	    					
	    						if(no_of_passengers[z][1]>no_of_passengers[z][0])
	    						{
	    							
	    							System.out.println("INVALID INPUT!");
	    							System.out.println("NUMBER OF PASSENGERS ARE ONLY " +no_of_passengers[z][0] +"!");
	    						x=1;
	    						}
	    						else
	    						{
	    							break;
	    						}
	    					}
	    					if(print==1)
	    					{
	    						System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	    						System.out.println("**        PASSENGER'S DETAILS        **");
	    						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	    						System.out.println("PASSENGER'S NAME                    : " + name[z][0]);
	    						System.out.println("                                              ");
	    						System.out.println("PASSENGER'S DESTINATION             : " + name[z][1]);
	    						System.out.println("                                              ");
	    						System.out.println("RUPESS                              : " + rupees[z][0]);
	    						System.out.println("                                             ");
	    						System.out.println("NUMBER  OF PASSENGERS               : " + no_of_passengers[z][0]);
	    						System.out.println("                                             ");
	    						System.out.println("NUMBER OF PASSENGERS WITH DISCOUNT  : " + no_of_passengers[z][1]);
	    						System.out.println("*********************************************");
	    						name[z][2]="0";
	    						double discount=(rupees[z][0]-(rupees[z][0]*0.2))*no_of_passengers[z][1];
	    						rupees[z][2]= ((no_of_passengers[z][0]-no_of_passengers[z][1])*rupees[z][0])+discount;
	    						x=0;
	    					}
	    					z++;
	    				  }
						}
						
					else if (choice.equals("3"))
					{
			          for(x=1; x==1;)
			          {
							System.out.print("ENTER PASSENGER'S NAME: ");
								search = in.readLine();
								int s=1;
								for(int b=0;b<z;b++)
								{
									if(search.equalsIgnoreCase(name[b][0])){
										System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			    						System.out.println("**        PASSENGER'S DETAILS        **");
			    						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			    						System.out.println("PASSENGER'S NAME                    : " + name[b][0]);
			    						System.out.println("                                              ");
			    						System.out.println("PASSENGER'S DESTINATION             : " +name[b][1]);
			    						System.out.println("                                              ");
			    						System.out.println("RUPESS                              : " + rupees[b][0]);
			    						System.out.println("                                             ");
			    						System.out.println("NUMBER  OF PASSENGERS               : " + no_of_passengers[b][0]);
			    						System.out.println("                                             ");
			    						System.out.println("NUMBER OF PASSENGERS WITH DISCOUNT  : " + no_of_passengers[b][1]);
			    						System.out.println("*********************************************");
	    								s=0;
										x=0;
										if(name[b][2].equals("x"))
										{
	    									System.out.println("PASSENGER'S ALREADY PAID!");
	    									x=0;
	    								}
	    								else
	    								{
	    									name[b][2]="x";
	    									for(x=1; x==1;)
	    									{
	    										System.out.println("\nPASSENGER'S TOTAL Amount: "+rupees[b][2]);
	    										System.out.print("ENTER AMOUNT TO PAY: ");
	    										pay[b] = Integer.parseInt(in.readLine());
	    									Balance[b]=pay[b]-rupees[b][2];
	    							
	    										if(Balance[b]<0)
	    										{
	    											System.out.println("INVALID INPUT!");
	    											x=1;
	    										}
	    										else
	    										{
	    											System.out.println("BALANCE RUPEES: +"+Balance[b]);
	    											System.out.println("");
	    											x=0;
	    										}
	    									}
										}
									}
								}
								if (s==1)
								{
									System.out.println("\nPASSENGER'S NAME NOT FOUND!\n");
									for(int q=1; q==1;)
									{
									
									System.out.print("DO YOU WISH TO CONTINUE  [YES/NO]: ");
									again=in.readLine();
									
									if(again.equalsIgnoreCase("YES"))
									{
										q=0;
									}
									else if (again.equalsIgnoreCase("NO"))
									{
										q=0;
										x=0;
										
									}
									else
									{
										System.out.println("\nINVALID INPUT\n");
									}
								  }
							   }	
						     }
					     }
			          
			            else if (choice.equals("4"))
			            {	
						for(int sx=0;sx<=3;)
						{
							System.out.println("SERACH PASSENGER NAME:");
							search=in.readLine();
							int s=1;
							for(x=0;x<=z;x++)
							{
								if(search.equalsIgnoreCase(name[x][0]))
								{
									System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
									System.out.println("PASSENGER  NAME    :"+name[x][0]);
									System.out.println("  ");
									System.out.println("PASSENGER  DESTINATION    :"+name[x][1]);
									System.out.println("  ");
									System.out.println("RUPEES   :"+name[x][2]);
									System.out.println("  ");
									System.out.println("NO OF PASSANGERS    :"+no_of_passengers[x][0]);
									System.out.println("  ");
									System.out.println("NUMBER OF PASSENGERS WITH DISCOUNT  : " + no_of_passengers[x][1]);
		    						System.out.println("      ");
		    						System.out.println("TOTAL RUPEES  : " + rupees[x][2]);
		    						System.out.println("     ");
		    						if(name[x][2].equals("x"))
		    						{
		    							
			    						System.out.println("PAY AMOUNT   :"+pay[x]);
			    						System.out.println("     ");
			    						System.out.println(" BALANCE   :"+Balance[x]);
			    						System.out.println("     ");
			    						System.out.println(" STATUS:PAID!!!!");
		    						}
		    						else
		    						{
		    							System.out.println(" STATUS:NOT PAID!!!!");
		    						}
		    							System.out.println("*********************************************");
			    						System.out.println("*********************************************");
		    						
		    						
			    						s=0;
			    						sx=4;
		    						}
									
								}
								if(s==1)
								{
									System.out.println("PASSENGERS NAME NOT FOUND!!");
									sx++;
								}
							}
						}
						else if (choice.equals("5"))
						{	
						
							end=1;
							x=0;
							System.out.println("THANK YOU!!!!");
						}
						else
						{
							System.out.println("INVALID!");
							x=1;
						}
					}
				for(int c=1;c==1;)
				{
					if(end==1)
					{
						break;
					}
					System.out.println("DO yOU WANT TO CONTINUE[YES or NO]");
					YesorNo=in.readLine();
					if(YesorNo.equalsIgnoreCase("YES"))
					{
						x=1;
						c=0;
					}
					else if (YesorNo.equalsIgnoreCase("NO"))
					{
						System.out.println("THANK YOU!!!!");
						break;
					}
					else
					{
						System.out.println("INVALID INPUT!!!!");
						c=1;
					}
				}
			  }
			  i=4;		
			}
					else
					{
						System.out.println("INVALID USER orPASSWORD!!!!\n");
						i++;
					}
		       }
	    }
}	
	


	




	


		
