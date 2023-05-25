package org.example.json;

import com.google.gson.Gson;

public class GsonExample {
    public static void main(String[] args) {
        // Create a Gson object
        Gson gson = new Gson();

        // Serialize an object to JSON
        Book book = new Book("1984", "George Orwell", 328);
        String json = gson.toJson(book);
        System.out.println("Serialized JSON: " + json);

        // Deserialize JSON to an object
        String json2 = "{\"title\":\"To Kill a Mockingbird\",\"author\":\"Harper Lee\",\"pages\":281}";
        Book book2 = gson.fromJson(json2, Book.class);
        System.out.println("Deserialized Book: " + book2);
    }

    // A simple POJO class representing a book
    static class Book {
        private String title;
        private String author;
        private int pages;

        public Book(String title, String author, int pages) {
            this.title = title;
            this.author = author;
            this.pages = pages;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", pages=" + pages +
                    '}';
        }
    }
}
