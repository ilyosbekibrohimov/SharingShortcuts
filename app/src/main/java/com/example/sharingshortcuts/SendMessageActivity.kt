package com.example.sharingshortcuts


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class SendMessageActivity : AppCompatActivity() {

    lateinit var title:EditText
    lateinit var content:EditText
    lateinit var post_button:Button
    private  val TAG = "SendMessageActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_send_message)
        title = findViewById(R.id.title)
        content = findViewById(R.id.content)
        post_button = findViewById(R.id.post_button)




        Log.e(TAG, "onCreate: ")
        val params = window.attributes
        params.x = 0
        params.gravity = Gravity.CENTER
        params.height = 800
        params.width = ViewGroup.LayoutParams.MATCH_PARENT
        params.y = 0
        this.window.attributes = params


    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume: ")

    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "onPause: ")
    
    }

    override fun onStart() {
        super.onStart()
        when {
            intent?.action == Intent.ACTION_SEND -> {
                if ("text/plain" == intent.type) {
                    intent.getStringExtra(Intent.EXTRA_TEXT)?.let {
                        content.setText(intent.getStringExtra(Intent.EXTRA_TEXT))


                    }
                }
            }

        }

    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "onStop: ")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy: ")
    }
}