package imransk.ml.okkhorshikhi.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar.*
import android.app.Dialog
import android.view.Window
import android.widget.Button
import imransk.ml.okkhorshikhi.R
import android.net.Uri
import android.util.Log


class MainActivity : AppCompatActivity(), View.OnClickListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setSupportActionBar(toolbar_id)
        supportActionBar!!.title = "অক্ষর শিখি"




//animation for item
        YoYo.with(Techniques.SlideInRight)
            .duration(1000)
            .repeat(0)
            .playOn(shorborno_btn_ID)
//animation for item
        YoYo.with(Techniques.SlideInRight)
            .duration(1000)
            .repeat(0)
            .playOn(capital_letters_btn_ID)
//animation for item
        YoYo.with(Techniques.SlideInRight)
            .duration(1000)
            .repeat(0)
            .playOn(number_bangla_btn_ID)
//animation for item
        YoYo.with(Techniques.SlideInLeft)
            .duration(1000)
            .repeat(0)
            .playOn(banjon_borno_btn_ID)
//animation for item
        YoYo.with(Techniques.SlideInLeft)
            .duration(1000)
            .repeat(0)
            .playOn(small_letters_btn_ID)
//animation for item
        YoYo.with(Techniques.SlideInLeft)
            .duration(1000)
            .repeat(0)
            .playOn(number_english_btn_ID)


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


    private fun show_Alert_to_Exit_The_App() {

        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.custom_alert_exit_or_rate)

        val no_btn = dialog.findViewById(R.id.no_button_ID) as Button
        val yes_btn = dialog.findViewById(R.id.yes_btn_ID) as Button
        val rate_btn = dialog.findViewById(R.id.rate_btn_ID) as Button
        dialog.show()
        no_btn.setOnClickListener{
            dialog.dismiss()
        }
        yes_btn.setOnClickListener{
          dialog.dismiss()
           finish()

        }
        rate_btn.setOnClickListener{
            dialog.dismiss()
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=${this.packageName}")))
            Log.e("Tag - ","package name = "+this.packageName)

        }


       /* AlertDialog.Builder(this)
            .setIcon(android.R.drawable.ic_dialog_alert)
            .setTitle("Exit App")
            .setMessage("Are you sure you want to Exit this App?")
            .setPositiveButton("Yes") { dialog, which -> finish() }
            .setNegativeButton("No", null)
            .show()*/
    }

    override fun onBackPressed() {
        //        super.onBackPressed();
        val count = supportFragmentManager.backStackEntryCount

        if (count == 0) {
            //                super.onBackPressed();
            //additional code
            show_Alert_to_Exit_The_App()
        } else {
            supportFragmentManager.popBackStack()
        }

    }

    /*//hide bottom and notification bar START
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus){ hideSystemUI()}
    }

    private fun hideSystemUI() {

        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_IMMERSIVE
                // Set the content to appear under the system bars so that the
                // content doesn't resize when the system bars hide and show.
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                // Hide the nav bar and status bar
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN)
    }
//hide bottom and notification bar END*/



    /*override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }*/
}
