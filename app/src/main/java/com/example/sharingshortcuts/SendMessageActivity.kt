package com.example.sharingshortcuts

import android.app.ActionBar
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SendMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_message)


        val params = window.attributes
        params.x = 0
        params.height = 800
        params.width = ActionBar.LayoutParams.MATCH_PARENT
        params.y = 0

        this.window.attributes = params
    }
}