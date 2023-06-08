package jp.techacademy.hiroto.ugajin.karuta1

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageButton
import androidx.core.content.ContextCompat
import jp.techacademy.hiroto.ugajin.karuta1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var mediaPlayer1: MediaPlayer
    private lateinit var mediaPlayer2: MediaPlayer

    val initialMessageArray = arrayOf(
        "京の都の　祇園祭",
        "春日なる　奈良の都の　お大仏",
        "世界遺産の、姫路城",
        "犬も歩けば、棒にあたる",
        "花より団子",
        "古池や　蛙飛び込む　水の音",
        "ひさかたの　光のどけき　春の日に　静心なく　花の散るらむ",
        "忍ぶれど　色に出にけり　わが恋は　ものや思うと　人の問うまで",
        "歌川広重　東海道",
        "葛飾北斎　富嶽三十六景",
        "写楽得意の　歌舞伎役者",
        "鬼より強い　桃太郎",
        "京に上るは　一寸法師",
        "誰でも開ける　玉手箱",
        "文明開花で　すき焼き文化",
        "海を渡って　やってきた　みんな大好き　ベースボール"
    )

    val drawableArray = arrayOf(
        R.drawable.k0,
        R.drawable.k1,
        R.drawable.k2,
        R.drawable.k3,
        R.drawable.k4,
        R.drawable.k5,
        R.drawable.k6,
        R.drawable.k7,
        R.drawable.k8,
        R.drawable.k9,
        R.drawable.k10,
        R.drawable.k11,
        R.drawable.k12,
        R.drawable.k13,
        R.drawable.k14,
        R.drawable.k15
    )

    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        mediaPlayer1 = MediaPlayer.create(this, R.raw.nice)
        mediaPlayer2 = MediaPlayer.create(this, R.raw.boo)

        val textView = binding.text

        // initialMessageArrayをシャッフルしてmessageArrayを作成
        val messageArray = initialMessageArray.toMutableList().shuffled().toTypedArray()
        // テキストサイズを変更する
        textView.textSize = 25f // ピクセル単位で指定
        textView.text = messageArray[currentIndex]
        currentIndex = 1


        val shuffledDrawableArray = drawableArray.clone().apply {
            shuffle()
        }

        // shuffledDrawableArrayを使用して画像を設定する
        for (i in 0 until shuffledDrawableArray.size) {
            val imageButtonId = resources.getIdentifier("button${i+1}", "id", "jp.techacademy.hiroto.ugajin.karuta1")
            val imageButton = findViewById<ImageButton>(imageButtonId)
            imageButton.setImageResource(shuffledDrawableArray[i])
        }

        val buttonClickListener = View.OnClickListener { view ->

            // クリックされたボタンの処理
            when (view.id) {
                R.id.button1 -> {
                    // ボタン1の処理
                    Log.d("my log", "ボタン１をタップしました")

                    val drawable = binding.button1.drawable

                    Log.d("my log", "${drawable}")


//                    val clickedImageIndex = if (drawable != null) drawableArray.indexOf(drawable) else -1
//
//                    val displayedMessage: String = textView.text.toString()
//                    val displayedMessageIndex: Int = if (displayedMessage!= null) initialMessageArray.indexOf(displayedMessage) else -1

//                    if (clickedImageIndex != -1 && displayedMessageIndex != -1 && clickedImageIndex == displayedMessageIndex) {
//// メッセージのインデックスと画像のインデックスが一致する場合の処理
//                        mediaPlayer1.start()
//                    } else {
//// 一致しない場合の処理
//                        mediaPlayer2.start()
//                    }
                }
//                R.id.button2 -> {
//                    // ボタン2の処理
//                }
//                // 他のボタンについても同様に処理を追加する
            }
        }

        binding.button1.setOnClickListener(buttonClickListener)
        binding.button2.setOnClickListener(buttonClickListener)
        binding.button3.setOnClickListener(buttonClickListener)
        binding.button4.setOnClickListener(buttonClickListener)
        binding.button5.setOnClickListener(buttonClickListener)
        binding.button6.setOnClickListener(buttonClickListener)
        binding.button7.setOnClickListener(buttonClickListener)
        binding.button8.setOnClickListener(buttonClickListener)
        binding.button9.setOnClickListener(buttonClickListener)
        binding.button10.setOnClickListener(buttonClickListener)
        binding.button11.setOnClickListener(buttonClickListener)
        binding.button12.setOnClickListener(buttonClickListener)
        binding.button13.setOnClickListener(buttonClickListener)
        binding.button14.setOnClickListener(buttonClickListener)
        binding.button15.setOnClickListener(buttonClickListener)
        binding.button16.setOnClickListener(buttonClickListener)
    }
}