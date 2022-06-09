package chrved.rssnews.rest

data class RssFeedResponse(
    val responseCode: Int = 0,
    val error: String = "",
    val channel: Channel
)

data class Channel(
    var title: String = "",
    var description: String = "",
    var managingEditor: String = "",
    var link: String = "",
    var copyright: String = "",
    var items: MutableList<Item> = mutableListOf()
)

data class Item(
    var title: String = "",
    var description: String = "",
    var pubDate: String = "",
    var author: String = "",
    var link: String = ""
)