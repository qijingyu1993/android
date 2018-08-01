package com.example.activitytest.Dom;


import com.example.activitytest.Bean.Word;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.xml.parsers.*;


/**
 * Created by USER3 on 2018/7/31.
 */

public class Dom {
    public List<Word> getWord(File file){
        List<Word> words=new ArrayList<Word>();
        try {
            //创建一个文档构建工厂
            DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
            //通过工厂生产DocumentBuilder对象
            DocumentBuilder builder=factory.newDocumentBuilder();
            //将指定file的内容解析  返回一个Document的对象
            Document doc= null;
            doc = builder.parse(file);
            Element element=doc.getDocumentElement();//获取根元素
            //System.out.println(element);
            NodeList nodeList=doc.getElementsByTagName("");
            //System.out.println(nodeList.getLength());
            int len=nodeList.getLength();
            for (int i = 0; i < len; i++) {
                Word word=new Word();
                Node node=nodeList.item(i);
                word.setId(Integer.parseInt(node.getAttributes().getNamedItem("id").getNodeValue()));
                int len2=nodeList.item(i).getChildNodes().getLength();
                for (int j = 0; j < len2; j++) {
                    Node node1=nodeList.item(i).getChildNodes().item(j);
                    if(node1.getNodeType()==1){
                        String content=node1.getFirstChild().getNodeValue();
                        String nodeName=node1.getNodeName();
                        switch (nodeName) {
                            case "text":
                                word.setText(content);
                                break;
                            case "translate":
                                word.setTranslate(content);
                                break;
                            case "end":
                                word.setEnd(content);
                                break;
                            case"kana":
                                word.setKana(content);
                            case "start":
                                word.setStart(content);
                                break;

                            default:
                                break;
                        }
                    }
                }
                words.add(word);
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return words;
    }
    public static void main(String[] args) {
        Dom td=new Dom();
        File file=new File("xml/Lesson01_cn.xml");
        List<Word> list=td.getWord(file);
        for (int i = 0; i <list.size(); i++) {
            Word word=list.get(i);
            System.out.println(word.toString());
        }
    }
}
