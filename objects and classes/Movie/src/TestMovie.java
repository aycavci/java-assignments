import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import acm.program.ConsoleProgram;

/*
 * Test Program for Movie Class 
 */

public class TestMovie extends ConsoleProgram {
	
	ArrayList<Movie> movies = new ArrayList<Movie>();
	public void run() {
		
		/*read movie informations from movies.txt*/	
		BufferedReader rd = null;
		try {
			rd = new BufferedReader(new FileReader("movies.txt"));
			String line = null;
			ArrayList<String> movieInfo = new ArrayList<String>();
			while(true){
				line = rd.readLine();
				if(line == null){
					break;
				}
				else if(line.charAt(0) != '%'){
					movieInfo.add(line);
				}
				else{
					//create a movie object
					String movieName = movieInfo.get(0);
					String year = movieInfo.get(1);
					double rating = new Double(movieInfo.get(2));
					ArrayList<String> cast = new ArrayList<String>();
					for(int i = 3; i < movieInfo.size(); i++){
						cast.add(movieInfo.get(i));
					}
					//add movie into movies ArrayList
					Movie aMovie = new Movie(movieName,year,rating,cast);
					movies.add(aMovie);
					movieInfo = new ArrayList<String>();
				}
			}
			rd.close();
		} catch (Exception e) {
			println("File read error!!");
		}
		
		
		int choice;
		/*menu for the movies*/
		while(true){
			println("\nMenu:\n1 - Display all movies.\n2 - Display movies that have rating equal or greater than a given rating.\n3 - Display movies of an actor/actress.\n0 - Exit.");
			choice = readInt("Enter an option: ");
			switch(choice){
				case 1: displayAllMovies();
						break;
				case 2: displaybyRating();
						break;
				case 3: displaybyCast();
						break;
				default: System.exit(0);
			}
		}
		
	}
	
	public void displayAllMovies(){
		println("---Movie List---");
		for(int i = 0; i < movies.size(); i++){
			Movie aMovie = movies.get(i);
			println(getMovieString(aMovie)+"\n");
		}
	}
	
	public String getMovieString(Movie aMovie){
		String movie = "Movie: "+aMovie.getMovieName()+"\nYear: "+aMovie.getYear()+"\nRating: "+aMovie.getRating()+"/10\nReview: "+aMovie.getReview()+"\nCast: ";
		boolean first = true;
		ArrayList<String> movieCast = aMovie.getCast();
		for(int i = 0; i < movieCast.size(); i++){
			String cast = movieCast.get(i);
			if(first){
				movie += cast;
				first = false;
			}
			else{
				movie += ", "+cast;
			}
		}
		return movie;
	}
	
	public void displaybyRating(){
		double rating = readDouble("Enter a rating: ");
		println("---Movies equal or greater than "+rating+" rating---");
		for(int i = 0; i < movies.size(); i++){
			Movie aMovie = movies.get(i);
			if(aMovie.getRating() >= rating){
				println(getMovieString(aMovie)+"\n");
			}
		}
	}
	
	public void displaybyCast(){
		String name = readLine("Enter a name: ");
		println("---Movies of "+name+"---");
		for(int i = 0; i < movies.size(); i++){
			Movie aMovie = movies.get(i);
			if(aMovie.inCast(name)){
				println(getMovieString(aMovie)+"\n");
			}
		}
	}
	
}
