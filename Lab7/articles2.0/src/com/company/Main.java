package com.company;

import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    static class Article {
        String title;
        String content;
        String author;

        public Article() {
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        @Override
        public String toString() {
            return title + " - " + content + ": " + author;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        List<Article> articles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = in.nextLine().split(", ");
            Article article = new Article();
            article.setTitle(input[0]);
            article.setContent(input[1]);
            article.setAuthor(input[2]);
            articles.add(article);
        }
        String sort = in.nextLine();
        switch (sort) {
            case "title":
                articles.stream().sorted(Comparator.comparing(Article::getTitle))
                        .forEach(a -> System.out.println(a.toString()));
                break;
            case "content":
                articles.stream().sorted(Comparator.comparing(Article::getContent))
                        .forEach(a -> System.out.println(a.toString()));
                break;
            case "author":
                articles.stream().sorted(Comparator.comparing(Article::getAuthor))
                        .forEach(a -> System.out.println(a.toString()));
                break;
            default:
                break;
        }
    }
}
