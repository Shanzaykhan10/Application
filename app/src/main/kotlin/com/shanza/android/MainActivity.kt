package com.shanza.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shanza.android.R
import com.shanza.android.screen.PreviewFunction
import com.shanza.android.screen.ScreenBox

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PreviewFunction()

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
                Image(painter = painterResource(id = R.drawable.pic4), contentDescription ="My pic",
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
                .padding(all = 8.dp))
        LazyColumn(verticalArrangement = Arrangement.spacedBy(10.dp), modifier = Modifier.padding(all = 9.dp)) {
            item {
                Image(
                    painter = painterResource(id =R.drawable.pic3),
                    contentDescription = "My pic",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(120.dp)
                        .clip(RoundedCornerShape(8.dp))
                )
                Text(text = "Picture 1", fontSize = 15.sp)
                Spacer(modifier = Modifier.padding(4.dp))


                Image(
                    painter = painterResource(id = R.drawable.pic2),
                    contentDescription = "My pic",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(120.dp)
                        .clip(RoundedCornerShape(8.dp))
                )
                Text(text = "picture 2", fontSize = 15.sp)
                Spacer(modifier = Modifier.padding(4.dp))

                Image(
                    painter = painterResource(id = R.drawable.pic5),
                    contentDescription = "My pic",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(120.dp)
                        .clip(RoundedCornerShape(8.dp))
                )
                Text(text = "Picture 3", fontSize = 15.sp)
                Spacer(modifier = Modifier.padding(4.dp))

                Image(
                    painter = painterResource(id = R.drawable.pic4),
                    contentDescription = "My pic",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(120.dp)
                        .clip(RoundedCornerShape(8.dp))
                )
                Text(text = "Picture 4", fontSize = 15.sp)
                Spacer(modifier = Modifier.padding(4.dp))

                Image(
                    painter = painterResource(id = R.drawable.pic4),
                    contentDescription = "My pic",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(120.dp)
                        .clip(RoundedCornerShape(8.dp))
                )
                Text(text = "Picture 5", fontSize = 15.sp)
                Spacer(modifier = Modifier.padding(4.dp))

                Image(
                    painter = painterResource(id = R.drawable.pic7),
                    contentDescription = "My pic",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(120.dp)
                        .clip(RoundedCornerShape(8.dp))
                )
                Text(text = "Picture 6", fontSize = 15.sp)
                Spacer(modifier = Modifier.padding(4.dp))

                Image(
                    painter = painterResource(id = R.drawable.pic1),
                    contentDescription = "My pic",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(120.dp)
                        .clip(RoundedCornerShape(8.dp))
                )
                Text(text = "Picture 7", fontSize = 15.sp)
                Spacer(modifier = Modifier.padding(4.dp))
            }
        }
    }
}



// Bottom App Bar
@Composable
fun BottomBar() {
        BottomAppBar(
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
            }
        )
    }






