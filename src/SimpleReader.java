public class SimpleReader extends User implements Reader {
    public SimpleReader(String name) {
        super(name);
    }

    @Override
    public void takeBook(String bookName, Administrator administrator) {

        System.out.printf("Reader %s take book %s", getName(), bookName);
    }

    @Override
    public void returnBook(String bookName, Administrator administrator) {

    }
}
