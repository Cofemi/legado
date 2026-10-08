package io.legado.app.data.entities

data class ReadRecordShow(
    var bookName: String,
    var readTime: Long,
    var lastRead: Long,
    /** 最后使用的书源 */
    var sourceUrl: String = "",
    /** 阅读进度-章节序号 */
    var durChapterIndex: Int = 0,
    /** 阅读进度-章节标题 */
    var durChapterTitle: String = ""
)