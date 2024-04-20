package com.wasfan.fixfastbuddy2.Garage.DataClasses

import android.os.Parcel
import android.os.Parcelable

data class MechanicDataClass(var dataImage : Int, var dataName : String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(dataImage)
        parcel.writeString(dataName)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MechanicDataClass> {
        override fun createFromParcel(parcel: Parcel): MechanicDataClass {
            return MechanicDataClass(parcel)
        }

        override fun newArray(size: Int): Array<MechanicDataClass?> {
            return arrayOfNulls(size)
        }
    }
}
