package imransk.ml.okkhorshikhi.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import imransk.ml.okkhorshikhi.AdapterClass.Small_Letter_Adapter
import imransk.ml.okkhorshikhi.R
import imransk.ml.okkhorshikhi.RecyclerView_click.RecyclerItemClickListenr
import kotlinx.android.synthetic.main.activity_small_letters.*
import java.util.*
import kotlin.collections.ArrayList

class SmallLetters_Activity : AppCompatActivity() {

    var small_Litter_List = ArrayList<Int>()
    lateinit var textToSpeak: TextToSpeech


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_small_letters)

        small_Litter_List.add(R.drawable.small_letter_1)
        small_Litter_List.add(R.drawable.small_letter_2)
        small_Litter_List.add(R.drawable.small_letter_3)
        small_Litter_List.add(R.drawable.small_letter_4)
        small_Litter_List.add(R.drawable.small_letter_5)
        small_Litter_List.add(R.drawable.small_letter_6)
        small_Litter_List.add(R.drawable.small_letter_7)
        small_Litter_List.add(R.drawable.small_letter_8)
        small_Litter_List.add(R.drawable.small_letter_9)
        small_Litter_List.add(R.drawable.small_letter_10)

        small_Litter_List.add(R.drawable.small_letter_11)
        small_Litter_List.add(R.drawable.small_letter_12)
        small_Litter_List.add(R.drawable.small_letter_13)
        small_Litter_List.add(R.drawable.small_letter_14)
        small_Litter_List.add(R.drawable.small_letter_15)
        small_Litter_List.add(R.drawable.small_letter_16)
        small_Litter_List.add(R.drawable.small_letter_17)
        small_Litter_List.add(R.drawable.small_letter_18)
        small_Litter_List.add(R.drawable.small_letter_19)
        small_Litter_List.add(R.drawable.small_letter_20)

        small_Litter_List.add(R.drawable.small_letter_21)
        small_Litter_List.add(R.drawable.small_letter_22)
        small_Litter_List.add(R.drawable.small_letter_23)
        small_Litter_List.add(R.drawable.small_letter_24)
        small_Litter_List.add(R.drawable.small_letter_25)
        small_Litter_List.add(R.drawable.small_letter_26)

        //set layout manager start
        var layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        small_letters_recycler_ID.layoutManager = layoutManager
        //set layout manager END

        //set adapter
        var small_Letter_Adapter = Small_Letter_Adapter(small_Litter_List)
        small_letters_recycler_ID.adapter = small_Letter_Adapter

        imageView_details_small_letters.setImageResource(small_Litter_List[0])

        //set default speak Start
        textToSpeak = TextToSpeech(this, TextToSpeech.OnInitListener {

            textToSpeak.language = Locale.US
            textToSpeak.speak("A", TextToSpeech.QUEUE_FLUSH, null)

        })
        //set default speak END



        //set On click
        small_letters_recycler_ID.addOnItemTouchListener(RecyclerItemClickListenr(this,small_letters_recycler_ID,object :RecyclerItemClickListenr.OnItemClickListener{
            override fun onItemClick(view: View, position: Int) {
                imageView_details_small_letters.setImageResource(small_Litter_List[position])
                callSpeakingMethod(position)
            }

            override fun onItemLongClick(view: View?, position: Int) {
                imageView_details_small_letters.setImageResource(small_Litter_List[position])
                callSpeakingMethod(position)
            }

        }))

    }
    private fun callSpeakingMethod(position: Int) {
        if (position == 0) {
            textToSpeak.speak("A", TextToSpeech.QUEUE_FLUSH, null)
            return
        }
        if (position == 1) {
            textToSpeak.speak("B", TextToSpeech.QUEUE_FLUSH, null)
            return
        }
        if (position == 2) {
            textToSpeak.speak("C", TextToSpeech.QUEUE_FLUSH, null)
            return
        }
        if (position == 3) {
            textToSpeak.speak("D", TextToSpeech.QUEUE_FLUSH, null)
            return
        }
        if (position == 4) {
            textToSpeak.speak("E", TextToSpeech.QUEUE_FLUSH, null)
            return
        }
        if (position == 5) {
            textToSpeak.speak("F", TextToSpeech.QUEUE_FLUSH, null)
            return
        }
        if (position == 6) {
            textToSpeak.speak("G", TextToSpeech.QUEUE_FLUSH, null)
            return
        }
        if (position == 7) {
            textToSpeak.speak("H", TextToSpeech.QUEUE_FLUSH, null)
            return
        }
        if (position == 8) {
            textToSpeak.speak("I", TextToSpeech.QUEUE_FLUSH, null)
            return
        }
        if (position == 9) {
            textToSpeak.speak("J", TextToSpeech.QUEUE_FLUSH, null)
            return
        }
        if (position == 10) {
            textToSpeak.speak("K", TextToSpeech.QUEUE_FLUSH, null)
            return
        }
        if (position == 11) {
            textToSpeak.speak("L", TextToSpeech.QUEUE_FLUSH, null)
            return
        }
        if (position ==12 ) {
            textToSpeak.speak("M", TextToSpeech.QUEUE_FLUSH, null)
            return
        }
        if (position == 13) {
            textToSpeak.speak("N", TextToSpeech.QUEUE_FLUSH, null)
            return
        }
        if (position == 14) {
            textToSpeak.speak("O", TextToSpeech.QUEUE_FLUSH, null)
            return
        }
        if (position == 15) {
            textToSpeak.speak("P", TextToSpeech.QUEUE_FLUSH, null)
            return
        }
        if (position == 16) {
            textToSpeak.speak("Q", TextToSpeech.QUEUE_FLUSH, null)
            return
        }
        if (position == 17) {
            textToSpeak.speak("R", TextToSpeech.QUEUE_FLUSH, null)
            return
        }
        if (position == 18) {
            textToSpeak.speak("S", TextToSpeech.QUEUE_FLUSH, null)
            return
        }
        if (position == 19) {
            textToSpeak.speak("T", TextToSpeech.QUEUE_FLUSH, null)
            return
        }
        if (position == 20) {
            textToSpeak.speak("U", TextToSpeech.QUEUE_FLUSH, null)
            return
        }
        if (position ==21 ) {
            textToSpeak.speak("V", TextToSpeech.QUEUE_FLUSH, null)
            return
        }
        if (position == 22) {
            textToSpeak.speak("W", TextToSpeech.QUEUE_FLUSH, null)
            return
        }
        if (position == 23) {
            textToSpeak.speak("X", TextToSpeech.QUEUE_FLUSH, null)
            return
        }
        if (position == 24) {
            textToSpeak.speak("Y", TextToSpeech.QUEUE_FLUSH, null)
            return
        }
        if (position == 25) {
            textToSpeak.speak("Z", TextToSpeech.QUEUE_FLUSH, null)
            return
        }


    }
}
