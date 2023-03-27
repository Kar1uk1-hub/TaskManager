package com.example.taskmgr

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmgr.ui.theme.TaskMgrTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskMgrTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Remarks()
                }
            }
        }
    }
}

@Composable
fun Remarks() {
    TaskManager(
        p1 = stringResource(R.string.p1),
        p2 = stringResource(R.string.p2),
        imagePainter = painterResource(R.drawable.ic_task_completed)
    )

}
@Composable
private fun TaskManager(imagePainter:Painter, p1:String, p2:String, modifier:Modifier=Modifier){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ){
        Image(painter = imagePainter, contentDescription = null)
        Text(text=p1,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top=24.dp, bottom=8.dp)

            )
        Text(text=p2,
            fontSize = 16.sp

        )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TaskMgrTheme {
        Surface{
            Remarks()
        }
    }
}