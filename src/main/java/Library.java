/**
 *  Copyright Murex S.A.S., 2003-2021. All Rights Reserved.
 *
 *  This software program is proprietary and confidential to Murex S.A.S and its affiliates ("Murex") and, without limiting the generality of the foregoing reservation of rights, shall not be accessed, used, reproduced or distributed without the
 *  express prior written consent of Murex and subject to the applicable Murex licensing terms. Any modification or removal of this copyright notice is expressly prohibited.
 */
import java.util.HashMap;
import java.util.Map;


/**
 * Copyright Murex S.A.S., 2003-2021. All Rights Reserved. This software program is proprietary and confidential to
 * Murex S.A.S and its affiliates ("Murex") and, without limiting the generality of the foregoing reservation of rights,
 * shall not be accessed, used, reproduced or distributed without the express prior written consent of Murex and subject
 * to the applicable Murex licensing terms. Any modification or removal of this copyright notice is expressly
 * prohibited.
 */
public class Library {

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Static fields/initializers
    //~ ----------------------------------------------------------------------------------------------------------------

    private static Library libInstance;

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Instance fields
    //~ ----------------------------------------------------------------------------------------------------------------

    private Map<String, Book> books;

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Constructors
    //~ ----------------------------------------------------------------------------------------------------------------

    private Library() {
        this.books = new HashMap<>();
    }

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Methods
    //~ ----------------------------------------------------------------------------------------------------------------

    //Singleton
    public static Library getInstance() {
        if (libInstance == null) {
            libInstance = new Library();
        }
        return libInstance;
    }

    public Map<String, Book> getBooks() {
        return this.books;
    }

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public void listAllBooks() {
        for (Map.Entry<String, Book> entry : books.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue().toString());
        }
    }
}
