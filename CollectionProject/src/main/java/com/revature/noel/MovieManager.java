package com.revature.noel;

import java.util.ArrayList;
import java.util.Collections;
public class MovieManager{
	public static void main(String[] args) {
		MovieDemo mov1 = new MovieDemo(4.5,"Spiderman",2022);
		MovieDemo mov2 = new MovieDemo(4.0,"Shrek",2006);
		MovieDemo mov3 = new MovieDemo(5.0,"Forest Gump",1996);
		MovieDemo mov4 = new MovieDemo(4.7,"Batman Dark Knight",2012);
		
		ArrayList<MovieDemo> a1 = new ArrayList<MovieDemo>();
		
		a1.add(mov1);
		a1.add(mov2);
		a1.add(mov3);
		a1.add(mov4);
		//Print ArrayList
		//System.out.println(a1);
		
		//Sort is a static method used with the class name
		Collections.sort(a1);
		
		for(MovieDemo m:a1)
			System.out.println(m);
		
		for (MovieDemo movie: a1)
        {
            System.out.println(movie.getName() + " " +
                               movie.getRating() + " " +
                               movie.getYear());
        }
		
		RatingCompare rC = new RatingCompare();
		Collections.sort(a1, rC);
		for(MovieDemo movi: a1)
			System.out.println(movi);
		
		
		
	}

}
