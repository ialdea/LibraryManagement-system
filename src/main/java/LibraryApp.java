/**
 *  Copyright Murex S.A.S., 2003-2021. All Rights Reserved.
 *
 *  This software program is proprietary and confidential to Murex S.A.S and its affiliates ("Murex") and, without limiting the generality of the foregoing reservation of rights, shall not be accessed, used, reproduced or distributed without the
 *  express prior written consent of Murex and subject to the applicable Murex licensing terms. Any modification or removal of this copyright notice is expressly prohibited.
 */
public class LibraryApp {

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Methods
    //~ ----------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        Author nosov = new Author("Nikolai", "Nosov");
        Genre adventure = new Genre("Adventure");
        PublishingHouse teora = new PublishingHouse("Teora");
        Book book3 = new Book("Aventurile lui Habarnam", nosov, adventure, teora);

        Utils.bookToXml(book3);

    }
}
