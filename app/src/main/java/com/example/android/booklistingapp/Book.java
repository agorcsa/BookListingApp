package com.example.android.booklistingapp;

/**
 * Created by ILEANA on 8/23/2017.
 */

public class Book {

    //The year of publication of the book
    private String mYear;

    //The author of the book
    private String mAuthor;

    // The location of the earthquake
    private String mName;

    private String mUrl;

    /**
     * Constructs a new {@link Book} object.
     *
     * @param year   is the year of publication of the book
     * @param author is the author who wrote the book
     * @param name   is the name of the book
     */
    public Book(String year, String author, String name, String url) {
        mYear = year;
        mAuthor = author;
        mName = name;
        mUrl = url;
    }

    public String getYear() {
        return mYear;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getName() {
        return mName;
    }

    public String getUrl() {
        return mUrl;
    }
}
