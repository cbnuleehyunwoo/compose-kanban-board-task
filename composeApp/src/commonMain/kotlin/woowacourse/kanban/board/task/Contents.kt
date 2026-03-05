package woowacourse.kanban.board.task

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp

@Composable
fun TaskContents(contents:String){
    Text(text = contents,
        fontSize = 15.sp,
        fontFamily = FontFamily.SansSerif,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis)
}