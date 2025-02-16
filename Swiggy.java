import java.util.Scanner;

class Swiggy {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws InterruptedException {
       System.out.println("\t\t\tWELCOME TO SWIGGY ");
       System.out.println("\t\t\t-------------------- ");
       System.out.println("\t\t\tPLEASE SELECT THE HOTEL");
       System.out.println("\t\t\t1.HOTEL BUHARI\n\t\t\t2.RAM HOTEL\n\t\t\t3.HOTEL NEEVI\n\t\t\t4.JALAL HOTEL");
        
        int hotel = sc.nextInt();
        
        switch (hotel) {
            case 1: {
                System.out.println("\t\t\tYOU SELECTED HOTEL BUHARI");
                System.out.println("\t\t\t1. BUTTER NAAN\n\t\t\t2. NORMAL NAAN\n\t\t\t3. CHEESE NAAN");
                int food = sc.nextInt();
                
                switch (food) {
                    case 1: {
                        double price = 50;
                        System.out.println("\t\t\tPER QUANTITY OF YOUR BUTTER NAAN IS: " + price);
                        System.out.print("\t\t\tENTER THE QUANTITY: ");
                        int qty = sc.nextInt();
                        double qty_price = price * qty;
                        System.out.println("****Processing****");
                        Thread.sleep(3000);
                        System.out.println("\t\t\tYou need to pay the amount: " + qty_price);
                        System.out.println("1. CONTINUE\n2. EXIT");
                        int con = sc.nextInt();
                        
                        switch (con) {
                            case 1: {
                                System.out.println("You are redirecting to payment page");
                                Thread.sleep(3000);
                                System.out.println("1. GPAY\n2. PHONEPAY");
                                int pay = sc.nextInt();
                                switch (pay) {
                                    case 1: {
                                        System.out.println("Your bill Amount: " + qty_price);
                                        System.out.print("ENTER YOUR BILL AMOUNT: ");
                                        int bill_amnt = sc.nextInt();
                                        if (bill_amnt == qty_price) {
                                            System.out.print("Your OTP is: ");
                                            int sys_otp = (int) (Math.random() * 9999 + 9999);
                                            System.out.println(sys_otp);
                                            System.out.print("ENTER THE OTP: ");
                                            int man_otp = sc.nextInt();
                                            if (sys_otp == man_otp) {
                                                System.out.println("YOUR OTP IS CORRECT....\nYour order is placed. HAPPY CUSTOMER!");
                                            } else {
                                                System.out.println("INVALID OTP");
                                            }
                                        } else {
                                            System.out.println("INVALID AMOUNT");
                                        }
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("Your bill Amount: " + qty_price);
                                        System.out.print("ENTER YOUR BILL AMOUNT: ");
                                        int bill_amnt = sc.nextInt();
                                        if (bill_amnt == qty_price) {
                                            System.out.print("Your OTP is: ");
                                            int sys_otp = (int) (Math.random() * 9999 + 9999);
                                            System.out.println(sys_otp);
                                            System.out.print("ENTER THE OTP: ");
                                            int man_otp = sc.nextInt();
                                            if (sys_otp == man_otp) {
                                                System.out.println("YOUR OTP IS CORRECT....\nYour order is placed. HAPPY CUSTOMER!");
                                            } else {
                                                System.out.println("INVALID OTP");
                                            }
                                        } else {
                                            System.out.println("INVALID AMOUNT");
                                        }
                                        break;
                                    }
                                    default:
                                        System.out.println("INVALID PAYMENT SELECTION");
                                        break;
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("YOUR ORDER CANCELLED");
                                break;
                            }
                            default:
                                System.out.println("INVALID SELECTION");
                                break;
                        }
                        break;
                    }
                    case 2: {
                        double price = 40;
                        System.out.println("\t\t\tPER QUANTITY OF YOUR NORMAL NAAN IS: " + price);
                        System.out.print("\t\t\tENTER THE QUANTITY: ");
                        int qty_food = sc.nextInt();
                        double qty_price = qty_food * price;
                        System.out.println("****Processing****");
                        Thread.sleep(3000);
                        System.out.println("\t\t\tYou need to pay the amount: " + qty_price);
                        System.out.println("1. CONTINUE\n2. EXIT");
                        int con = sc.nextInt();

                        switch (con) {
                            case 1: {
                                System.out.println("You are redirecting to payment page");
                                Thread.sleep(3000);
                                System.out.println("1. GPAY\n2. PHONEPAY");
                                int pay = sc.nextInt();
                                switch (pay) {
                                    case 1: {
                                        System.out.println("Your bill Amount: " + qty_price);
                                        System.out.print("ENTER YOUR BILL AMOUNT: ");
                                        int bill_amnt = sc.nextInt();
                                        if (bill_amnt == qty_price) {
                                            System.out.print("Your OTP is: ");
                                            int sys_otp = (int) (Math.random() * 9999 + 9999);
                                            System.out.println(sys_otp);
                                            System.out.print("ENTER THE OTP: ");
                                            int man_otp = sc.nextInt();
                                            if (sys_otp == man_otp) {
                                                System.out.println("YOUR OTP IS CORRECT....\nYour order is placed. HAPPY CUSTOMER!");
                                            } else {
                                                System.out.println("INVALID OTP");
                                            }
                                        } else {
                                            System.out.println("INVALID AMOUNT");
                                        }
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("Your bill Amount: " + qty_price);
                                        System.out.print("ENTER YOUR BILL AMOUNT: ");
                                        int bill_amnt = sc.nextInt();
                                        if (bill_amnt == qty_price) {
                                            System.out.print("Your OTP is: ");
                                            int sys_otp = (int) (Math.random() * 9999 + 9999);
                                            System.out.println(sys_otp);
                                            System.out.print("ENTER THE OTP: ");
                                            int man_otp = sc.nextInt();
                                            if (sys_otp == man_otp) {
                                                System.out.println("YOUR OTP IS CORRECT....\nYour order is placed. HAPPY CUSTOMER!");
                                            } else {
                                                System.out.println("INVALID OTP");
                                            }
                                        } else {
                                            System.out.println("INVALID AMOUNT");
                                        }
                                        break;
                                    }
                                    default:
                                        System.out.println("INVALID PAYMENT SELECTION");
                                        break;
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("YOUR ORDER CANCELLED");
                                break;
                            }
                            default:
                                System.out.println("INVALID SELECTION");
                                break;
                        }
                        break;
                    }
              
			case 3: {
				double price = 60;
				System.out.println("\t\t\tPER QUANTITY OF YOUR CHEESE NAAN IS: " + price);
				System.out.print("\t\t\tENTER THE QUANTITY: ");
				int qty = sc.nextInt();
				double qty_price = price * qty;
				System.out.println("****Processing****");
				Thread.sleep(3000);
				System.out.println("\t\t\tYou need to pay the amount: " + qty_price);
				System.out.println("1. CONTINUE\n2. EXIT");
				int con = sc.nextInt();
				
				switch (con) {
					case 1: {
						System.out.println("You are redirecting to payment page");
						Thread.sleep(3000);
						System.out.println("1. GPAY\n2. PHONEPAY");
						int pay = sc.nextInt();
						switch (pay) {
							case 1: {
								System.out.println("Your bill Amount: " + qty_price);
								System.out.print("ENTER YOUR BILL AMOUNT: ");
								int bill_amnt = sc.nextInt();
								if (bill_amnt == qty_price) {
									System.out.print("Your OTP is: ");
									int sys_otp = (int) (Math.random() * 9999 + 9999);
									System.out.println(sys_otp);
									System.out.print("ENTER THE OTP: ");
									int man_otp = sc.nextInt();
									if (sys_otp == man_otp) {
										System.out.println("YOUR OTP IS CORRECT....\nYour order is placed. HAPPY CUSTOMER!");
									} else {
										System.out.println("INVALID OTP");
									}
								} else {
									System.out.println("INVALID AMOUNT");
								}
								break;
							}
							case 2: {
								System.out.println("Your bill Amount: " + qty_price);
								System.out.print("ENTER YOUR BILL AMOUNT: ");
								int bill_amnt = sc.nextInt();
								if (bill_amnt == qty_price) {
									System.out.print("Your OTP is: ");
									int sys_otp = (int) (Math.random() * 9999 + 9999);
									System.out.println(sys_otp);
									System.out.print("ENTER THE OTP: ");
									int man_otp = sc.nextInt();
									if (sys_otp == man_otp) {
										System.out.println("YOUR OTP IS CORRECT....\nYour order is placed. HAPPY CUSTOMER!");
									} else {
										System.out.println("INVALID OTP");
									}
								} else {
									System.out.println("INVALID AMOUNT");
								}
								break;
							}
							default:
								System.out.println("INVALID PAYMENT SELECTION");
								break;
						}
						break;
					}
					case 2: {
						System.out.println("YOUR ORDER CANCELLED");
						break;
					}
					default:
						System.out.println("INVALID SELECTION");
						break;
				}
				break;
			}
			default:
                       System.out.println("INVALID FOOD SELECTION");
                        break;
              }
               break;
            }
            case 2: {
                System.out.println("\t\t\tYOU SELECTED RAM HOTEL");
                System.out.println("\t\t\t1. CHICKEN RICE \n\t\t\t2. VEG RICE \n\t\t\t3. EGG RICE");
                int food = sc.nextInt();
                
                switch (food) {
                    case 1: {
                        double price = 110;
                        System.out.println("\t\t\tPER QUANTITY OF YOUR CHICKEN RICE IS: " + price);
                        System.out.print("\t\t\tENTER THE QUANTITY: ");
                        int qty = sc.nextInt();
                        double qty_price = price * qty;
                        System.out.println("****Processing****");
                        Thread.sleep(3000);
                        System.out.println("\t\t\tYou need to pay the amount: " + qty_price);
                        System.out.println("1. CONTINUE\n2. EXIT");
                        int con = sc.nextInt();
                        
                        switch (con) {
                            case 1: {
                                System.out.println("You are redirecting to payment page");
                                Thread.sleep(3000);
                                System.out.println("1. GPAY\n2. PHONEPAY");
                                int pay = sc.nextInt();
                                switch (pay) {
                                    case 1: {
                                        System.out.println("Your bill Amount: " + qty_price);
                                        System.out.print("ENTER YOUR BILL AMOUNT: ");
                                        int bill_amnt = sc.nextInt();
                                        if (bill_amnt == qty_price) {
                                            System.out.print("Your OTP is: ");
                                            int sys_otp = (int) (Math.random() * 9999 + 9999);
                                            System.out.println(sys_otp);
                                            System.out.print("ENTER THE OTP: ");
                                            int man_otp = sc.nextInt();
                                            if (sys_otp == man_otp) {
                                                System.out.println("YOUR OTP IS CORRECT....\nYour order is placed. HAPPY CUSTOMER!");
                                            } else {
                                                System.out.println("INVALID OTP");
                                            }
                                        } else {
                                            System.out.println("INVALID AMOUNT");
                                        }
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("Your bill Amount: " + qty_price);
                                        System.out.print("ENTER YOUR BILL AMOUNT: ");
                                        int bill_amnt = sc.nextInt();
                                        if (bill_amnt == qty_price) {
                                            System.out.print("Your OTP is: ");
                                            int sys_otp = (int) (Math.random() * 9999 + 9999);
                                            System.out.println(sys_otp);
                                            System.out.print("ENTER THE OTP: ");
                                            int man_otp = sc.nextInt();
                                            if (sys_otp == man_otp) {
                                                System.out.println("YOUR OTP IS CORRECT....\nYour order is placed. HAPPY CUSTOMER!");
                                            } else {
                                                System.out.println("INVALID OTP");
                                            }
                                        } else {
                                            System.out.println("INVALID AMOUNT");
                                        }
                                        break;
                                    }
                                    default:
                                        System.out.println("INVALID PAYMENT SELECTION");
                                        break;
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("YOUR ORDER CANCELLED");
                                break;
                            }
                            default:
                                System.out.println("INVALID SELECTION");
                                break;
                        }
                        break;
                    }
                    case 2: {
                        double price = 80;
                        System.out.println("\t\t\tPER QUANTITY OF YOUR VEG RICE IS: " + price);
                        System.out.print("\t\t\tENTER THE QUANTITY: ");
                        int qty_food = sc.nextInt();
                        double qty_price = qty_food * price;
                        System.out.println("****Processing****");
                        Thread.sleep(3000);
                        System.out.println("\t\t\tYou need to pay the amount: " + qty_price);
                        System.out.println("1. CONTINUE\n2. EXIT");
                        int con = sc.nextInt();

                        switch (con) {
                            case 1: {
                                System.out.println("You are redirecting to payment page");
                                Thread.sleep(3000);
                                System.out.println("1. GPAY\n2. PHONEPAY");
                                int pay = sc.nextInt();
                                switch (pay) {
                                    case 1: {
                                        System.out.println("Your bill Amount: " + qty_price);
                                        System.out.print("ENTER YOUR BILL AMOUNT: ");
                                        int bill_amnt = sc.nextInt();
                                        if (bill_amnt == qty_price) {
                                            System.out.print("Your OTP is: ");
                                            int sys_otp = (int) (Math.random() * 9999 + 9999);
                                            System.out.println(sys_otp);
                                            System.out.print("ENTER THE OTP: ");
                                            int man_otp = sc.nextInt();
                                            if (sys_otp == man_otp) {
                                                System.out.println("YOUR OTP IS CORRECT....\nYour order is placed. HAPPY CUSTOMER!");
                                            } else {
                                                System.out.println("INVALID OTP");
                                            }
                                        } else {
                                            System.out.println("INVALID AMOUNT");
                                        }
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("Your bill Amount: " + qty_price);
                                        System.out.print("ENTER YOUR BILL AMOUNT: ");
                                        int bill_amnt = sc.nextInt();
                                        if (bill_amnt == qty_price) {
                                            System.out.print("Your OTP is: ");
                                            int sys_otp = (int) (Math.random() * 9999 + 9999);
                                            System.out.println(sys_otp);
                                            System.out.print("ENTER THE OTP: ");
                                            int man_otp = sc.nextInt();
                                            if (sys_otp == man_otp) {
                                                System.out.println("YOUR OTP IS CORRECT....\nYour order is placed. HAPPY CUSTOMER!");
                                            } else {
                                                System.out.println("INVALID OTP");
                                            }
                                        } else {
                                            System.out.println("INVALID AMOUNT");
                                        }
                                        break;
                                    }
                                    default:
                                        System.out.println("INVALID PAYMENT SELECTION");
                                        break;
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("YOUR ORDER CANCELLED");
                                break;
                            }
                            default:
                                System.out.println("INVALID SELECTION");
                                break;
                        }
                        break;
                    }
              
			case 3: {
				double price = 90;
				System.out.println("\t\t\tPER QUANTITY OF YOUR EGG RICE IS: " + price);
				System.out.print("\t\t\tENTER THE QUANTITY: ");
				int qty = sc.nextInt();
				double qty_price = price * qty;
				System.out.println("****Processing****");
				Thread.sleep(3000);
				System.out.println("\t\t\tYou need to pay the amount: " + qty_price);
				System.out.println("1. CONTINUE\n2. EXIT");
				int con = sc.nextInt();
				
				switch (con) {
					case 1: {
						System.out.println("You are redirecting to payment page");
						Thread.sleep(3000);
						System.out.println("1. GPAY\n2. PHONEPAY");
						int pay = sc.nextInt();
						switch (pay) {
							case 1: {
								System.out.println("Your bill Amount: " + qty_price);
								System.out.print("ENTER YOUR BILL AMOUNT: ");
								int bill_amnt = sc.nextInt();
								if (bill_amnt == qty_price) {
									System.out.print("Your OTP is: ");
									int sys_otp = (int) (Math.random() * 9999 + 9999);
									System.out.println(sys_otp);
									System.out.print("ENTER THE OTP: ");
									int man_otp = sc.nextInt();
									if (sys_otp == man_otp) {
										System.out.println("YOUR OTP IS CORRECT....\nYour order is placed. HAPPY CUSTOMER!");
									} else {
										System.out.println("INVALID OTP");
									}
								} else {
									System.out.println("INVALID AMOUNT");
								}
								break;
							}
							case 2: {
								System.out.println("Your bill Amount: " + qty_price);
								System.out.print("ENTER YOUR BILL AMOUNT: ");
								int bill_amnt = sc.nextInt();
								if (bill_amnt == qty_price) {
									System.out.print("Your OTP is: ");
									int sys_otp = (int) (Math.random() * 9999 + 9999);
									System.out.println(sys_otp);
									System.out.print("ENTER THE OTP: ");
									int man_otp = sc.nextInt();
									if (sys_otp == man_otp) {
										System.out.println("YOUR OTP IS CORRECT....\nYour order is placed. HAPPY CUSTOMER!");
									} else {
										System.out.println("INVALID OTP");
									}
								} else {
									System.out.println("INVALID AMOUNT");
								}
								break;
							}
							default:
								System.out.println("INVALID PAYMENT SELECTION");
								break;
						}
						break;
					}
					case 2: {
						System.out.println("YOUR ORDER CANCELLED");
						break;
					}
					default:
						System.out.println("INVALID SELECTION");
						break;
				}
				break;
			}
			default:
                       System.out.println("INVALID FOOD SELECTION");
                        break;
              }
               break;
            }
			case 3: {
                System.out.println("\t\t\tYOU SELECTED HOTEL NEEVI");
                System.out.println("\t\t\t1. NON-VEG MEALS \n\t\t\t2. VEG MEALS \n\t\t\t3. VEG BRIYANI");
                int food = sc.nextInt();
                
                switch (food) {
                    case 1: {
                        double price = 180;
                        System.out.println("\t\t\tPER QUANTITY OF YOUR NON-VEG MEAL IS: " + price);
                        System.out.print("\t\t\tENTER THE QUANTITY: ");
                        int qty = sc.nextInt();
                        double qty_price = price * qty;
                        System.out.println("****Processing****");
                        Thread.sleep(3000);
                        System.out.println("\t\t\tYou need to pay the amount: " + qty_price);
                        System.out.println("1. CONTINUE\n2. EXIT");
                        int con = sc.nextInt();
                        
                        switch (con) {
                            case 1: {
                                System.out.println("You are redirecting to payment page");
                                Thread.sleep(3000);
                                System.out.println("1. GPAY\n2. PHONEPAY");
                                int pay = sc.nextInt();
                                switch (pay) {
                                    case 1: {
                                        System.out.println("Your bill Amount: " + qty_price);
                                        System.out.print("ENTER YOUR BILL AMOUNT: ");
                                        int bill_amnt = sc.nextInt();
                                        if (bill_amnt == qty_price) {
                                            System.out.print("Your OTP is: ");
                                            int sys_otp = (int) (Math.random() * 9999 + 9999);
                                            System.out.println(sys_otp);
                                            System.out.print("ENTER THE OTP: ");
                                            int man_otp = sc.nextInt();
                                            if (sys_otp == man_otp) {
                                                System.out.println("YOUR OTP IS CORRECT....\nYour order is placed. HAPPY CUSTOMER!");
                                            } else {
                                                System.out.println("INVALID OTP");
                                            }
                                        } else {
                                            System.out.println("INVALID AMOUNT");
                                        }
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("Your bill Amount: " + qty_price);
                                        System.out.print("ENTER YOUR BILL AMOUNT: ");
                                        int bill_amnt = sc.nextInt();
                                        if (bill_amnt == qty_price) {
                                            System.out.print("Your OTP is: ");
                                            int sys_otp = (int) (Math.random() * 9999 + 9999);
                                            System.out.println(sys_otp);
                                            System.out.print("ENTER THE OTP: ");
                                            int man_otp = sc.nextInt();
                                            if (sys_otp == man_otp) {
                                                System.out.println("YOUR OTP IS CORRECT....\nYour order is placed. HAPPY CUSTOMER!");
                                            } else {
                                                System.out.println("INVALID OTP");
                                            }
                                        } else {
                                            System.out.println("INVALID AMOUNT");
                                        }
                                        break;
                                    }
                                    default:
                                        System.out.println("INVALID PAYMENT SELECTION");
                                        break;
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("YOUR ORDER CANCELLED");
                                break;
                            }
                            default:
                                System.out.println("INVALID SELECTION");
                                break;
                        }
                        break;
                    }
                    case 2: {
                        double price = 150;
                        System.out.println("\t\t\tPER QUANTITY OF YOUR VEG MEAL IS: " + price);
                        System.out.print("\t\t\tENTER THE QUANTITY: ");
                        int qty_food = sc.nextInt();
                        double qty_price = qty_food * price;
                        System.out.println("****Processing****");
                        Thread.sleep(3000);
                        System.out.println("\t\t\tYou need to pay the amount: " + qty_price);
                        System.out.println("1. CONTINUE\n2. EXIT");
                        int con = sc.nextInt();

                        switch (con) {
                            case 1: {
                                System.out.println("You are redirecting to payment page");
                                Thread.sleep(3000);
                                System.out.println("1. GPAY\n2. PHONEPAY");
                                int pay = sc.nextInt();
                                switch (pay) {
                                    case 1: {
                                        System.out.println("Your bill Amount: " + qty_price);
                                        System.out.print("ENTER YOUR BILL AMOUNT: ");
                                        int bill_amnt = sc.nextInt();
                                        if (bill_amnt == qty_price) {
                                            System.out.print("Your OTP is: ");
                                            int sys_otp = (int) (Math.random() * 9999 + 9999);
                                            System.out.println(sys_otp);
                                            System.out.print("ENTER THE OTP: ");
                                            int man_otp = sc.nextInt();
                                            if (sys_otp == man_otp) {
                                                System.out.println("YOUR OTP IS CORRECT....\nYour order is placed. HAPPY CUSTOMER!");
                                            } else {
                                                System.out.println("INVALID OTP");
                                            }
                                        } else {
                                            System.out.println("INVALID AMOUNT");
                                        }
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("Your bill Amount: " + qty_price);
                                        System.out.print("ENTER YOUR BILL AMOUNT: ");
                                        int bill_amnt = sc.nextInt();
                                        if (bill_amnt == qty_price) {
                                            System.out.print("Your OTP is: ");
                                            int sys_otp = (int) (Math.random() * 9999 + 9999);
                                            System.out.println(sys_otp);
                                            System.out.print("ENTER THE OTP: ");
                                            int man_otp = sc.nextInt();
                                            if (sys_otp == man_otp) {
                                                System.out.println("YOUR OTP IS CORRECT....\nYour order is placed. HAPPY CUSTOMER!");
                                            } else {
                                                System.out.println("INVALID OTP");
                                            }
                                        } else {
                                            System.out.println("INVALID AMOUNT");
                                        }
                                        break;
                                    }
                                    default:
                                        System.out.println("INVALID PAYMENT SELECTION");
                                        break;
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("YOUR ORDER CANCELLED");
                                break;
                            }
                            default:
                                System.out.println("INVALID SELECTION");
                                break;
                        }
                        break;
                    }
              
			case 3: {
				double price = 100;
				System.out.println("\t\t\tPER QUANTITY OF YOUR VEG BRIYANI IS: " + price);
				System.out.print("\t\t\tENTER THE QUANTITY: ");
				int qty = sc.nextInt();
				double qty_price = price * qty;
				System.out.println("****Processing****");
				Thread.sleep(3000);
				System.out.println("\t\t\tYou need to pay the amount: " + qty_price);
				System.out.println("1. CONTINUE\n2. EXIT");
				int con = sc.nextInt();
				
				switch (con) {
					case 1: {
						System.out.println("You are redirecting to payment page");
						Thread.sleep(3000);
						System.out.println("1. GPAY\n2. PHONEPAY");
						int pay = sc.nextInt();
						switch (pay) {
							case 1: {
								System.out.println("Your bill Amount: " + qty_price);
								System.out.print("ENTER YOUR BILL AMOUNT: ");
								int bill_amnt = sc.nextInt();
								if (bill_amnt == qty_price) {
									System.out.print("Your OTP is: ");
									int sys_otp = (int) (Math.random() * 9999 + 9999);
									System.out.println(sys_otp);
									System.out.print("ENTER THE OTP: ");
									int man_otp = sc.nextInt();
									if (sys_otp == man_otp) {
										System.out.println("YOUR OTP IS CORRECT....\nYour order is placed. HAPPY CUSTOMER!");
									} else {
										System.out.println("INVALID OTP");
									}
								} else {
									System.out.println("INVALID AMOUNT");
								}
								break;
							}
							case 2: {
								System.out.println("Your bill Amount: " + qty_price);
								System.out.print("ENTER YOUR BILL AMOUNT: ");
								int bill_amnt = sc.nextInt();
								if (bill_amnt == qty_price) {
									System.out.print("Your OTP is: ");
									int sys_otp = (int) (Math.random() * 9999 + 9999);
									System.out.println(sys_otp);
									System.out.print("ENTER THE OTP: ");
									int man_otp = sc.nextInt();
									if (sys_otp == man_otp) {
										System.out.println("YOUR OTP IS CORRECT....\nYour order is placed. HAPPY CUSTOMER!");
									} else {
										System.out.println("INVALID OTP");
									}
								} else {
									System.out.println("INVALID AMOUNT");
								}
								break;
							}
							default:
								System.out.println("INVALID PAYMENT SELECTION");
								break;
						}
						break;
					}
					case 2: {
						System.out.println("YOUR ORDER CANCELLED");
						break;
					}
					default:
						System.out.println("INVALID SELECTION");
						break;
				}
				break;
			}
			default:
                       System.out.println("INVALID FOOD SELECTION");
                        break;
              }
               break;
            }
			case 4: {
                System.out.println("\t\t\tYOU SELECTED JALAL HOTEL");
                System.out.println("\t\t\t1. CHICKEN BRIYANI \n\t\t\t2. MUTTON BRIYANI \n\t\t\t3. GRILLED CHICKEN");
                int food = sc.nextInt();
                
                switch (food) {
                    case 1: {
                        double price = 160;
                        System.out.println("\t\t\tPER QUANTITY OF YOUR CHICKEN BRIYANI IS: " + price);
                        System.out.print("\t\t\tENTER THE QUANTITY: ");
                        int qty = sc.nextInt();
                        double qty_price = price * qty;
                        System.out.println("****Processing****");
                        Thread.sleep(3000);
                        System.out.println("\t\t\tYou need to pay the amount: " + qty_price);
                        System.out.println("1. CONTINUE\n2. EXIT");
                        int con = sc.nextInt();
                        
                        switch (con) {
                            case 1: {
                                System.out.println("You are redirecting to payment page");
                                Thread.sleep(3000);
                                System.out.println("1. GPAY\n2. PHONEPAY");
                                int pay = sc.nextInt();
                                switch (pay) {
                                    case 1: {
                                        System.out.println("Your bill Amount: " + qty_price);
                                        System.out.print("ENTER YOUR BILL AMOUNT: ");
                                        int bill_amnt = sc.nextInt();
                                        if (bill_amnt == qty_price) {
                                            System.out.print("Your OTP is: ");
                                            int sys_otp = (int) (Math.random() * 9999 + 9999);
                                            System.out.println(sys_otp);
                                            System.out.print("ENTER THE OTP: ");
                                            int man_otp = sc.nextInt();
                                            if (sys_otp == man_otp) {
                                                System.out.println("YOUR OTP IS CORRECT....\nYour order is placed. HAPPY CUSTOMER!");
                                            } else {
                                                System.out.println("INVALID OTP");
                                            }
                                        } else {
                                            System.out.println("INVALID AMOUNT");
                                        }
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("Your bill Amount: " + qty_price);
                                        System.out.print("ENTER YOUR BILL AMOUNT: ");
                                        int bill_amnt = sc.nextInt();
                                        if (bill_amnt == qty_price) {
                                            System.out.print("Your OTP is: ");
                                            int sys_otp = (int) (Math.random() * 9999 + 9999);
                                            System.out.println(sys_otp);
                                            System.out.print("ENTER THE OTP: ");
                                            int man_otp = sc.nextInt();
                                            if (sys_otp == man_otp) {
                                                System.out.println("YOUR OTP IS CORRECT....\nYour order is placed. HAPPY CUSTOMER!");
                                            } else {
                                                System.out.println("INVALID OTP");
                                            }
                                        } else {
                                            System.out.println("INVALID AMOUNT");
                                        }
                                        break;
                                    }
                                    default:
                                        System.out.println("INVALID PAYMENT SELECTION");
                                        break;
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("YOUR ORDER CANCELLED");
                                break;
                            }
                            default:
                                System.out.println("INVALID SELECTION");
                                break;
                        }
                        break;
                    }
                    case 2: {
                        double price = 250;
                        System.out.println("\t\t\tPER QUANTITY OF YOUR MUTTON BRIYANI IS: " + price);
                        System.out.print("\t\t\tENTER THE QUANTITY: ");
                        int qty_food = sc.nextInt();
                        double qty_price = qty_food * price;
                        System.out.println("****Processing****");
                        Thread.sleep(3000);
                        System.out.println("\t\t\tYou need to pay the amount: " + qty_price);
                        System.out.println("1. CONTINUE\n2. EXIT");
                        int con = sc.nextInt();

                        switch (con) {
                            case 1: {
                                System.out.println("You are redirecting to payment page");
                                Thread.sleep(3000);
                                System.out.println("1. GPAY\n2. PHONEPAY");
                                int pay = sc.nextInt();
                                switch (pay) {
                                    case 1: {
                                        System.out.println("Your bill Amount: " + qty_price);
                                        System.out.print("ENTER YOUR BILL AMOUNT: ");
                                        int bill_amnt = sc.nextInt();
                                        if (bill_amnt == qty_price) {
                                            System.out.print("Your OTP is: ");
                                            int sys_otp = (int) (Math.random() * 9999 + 9999);
                                            System.out.println(sys_otp);
                                            System.out.print("ENTER THE OTP: ");
                                            int man_otp = sc.nextInt();
                                            if (sys_otp == man_otp) {
                                                System.out.println("YOUR OTP IS CORRECT....\nYour order is placed. HAPPY CUSTOMER!");
                                            } else {
                                                System.out.println("INVALID OTP");
                                            }
                                        } else {
                                            System.out.println("INVALID AMOUNT");
                                        }
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("Your bill Amount: " + qty_price);
                                        System.out.print("ENTER YOUR BILL AMOUNT: ");
                                        int bill_amnt = sc.nextInt();
                                        if (bill_amnt == qty_price) {
                                            System.out.print("Your OTP is: ");
                                            int sys_otp = (int) (Math.random() * 9999 + 9999);
                                            System.out.println(sys_otp);
                                            System.out.print("ENTER THE OTP: ");
                                            int man_otp = sc.nextInt();
                                            if (sys_otp == man_otp) {
                                                System.out.println("YOUR OTP IS CORRECT....\nYour order is placed. HAPPY CUSTOMER!");
                                            } else {
                                                System.out.println("INVALID OTP");
                                            }
                                        } else {
                                            System.out.println("INVALID AMOUNT");
                                        }
                                        break;
                                    }
                                    default:
                                        System.out.println("INVALID PAYMENT SELECTION");
                                        break;
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("YOUR ORDER CANCELLED");
                                break;
                            }
                            default:
                                System.out.println("INVALID SELECTION");
                                break;
                        }
                        break;
                    }
              
			case 3: {
				double price = 220;
				System.out.println("\t\t\tPER QUANTITY OF YOUR GRILLED CHICKEN IS: " + price);
				System.out.print("\t\t\tENTER THE QUANTITY: ");
				int qty = sc.nextInt();
				double qty_price = price * qty;
				System.out.println("****Processing****");
				Thread.sleep(3000);
				System.out.println("\t\t\tYou need to pay the amount: " + qty_price);
				System.out.println("1. CONTINUE\n2. EXIT");
				int con = sc.nextInt();
				
				switch (con) {
					case 1: {
						System.out.println("You are redirecting to payment page");
						Thread.sleep(3000);
						System.out.println("1. GPAY\n2. PHONEPAY");
						int pay = sc.nextInt();
						switch (pay) {
							case 1: {
								System.out.println("Your bill Amount: " + qty_price);
								System.out.print("ENTER YOUR BILL AMOUNT: ");
								int bill_amnt = sc.nextInt();
								if (bill_amnt == qty_price) {
									System.out.print("Your OTP is: ");
									int sys_otp = (int) (Math.random() * 9999 + 9999);
									System.out.println(sys_otp);
									System.out.print("ENTER THE OTP: ");
									int man_otp = sc.nextInt();
									if (sys_otp == man_otp) {
										System.out.println("YOUR OTP IS CORRECT....\nYour order is placed. HAPPY CUSTOMER!");
									} else {
										System.out.println("INVALID OTP");
									}
								} else {
									System.out.println("INVALID AMOUNT");
								}
								break;
							}
							case 2: {
								System.out.println("Your bill Amount: " + qty_price);
								System.out.print("ENTER YOUR BILL AMOUNT: ");
								int bill_amnt = sc.nextInt();
								if (bill_amnt == qty_price) {
									System.out.print("Your OTP is: ");
									int sys_otp = (int) (Math.random() * 9999 + 9999);
									System.out.println(sys_otp);
									System.out.print("ENTER THE OTP: ");
									int man_otp = sc.nextInt();
									if (sys_otp == man_otp) {
										System.out.println("YOUR OTP IS CORRECT....\nYour order is placed. HAPPY CUSTOMER!");
									} else {
										System.out.println("INVALID OTP");
									}
								} else {
									System.out.println("INVALID AMOUNT");
								}
								break;
							}
							default:
								System.out.println("INVALID PAYMENT SELECTION");
								break;
						}
						break;
					}
					case 2: {
						System.out.println("YOUR ORDER CANCELLED");
						break;
					}
					default:
						System.out.println("INVALID SELECTION");
						break;
				}
				break;
			}
			default:
                       System.out.println("INVALID FOOD SELECTION");
                        break;
              }
               break;
            }
            default:
                System.out.println("INVALID HOTEL SELECTION");
                break;
        }
    }
}

