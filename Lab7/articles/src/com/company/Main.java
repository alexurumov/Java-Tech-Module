package com.company;

import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
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
        String[] input = in.nextLine().split(", ");
        Article article = new Article();
        article.setTitle(input[0]);
        article.setContent(input[1]);
        article.setAuthor(input[2]);
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) {
            String[] cmd = in.nextLine().split(": ");
            switch (cmd[0]) {
                case "Edit":
                    article.setContent(cmd[1]);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(cmd[1]);
                    break;
                case "Rename":
                    article.setTitle(cmd[1]);
                    break;
                default:
                    break;
            }
        }

        System.out.println(article.toString());

    }
}
