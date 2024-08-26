package com.shanza.android.screen

import androidx.compose.animation.core.SnapSpec
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Place
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.sharp.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.textButtonColors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shanza.android.R
import java.security.spec.RSAOtherPrimeInfo

@ExperimentalMaterial3Api
@Preview
@Composable
fun PreviewFunction() {
    Scaffold(
        bottomBar = { BottomBar()}
    ) {
        innerpadding -> ScreenBox(innerpadding)
    }
}

@ExperimentalMaterial3Api
@Composable
fun ScreenBox(Innerpadding : PaddingValues) {
        Column(modifier = Modifier
            .padding(Innerpadding)
            .fillMaxHeight()) {
            Box(
                modifier = Modifier
                    .height(255.dp)
                    .background(Color(0xFFEDE9F3))
            )
            {

                Row(
                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pic2),
                        contentDescription = "My pic",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(45.dp)
                            .clip(CircleShape)
                    )
                }
                Column(modifier = Modifier.padding(start = 20.dp, top = 20.dp)) {
                    Row {
                        Text(text = "New York", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                        Icon(
                            Icons.Default.KeyboardArrowDown,
                            contentDescription = "KeyboardArrowDown"
                        )
                    }
                    Text(
                        text = "within 20 miles", color = Color.DarkGray
                    )

                    Spacer(
                        modifier = Modifier.height(20.dp)
                    )

                    Text(
                        text = "Hello, Simone",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "There are 25 new \n Events in your area.",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFAD9ACC)
                    )
                    Spacer(modifier = Modifier.height(19.dp))
                    TextField(value = "Search for an event",
                        onValueChange = {},
                        shape = RoundedCornerShape(8.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color(0xFFFEFEFF),
                            unfocusedIndicatorColor = Color.Transparent
                        ),
                        modifier = Modifier.size(width = 350.dp, height = 50.dp),
                        leadingIcon = {
                            Icon(
                                Icons.Default.Search,
                                contentDescription = "Search"
                            )
                        }
                    )
                }
            }
            Row(
                modifier = Modifier
                    .background(Color(0xFFF9F7FF))
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "You might like this",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp, modifier = Modifier
                        .padding(top = 30.dp, start = 13.dp)
                )
                TextButton(
                    onClick = {},
                    colors = textButtonColors(
                        contentColor = Color.Gray
                    ),
                    modifier = Modifier.padding(end = 20.dp, top = 20.dp)
                ) {
                    Text(
                        text = "See All", fontSize = 15.sp,
                        style = TextStyle(
                            textDecoration = TextDecoration
                                .Underline
                        )
                    )
                }
            }
            LazyRow(modifier = Modifier.padding(start = 15.dp, top = 2.dp)) {
                item {
                    Column {
                        Box {
                            Image(
                                painter = painterResource(id = R.drawable.art_event),
                                contentDescription = "Art event",
                                modifier = Modifier
                                    .width(270.dp)
                                    .clip(RoundedCornerShape(8.dp))
                            )
                            Box(
                                modifier = Modifier
                                    .padding(start = 15.dp, top = 15.dp)
                                    .background(Color(0xFF77767A))
                                    .width(50.dp)
                                    .height(56.dp)
                                    .shadow(1.dp, shape = RoundedCornerShape(3.dp))
                            )
                            {
                                Column(
                                    modifier = Modifier
                                        .padding(12.dp)
                                        .size(width = 68.dp, height = 68.dp)
                                ) {
                                    Text(text = "Nov", color = Color.White)
                                    Text(text = "18", fontWeight = FontWeight.ExtraBold,
                                        color = Color.White, fontSize = 17.sp)
                                }
                            }
                            Box(modifier = Modifier
                                .padding(top = 120.dp, start = 15.dp)
                                .background(Color(0xFF77767A))
                                .height(30.dp)
                                .width(138.dp)) {
                                Row() {
                                    Icon(Icons.Outlined.Menu, "Check",
                                        tint = Color(0xFF494546)
                                    )
                                    Spacer(modifier = Modifier.padding(start = 5.dp))
                                    Text(text = "Workshops",
                                        color = Color.White,
                                        fontSize = 20.sp)
                                }
                            }
                        }
                        Spacer(modifier = Modifier.padding(6.dp))
                        Text(
                            text = "Art festival in pakistan",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Row(
                            modifier = Modifier.padding(top = 8.dp),
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Icon(
                                Icons.Outlined.CheckCircle,
                                contentDescription = "KeyboardArrowDown",
                                modifier = Modifier.size(18.dp)
                            )
                            Text(text = "10:00 - 19:30")
                        }
                    }

                    Column(modifier = Modifier.padding(start = 18.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.culture_event),
                            contentDescription = "Event 1",
                            modifier = Modifier
                                .width(240.dp)
                                .clip(RoundedCornerShape(8.dp))
                        )
                        Spacer(modifier = Modifier.padding(6.dp))
                        Text(
                            text = "Culture festival in pakistan",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Row(
                            modifier = Modifier.padding(top = 8.dp),
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Icon(
                                Icons.Outlined.CheckCircle,
                                contentDescription = "KeyboardArrowDown",
                                modifier = Modifier.size(18.dp)
                            )
                            Text(text = "10:00 - 19:30")
                        }
                    }
                    Column(modifier = Modifier.padding(start = 18.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.art_event),
                            contentDescription = "Art event",
                            modifier = Modifier
                                .width(270.dp)
                                .clip(RoundedCornerShape(8.dp))
                        )
                        Spacer(modifier = Modifier.padding(6.dp))
                        Text(
                            text = "Art festival in pakistan",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Row(
                            modifier = Modifier.padding(top = 8.dp),
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Icon(
                                Icons.Outlined.CheckCircle,
                                contentDescription = "KeyboardArrowDown",
                                modifier = Modifier.size(18.dp)
                            )
                            Text(text = "10:00 - 19:30")
                        }
                    }
                    Column(modifier = Modifier.padding(start = 18.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.culture_event),
                            contentDescription = "Event 1",
                            modifier = Modifier
                                .width(240.dp)
                                .clip(RoundedCornerShape(8.dp))
                        )
                        Spacer(modifier = Modifier.padding(6.dp))
                        Text(
                            text = "Culture festival in pakistan",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Row(
                            modifier = Modifier.padding(top = 8.dp),
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Icon(
                                Icons.Outlined.CheckCircle,
                                contentDescription = "KeyboardArrowDown",
                                modifier = Modifier.size(18.dp)
                            )
                            Text(text = "10:00 - 19:30")
                        }
                    }
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Upcoming events",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp, modifier = Modifier
                        .padding(top = 30.dp, start = 13.dp)
                )
                TextButton(
                    onClick = {},
                    colors = textButtonColors(
                        contentColor = Color.Gray
                    ),
                    modifier = Modifier.padding(end = 20.dp, top = 20.dp)
                ) {
                    Text(
                        text = "See All", fontSize = 15.sp,
                        style = TextStyle(
                            textDecoration = TextDecoration
                                .Underline
                        )
                    )
                }
            }
            Row {
                Box(
                    modifier = Modifier
                        .padding(start = 15.dp)
                        .background(Color.White)
                        .width(50.dp)
                        .height(65.dp)
                        .shadow(2.dp, shape = RoundedCornerShape(10.dp))
                )
                {
                    Column(
                        modifier = Modifier
                            .padding(12.dp)
                            .size(width = 68.dp, height = 68.dp)
                    ) {
                        Text(text = "Nov")
                        Text(text = "18", fontWeight = FontWeight.ExtraBold)
                    }
                }

                Image(
                    painter = painterResource(id = R.drawable.upcoming_event),
                    contentDescription = "Art event",
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(8.dp))
                )
            }
        }
    }

@Composable
fun BottomBar() {
    BottomAppBar(containerColor = Color.Transparent,
        actions = {
            Column(modifier = Modifier
                .padding(start = 25.dp)) {

                Icon(
                    Icons.Outlined.Home, "Home",
                    modifier = Modifier.size(40.dp), tint = Color.Gray
                )
                Text(text = "Home", color = Color.Gray)
            }
            Spacer(modifier = Modifier.padding(start = 35.dp))
            Column(modifier = Modifier
                .padding(start = 20.dp)) {

                Icon(
                    Icons.Outlined.Search, "Search",
                    modifier = Modifier.size(40.dp),tint = Color.Gray
                )
                Text(text = "Search",color = Color.Gray)
            }
            Spacer(modifier = Modifier.padding(start = 35.dp))
            Column(modifier = Modifier
                .padding(start = 20.dp)) {

                Icon(
                    Icons.Outlined.Place, "Place",
                    modifier = Modifier.size(40.dp),tint = Color.Gray
                )
                Text(text = "Place",color = Color.Gray)
            }
            Spacer(modifier = Modifier.padding(start = 35.dp))
            Column(modifier = Modifier
                .padding(start = 20.dp)) {

                Icon(
                    Icons.Outlined.Menu, "Menu",
                    modifier = Modifier.size(40.dp),tint = Color.Gray
                )
                Text(text = "Menu",color = Color.Gray)
            }
        }
    )
}



















