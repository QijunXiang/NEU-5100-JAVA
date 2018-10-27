package PartA;

import java.util.ArrayList;

public class Mreview implements Comparable<Mreview> {
    private String title;
    private ArrayList<Integer> ratings;

    public Mreview() {
        this.title = "";
        ratings = new ArrayList<>();
    }

    public Mreview(String ttl) {
        this.title = ttl;
        ratings = new ArrayList<>();
    }

    public Mreview(String ttl, int firstRating) {
        this.title = ttl;
        ratings = new ArrayList<>(1);
        ratings.set(0, firstRating);
    }

    public String getTitle() {
        return this.title;
    }

    public void addRating(int r) {
        this.ratings.add(r);
    }

    public double aveRating() {
        double total = 0.0;
        for (int rating: ratings)
            total += rating;
        return total/ratings.size();
    }

    public int numRatings() {
        return this.ratings.size();
    }

    public int compareTo(Mreview obj) {
        return this.title.compareTo(obj.getTitle());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Mreview))
            return false;
        return this.title.equals(((Mreview) obj).getTitle());
    }

    public String toString() {
        return String.format("%s, average %s out of %s ratings", this.getTitle(), this.aveRating(), this.numRatings());
    }

    public static void main(String[] args) {
        Mreview mreview = new Mreview("Kill Bill");
        mreview.addRating(4);
        mreview.addRating(5);
        mreview.addRating(7);
        System.out.println(mreview);
        System.out.println(mreview.aveRating());
    }
}
