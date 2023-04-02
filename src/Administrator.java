public interface Administrator {

    void findBook(String bookName);

    void issueBook(String bookName, Reader reader);

    void overdueNotification(Reader reader);
}
