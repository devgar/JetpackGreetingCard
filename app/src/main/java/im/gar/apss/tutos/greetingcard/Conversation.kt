package im.gar.apss.tutos.greetingcard

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.ui.tooling.preview.Preview
import im.gar.apss.tutos.greetingcard.ui.theme.GreetingCardTheme

@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(messages) { message ->
            MessageCard(message)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewConversation() {
    GreetingCardTheme {
        Surface {
            Conversation(SampleData.conversationSample)
        }
    }
}