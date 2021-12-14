package ru.skypro;

public class Main {

    public static void main(String[] args) {
//       Инициализация авторов
        Author king = new Author("Steven", "King");
        Author nabokov = new Author("Vladimir", "Nabokov");
//        Инициализация книг
        Book misery = new Book("Misery", king, 1990);
        Book lolita = new Book("Lolita", nabokov, 1955);

//         Изменение года
        misery.setYear(2015);

    }
}
