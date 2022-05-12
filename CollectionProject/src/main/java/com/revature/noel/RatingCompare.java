package com.revature.noel;
import java.util.*;
class RatingCompare implements Comparator<MovieDemo>
{
    public int compare(MovieDemo m1, MovieDemo m2)
    {
        if (m1.getRating() < m2.getRating()) return -1;
        if (m1.getRating() > m2.getRating()) return 1;
        else return 0;
    }
}