package JavaConstructor;

public class Movie {
	 private String title;
	 private String studio;
	 private String rating;

	 public Movie(String t, String s, String r) {
		 title = t;
		 studio = s;
		 rating = r;
	 }
		
	 public Movie (String t, String s) {
		 title = t;
		 studio = s;
		 rating = "PG" ; 
	 }
	 
	 public static void main(String[] args) {
		 Movie movie1 = new Movie("Casino Royale","Eon Productions","PG-13");
		 Movie movie2 = new Movie("Royale Casino", "Production Eon");
		 System.out.println(movie1.rating);
		 System.out.println(movie2.rating);
	 }
	 
	 
	 
}