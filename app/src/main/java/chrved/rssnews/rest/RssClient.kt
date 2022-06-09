package chrved.rssnews.rest

import okhttp3.Call
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response

class RssClient {
    private val client = OkHttpClient();
    fun synchronousCall(url: String) {
        var req = Request.Builder().url(url)
            .build();

        val call: Call = client.newCall(req);
        val response: Response = call.execute()
        var ss = response.body?.string()
        println(ss)
        println(response)

    }
}