package com.android.swipebuttonandroid

import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import java.security.AccessController.getContext


class MainActivity : AppCompatActivity(), SwipeButton.OnSwipeButtonStateChangeListener {

    lateinit var swipe_btn: SwipeButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        swipe_btn = findViewById(R.id.swipe_btn)
        swipe_btn.setOnSwipeButtonStateChangeListener(this);
    }

    override fun onButtonStateChange(active: Boolean) {
        Toast.makeText(this, "Completed", Toast.LENGTH_SHORT).show()
    }
}