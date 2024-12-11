import hu.domparse.gf2465.DomModifyGF2465;
import hu.domparse.gf2465.DomQueryGF2465;
import hu.domparse.gf2465.DomReadGF2465;
import hu.domparse.gf2465.DomWriteGF2465;

public class Main {
    public static void main(String[] args) {
        // RootElement beolvasása
       // DomReadGF2465.ReadXMLDocument("XMLTAskGF2465\\DOMParseGF2465\\src\\XML_GF2465.xml");
        // Elementek módosítása
        //DomModifyGF2465.ModifyElement("XMLTAskGF2465\\DOMParseGF2465\\src\\XML_GF2465.xml");
        // Elemek kiírása
        //DomWriteGF2465.WriteElementsToFileAndConsole();
        // Elementek lekérdezése
        DomQueryGF2465.QueryPrescribedDetails("XMLTAskGF2465\\DOMParseGF2465\\src\\XML_GF2465.xml");
    }
}