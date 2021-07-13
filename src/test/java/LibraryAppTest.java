/**
 *  Copyright Murex S.A.S., 2003-2021. All Rights Reserved.
 *
 *  This software program is proprietary and confidential to Murex S.A.S and its affiliates ("Murex") and, without limiting the generality of the foregoing reservation of rights, shall not be accessed, used, reproduced or distributed without the
 *  express prior written consent of Murex and subject to the applicable Murex licensing terms. Any modification or removal of this copyright notice is expressly prohibited.
 */
//import org.junit.jupiter.api.Assertions;

//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;


/**
 * Copyright Murex S.A.S., 2003-2021. All Rights Reserved. This software program is proprietary and confidential to
 * Murex S.A.S and its affiliates ("Murex") and, without limiting the generality of the foregoing reservation of rights,
 * shall not be accessed, used, reproduced or distributed without the express prior written consent of Murex and subject
 * to the applicable Murex licensing terms. Any modification or removal of this copyright notice is expressly
 * prohibited.
 */
public class LibraryAppTest {

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Instance fields
    //~ ----------------------------------------------------------------------------------------------------------------

    //  @Before - creezi o functie a carei implementare se executa inaintea fiecarui @Test;
    //  @After - creezi o functie a carei implementare se executa dupa fiecare @Test;
    //  @BeforeClass - creezi o functie a carei implementare se executa la run o singura data,
    //  cam ca blocurile statice, ex: o conexiune la baza de date;
    //  @AfterClass - creezi o functie care se executa la run dupa ce s a executat tot altceva din aceasta clasa.
    //  de ex: inchizi conexiunea la baza de date;

    Library library;

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Methods
    //~ ----------------------------------------------------------------------------------------------------------------

    @Before
    public void createLibrary() {
        library = Library.getInstance();
    }

    @Test
    public void listAllBooks() {
        // Library library = Library.getInstance();
        library.listAllBooks();
        assertNotNull(library.getBooks());
    }

    @Test
    public void testSize() {
        Author eliade = new Author("Eliade", "Mircea");
        Author twain = new Author("Twain", "Mircea");

        Genre romance = new Genre("Romance, Love");
        Genre adventure = new Genre("Adventure");

        PublishingHouse teora = new PublishingHouse("Teora");
        PublishingHouse humanitas = new PublishingHouse("Humanitas");

        Book book1 = new Book("Maitreyi", eliade, romance, teora);
        Book book2 = new Book("Adventures of Huckeberry Finn", twain, adventure, humanitas);

        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.getBooks().size());
    }

}
