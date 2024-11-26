package org.northcoders.model;

import java.util.Date;

public record dataItems(
        int id,
        String title,
        String author,
        String genre,
        String description,
        long isbn,
        String image,
        Date published,
        String publisher
) {
}
