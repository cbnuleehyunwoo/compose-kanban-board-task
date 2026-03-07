package woowacourse.kanban.board.task

data class TaskInfo(
    val title: String,
    val contents: String? = null,
    val tags: List<Tag>? = null,
    val contactName: String? = null,
    )