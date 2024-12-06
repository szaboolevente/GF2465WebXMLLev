package domgf24651108;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class DOMReadGF2465{

    public static void main(String[] args) {
        try {
            // Az XML fájl betöltése
            File xmlFile = new File("orarendCngdz3.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            
            // Normalizálja az XML struktúrát
            doc.getDocumentElement().normalize();
            
            // Az orarend elem megjelenítése
            System.out.println("Gyökérelem: " + doc.getDocumentElement().getNodeName());
            
            // Az ora elemek listázása
            NodeList oraList = doc.getElementsByTagName("ora");
            
            for (int i = 0; i < oraList.getLength(); i++) {
                Node oraNode = oraList.item(i);
                
                if (oraNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element oraElement = (Element) oraNode;
                    
                    // Blokkos megjelenítés
                    System.out.println("------------");
                    // Az attribútumok kiolvasása
                    String id = oraElement.getAttribute("id");
                    String tipus = oraElement.getAttribute("tipus");
                    System.out.println("Óra ID: " + id);
                    System.out.println("Típus: " + tipus);
                    
                    // Elem tartalom kiolvasása
                    System.out.println("Kurzusnév: " + oraElement.getElementsByTagName("kurzusnev").item(0).getTextContent());
                    
                    // Időpont részletei
                    Element idopontElement = (Element) oraElement.getElementsByTagName("idopont").item(0);
                    System.out.println("Dátum: " + idopontElement.getElementsByTagName("nap").item(0).getTextContent());
                    System.out.println("Idő kezdete: " + idopontElement.getElementsByTagName("tol").item(0).getTextContent());
                    System.out.println("Idő vége: " + idopontElement.getElementsByTagName("ig").item(0).getTextContent());
                    
                    System.out.println("Helyszín: " + oraElement.getElementsByTagName("helyszin").item(0).getTextContent());
                    System.out.println("Oktató: " + oraElement.getElementsByTagName("oktato").item(0).getTextContent());
                    System.out.println("Szak: " + oraElement.getElementsByTagName("szak").item(0).getTextContent());
                    System.out.println("------------");
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
