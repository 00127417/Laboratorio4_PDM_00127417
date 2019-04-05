package com.example.laboratorio4_pdm_00127417

import android.os.Parcel
import android.os.Parcelable

data class Movie (
    var Title: String = "N/A",
    var Year: String = "N/A",
    var Released: String = "N/A",
    var Runtime: String = "N/A",
    var Genre: String = "N/A",
    var Director: String = "N/A",
    var Actors: String = "N/A",
    var Plot: String = "N/A",
    var Languaje: String = "N/A",
    var imdbRating: String = "N/A",
    var Poster: String = "N/A"
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(Title)
        parcel.writeString(Year)
        parcel.writeString(Released)
        parcel.writeString(Runtime)
        parcel.writeString(Genre)
        parcel.writeString(Director)
        parcel.writeString(Actors)
        parcel.writeString(Plot)
        parcel.writeString(Languaje)
        parcel.writeString(imdbRating)
        parcel.writeString(Poster)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Movie> {
        override fun createFromParcel(parcel: Parcel): Movie {
            return Movie(parcel)
        }

        override fun newArray(size: Int): Array<Movie?> {
            return arrayOfNulls(size)
        }
    }

}