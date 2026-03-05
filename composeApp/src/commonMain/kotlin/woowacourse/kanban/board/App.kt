package woowacourse.kanban.board

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import woowacourse.kanban.board.task.TaskCard

@Composable
@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
fun App() {
    MaterialTheme {
        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(horizontal = 62.5.dp, vertical = 60.dp)
                .safeContentPadding()
                .fillMaxSize(),
        ) {
            Row{
                val tagNames = listOf("컴포넌트", "성능")
                TaskCard("LazyColumn 컴포넌트 구현", "세로 스크롤 가능한 리스트 컴포넌트를 만들고 성능 최적화를 적용합니다.", tagNames, "다이노")
            }

            }
        }
    }
