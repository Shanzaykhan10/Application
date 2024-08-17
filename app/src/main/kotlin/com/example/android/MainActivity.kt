package com.example.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android.R.drawable


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyScreen()
        }
    }
}

@ExperimentalMaterial3Api
@Preview(showBackground = true)
@Composable
fun MyScreen() {
    Scaffold(
        topBar = { TopAppbar()},
        bottomBar = { BottomBar() }
    )
        { innerPadding ->
            ScreenBody(innerPadding)
        }


}

// Top App Bar
@ExperimentalMaterial3Api
@Composable
fun TopAppbar() {
    TopAppBar(colors = topAppBarColors(containerColor = Color(0xFF67E4F4)),
        title = {
        Row() {
            Image(painter = painterResource(id = drawable.pic3), contentDescription ="My pic",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(33.dp)
                .clip(CircleShape))
            Spacer(modifier = Modifier.padding(start = 10.dp))
            Text(text = "My Gallery", fontWeight = FontWeight.ExtraBold)
        }
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Outlined.AccountCircle, contentDescription = "Account circle")
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Outlined.Notifications, contentDescription = "Notification")
            }
        }
    )
}

// Screen body
@Composable
fun ScreenBody(Innerpadding : PaddingValues) {
    Column(modifier = Modifier.padding((Innerpadding))) {
         Text(text = "Photos", fontWeight = FontWeight.ExtraBold, fontSize = 20.sp,
             modifier = Modifier
                 .fillMaxWidth()
                 .padding(start = 9.dp, top = 9.dp, bottom = 9.dp))
        LazyRow(modifier = Modifier.padding(start = 9.dp, end = 9.dp)) {
            item {
                Column(modifier = Modifier.padding(7.dp)) {
                    Image(
                        painter = painterResource(id = drawable.pic5),
                        contentDescription = "My pic",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(120.dp)
                            .clip(RoundedCornerShape(8.dp))
                    )
                    Spacer(modifier = Modifier.padding(4.dp))
                    Text(text = "Picture 1", fontSize = 15.sp)
                }

                Column(modifier = Modifier.padding(7.dp)) {
                    Image(
                        painter = painterResource(id = drawable.pic2),
                        contentDescription = "My pic",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(120.dp)
                            .clip(RoundedCornerShape(8.dp))
                    )
                    Spacer(modifier = Modifier.padding(4.dp))
                    Text(text = "picture 2", fontSize = 15.sp)
                }
                Column(modifier = Modifier.padding(7.dp)) {
                    Image(
                        painter = painterResource(id = drawable.pic3),
                        contentDescription = "My pic",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(120.dp)
                            .clip(RoundedCornerShape(8.dp))
                    )
                    Spacer(modifier = Modifier.padding(4.dp))
                    Text(text = "Picture 3", fontSize = 15.sp)
                }
                Column(modifier = Modifier.padding(7.dp)) {
                    Image(
                        painter = painterResource(id = drawable.pic4),
                        contentDescription = "My pic",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(120.dp)
                            .clip(RoundedCornerShape(8.dp))
                    )
                    Spacer(modifier = Modifier.padding(4.dp))
                    Text(text = "Picture 4", fontSize = 15.sp)
                }
                Column(modifier = Modifier.padding(7.dp)) {
                    Image(
                        painter = painterResource(id = drawable.pic1),
                        contentDescription = "My pic",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(120.dp)
                            .clip(RoundedCornerShape(8.dp))
                    )
                    Spacer(modifier = Modifier.padding(4.dp))
                    Text(text = "Picture 5", fontSize = 15.sp)
                }
                Column(modifier = Modifier.padding(7.dp)) {
                    Image(
                        painter = painterResource(id = drawable.pic6),
                        contentDescription = "My pic",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(120.dp)
                            .clip(RoundedCornerShape(8.dp))
                    )
                    Spacer(modifier = Modifier.padding(4.dp))
                    Text(text = "Picture 6", fontSize = 15.sp)
                }
                Column(modifier = Modifier.padding(7.dp)) {
                    Image(
                        painter = painterResource(id = drawable.pic7),
                        contentDescription = "My pic",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(120.dp)
                            .clip(RoundedCornerShape(8.dp))
                    )
                    Spacer(modifier = Modifier.padding(4.dp))
                    Text(text = "Picture 7", fontSize = 15.sp)
                }
            }
        }
    }
}

// Bottom App Bar
@Composable
fun BottomBar() {
   BottomAppBar(containerColor = Color(0xFF67E4F4),
        actions = {
        IconButton(onClick = { /*TODO*/ })
        {
            Icon(Icons.Filled.LocationOn, contentDescription = "Location")
        }
        IconButton(onClick = { /*TODO*/ })
        {
            Icon(Icons.Filled.Call, contentDescription = "Call")
        }
        IconButton(onClick = { /*TODO*/ })
        {
            Icon(Icons.Filled.Email, contentDescription = "Email")
        }
    },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }, containerColor = Color(0xFF5AB0BB)) {
                Icon(Icons.Filled.Add, contentDescription = "Add")
            }
        }
    )
}





