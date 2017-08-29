package com.example.android.booklistingapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;


/**
 * Created by ILEANA on 8/23/2017.
 */

public class BookAdapter extends ArrayAdapter<Book> {

    public BookAdapter(Context context, List<Book> books) {
        super(context, 0, books);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.books_list_item, parent, false);

        }

        // Find the book at the given position in the list of books
        Book currentBook = getItem(position);

        //Find the TextView with the ID "bookYear"
        TextView bookYear = (TextView) listItemView.findViewById(R.id.bookYear);
        String formattedBookYear = currentBook.getYear();
        bookYear.setText(formattedBookYear);

        //Find the TextView with the ID "bookAuthor"
        TextView bookAuthor = (TextView) listItemView.findViewById(R.id.bookAuthor);
        String formattedBookAuthor = currentBook.getAuthor();
        bookAuthor.setText(formattedBookAuthor);

        //Find the TextView with the IF "bookName"
        TextView bookName = (TextView) listItemView.findViewById(R.id.bookName);
        String formattedBookName = currentBook.getName();
        bookName.setText(formattedBookName);

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
