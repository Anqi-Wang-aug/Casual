import java.util.Timer;
import java.util.TimerTask;

public class Pet {
	private int fed;
	private int thirst;
	private int wantPlay;
	private boolean dead;
	
	public Pet() {
		fed = 100;
		thirst = 100;
		wantPlay = 100;
		dead = false;
	}
	
	public void feedFood() {
		if(dead!=true) fed = fed+3;
	}
	
	public void giveWater() {
		if(dead!=true) thirst = thirst+3;
	}
	
	public void play() {
		if(dead!=true) wantPlay = wantPlay+3;
	}
	
	public void consume() {
		Timer period = new Timer();
		period.schedule(new TimerTask() {
			public void run() {
			fed = fed-3;
			thirst = thirst-3;
			wantPlay = wantPlay-3;
			System.out.println(fed);
			}
		}, 1000,1000);
	}
	
	public void death() {
		Timer life = new Timer();
		life.schedule(new TimerTask() {
			public void run() {
				System.out.println("The pet is dead");
				System.out.println(getFed());
				dead = true;
			}
			
		}, 30000);
	}
	
	public int getFed() {
		return fed;
	}
	
	public int getThirst() {
		return thirst;
	}
	
	public void getWantPlay() {
		if(wantPlay<50) System.out.println("The pet really wants to play");
		else if (wantPlay<80) System.out.println("The pet is a little bit lonely");
		else System.out.println("The pet is happy");
	}
	
	public boolean getDead() {
		return dead;
	}
	
	public void getInfo() {
		if(dead==false) {
			System.out.println("Hunger Level: "+fed);
			System.out.println("Thirst Level: "+thirst);
			if(wantPlay<50) System.out.println("The pet really wants to play");
			else if(wantPlay<80) System.out.println("The pet is a little lonely");
			else System.out.println("The pet is happy");
		}
		else System.out.println("The pet is dead and no data could be changed");

	}
}

