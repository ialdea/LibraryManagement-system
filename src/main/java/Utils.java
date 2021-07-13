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


/**
 * Copyright Murex S.A.S., 2003-2021. All Rights Reserved. This software program is proprietary and confidential to
 * Murex S.A.S and its affiliates ("Murex") and, without limiting the generality of the foregoing reservation of rights,
 * shall not be accessed, used, reproduced or distributed without the express prior written consent of Murex and subject
 * to the applicable Murex licensing terms. Any modification or removal of this copyright notice is expressly
 * prohibited.
 */

public class Utils {

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Methods
    //~ ----------------------------------------------------------------------------------------------------------------

    public static void bookToXml(Book book) {
        try {
            JAXBContext context = JAXBContext.newInstance(Book.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            File file = new File("book.xml");
            marshaller.marshal(book, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
