package com.ali.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.sax.StartElementListener
import android.util.Log
import android.widget.Toast
import java.io.IOException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var ss = Thread(Runnable {

            for (i in 1..3){
                Log.d("MALI" , "+++++++++++++1 jh 1++++++++++")
            }

        })
        ss.priority = Thread.MIN_PRIORITY


        var a12a = 15


//  این است جعفر ملی 


        var ss1 = Thread(Runnable {
            for (i in 1..3){
                Log.d("MALI" , "+++++++++++++2 jh 2++++++++++")
            }
        })
        ss1.priority = Thread.MAX_PRIORITY

        if (ss.priority > ss1.priority){

            Log.d("MALI" , "00000")

        }else{
            Log.d("MALI" , "111111")
        }
        ss.start()
        ss1.start()



        val t1 = Thread(Runnable {


            var ali = "ali"
        })




    }
}
