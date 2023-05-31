package com.eregion.markdowntest03

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.eregion.markdowntest03.R
import io.noties.markwon.Markwon

/*
    This app demonstrates a simple Markdown viewer app, using Markwon
 */
class MainActivity : ComponentActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.main_text_view)

        // Create an instance of Markwon with desired plugins
        val markwon = Markwon.builder(this)
            .build()

        // Sample Markdown content
        val markdown = """
            # Hello world! :)
            
            Seems like ChatGPT's markwon code is working!
            
            Let's try a to do list:
            - [x] First item
            - [_] Second item
            - Third item
                - [x] Subitem A
                - [_] Subitem B
        """.trimIndent()
        markwon.setMarkdown(textView, markdown)
    }

    /*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /*
            val linearLayout = findViewById<View>(R.id.main_linear_layout) as LinearLayout
            val textView = findViewById<TextView>(R.id.main_text_view)
            val markwon = Markwon.builder(this)
                .build()
             */

            MarkdownTest02Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // markwon.setMarkdown(textView, "**Hello world! :)**");
                    Greeting("Android")
                }
            }
        }
    }
    */
}
