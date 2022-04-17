package com.example.randomnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)

        //panggil listener untuk button ketika di klik, yang dipanggil adalah fungsi randomize
        rollButton.setOnClickListener{ randomize(); }
    }

    private fun randomize() {
        //menampilkan toas dengan kalimat random random
        val toast = Toast.makeText(this, "Random Random!", Toast.LENGTH_SHORT)
        toast.show()
        //initiate variable rand dengan memanggil kelas Randa yang berisi 6 numSides
        val rand = Randa(6)
        val randDua = Randa(8)
        //eksekusi fungsi rollout yang ada di dalam kelas Randa. yang mana kelas tersebut telah diinisiasi ke dalam variabel rand.
        val randaMit = rand.rollout()
        val randaMitDua = randDua.rollout()
        //menampilkan hasil random, ke textView
        val resultDaduDua: TextView = findViewById(R.id.dadu2)
        val resultTextView: TextView = findViewById(R.id.textView)

        resultTextView.text = randaMit.toString()
        resultDaduDua.text = randaMitDua.toString()

    }


}

//kelas agar bisa dipanggil berkali kali.
class Randa(val numSides:Int){
    fun rollout(): Int{
        return (1..numSides).random()
    }

}