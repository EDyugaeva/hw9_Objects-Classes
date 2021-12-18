package ru.skypro;

public class Main {

    public static void main(String[] args) {
//       Инициализация авторов
        Author king = new Author("Steven", "King");
        Author nabokov = new Author("Vladimir", "Nabokov");

//        Инициализация книг
        Book misery = new Book("Misery", king, 1990);
        Book lolita = new Book("Lolita", nabokov, 1955);
        Book it = new Book("It", king, 1990);


//      Изменение года
        misery.setYear(2015);

        Book[] massiveBooks = new Book[5];
        massiveBooks[0] = misery;
        massiveBooks[1] = lolita;

        //      Поиск пустого места, добавление новой книги

        addBook(massiveBooks, it);
        addBook(massiveBooks, new Book("Mister Mersedes", king, 2018));


//      Печать массива
        printMassive(massiveBooks);

       }

    public static boolean addBook(Book[] books, Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                return true;
            } else {
            }
        }
        return false;
    }

    public static void printBook(Book book) {
        System.out.println(book.getAuthor() + ": " + book.getName() + ": " + book.getYear());

    }

    public static void printMassive(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                printBook(books[i]);
            }
        }
    }
}
