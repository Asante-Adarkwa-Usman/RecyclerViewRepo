package com.example.recyclerviewproject.navigate_compose.ui


import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Button
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview

enum class IconPosition { START, END }

@Composable
fun CustomButton(
    buttonName: String? = "Button",
    backgroundColor: Color? = Color.Blue,
    textColor: Color? = Color.White,
    textSize: Int? = 16,
    icon: ImageVector? = null,
    iconSize: Int? = 24,
    iconPosition: IconPosition? = IconPosition.START,
    buttonActiveState: Boolean? = true,
    onClick: () -> Unit
) {
    Button(
        onClick = { if(buttonActiveState == true)  onClick.invoke() },
        colors = ButtonDefaults.buttonColors(
            containerColor = if (buttonActiveState == true) backgroundColor!! else Color.Gray
        ),
        shape = RoundedCornerShape(8.dp),
        enabled = buttonActiveState == true
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            if (icon != null && iconPosition == IconPosition.START) {
                Icon(
                    imageVector = icon,
                    contentDescription = "Button Icon",
                    tint = textColor!!,
                    modifier = Modifier.size(iconSize!!.dp).padding(end = 4.dp)
                )
            }

            Text(
                text = buttonName!!,
                style = TextStyle(color = textColor!!, fontSize = textSize!!.sp)
            )

            if (icon != null && iconPosition == IconPosition.END) {
                Icon(
                    imageVector = icon,
                    contentDescription = "Button Icon",
                    tint = textColor!!,
                    modifier = Modifier.size(iconSize!!.dp).padding(start = 4.dp)
                )
            }
        }
    }
}


//Previewing composable
@Preview(showBackground = true)
@Composable
fun CustomButtonPreview() {
    Column(modifier = Modifier.padding(16.dp)) {
        CustomButton(
            buttonName = "Click Me",
            backgroundColor = Color.Green,
            textColor = Color.White,
            textSize = 18,
            icon = Icons.Default.Favorite,
            iconSize = 24,
            iconPosition = IconPosition.START,
            buttonActiveState = true
        ) {
            println("Button clicked!")
        }
    }
}