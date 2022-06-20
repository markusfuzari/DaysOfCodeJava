package br.com.alura.daysofcodejava.desafio.model;

import lombok.Data;

@Data
public class Filme {
    private String id;
    private String rank;
    private String title;
    private String fullTitle;
    private String year;
    private String image;
    private String crew;
    private String imDbRating;
    private String imDbRatingCount;

    @Override
    public String toString() {
        return String.format("{id:\"%s\", rank:\"%s\", title:\"%s\", fullTitle:\"%s\", year:\"%s\"" +
                ", image:\"%s\", crew:\"%s\", imDbRating:\"%s\"" +
                ", imDbRatingCount:'%s'}",id, rank, title, fullTitle, year, image, crew,
                imDbRating, imDbRatingCount);
    }
}
