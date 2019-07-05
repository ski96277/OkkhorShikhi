package imransk.ml.okkhorshikhi.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import imransk.ml.okkhorshikhi.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        shorborno_btn_ID.setOnClickListener(this)
        banjon_borno_btn_ID.setOnClickListener(this)
        capital_letters_btn_ID.setOnClickListener(this)
        small_letters_btn_ID.setOnClickListener(this)
        number_bangla_btn_ID.setOnClickListener(this)
        number_english_btn_ID.setOnClickListener(this)
        arbi_btn_ID.setOnClickListener(this)

    }


    override fun onClick(view: View?) {
        when (view?.id) {
            shorborno_btn_ID.id -> {
                var intent = Intent(this, Shorborno_Activity::class.java)
                startActivity(intent)
            }
            banjon_borno_btn_ID.id -> {
                var intent = Intent(this, BanjonBorno_Activity::class.java)
                startActivity(intent)

            }
            capital_letters_btn_ID.id -> {
                var intent = Intent(this, CapitalLetters_Activity::class.java)
                startActivity(intent)

            }
            small_letters_btn_ID.id -> {
                var intent = Intent(this, SmallLetters_Activity::class.java)
                startActivity(intent)
            }
            number_english_btn_ID.id -> {
                var intent=Intent(this,English_Numer_Activity::class.java)
                startActivity(intent)

            }
            number_bangla_btn_ID.id -> {
                var intent=Intent(this,Bangla_Number_Activity::class.java)
                startActivity(intent)

            }
            arbi_btn_ID.id -> {
                var intent=Intent(this,Arbi_Borno_Activity::class.java)
                startActivity(intent)

            }


        }

    }
}
