package com.example.job21_setya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Siswa>()
    val listnama = arrayOf(
        "NOR HIDAYAH FITRIYANI",
        "NOVITA SARI",
        "NUR IZZA",
        "RISKA ANGGUN ANGGRIANI",
        "SAHRUL LUKMAN HAKIM",
        "SETYA NENG RAHAYU",
        "SITI AGNIA AMALIA",
        "TIARA BINTANG LISWANDA",
        "WAHYU EKA PRASETYA",
        "ZAHROTUN NISWAH",
        "ZULIANA"
    )

    val listnis = arrayOf(
        "3020",
        "3022",
        "3024",
        "3026",
        "3027",
        "3030",
        "3032",
        "3034",
        "3036",
        "3038",
        "3040",
    )
    lateinit var SiswaView: RecyclerView
    lateinit var SiswaAdapter: SiswaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SiswaView = findViewById(R.id.SiswaView)
        SiswaView.layoutManager = LinearLayoutManager(this)

        for (i in listnama.indices) {
            list.add(Siswa(listnama[i], listnis[i]))
        }

        SiswaAdapter = SiswaAdapter(list)
        SiswaAdapter.notifyDataSetChanged()
        SiswaView.adapter = SiswaAdapter
    }
}