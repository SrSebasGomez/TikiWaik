package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.graphics.ColorSpace.Connector
import android.media.AudioManager
import android.media.browse.MediaBrowser.MediaItem
import android.media.session.MediaSession
import android.net.Uri.parse
import android.net.Uri
import android.os.Bundle
import android.widget.VideoView
import android.os.Parcelable.Creator
import android.provider.MediaStore.Audio.Media
import android.provider.MediaStore.Video
import android.support.v4.media.session.MediaSessionCompat
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import android.support.v4.media.MediaDescriptionCompat
import kotlinx.android.synthetic.*
import com.google.android.exoplayer2.ExoPlayer
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import android.widget.MediaController
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.analytics.PlayerId
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_main3.view.*





public class MainActivity3 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)




        imageView20.setOnClickListener {
        }
        imageView22.setOnClickListener {

        }

        imageView21.setOnClickListener {

        }
        imageView7.setOnClickListener {

        }


        perfilImageView.setOnClickListener {
            startActivity(Intent(this, MainActivity4::class.java))
        }


        var like = false
        Likeimage.setOnClickListener {
            like = likeAnimation(Likeimage, R.raw.corazonxd, like)
        }
        var like2 = false

        Like2ImageView.setOnClickListener {
            like2 = likeAnimation(Like2ImageView, R.raw.risaemoji, like2)
        }
        var like3 = false

        Like3ImageView.setOnClickListener {
            like3 = likeAnimation(Like3ImageView, R.raw.sadlike, like3)
        }

    }



    private fun createPlayer() {

    }


    private fun likeAnimation(
        imageView: LottieAnimationView,
        animation: Int,
        like: Boolean
    ): Boolean {
        if (!like) {
            imageView.setAnimation(animation)
            imageView.playAnimation()
        } else {
            Likeimage.setImageResource(R.drawable.ic_corazon_foreground)
            Like2ImageView.setImageResource(R.drawable.ic_cararisa_foreground)
            Like3ImageView.setImageResource(R.drawable.ic_caratriste_foreground)
        }
        return !like
    }
}



