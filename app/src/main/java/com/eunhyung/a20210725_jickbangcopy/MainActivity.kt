package com.eunhyung.a20210725_jickbangcopy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eunhyung.a20210725_jickbangcopy.adapters.RoomAdapter
import com.eunhyung.a20210725_jickbangcopy.datas.Room
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val mRooms = ArrayList<Room>()

    lateinit var mRoomAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRooms.add( Room(7500, "서울시 동대문구", 2, "동대문구의  방입니다."))
        mRooms.add( Room(14500, "서울시 동대문구", 5, "동대문구의 방입니다."))
        mRooms.add( Room(95000, "서울시 서대문구", 0, "동대문구의 방입니다.."))
        mRooms.add( Room(3500, "서울시 중랑구", -3, "중랑구의  방입니다."))
        mRooms.add( Room(9000, "서울시 송파구", 20, "동대문구의 방입니다."))
        mRooms.add( Room(100000, "서울시 강남구", -2, "강남구의 방입니다."))
        mRooms.add( Room(680000, "서울시 서초구", -1, "동대문구의 방입니다."))
        mRooms.add( Room(8500, "서울시 중구", 15, "중구의 방입니다."))
        mRooms.add( Room(3400, "서울시 중구", 0, "중구의 방입니다."))
        mRooms.add( Room(156000, "서울시 동대문구", 6, "동대문구의 방입니다."))


        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRooms)

        roomListView.adapter = mRoomAdapter

        roomListView.setOnItemClickListener { parent, view, position, id ->

            val clickedRoom = mRooms[position]

            val myIntent = Intent(this, ViewRoomDetailActivity::class.java)
            myIntent.putExtra("roomInfo", clickedRoom)
            startActivity(myIntent)


        }
    }
}