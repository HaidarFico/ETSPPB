package com.example.etsppb

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import com.example.etsppb.ui.theme.ETSPPBTheme

class PreviousOrders : ComponentActivity {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent(){
            ETSPPBTheme {
                Text(text = "TEMP")
            }
        }
    }
}