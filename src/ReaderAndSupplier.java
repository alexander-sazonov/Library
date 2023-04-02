public class ReaderAndSupplier extends User implements Reader, Supplier{
    public ReaderAndSupplier(String name) {
        super(name);
    }

    @Override
    public void takeBook(String bookName, Administrator administrator) {

    }

    @Override
    public void returnBook(String bookName, Administrator administrator) {

    }

    @Override
    public void deliveryBook(String bookName) {

    }
}
