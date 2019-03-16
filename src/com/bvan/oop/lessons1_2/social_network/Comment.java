package com.bvan.oop.lessons1_2.social_network;

import java.time.LocalDateTime;

/**
 * @author bvanchuhov
 */
public class Comment {

    private final String author;
    private String content;
    private final LocalDateTime publicationDate;
    private LocalDateTime modificationDate;

    public Comment(String author, String content) {
        this.author = author;
        this.content = content;
        this.publicationDate = LocalDateTime.now();
        this.modificationDate = this.publicationDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getPublicationDate() {
        return publicationDate;
    }

    public LocalDateTime getModificationDate() {
        return modificationDate;
    }

    public void setContent(String content) {
        this.content = content;
        this.modificationDate = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Comment{" +
                "author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", publicationDate=" + publicationDate +
                ", modificationDate=" + modificationDate +
                '}';
    }
}
