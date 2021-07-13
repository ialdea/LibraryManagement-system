/**
 *  Copyright Murex S.A.S., 2003-2021. All Rights Reserved.
 *
 *  This software program is proprietary and confidential to Murex S.A.S and its affiliates ("Murex") and, without limiting the generality of the foregoing reservation of rights, shall not be accessed, used, reproduced or distributed without the
 *  express prior written consent of Murex and subject to the applicable Murex licensing terms. Any modification or removal of this copyright notice is expressly prohibited.
 */
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.*;


@XmlRootElement
@XmlAccessorType(value = XmlAccessType.FIELD)
public class Book {

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Static fields/initializers
    //~ ----------------------------------------------------------------------------------------------------------------

    private static int nextIBSN = 1000;

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Instance fields
    //~ ----------------------------------------------------------------------------------------------------------------

    @XmlAttribute(name = "titlu") //asta suprascrie "title", adica in loc de <book title = "Abu doarme"> o sa fie <book titlu = "Abu doarme">
    private String title;

    @XmlElement
    private Author author;

    @XmlElement
    private Genre genre;

    @XmlElement
    private PublishingHouse publishingHouse;

    private int ibsn; //international standard book number

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Constructors
    //~ ----------------------------------------------------------------------------------------------------------------

    public Book() {
    }

    public Book(String title, Author author, Genre genre, PublishingHouse publishingHouse) {
        this.ibsn = nextIBSN;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publishingHouse = publishingHouse;
    }

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Methods
    //~ ----------------------------------------------------------------------------------------------------------------

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public Genre getGenre() {
        return genre;
    }

    public PublishingHouse getPublishingHouse() {
        return publishingHouse;
    }

    @Override
    public String toString() {
        return this.ibsn + ". " + this.title + ", written by " + author.getName() + " " + author.getSurname() + ", genre " + genre.getGenreName() +
            ", ed. " + publishingHouse.getPubHouseName();
    }

}
