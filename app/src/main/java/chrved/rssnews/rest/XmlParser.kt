package chrved.rssnews.rest

import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList
import java.io.ByteArrayInputStream
import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory

class XmlParser {
    fun parseXml(xml: String): Channel {
        val builder: DocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder()
        val doc: Document = builder.parse(ByteArrayInputStream(xml.encodeToByteArray()))
        doc.getDocumentElement().normalize();
        val nodeList: NodeList = doc.getElementsByTagName("channel").item(0).childNodes
        var channel: Channel = Channel()

        for(index in 0 until nodeList.length) {
            var node :Node = nodeList.item(index)
            when(node.nodeName){
                "title" -> channel.title = node.textContent
                "description" -> channel.description = node.textContent
                "copyright" -> channel.copyright = node.textContent
                "managingEditor" -> channel.managingEditor = node.textContent
                "link" -> channel.link = node.textContent
                "item" -> {
                    var item: Item = Item()
                    for(childIndex in 0 until node.childNodes.length) {
                        when (node.childNodes.item(childIndex).nodeName) {
                            "title" -> item.title = node.childNodes.item(childIndex).textContent
                            "description" -> item.description = node.childNodes.item(childIndex).textContent
                            "pubDate" -> item.pubDate = node.childNodes.item(childIndex).textContent
                            "author" -> item.author = node.childNodes.item(childIndex).textContent
                            "link" -> item.link = node.childNodes.item(childIndex).textContent
                        }

                    }
                    channel.items.add(item)
                }
            }
        }
        return channel
    }
}
