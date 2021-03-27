package Office_2_MovieProject;

public class Movie {
	// 1. Create a class: Movie
	// create variables and methods and create getters&setters for private
	// variables:
	// private String name;
	// int duration;
	// boolean isGood;
	// public void shortOrLong() {
//		      //Print: name+" was short!" if duration is less than 90 minutes
//		      //Print: name+" was long!" otherwise
	// }
	//
	// public void movieInfo() {
//		      print the movie name, duration and isGood
	// }
	
	private String name;

	private int duration;

	private boolean isGood;

	public Movie(String name, int duration, boolean isGood) {
		this.name=name;
		this.duration=duration;
		this.isGood=isGood;
	}

	public Movie() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public boolean isGood() {
		return isGood;
	}

	public void setGood(boolean isGood) {
		this.isGood = isGood;
	}

	public void shortOrLong() {
		if(this.duration<90) {
			System.out.println(name+" was short!"); 
			}else {
				 System.out.println(name+" was long!"); }
		}
	
	public void movieInfo() { System.out.println("Movie name: "+name+
		  "\nMovie Duration: "+duration+ "\nMovie was good: "+this.isGood); 
		  
}
}
		