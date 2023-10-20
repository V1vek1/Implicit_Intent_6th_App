package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Yha maine 2 variables bnaya h 1. webButton, joki xml se "cardWeb" ko le rha h  Or
        //2. cameraButton, variable "xml" file se "cardCamera" ke design ko le rha h
        val webButton = findViewById<CardView>(R.id.cardWeb)
        val  cameraButton = findViewById<CardView>(R.id.cardCamera)


        //Yha maime "webButton" per yeh set kiya ki isper click karne per kya hoga
        webButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)   //ek variable bnaya "intent" jisme "Intent"
                                                      // Method call kiya Or usse ek "Action" call
                                                      //karwaya jo  yeh view karega ki iss "link"
                                                      // ko open karne ke liye iss phone me koun
                                                      //koun se app avialable h, to phir wo hame
                                                      //yeh options Show karega, or Hum uske according
                                                      //Koi app Select karke iss Link ko Open karelenge

            intent.data = Uri.parse("https://spotrental.in/")   //Or Phir uss Intent me "data" diya
                                                                       //ki tumhe iss Link per jana h

            startActivity(intent)   //Phir iss "Intent" ko start karne ka Command diya
        }


        //Yha maime "cameraButton" per yeh set kiya ki isper click karne per kya hoga
        cameraButton.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)  //ek variable bnaya "intent" jisme "Intent"
                                                                 //Method call kiya Or usse ek "Action" call
                                                                //karwaya jo ki Phone me jo bhi camera Apps
                                                                //hai usko Open karke ka option dega ki aap
                                                                //kis kamera App se yeh Action karna chate h
                                                                //phir aap khud ke according app open karlenge

            startActivity(intent)    //Phir iss "Intent" ko start karne ka Command diya
        }
    }
}