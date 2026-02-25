package com.startseva.andr_kuz.data

import com.startseva.andr_kuz.R
import com.startseva.andr_kuz.model.Serial

class Datasource {
    fun loadSerialList(): List<Serial> {
        return listOf(
            Serial(
                titleResourceId = R.string.ser1,
                descriptonResourceId = R.string.ser1_description,
                imageResourceId = R.drawable.ser1
            ),
            Serial(R.string.ser2,
                R.string.ser2_description,
                R.drawable.ser2),
            Serial(R.string.ser3,
                R.string.ser3_description,
                R.drawable.ser3),
            Serial(R.string.ser4,
                R.string.ser4_description,
                R.drawable.ser4),
            Serial(R.string.ser5,
                R.string.ser5_description,
                R.drawable.ser5),
            Serial(R.string.ser6,
                R.string.ser6_description,
                R.drawable.ser6),
            Serial(R.string.ser7,
                R.string.ser7_description,
                R.drawable.ser7),
            Serial(R.string.ser8,
                R.string.ser8_description,
                R.drawable.ser8),
            Serial(R.string.ser9,
                R.string.ser9_description,
                R.drawable.ser9),
            Serial(R.string.ser10,
                R.string.ser10_description,
                R.drawable.ser10),
        )
    }
}