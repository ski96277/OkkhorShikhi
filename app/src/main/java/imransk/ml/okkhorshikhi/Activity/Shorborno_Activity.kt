package imransk.ml.okkhorshikhi.Activity

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import imransk.ml.okkhorshikhi.R
import imransk.ml.okkhorshikhi.RecyclerView_click.RecyclerItemClickListenr
import imransk.ml.okkhorshikhi.AdapterClass.Shorborno_Adapter
import kotlinx.android.synthetic.main.activity_shorborno.*

class Shorborno_Activity : AppCompatActivity() {

    var shorbborno_okkhor = ArrayList<String>()
     var mPlayer2:MediaPlayer = MediaPlayer()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shorborno)

        shorbborno_okkhor.add("অ")
        shorbborno_okkhor.add("আ")
        shorbborno_okkhor.add("ই")
        shorbborno_okkhor.add("ঈ")
        shorbborno_okkhor.add("উ")
        shorbborno_okkhor.add("ঊ")
        shorbborno_okkhor.add("ঋ")
        shorbborno_okkhor.add("এ")
        shorbborno_okkhor.add("ঐ")
        shorbborno_okkhor.add("ও")
        shorbborno_okkhor.add("ঔ")

        //set layout manager
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        shororno_okkhor_recycler_ID.layoutManager = linearLayoutManager
        //set layout manager END


        var shorborno_Adapter = Shorborno_Adapter(this, shorbborno_okkhor)
        shororno_okkhor_recycler_ID.adapter = shorborno_Adapter

        imageView_details.setImageResource(R.drawable.a01)


        shororno_okkhor_recycler_ID.addOnItemTouchListener(
            RecyclerItemClickListenr(
                this,
                shororno_okkhor_recycler_ID,
                object : RecyclerItemClickListenr.OnItemClickListener {

                    override fun onItemClick(view: View, position: Int) {


                        if (position==0){
                            imageView_details.setImageResource(R.drawable.a01)
                            mPlayer2.stop()
                            mPlayer2=MediaPlayer.create(this@Shorborno_Activity,R.raw.a01)
                            mPlayer2.start()
                        }
                        if (position==1){
                            imageView_details.setImageResource(R.drawable.a02)
                            mPlayer2.stop()

                            mPlayer2=MediaPlayer.create(this@Shorborno_Activity,R.raw.a02)
                            mPlayer2.start()
                        }
                        if (position==2){
                            imageView_details.setImageResource(R.drawable.a03)
                            mPlayer2.stop()

                            mPlayer2=MediaPlayer.create(this@Shorborno_Activity,R.raw.a03)
                            mPlayer2.start()
                        }
                        if (position==3){
                            imageView_details.setImageResource(R.drawable.a04)

                            mPlayer2.stop()

                            mPlayer2=MediaPlayer.create(this@Shorborno_Activity,R.raw.a04)
                            mPlayer2.start()
                        }
                        if (position==4){
                            imageView_details.setImageResource(R.drawable.a05)

                            mPlayer2.stop()

                            mPlayer2=MediaPlayer.create(this@Shorborno_Activity,R.raw.a05)
                            mPlayer2.start()
                        }
                        if (position==5){
                            imageView_details.setImageResource(R.drawable.a06)

                            mPlayer2.stop()

                            mPlayer2=MediaPlayer.create(this@Shorborno_Activity,R.raw.a06)
                            mPlayer2.start()
                        }
                        if (position==6){
                            imageView_details.setImageResource(R.drawable.a07)

                            mPlayer2.stop()

                            mPlayer2=MediaPlayer.create(this@Shorborno_Activity,R.raw.a07)
                            mPlayer2.start()
                        }
                        if (position==7){
                            imageView_details.setImageResource(R.drawable.a08)

                            mPlayer2.stop()

                            mPlayer2=MediaPlayer.create(this@Shorborno_Activity,R.raw.a08)
                            mPlayer2.start()
                        }
                        if (position==8){
                            imageView_details.setImageResource(R.drawable.a09)

                            mPlayer2.stop()

                            mPlayer2=MediaPlayer.create(this@Shorborno_Activity,R.raw.a09)
                            mPlayer2.start()
                        }
                        if (position==9){
                            imageView_details.setImageResource(R.drawable.a10)

                            mPlayer2.stop()

                            mPlayer2=MediaPlayer.create(this@Shorborno_Activity,R.raw.a10)
                            mPlayer2.start()
                        }
                        if (position==10){
                            imageView_details.setImageResource(R.drawable.a11)

                            mPlayer2.stop()

                            mPlayer2=MediaPlayer.create(this@Shorborno_Activity,R.raw.a11)
                            mPlayer2.start()
                        }




                    }

                    override fun onItemLongClick(view: View?, position: Int) {

                        if (position==0){
                            imageView_details.setImageResource(R.drawable.a01)
                            var mPlayer2:MediaPlayer
                            mPlayer2=MediaPlayer.create(this@Shorborno_Activity,R.raw.a01)
                            mPlayer2.start()
                        }
                        if (position==1){
                            imageView_details.setImageResource(R.drawable.a02)

                            var mPlayer2:MediaPlayer
                            mPlayer2=MediaPlayer.create(this@Shorborno_Activity,R.raw.a02)
                            mPlayer2.start()
                        }
                        if (position==2){
                            imageView_details.setImageResource(R.drawable.a03)
                            var mPlayer2:MediaPlayer
                            mPlayer2=MediaPlayer.create(this@Shorborno_Activity,R.raw.a03)
                            mPlayer2.start()
                        }
                        if (position==3){
                            imageView_details.setImageResource(R.drawable.a04)
                            var mPlayer2:MediaPlayer
                            mPlayer2=MediaPlayer.create(this@Shorborno_Activity,R.raw.a04)
                            mPlayer2.start()
                        }
                        if (position==4){
                            imageView_details.setImageResource(R.drawable.a05)
                            var mPlayer2:MediaPlayer
                            mPlayer2=MediaPlayer.create(this@Shorborno_Activity,R.raw.a05)
                            mPlayer2.start()
                        }
                        if (position==5){
                            imageView_details.setImageResource(R.drawable.a06)
                            var mPlayer2:MediaPlayer
                            mPlayer2=MediaPlayer.create(this@Shorborno_Activity,R.raw.a06)
                            mPlayer2.start()
                        }
                        if (position==6){
                            imageView_details.setImageResource(R.drawable.a07)
                            var mPlayer2:MediaPlayer
                            mPlayer2=MediaPlayer.create(this@Shorborno_Activity,R.raw.a07)
                            mPlayer2.start()
                        }
                        if (position==7){
                            imageView_details.setImageResource(R.drawable.a08)
                            var mPlayer2:MediaPlayer
                            mPlayer2=MediaPlayer.create(this@Shorborno_Activity,R.raw.a08)
                            mPlayer2.start()
                        }
                        if (position==8){
                            imageView_details.setImageResource(R.drawable.a09)
                            var mPlayer2:MediaPlayer
                            mPlayer2=MediaPlayer.create(this@Shorborno_Activity,R.raw.a09)
                            mPlayer2.start()
                        }
                        if (position==9){
                            imageView_details.setImageResource(R.drawable.a10)
                            var mPlayer2:MediaPlayer
                            mPlayer2=MediaPlayer.create(this@Shorborno_Activity,R.raw.a10)
                            mPlayer2.start()
                        }
                        if (position==10){
                            imageView_details.setImageResource(R.drawable.a11)
                            var mPlayer2:MediaPlayer
                            mPlayer2=MediaPlayer.create(this@Shorborno_Activity,R.raw.a11)
                            mPlayer2.start()
                        }

                    }

                })
        )


    }
}
