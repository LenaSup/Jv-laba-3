import java.util.Vector;


public class Main{
    static void main(String[] args){
        Manager manager = new Manager(21, "popa", "kakam", "iuy", "s");
        Worker worker1 = new Worker(41, "bvre",  "eg", "gd", "etg");
        Worker worker2 = new Worker(42, "jf", "mmf", "s", "ru");
        Random r = new Random();
        Book book = new Book(1999, "gt", "u", 2, "xyu", 1911, "a");
        for (int i = 0; i < 15; i++){
            Book book = new Book(r.nextInt(999) + 1000,
            "" + (char)(r.nextInt(26) + 'a') + (char)(r.nextInt(26) + 'a'),
            "" + (char)(r.nextInt(26) + 'a'),
            r.nextInt(10),
            "" + (char)(r.nextInt(26) + 'a') + (char)(r.nextInt(26) + 'a') + (char)(r.nextInt(26) + 'a'),
            r.nextInt(101) + 1900,
            "" + (char)(r.nextInt(3) + 'a'));
            manager.new_book(book);
        }

        Client clt1 = new Client(31, "vsw", "sfvf", "xziiz", "u");

        worker1.give(1999);
        clt1.take(1999);
        
        worker1.take(1999);
        clt1.give(1999);

    }
}

class Book{
    public int owner = 0;

    public Book(int id, String name, String author, int edition, String publisher, int yer, String genre){
        int this.id = id;
        String this.name = name;
        String this.author = author;
        int this.edition = edition;
        String this.publisher = publisher;
        int this.yer = yer;
        String this.genre = genre;
    }
}


