//package com.example.samplecompose
//
//import android.os.Bundle
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//import androidx.compose.*
//import androidx.ui.core.*
//import androidx.ui.foundation.AdapterList
//import androidx.ui.foundation.Image
//import androidx.ui.foundation.Text
//import androidx.ui.foundation.shape.corner.RoundedCornerShape
//import androidx.ui.graphics.Color
//import androidx.ui.layout.*
//import androidx.ui.material.Button
//import androidx.ui.material.ListItem
//import androidx.ui.material.MaterialTheme
//import androidx.ui.material.Surface
//import androidx.ui.res.imageResource
//import androidx.ui.text.TextStyle
//import androidx.ui.text.style.TextAlign
//import androidx.ui.tooling.preview.Preview
//import androidx.ui.unit.dp
//import java.util.*
//
//@Model
//data class MainState(
//        val name: String = "",
//        val items: List<String>? = null,
//        val details: List<String>? = null,
//        var count: Int = 0,
//        val id: String = UUID.randomUUID().toString()
//)
//
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            MainUI()
//        }
//    }
//    @Composable
//    fun Greeting(name: String, count: Int) {
//        Row(modifier = Modifier.fillMaxWidth()) {
//            Text(
//                    text = "Count: $count",
//                    textAlign = TextAlign.Left
//            )
//            Text(
//                    text = "I am $name",
//                    textAlign = TextAlign.Right,
//                    modifier = Modifier.fillMaxWidth()
//            )
//        }
//    }
//
//    @Composable
//    fun ColoredText(text: String, style: TextStyle) {
//        Text(text, style = style, color = Color.White)
//    }
//
//    @Composable
//    fun NewsStory() {
//        val typography = MaterialTheme.typography
//        Surface(
//                color = Color.DarkGray,
//                modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(4.dp))
//        ) {
//            Column(Modifier.padding(8.dp)) {
//                ColoredText("I am learning compose today", style = typography.h6)
//                ColoredText("I think it should be really nice", style = typography.body1)
//                ColoredText("I absolutely hate XML based layouts", style = typography.body2)
//            }
//        }
//    }
//
//    fun handleClick() {
//        Toast.makeText(this, "You clicked me", Toast.LENGTH_SHORT).show()
//    }
//
//    @Composable
//    fun Space() {
//        Spacer(Modifier.preferredHeight(16.dp))
//    }
//
//    @Composable
//    fun StringList(items: List<String>) {
//        AdapterList(data = items) {
//            ListItem(text = it)
//        }
//    }
//
//    @Composable
//    fun Counter() {
//        val count = remember { mutableStateOf(0) }
//        Button(onClick = { count.value++ }) {
//            Text("I've been clicked ${count.value} times")
//        }
//    }
//
//    @Preview(showBackground = true)
//    @Composable
//    fun MainUI() {
//        val state = remember { mutableStateOf(MainState()) }
//
//        val imageModifier = Modifier
//                .preferredHeightIn(maxHeight = 180.dp)
//                .fillMaxWidth()
//                .clip(RoundedCornerShape(4.dp))
//        MaterialTheme {
//            Column(modifier = Modifier.padding(16.dp)) {
////        understand how to put glide here
//                Image(
//                        imageResource(id = R.drawable.mountains),
//                        modifier = imageModifier,
//                        contentScale = ContentScale.Crop
//                )
//                Space()
//
//                Greeting(name = "Shibasis", count = state.value.count)
//                Space()
//
//                NewsStory()
//                Space()
//
//                Row {
//                    Button(
//                            text = { Text(text = "Toast") },
//                            onClick = {
//                                handleClick()
//                                state.value.count += 1
//                            }
//                    )
//                    Counter()
//                }
//
//
//                StringList(listOf(
//                        "Shibasis",
//                        "Patnaik",
//                        "Jetpack",
//                        "Compose"
//                ))
//                Space()
//            }
//        }
//    }
//}
//
