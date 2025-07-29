package Machine;

import java.util.Random;

public class Queue {
	
	private Long id;
	
	private String homeTown;
	
	private String tckn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	public String getTckn() {
		return tckn;
	}

	
	boolean control = true;
	
	public void setTckn(String tckn) {
		
		if(tckn.length()==11) //Here wee look at tckn word how much character and is it equal to 11 character
		{  
			for(int i=0; i<tckn.length(); i++)
			{
				char character = tckn.charAt(i); // burda 5674322223 diye bir tc girdigini dusunelim i 0 olunca 5 e bakiyor i 1 olunca 6 ya bakiyor i2 olunca 7 ye bakiyor.
				
				if(Character.isDigit(character)) // Burda yukarda alinan degeri alip sayi mi yoksa harf mi ona bakar ve ona bore boolean deger dondurur
				{
					control= true;
					
					
				}else {
					control=false;
					break;
				}
				
				
				
			}if(control) {
				
				//It uses for the produce new and random numbers 
				Random random = new Random();
				
				// now we will give random number between 0-100 to user.
				int queueNum = random.nextInt(100); //Burada 100 dermek 0 ile 100 arasinda numara verdirmek icin
				
				printScreen("Your Queue Num : " +queueNum);
			}else {
				printScreen("Please enter all characters number.");
			}
			
			
		}else {
			printScreen("TC number must be 11 character");
		}
		
		this.tckn = tckn;
	}
	
	public void printScreen(String text) {
		
		System.out.println(text);
	}
	

}



