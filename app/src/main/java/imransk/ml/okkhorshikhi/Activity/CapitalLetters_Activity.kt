package imransk.ml.okkhorshikhi.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import imransk.ml.okkhorshikhi.AdapterClass.CapitalLetters_Adapter
import imransk.ml.okkhorshikhi.R
import imransk.ml.okkhorshikhi.RecyclerView_click.RecyclerItemClickListenr
import kotlinx.android.synthetic.main.activity_capital_letters.*
import java.util.*
import kotlin.collections.ArrayList


class CapitalLetters_Activity : AppCompatActivity() {

    var capitalLetters_list = ArrayList<Int>()

    var capitalLetters_Images_details_list = ArrayList<Int>()

    lateinit var textToSpeak: TextToSpeech

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capital_letters)


        capitalLetters_list.add(R.drawable.capital_letter_1)
        capitalLetters_list.add(R.drawable.capital_letter_2)
        capitalLetters_list.add(R.drawable.capital_letter_3)
        capitalLetters_list.add(R.drawable.capital_letter_4)
        capitalLetters_list.add(R.drawable.capital_letter_5)
        capitalLetters_list.add(R.drawable.capital_letter_6)
        capitalLetters_list.add(R.drawable.capital_letter_7)
        capitalLetters_list.add(R.drawable.capital_letter_8)
        capitalLetters_list.add(R.drawable.capital_letter_9)
        capitalLetters_list.add(R.drawable.capital_letter_10)

        capitalLetters_list.add(R.drawable.capital_letter_11)
        capitalLetters_list.add(R.drawable.capital_letter_12)
        capitalLetters_list.add(R.drawable.capital_letter_13)
        capitalLetters_list.add(R.drawable.capital_letter_14)
        capitalLetters_list.add(R.drawable.capital_letter_15)
        capitalLetters_list.add(R.drawable.capital_letter_16)
        capitalLetters_list.add(R.drawable.capital_letter_17)
        capitalLetters_list.add(R.drawable.capital_letter_18)
        capitalLetters_list.add(R.drawable.capital_letter_19)
        capitalLetters_list.add(R.drawable.capital_letter_20)

        capitalLetters_list.add(R.drawable.capital_letter_21)
        capitalLetters_list.add(R.drawable.capital_letter_22)
        capitalLetters_list.add(R.drawable.capital_letter_23)
        capitalLetters_list.add(R.drawable.capital_letter_24)
        capitalLetters_list.add(R.drawable.capital_letter_25)
        capitalLetters_list.add(R.drawable.capital_letter_26)

        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_1)
        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_2)
        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_3)
        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_4)
        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_5)
        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_6)
        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_7)
        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_8)
        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_9)
        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_10)

        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_11)
        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_12)
        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_13)
        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_14)
        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_15)
        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_16)
        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_17)
        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_18)
        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_19)
        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_20)

        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_21)
        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_22)
        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_23)
        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_24)
        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_25)
        capitalLetters_Images_details_list.add(R.drawable.capital_letter_details_images_26)


        //set layout manager
        var linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        capital_letters_recycler_ID.layoutManager = linearLayoutManager
        //set layout manager

        //set Adapter
        var capitalLetters_Adapter = CapitalLetters_Adapter(capitalLetters_list)
        capital_letters_recycler_ID.adapter = capitalLetters_Adapter
        //set Adapter END

        imageView_details_capital_letters.setImageResource(capitalLetters_Images_details_list[0])

  //set default speak Start
        textToSpeak = TextToSpeech(this, TextToSpeech.OnInitListener {

            textToSpeak.language = Locale.UK
            textToSpeak.speak("A", TextToSpeech.QUEUE_FLUSH, null)

        })
  //set default speak END


        capital_letters_recycler_ID.addOnItemTouchListener(
            RecyclerItemClickListenr(
                this,
                capital_letters_recycler_ID,
                object : RecyclerItemClickListenr.OnItemClickListener {
                    override fun onItemClick(view: View, position: Int) {

                        imageView_details_capital_letters.setImageResource(capitalLetters_Images_details_list[position])

                      callSpeakingMethod(position)

                    }

                    override fun onItemLongClick(view: View?, position: Int) {
                        imageView_details_capital_letters.setImageResource(capitalLetters_Images_details_list[position])
                        callSpeakingMethod(position)

                    }

                })
        )

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
