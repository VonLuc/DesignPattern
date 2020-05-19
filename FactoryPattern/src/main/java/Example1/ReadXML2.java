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
 * @date: 2020/5/19
 * @time: 5:39 下午
 * Copyright (C) 2015
 * All rights reserved
 */
public class ReadXML2 {
    public static Object getObject(){
        try{
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src/FactoryMethod/config2.xml"));
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String cName = "FactoryMethod."+classNode.getNodeValue();
            System.out.println("new CLASS name:"+cName);
            Class<?> c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
