package lecture03.domAndSax;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class S02_Node {

	Document doc;

	@Before
	public void init() throws ParserConfigurationException, SAXException,
			IOException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		doc = db.parse(new File("student.xml"));

	}

	@Test
	public void testNodeName() {
		Element root = doc.getDocumentElement();
		NodeList list = root.getChildNodes();
		System.out.println(list.getLength());
		for (int i = 0; i < list.getLength(); i++) {
			System.out.println(list.item(i).getNodeName());
		}
	}

	@Test
	public void testNodeTypeAndValue() {

		Element root = doc.getDocumentElement();
		NodeList list = root.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			Node n = list.item(i);
			System.out.println(n.getNodeType() + " : " + n.getNodeValue());
		}
	}

	@Test
	public void testNodeTextContent() {

		Element root = doc.getDocumentElement();
		NodeList list = root.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			Node n = list.item(i);
			System.out.println(n.getTextContent());
		}
	}

	@Test
	public void testTagName() {
		NodeList nodeList = doc.getElementsByTagName("学生");

		for (int i = 0; i < nodeList.getLength(); i++) {
			NamedNodeMap nnm = nodeList.item(i).getAttributes();

			String attrName = nnm.item(0).getNodeName();
			System.out.print(attrName);

			System.out.print("=");
			String attrValue = nnm.item(0).getNodeValue();
			System.out.println(attrValue);
		}
	}
}
