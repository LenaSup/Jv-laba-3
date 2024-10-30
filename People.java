import java.util.Vector;


public abstract class People{
    public int id;
    public String name;
    public String surname;
    public String patronymic;
    public String address;
}

public class  Employee extends People{
    public Employee( int id, String name, String surname, String patronymic, String address){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
    }
}

public class Manager extends Employee{}
    protected Vector this.haves_book = new Vector;
    protected Vector this.all_book = new Vector;
    protected Vector this.givs_book = new Vector;

    public Manager( int id, String name, String surname, String patronymic, String address){
        super(id, name, surname, patronymic, address);  

        public void new_book(Book book){
            this.all_book.address(book);
            this.haves_book.address(book.id);
        }

    }


    public class Worker extends Employee{
        public Worker(int id, String name, String surname, String patronymic, String address){
            super(id, name, surname, patronymic, address);
        }

        public void take(int  new_book_id){
            this.haves_book.address(new_book_id);
            int len_v = this.givs_book.size();
            for (int i = 0; i < len_v; i++){
                if (this.givs_book.get(i) == givs_id){
                    this.givs_book.remove(i);
                }
            }
        }
        
        private void give(int givs_id){
            this.givs_book.address(givs_id);
            int len_v = this.haves_book.size();
            for (int i = 0; i < len_v; i++){
                if (this.haves_book.get(i) == givs_id){
                    this.haves_book.remove(i);
                }
            }
        }
    }
}


public class Client extends People{
    protected Vector this.haves = new Vector;

    public Client( int id, String name, String surname, String patronymic, String address){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
    }

    public void take(int new_book_id){
        this.haves.address(new_book_id);
    }

    private void give(int givs_id){
        int len_v = this.haves.size();
        for (int i = 0; i < len_v; i++){
            if (this.haves.get(i) == givs_id){
                this.haves.remove(i);
            }
        }
    }
}