package Example1;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @description:
 * @author: zhanhongyu
 * @date: 2020/5/21
 * @time: 2:23 下午
 * Copyright (C) 2015
 * All rights reserved
 */
public class ReadXML {
    public static Object getObject(){
        try{
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src/Builder/config.xml"));
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String cName = "Builder."+classNode.getNodeValue();
            System.out.println("新类名"+cName);
            Class<?> c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
