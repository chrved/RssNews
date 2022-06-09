package chrved.rssnews.rest

import org.junit.Test

internal class RssClientTest {

    @Test
    fun synchronousCall() {
        var rest: RssClient = RssClient()
        rest.synchronousCall("https://feeds.expressen.se/nyheter/")


    }
}