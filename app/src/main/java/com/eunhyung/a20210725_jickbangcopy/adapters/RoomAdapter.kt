package com.eunhyung.a20210725_jickbangcopy.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.eunhyung.a20210725_jickbangcopy.datas.Room
import java.util.*

class RoomAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Room>) : ArrayAdapter<Room>(mContext, resId, mList) {
}