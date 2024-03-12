package br.senai.sp.jandira.imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.imc.ui.theme.ImcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImcTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                    SignUp()

                }
            }
        }
    }
}
@Composable
fun Greeting() {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Column(
            modifier = Modifier
                .background(color = Color(0xffea1450))
                .fillMaxWidth()
                .height(200.dp)


        ) {
            Image(
                painter = painterResource(id = R.drawable.imc),
                contentDescription = "logo imc",


                modifier = Modifier
                    .padding(16.dp)
                    .size(height = 76.dp, width = 76.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Text(
                text = "Calculadora IMC",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )


        }
        Card(
            modifier = Modifier
                .width(340.dp)
                .offset(x = 0.dp, y = -20.dp),
            elevation = CardDefaults.cardElevation(8.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xffF9F6F6)),


            ) {
            Column(
                modifier = Modifier
                    .wrapContentWidth()
                    .align(Alignment.CenterHorizontally)
            ) {
                Text(
                    text = "Seus Dados",
                    color = Color(0xffea1450),
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    modifier = Modifier
                        .padding(top = 30.dp, bottom = 30.dp)
                        .align(Alignment.CenterHorizontally)
                )
                Column(
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                ) {


                    Text(
                        text = "Seu Peso: ",
                        color = Color(0xffea1450),
                        modifier = Modifier
                            .padding(12.dp)
                    )
                    TextField(
                        value = "Seu peso em Kg",
                        onValueChange = {},
                        modifier = Modifier
                            .background(Color.White)
                            .border(
                                width = 1.dp,
                                color = Color(0xffea1450),
                                shape = RoundedCornerShape(size = 2.dp)
                            ),
                        colors = OutlinedTextFieldDefaults
                            .colors(
                                unfocusedTextColor = Color(0xffAFA9A9),
                                unfocusedBorderColor = Color.Transparent,
                                focusedBorderColor = Color.Transparent,
                            )
                    )
                    Text(
                        text = "Sua Altura: ",
                        color = Color(0xffea1450),
                        modifier = Modifier.padding(12.dp)
                    )
                    TextField(
                        value = "Sua altura em cm",
                        onValueChange = {},
                        modifier = Modifier
                            .background(Color.White)
                            .border(
                                width = 1.dp,
                                color = Color(0xffea1450),
                                shape = RoundedCornerShape(size = 2.dp)
                            ),
                        colors = OutlinedTextFieldDefaults
                            .colors(
                                unfocusedTextColor = Color(0xffAFA9A9),
                                unfocusedBorderColor = Color.Transparent,
                                focusedBorderColor = Color.Transparent,


                                )
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults
                        .buttonColors(
                            containerColor = Color(0xffea1450)
                        ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 32.dp, vertical = 18.dp),
                    shape = RoundedCornerShape(size = 8.dp)
                ) {
                    Text(text = "CALCULAR")
                }




            }
        }
        Card(
            modifier = Modifier
                .width(340.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xff329F6B)),
            elevation = CardDefaults.cardElevation(8.dp),
        ) {
            Row(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(12.dp),
                //horizontalArrangement = Arrangement.SpaceBetween,


            ) {
                Column(
                    modifier = Modifier
                        .padding(end = 32.dp),
                ) {
                    Text(
                        text = "Resultado",
                        fontSize = 16.sp,
                        color = Color.White
                    )
                    Text(
                        text = "Peso Ideal",
                        fontSize = 20.sp,
                        color = Color.White
                    )
                }
                Text(
                    text = "21.3",
                    color = Color.White,
                    fontSize = 38.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}




@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ImcTheme {
        Greeting()
    }
}

@Composable
fun Login() {
    Box(
        contentAlignment = Alignment.TopEnd,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .background(
                    Color(0xffCF06F0),
                    shape = RoundedCornerShape(bottomStart = 25.dp)
                )
                .height(40.dp)
                .width(120.dp)
        ) {


        }
    }
    Column(
        modifier = Modifier.padding(top = 160.dp, start = 16.dp)
    ) {
        Text(
            text = "Login",
            color = Color(0xffCF06F0),
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Please sign in to continue.",
            color = Color(0xffA09C9C)
        )
        Column(
        ) {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 16.dp, top = 70.dp),
                label = { Text(text = "E-mail") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "",
                        tint = Color(0xffCF06F0),
                    )




                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xffCF06F0),
                        focusedBorderColor = Color(0xffCF06F0),


                        )
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 16.dp, bottom = 16.dp, top = 16.dp),
                label = { Text(text = "Password") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Lock,
                        contentDescription = "",
                        tint = Color(0xffCF06F0),
                    )




                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xffCF06F0),
                        focusedBorderColor = Color(0xffCF06F0),
                    )
            )
        }
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults
                .buttonColors(
                    containerColor = Color(0XFFCF06F0)
                ),
            modifier = Modifier
                .align(Alignment.End)
                .padding(bottom = 32.dp, end = 16.dp),
            shape = RoundedCornerShape(size = 8.dp)
        ) {
            Text(
                text = "SIGN IN",
                modifier = Modifier
                    .padding(12.dp)
            )
            Icon(
                imageVector = Icons.Filled.ArrowForward,
                contentDescription = "",
            )
        }
        Row(
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(
                text = "Don’t have an account?",
                fontFamily = FontFamily.SansSerif
            )
            Text(
                text = "Sign up",
                color = Color(0xffCF06F0),
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier.padding(end = 16.dp)
            )
        }
    }
    Box(
        contentAlignment = Alignment.BottomStart,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .background(
                    Color(0xffCF06F0),
                    shape = RoundedCornerShape(topEnd = 25.dp)
                )
                .height(40.dp)
                .width(120.dp)
        ) {


        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginPreview() {
    ImcTheme {
        Login()
    }
}


@Composable
fun SignUp() {
    Box(
        contentAlignment = Alignment.TopEnd,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .background(
                    Color(0xffCF06F0),
                    shape = RoundedCornerShape(bottomStart = 25.dp)
                )
                .height(40.dp)
                .width(120.dp)
        ) {


        }


    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 60.dp)
    ) {
        Text(
            text = "Sign Up",
            color = Color(0xffCF06F0),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Create a new account",
            color = Color(0xffA09C9C),
            fontSize = 14.sp,
            modifier = Modifier.padding(bottom = 25.dp)
        )
        Card(
            modifier = Modifier
                .size(height = 100.dp, width = 100.dp),
            colors = CardDefaults
                .cardColors(containerColor = Color(0xFFE2E2E2)),
            shape = CircleShape
        ) {
            Image(
                painter = painterResource(id = R.drawable.person),
                contentDescription = "imagem de perfil",
                modifier = Modifier
                    .size(height = 100.dp, width = 100.dp)
            )
        }
        Image(
            painter = painterResource(id = R.drawable.adicionar_foto),
            contentDescription = "imagem de perfil",
            modifier = Modifier
                .offset(x = 32.dp, y = -26.dp)
                .size(height = 28.dp, width = 28.dp)
        )
        Column(
        ) {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 17.dp, end = 17.dp),
                label = { Text(text = "Username") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = "",
                        tint = Color(0xffCF06F0),
                    )
                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xffCF06F0),
                        focusedBorderColor = Color(0xffCF06F0),


                        )
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 17.dp, end = 17.dp),
                label = { Text(text = "Phone") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Phone,
                        contentDescription = "",
                        tint = Color(0xffCF06F0),
                    )
                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xffCF06F0),
                        focusedBorderColor = Color(0xffCF06F0),


                        )
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 17.dp, end = 17.dp),
                label = { Text(text = "E-mail") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "",
                        tint = Color(0xffCF06F0),
                    )
                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xffCF06F0),
                        focusedBorderColor = Color(0xffCF06F0),


                        )
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 17.dp, end = 17.dp),
                label = { Text(text = "Password") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Lock,
                        contentDescription = "",
                        tint = Color(0xffCF06F0),
                    )
                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xffCF06F0),
                        focusedBorderColor = Color(0xffCF06F0),


                        )
            )
        }
        Row(
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 20.dp, top = 20.dp)
        ) {
            Button(
                onClick = { /*TODO*/ },
                shape = RectangleShape,
                modifier = Modifier
                    .size(27.dp)
                    .border(1.dp, Color(0xffCF06F0))
                    .padding(0.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                )
            ) {
            }
            Text(text = "Over 18?", modifier = Modifier.padding(start = 12.dp))
        }
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults
                .buttonColors(
                    containerColor = Color(0XFFCF06F0)
                ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 26.dp, end = 16.dp, top = 26.dp, bottom = 30.dp),
            shape = RoundedCornerShape(size = 8.dp)
        ) {
            Text(
                text = "CREATE ACCOUNT",
                modifier = Modifier
                    .padding(12.dp)
            )
        }
        Row(
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(
                text = "Already have an account?",
                fontFamily = FontFamily.SansSerif
            )
            Text(
                text = "Sign in",
                color = Color(0xffCF06F0),
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier.padding(end = 16.dp)
            )
        }


    }
    Box(
        contentAlignment = Alignment.BottomStart,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .background(
                    Color(0xffCF06F0),
                    shape = RoundedCornerShape(topEnd = 25.dp)
                )
                .height(40.dp)
                .width(120.dp)
        ) {


        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignUpPreview() {
    ImcTheme {
        SignUp()
    }
}


