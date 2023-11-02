package com.example.androidlaboratory

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.StarHalf
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import com.example.androidlaboratory.ui.theme.AndroidLaboratoryTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            AndroidLaboratoryTheme {
                // A surface container using the 'background' color from the theme
                ApplySystemBarColors()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Transparent,
                ){
                    ListItem()
                }
            }
        }
    }
}

@Composable
private fun ListItem() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF050B18)),
    ) {
        item {

            Box() {
                Image(
                    painter = painterResource(id = R.drawable.headerimage),
                    contentDescription = "Header",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxWidth()
                )

            }
        }
        item {
            Box(
                Modifier
                    .fillMaxWidth()
                    .height(100.dp)
            )
            {
                Box(
                    modifier = Modifier
                        .offset(20.dp, -40.dp)
                        .border(1.dp, Color.DarkGray, shape = RoundedCornerShape(16.dp))
                        .size(100.dp)
                        .background(color = Color.Black, shape = RoundedCornerShape(16.dp)),
                    contentAlignment = Alignment.Center
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.dota),
                        contentDescription = "Dota",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(70.dp)
                    )
                }
                Text(text = "DoTA 2", Modifier.offset(130.dp, 0.dp), fontSize = 24.sp)
                for (i in 0..4) {
                    Icon(
                        Icons.Filled.Star, "bsw", tint = Color.Yellow, modifier = Modifier
                            .size(15.dp)
                            .offset((130 + (15 * i)).dp, 30.dp)
                    )

                }
                Text(text = "70M", modifier = Modifier.offset(210.dp, 30.dp), fontSize = 10.sp)

                Row(modifier = Modifier.offset(35.dp, 85.dp)

                ) {
//                    Box (
//                        modifier = Modifier.background(Color.Blue).padding(start = 24.dp, end = 24.dp, top = 14.dp, bottom = 14.dp)
//                    ){
//                        Text(text = "MOBA",
//                            modifier = Modifier,
//                            fontSize = 14.sp)
//                    }
                    //val list = listOf("MOBA", "MULTIPLAYER", "STRATEGY")

                }

                Image(
                    painter = painterResource(id = R.drawable.tags),
                    contentDescription = "Dota",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .height(25.dp)
                        .width(300.dp)
                        .offset(24.dp, 80.dp)
                )

            }
        }
        item {
            Text(
                text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a" +
                        " large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
                fontSize = 13.sp,
                modifier = Modifier
                    .offset(24.dp, 20.dp)
                    .width(350.dp)
                    .height(120.dp)
            )
        }
        item {
            Row(
                modifier = Modifier
                    .offset(24.dp, 50.dp)
                    .fillMaxWidth()
                    .height(128.dp)
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.first),
                    contentDescription = "FirstImage",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(240.dp)
                        .clip(RoundedCornerShape(16.dp))
                )
                Image(
                    painter = painterResource(id = R.drawable.second),
                    contentDescription = "FirstImage",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(240.dp)
                        .offset(10.dp, 0.dp)
                        .clip(RoundedCornerShape(16.dp))
                )
            }
        }
        item {
            Box(
                Modifier
                    .offset(24.dp, 80.dp)
                    .fillMaxWidth()
            )
            {
                Text(
                    text = "Review & Ratings",
                    fontSize = 20.sp
                )
                Row(
                    modifier = Modifier
                        .offset(0.dp, 30.dp)
                )
                {
                    Text(text = "4.9", fontSize = 40.sp)
                    for (i in 0..3) {
                        Icon(
                            Icons.Filled.Star, "bsw", tint = Color.Yellow, modifier = Modifier
                                .size(15.dp)
                                .offset(20.dp, 15.dp)
                        )
                    }
                    Icon(
                        Icons.Filled.StarHalf, "wrb", tint = Color.Yellow, modifier = Modifier
                            .size(15.dp)
                            .offset(20.dp, 15.dp)
                    )

                    Text(
                        text = "70M Reviews",
                        modifier = Modifier.offset(-50.dp, 30.dp),
                        fontSize = 14.sp
                    )
                }

            }
        }
        item {
            Box(
                Modifier
                    .offset(24.dp, 80.dp)
                    .fillMaxWidth()
                    .height(200.dp)
                //.background(color = Color.Green)
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.avatar),
                    contentDescription = "avatar",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(50.dp)
                        .offset(10.dp, 50.dp)
                )
                Text(
                    text = "Auguste Conte",
                    fontSize = 20.sp,
                    modifier = Modifier.offset(70.dp, 50.dp)
                )
                Text(
                    text = "February 14, 2019",
                    fontSize = 12.sp,
                    modifier = Modifier.offset(70.dp, 85.dp)
                )
                Text(
                    text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
                    fontSize = 14.sp,
                    modifier = Modifier
                        .offset(10.dp, 120.dp)
                        .width(300.dp)
                )
            }
        }
        item {
            Box(
                Modifier
                    .offset(40.dp, 90.dp)
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.polosa),
                    contentDescription = "polosa",
                    modifier = Modifier
                        .width(300.dp)
                        .height(10.dp)
                )
            }
        }
        item {
            Box(
                Modifier
                    .offset(24.dp, 50.dp)
                    .fillMaxWidth()
                    .height(200.dp)
                //.background(color = Color.Green)
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.avatar2),
                    contentDescription = "avatar",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(50.dp)
                        .offset(10.dp, 50.dp)
                )
                Text(
                    text = "Jang Marcelino",
                    fontSize = 20.sp,
                    modifier = Modifier.offset(70.dp, 50.dp)
                )
                Text(
                    text = "February 14, 2019",
                    fontSize = 12.sp,
                    modifier = Modifier.offset(70.dp, 85.dp)
                )
                Text(
                    text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
                    fontSize = 14.sp,
                    modifier = Modifier
                        .offset(10.dp, 120.dp)
                        .width(300.dp)
                )
            }
        }
        item{
            Box(modifier = Modifier.height(220.dp))
            {

                Button(
                    onClick = {      },
                    modifier = Modifier
                     //   .padding(8.dp)
                        .offset(0.dp, 70.dp)
                        .height(100.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .width(500.dp),

                    colors = ButtonDefaults.buttonColors(Color(0xFFF4D144))
                ) {
                    Text(text = "Install",
                        fontSize = 24.sp,
                        color = Color.Black
                    )
                }
//                Image(
//                    painter = painterResource(id = R.drawable.install),
//                    contentDescription = "FirstImage",
//                    modifier = Modifier
//                        .offset(0.dp, 50.dp)
//                        .height(100.dp)
//                        .width(500.dp)
//                )
            }
        }
    }
}

@Composable
fun ApplySystemBarColors() {
    val systemUiController = rememberSystemUiController()
    SideEffect {

        systemUiController.setStatusBarColor(color = Color.Transparent, darkIcons = false)
        systemUiController.setNavigationBarColor(color = Color.Transparent, darkIcons = false)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidLaboratoryTheme {
        ListItem()
    }
}