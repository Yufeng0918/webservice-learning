package lecture03.domAndSax;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class S01_ReadXML {

	public static void main(String[] args) throws Exception {
		// step 1: Create the DOM Builder factory
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

		// System.out.println("class name: " + dbf.getClass().getName());

		// step 2: Create the DOM Builder
		DocumentBuilder db = dbf.newDocumentBuilder();

		// System.out.println("class name: " + db.getClass().getName());

		// step3: Create DOM object
		Document document = db.parse(new File("candidate.xml"));

		NodeList list = document.getElementsByTagName("PERSON");

		for (int i = 0; i < list.getLength(); i++) {
			Element element = (Element) list.item(i);

			String content = element.getElementsByTagName("NAME").item(0)
					.getFirstChild().getNodeValue();

			System.out.println("name:" + content);

			content = element.getElementsByTagName("ADDRESS").item(0)
					.getFirstChild().getNodeValue();

			System.out.println("address:" + content);

			content = element.getElementsByTagName("TEL").item(0)
					.getFirstChild().getNodeValue();

			System.out.println("tel:" + content);

			content = element.getElementsByTagName("FAX").item(0)
					.getFirstChild().getNodeValue();

			System.out.println("fax:" + content);

			content = element.getElementsByTagName("EMAIL").item(0)
					.getFirstChild().getNodeValue();

			System.out.println("email:" + content);
			System.out.println("--------------------------------------");
		}
	}
}
