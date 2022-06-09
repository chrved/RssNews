package chrved.rssnews.rest


import org.junit.Test

class XmlParserTest {
    private val xml :String =
    "<rss version=\"2.0\"><channel><title>Expressen: Nyheter</title><link>https://www.expressen.se/</link><description>Sveriges bästa nyhetssajt med nyheter, sport och nöje!</description><copyright>Copyright, AB Kvällstidningen Expressen</copyright><managingEditor>klas.granstrom@expressen.se (Klas Granström)</managingEditor><image><url>https://www.expressen.se/Static/images/rss/getting_rss.png</url><title>Expressen: Nyheter</title><link>https://www.expressen.se/</link></image><item><guid isPermaLink=\"true\">https://www.expressen.se/nyheter/mordmisstankar-mot--sd-politiker-avskrivna/</guid><link>https://www.expressen.se/nyheter/mordmisstankar-mot--sd-politiker-avskrivna/</link><author>linnea.lundstrom@gt.se (Linnea Lundström)</author><title>Mordmisstankar mot  SD-politiker avskrivna</title><description><![CDATA[<img src='https://static.cdn-expressen.se/images/65/1c/651c754274f140339e450b87fa6e3007/16x9/265@70.jpg'/><p>Utredningen mot den SD-politiker i Sjuhärad som sedan i september förra året misstänkts för mordet på sin fru har nu lagts ner.</p><p>– Om jag ska gå vidare med utredningen och väcka ett åtal måste jag vara säker på att jag i stort sett kan få en fällande dom och vi anser inte att bevisningen pekar åt det hållet, säger Olof Sahlgren till <a href=\"https://sverigesradio.se/artikel/tung-sd-politiker-frias-fran-misstanke-om-mord\">P4 Sjuhärad</a>.</p>]]></description><pubDate>Thu, 09 Jun 2022 15:01:06 +0200</pubDate></item><item><guid isPermaLink=\"true\">https://www.expressen.se/nyheter/man-gripen-for-valdtakt-i-linkoping/</guid><link>https://www.expressen.se/nyheter/man-gripen-for-valdtakt-i-linkoping/</link><author>johan.ronge@expressen.se (Johan Ronge)</author><title>Man gripen för våldtäkt i Linköping</title><description><![CDATA[<p>En man i 20-årsåldern har anhållits som misstänkt för en våldtäkt i Linköping.&nbsp;</p><p>Våldtäkten ska ha ägt rum i en bostad.&nbsp;</p>]]></description><pubDate>Thu, 09 Jun 2022 14:57:13 +0200</pubDate></item></channel></rss>"
    @Test
    fun parseXml() {
        val parser: XmlParser = XmlParser()
        var channel = parser.parseXml(xml)
        println(channel)
    }
}