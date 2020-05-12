package lecture03.domAndSax;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;
import org.xml.sax.SAXException;


public class S06_Dom4jRead {
	
	public static Document parse(URL url) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(url);
        return document;
    }
	
	
	@SuppressWarnings("unused")
	public static void getConfirmation(Document document) throws DocumentException, IOException {

        Element root = document.getRootElement();
        
        List<?> list = document.selectNodes( "//FeedMessage/BatchedConfirm/Confirmations/Confirm" );
        
        for (Iterator<?> iter = list.iterator(); iter.hasNext(); ) {
        	Object o = iter.next();
        	
            Element element =(Element) o;
            
            String fileName = element.selectSingleNode("xmsgID").getText();
            System.out.println(fileName.replace('/', '_'));
            
            System.out.println(element.asXML());
            OutputFormat format = new OutputFormat("    ", true);

    		XMLWriter xmlWriter2 = new XMLWriter(new FileOutputStream(
    				"student2.xml"), format);
    		xmlWriter2.setEscapeText(false);
    		xmlWriter2.write(element.asXML());
    		
    		break;
        }
	}
	
	
	@Test
	public void testGetConfirm() throws DocumentException, IOException{
		
		URL url = new URL("pre/BConfirmEmail284460184076081-192.168.56.1-3445BatchedConfirmationFeedMessage.txt");
		Document doc = parse(url);
		getConfirmation(doc);
	}
	
	public static void main(String[] args) throws DocumentException, ParserConfigurationException, SAXException, IOException {
		

        File fXmlFile = new File("src/pre/BConfirmEmail284460184076081-192.168.56.1-3445BatchedConfirmationFeedMessage.txt");
        SAXReader reader = new SAXReader();
        Document doc = reader.read(fXmlFile);
		getConfirmation(doc);
	}
}
