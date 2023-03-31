package com.yr.belajarintent

import android.os.Parcel
import android.os.Parcelable

data class cars (
    val merk : String?,
    val tahun : Int,
    val plat : String?
        ) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(merk)
        parcel.writeInt(tahun)
        parcel.writeString(plat)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<cars> {
        override fun createFromParcel(parcel: Parcel): cars {
            return cars(parcel)
        }

        override fun newArray(size: Int): Array<cars?> {
            return arrayOfNulls(size)
        }
    }
}