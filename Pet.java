/*This is an interface for simulating an Animal
 *Normally any class extends the interface would have several variables:
 *	String name, int hunger, int thirst, int energy, int mood
 *Actions listed in this interface have effect on these variables 
*/

public interface Pet {
	
	/*feedFood() simulates feeding. 
	 *It increases or decreases the hunger, depending on how the program is designed
	*/
	public void feedFood();
	
	/*giveWater() simulates giving water to the animal. 
	 * It increases or decreases thirst, depending on how the program is designed
	 */
	public void giveWater();
	
	/*sleep() simulates the normal sleeping process
	 * It increases or decreases energy, depending on how the program is designed
	 */
	public void sleep();
	
	//play() elevates the mood (increases mood variable) while also consuming energy(decreases energy variable)
	public void play();
	
	/*consume() is like the normal metabolism process
	 * It has effects on variable hunger, thirst and energy
	 */
	public void consume();
	
	//The virtual animal is not immortal. It has a life time.
	public void life();
	
	/*death() is like the natural death of any organism. 
	 * It comes once life() finishes
	 * The program would print out a message telling the "animal" is dead, the consume() should also stop executing 
	 * and except setName() no action would affect those variables 
	*/
	public void death();
	
	//Ideally the system would print out messages during some of the actions above
	public void voice();
	
	//It changes the name of the animal
	public void setName();
	
	//Program should print out all information of the animal
	public void getInfo();
	

}
