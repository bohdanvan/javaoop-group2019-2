package com.bvan.oop.lessons1_2.social_network;

/**
 * @author bvanchuhov
 */
public class Post {

    private final String author;
    private String content;
    private long likes;

    public Post(String author, String content, long likes) {
        checkLikes(likes);
        this.author = author;
        this.content = content;
        this.likes = likes;
    }

    private void checkLikes(long likes) {
        if (likes < 0) {
            throw new IllegalArgumentException("negative likes");
        }
    }

    public Post(String author, String content) {
        this(author, content, 0); // constructors chain
    }

//    public Post(String author, String content) {
//        this.author = author;
//        this.content = content;
//    }

    public String show() { // \", \', \\, \n
        return "\"" + content + "\" by " + author + ", "
                + likes + " likes";
    }

    public void like() {
        likes++;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public long getLikes() {
        return likes;
    }

    public void setContent(String content) {
        this.content = content;
    }

//    public void setAuthor(String author) {
//        this.author = author;
//    }

//    public void setLikes(long likes) {
//        checkLikes(likes);
//        this.likes = likes;
//    }

    public String toString() {
        return "Post{" +
                "author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", likes=" + likes +
                '}';
    }
}
