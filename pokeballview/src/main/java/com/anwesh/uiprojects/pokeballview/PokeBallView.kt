package com.anwesh.uiprojects.pokeballview

import android.graphics.Color
import android.app.Activity
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.view.View
import android.view.MotionEvent

/**
 * Created by anweshmishra on 13/02/19.
 */

val nodes : Int = 5
val lines : Int = 2
val half1Color : Int = Color.parseColor("#f44336")
val half2Color : Int = Color.parseColor("#BDBDBD")
val backColor : Int = Color.parseColor("#212121")
val scGap : Float = 0.05f
val scDiv : Double = 0.51
val sizeFactor : Float = 2.8f
val strokeFactor : Int = 50