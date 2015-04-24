package com.epam.vb.library.model.model;

import java.util.List;

public class Publication extends Book {

    private List<String> author;
    private int publicationYear;
    private Genre genre;
    private String publicationAgency;
    private PlaceToRead placeToRead;

    public enum PlaceToRead{
        home, readingRoom ,both;
    }

    public enum Genre {
        fantasy,novel,drama,scienceFiction,science,comedy,
        mystery,horror,folklore,poem,fairyTale;
    }
}
