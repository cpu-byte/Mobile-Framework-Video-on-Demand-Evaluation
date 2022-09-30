package com.kuberio.videoplayerkotlin

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    private lateinit var videoView: VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        videoView = findViewById(R.id.videoView)

        // creating MediaController
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        // specify the location of media file
        val onlineUri: Uri =
            Uri.parse("https://dj0y8ictbokkx.cloudfront.net/94436a14-9fa4-496f-8d8c-78e84e61ef28/AppleHLS1/forest.m3u8")
//        val offlineUri: Uri = Uri.parse("android.resource://$packageName/${R.raw.meme}")

        // setting MediaController and URI, then starting the videoView
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(onlineUri)
        videoView.requestFocus()
        videoView.start()
    }
}