package io.legado.app.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "readRecord", primaryKeys = ["deviceId", "bookName"])
data class ReadRecord(
    var deviceId: String = "",
    var bookName: String = "",
    @ColumnInfo(defaultValue = "0")
    var readTime: Long = 0L,
    @ColumnInfo(defaultValue = "0")
    var lastRead: Long = System.currentTimeMillis(),
    /** 最后使用的书源 */
    @ColumnInfo(defaultValue = "")
    var sourceUrl: String = "",
    /** 阅读进度-章节序号 */
    @ColumnInfo(defaultValue = "0")
    var durChapterIndex: Int = 0,
    /** 阅读进度-章节内位置 */
    @ColumnInfo(defaultValue = "0")
    var durChapterPos: Int = 0,
    /** 阅读进度-章节标题 */
    @ColumnInfo(defaultValue = "")
    var durChapterTitle: String = ""
)