package com.bvan.oop.lessons1_2.social_network;

/**
 * @author bvanchuhov
 */
public class PostRunner {

    public static void main(String[] args) {
        Post post1 = new Post("@elonmusk",
                "Tesla car prices go up ~3%",
                26);

        Post post2 = new Post("@VancityReynolds",
                "F for effort.");

//        post1.setLikes(-26);
//        post.setLikes(post.getLikes() + 1);

        post2.like();
        post2.like();
        post2.like();
        post2.like();
        post2.like();

        String postInfo = post1.show();
        System.out.println(postInfo);

        System.out.println(post2.show());

        System.out.println(post1.getAuthor());
        System.out.println(post1.toString());
    }
}
