package ru.skypro;

public class Main {

    public static void main(String[] args) {
//       Инициализация авторов
        Author king = new Author("Steven", "King");
        Author nabokov = new Author("Vladimir", "Nabokov");
//        Author king2 = new Author("Steven2", "King");

//        Инициализация книг
        Book misery = new Book("Misery", king, 1990);
//        Book misery2 = new Book("Misery", king, 1990);
        Book lolita = new Book("Lolita", nabokov, 1955);
        System.out.println(king);
//        System.out.println("misery = " + misery);

//        System.out.println(misery.equals(misery2));

//         Изменение года
        misery.setYear(2015);



    }
}
