package com;

import java.util.Scanner;

public class Start extends UserData implements Directions {

	Scanner sc = new Scanner(System.in);
	int counts = 0;

	public Start(String userName, String dateOfBirth, String gender, int userAge) {

		super(userName, dateOfBirth, gender, userAge);
		begin();

	}
	
	  public Start() {
	  
	  }
	 
	
	public void begin() {

		
		System.out.println("Welcome to Zombieland.. \n where do you want move");
		System.out.println("            ************           ");
		System.out.println("1.North of Zombieland"+"\n"+"2.South of Zombieland"+"\n"+"3. for more options");
		int choice = sc.nextInt();
		if(choice==1)
		{
			counter();
			north();
		}
		else if(choice == 2){
			counter();
			south();
		}
		else if(choice ==3)
		{
			System.out.println("4. East of Zombieland"+"\n"+"5.South of Zombieland");
			counter();
			choice = sc.nextInt();
		}
		else
		{
			System.out.println("please choose the proper option to proceed further");
			counter();
			begin();
		}
		//choice = sc.nextInt();
		if(choice == 4)
		{
			counter();
			east();
		}
		else if(choice == 5)
		{
			counter();
			west();
		}
		/*System.out.println("please enter your choice");

		

		if (i == 1) {

			System.out.println("You have entered into the North of Jombiland");

			System.out.println("you have three weapons to pick and proceed forward");

			System.out.println("1.Gun 2.Sword 3.Granite 4.Missile Launcher");

			int choice = sc.nextInt();

			if (choice == 1) {

				gun();

			}

			else if (choice == 2) {

				Grenade();

			}

			else if (choice == 3) {

				knife();

			}

		}

		else if (i == 2) {

			System.out.println("You have entered into the South of Jombiland");

		} else if (i == 3) {

			System.out.println("You have entered into the west of Jombiland");

		}*/

	}
	
	@Override
	public void north() {
		// TODO Auto-generated method stub
		North north = new North();
		north.begin(counts);
		counter();
		
	}

	@Override
	public void south() {
		// TODO Auto-generated method stub
		South south = new South();
		south.begin(counts);
		counter();
		
	}

	@Override
	public void east() {
		// TODO Auto-generated method stub
		East east = new East();
		east.begin();
		counter();
		
	}

	@Override
	public void west() {
		// TODO Auto-generated method stub
		West west = new West();
		west.begin();
		counter();
	}
	public void counter()
	{
		counts=counts+1;
	}

}