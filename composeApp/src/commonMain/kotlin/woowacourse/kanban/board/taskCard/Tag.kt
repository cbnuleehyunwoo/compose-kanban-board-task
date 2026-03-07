package woowacourse.kanban.board.taskCard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Tag(
    val name: String,
)

@Preview(showBackground = true)
@Composable
fun TaskTags(
    @PreviewParameter(TagPreviewParameterProvider::class)
    tagNames: List<Tag>,
    ) {
    val checkedTagNames = tagNames.map {
        checkTagNameOverflow(it.name)
    }.subList(0, minOf(tagNames.size, 5))

    FlowRow(
        horizontalArrangement = Arrangement.spacedBy(6.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
    ) {
        checkedTagNames.forEach {
            TaskTag(Modifier.height(32.dp),it)
        }
    }


}

@Composable
private fun TaskTag(
    modifier: Modifier,
    tagName: String
) {
    Button(
        modifier = modifier,
        onClick = {},
        shape = RoundedCornerShape(21.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray),
        contentPadding = PaddingValues(vertical = 5.dp, horizontal = 10.dp),
    ) {
        Text(
            text = tagName,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black,
            fontSize = 16.sp,
        )
    }
}

private fun checkTagNameOverflow(tagName: String): String {
    return if (tagName.length > 5) {
        tagName.take(5) + "..."
    } else {
        tagName
    }
}

private class TagPreviewParameterProvider : PreviewParameterProvider<List<Tag>> {
    override val values: Sequence<List<Tag>> = sequenceOf(
        listOf(Tag("컴포넌트"), Tag("성능")),
        listOf(),
        listOf(Tag("긴 태그"), Tag("최대로"), Tag("5자까지"), Tag("5개제한임"), Tag("줄임표가되었습니다.")),
        listOf(Tag("6번째부터"), Tag("표시되지"), Tag("않습니다"), Tag("5개제한임"), Tag("5개제한임"), Tag("6개부터는 표시되지 않습니다.")),
    )
}
