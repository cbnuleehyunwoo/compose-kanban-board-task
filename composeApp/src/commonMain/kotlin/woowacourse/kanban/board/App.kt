package woowacourse.kanban.board

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import woowacourse.kanban.board.study.ButtonExample
import woowacourse.kanban.board.study.ButtonLike
import woowacourse.kanban.board.study.ButtonLove
import woowacourse.kanban.board.study.ButtonSummit
import woowacourse.kanban.board.study.IconExample
import woowacourse.kanban.board.study.ImageExample
import woowacourse.kanban.board.study.SimpleBox
import woowacourse.kanban.board.study.TextExample

@Composable
@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
fun App() {
    MaterialTheme {
        //var showContent by remember { mutableStateOf(false) }
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            TextExample()
            ImageExample()
            IconExample()
            ButtonExample()
            ButtonSummit()
            ButtonLove()
            ButtonLike()
            SimpleBox()
            }
        }
    }
