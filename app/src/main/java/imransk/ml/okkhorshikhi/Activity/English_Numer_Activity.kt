package imransk.ml.okkhorshikhi.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import imransk.ml.okkhorshikhi.AdapterClass.English_Numer_Adapter
import imransk.ml.okkhorshikhi.R
import imransk.ml.okkhorshikhi.RecyclerView_click.RecyclerItemClickListenr
import kotlinx.android.synthetic.main.activity_english__numer.*
import java.util.*
import kotlin.collections.ArrayList

class English_Numer_Activity : AppCompatActivity() {

    var number_english_speeling = ArrayList<String>()
    lateinit var textToSpeak: TextToSpeech

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_english__numer)

        number_english_speeling.add("Zero")
        number_english_speeling.add("One")
        number_english_speeling.add("Two")
        number_english_speeling.add("Three")
        number_english_speeling.add("Four")
        number_english_speeling.add("Five")
        number_english_speeling.add("Six")
        number_english_speeling.add("Seven")
        number_english_speeling.add("Eight")
        number_english_speeling.add("Nine")
        number_english_speeling.add("Ten")


        number_english_speeling.add("Eleven")
        number_english_speeling.add("Twelve")
        number_english_speeling.add("Thirteen")
        number_english_speeling.add("Fourteen")
        number_english_speeling.add("Fifteen")
        number_english_speeling.add("Sixteen")
        number_english_speeling.add("Seventeen")
        number_english_speeling.add("Eighteen")
        number_english_speeling.add("Nineteen")
        number_english_speeling.add("Twenty")

        number_english_speeling.add("Twenty-one")
        number_english_speeling.add("Twenty-two")
        number_english_speeling.add("Twenty-three")
        number_english_speeling.add("Twenty-four")
        number_english_speeling.add("Twenty-five")
        number_english_speeling.add("Twenty-six")
        number_english_speeling.add("Twenty-seven")
        number_english_speeling.add("Twenty-eight")
        number_english_speeling.add("Twenty-nine")
        number_english_speeling.add("Thirty")

        number_english_speeling.add("Thirty-one")
        number_english_speeling.add("Thirty-two")
        number_english_speeling.add("Thirty-three")
        number_english_speeling.add("Thirty-four")
        number_english_speeling.add("Thirty-five")
        number_english_speeling.add("Thirty-six")
        number_english_speeling.add("Thirty-seven")
        number_english_speeling.add("Thirty-eight")
        number_english_speeling.add("Thirty-nine")
        number_english_speeling.add("Forty")

        number_english_speeling.add("Forty-one")
        number_english_speeling.add("Forty-two")
        number_english_speeling.add("Forty-three")
        number_english_speeling.add("Forty-four")
        number_english_speeling.add("Forty-five")
        number_english_speeling.add("Forty-six")
        number_english_speeling.add("Forty-seven")
        number_english_speeling.add("Forty-eight")
        number_english_speeling.add("Forty-nine")
        number_english_speeling.add("Fifty")

        number_english_speeling.add("Fifty-one")
        number_english_speeling.add("Fifty-two")
        number_english_speeling.add("Fifty-three")
        number_english_speeling.add("Fifty-four")
        number_english_speeling.add("Fifty-five")
        number_english_speeling.add("Fifty-six")
        number_english_speeling.add("Fifty-seven")
        number_english_speeling.add("Fifty-eight")
        number_english_speeling.add("Fifty-nine")
        number_english_speeling.add("Sixty")

        number_english_speeling.add("Sixty-one")
        number_english_speeling.add("Sixty-two")
        number_english_speeling.add("Sixty-three")
        number_english_speeling.add("Sixty-four")
        number_english_speeling.add("Sixty-five")
        number_english_speeling.add("Sixty-six")
        number_english_speeling.add("Sixty-seven")
        number_english_speeling.add("Sixty-eight")
        number_english_speeling.add("Sixty-nine")
        number_english_speeling.add("Seventy")

        number_english_speeling.add("Seventy-one")
        number_english_speeling.add("Seventy-two")
        number_english_speeling.add("Seventy-three")
        number_english_speeling.add("Seventy-four")
        number_english_speeling.add("Seventy-five")
        number_english_speeling.add("Seventy-six")
        number_english_speeling.add("Seventy-seven")
        number_english_speeling.add("Seventy-eight")
        number_english_speeling.add("Seventy-nine")
        number_english_speeling.add("Eighty")

        number_english_speeling.add("Eighty-one")
        number_english_speeling.add("Eighty-two")
        number_english_speeling.add("Eighty-three")
        number_english_speeling.add("Eighty-four")
        number_english_speeling.add("Eighty-five")
        number_english_speeling.add("Eighty-six")
        number_english_speeling.add("Eighty-seven")
        number_english_speeling.add("Eighty-eight")
        number_english_speeling.add("Eighty-nine")
        number_english_speeling.add("Ninety")

        number_english_speeling.add("Ninety-one")
        number_english_speeling.add("Ninety-two")
        number_english_speeling.add("Ninety-three")
        number_english_speeling.add("Ninety-four")
        number_english_speeling.add("Ninety-five")
        number_english_speeling.add("Ninety-six")
        number_english_speeling.add("Ninety-seven")
        number_english_speeling.add("Ninety-eight")
        number_english_speeling.add("Ninety-Nine")
        number_english_speeling.add("Hundred")

        var layoutManager = GridLayoutManager(this, 2)
        english_number_recyclerView_ID.layoutManager = layoutManager

        var english_Numer_Adapter = English_Numer_Adapter(number_english_speeling)
        english_number_recyclerView_ID.adapter = english_Numer_Adapter


        //set default speak Start
        textToSpeak = TextToSpeech(this, TextToSpeech.OnInitListener {

            textToSpeak.language = Locale.US
            textToSpeak.speak("0", TextToSpeech.QUEUE_FLUSH, null)

        })
        //set default speak END


        english_number_recyclerView_ID.addOnItemTouchListener(
            RecyclerItemClickListenr(
                this,
                english_number_recyclerView_ID,
                object : RecyclerItemClickListenr.OnItemClickListener {
                    override fun onItemClick(view: View, position: Int) {
                        callSpeakingMethod(position)
                    }

                    override fun onItemLongClick(view: View?, position: Int) {
                        callSpeakingMethod(position)

                    }

                })
        )

    }

    private fun callSpeakingMethod(position: Int) {
        textToSpeak.speak(position.toString(), TextToSpeech.QUEUE_FLUSH, null)

    }
}
