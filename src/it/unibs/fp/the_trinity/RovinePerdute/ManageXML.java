package it.unibs.fp.the_trinity.RovinePerdute;

import it.unibs.fp.the_trinity.XMLUtilities.*;
import javax.xml.stream.XMLStreamException;
import java.util.ArrayList;
import java.util.HashMap;

public class ManageXML {
    private final String MAP_5 = "PgAr_Map_5.xml";
    private final String MAP_12 = "PgAr_Map_12.xml";
    private final String MAP_50 = "PgAr_Map_50.xml";
    private final String MAP_200 = "PgAr_Map_200.xml";
    private final String MAP_2000 = "PgAr_Map_2000.xml";
    private final String MAP_10000 = "PgAr_Map_10000.xml";

    private ArrayList<City> cities = new ArrayList<>();

    public void startXMLManaging() {
        parseXMLFiles();
       // writeOutputFile();
    }

    private void parseXMLFiles() {
        try {
            XMLParser xmlParserC = new XMLParser(MAP_5);
            cities = xmlParserC.parseXML(City.class);
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }

    /**
     * Writing the output of .xml file.
     */
    /*
    private void writeOutputFile() {
        XMLWriter xmlWriter = new XMLWriter(OUTPUT_FILE);
        xmlWriter.writeOpeningTagXML("output");
        xmlWriter.writeArrayListXML(persons, "persone", "numero", persons.size() + "");
        xmlWriter.writeOpeningTagXML("codici");
        xmlWriter.writeArrayListXML(invalid, "invalidi", "numero", invalid.size() + "");
        xmlWriter.writeArrayListXML(unmatched, "spaiati", "numero", unmatched.size() + "");
        xmlWriter.writeClosingTagXML(false);
        xmlWriter.writeClosingTagXML(true);
    }

     */

}