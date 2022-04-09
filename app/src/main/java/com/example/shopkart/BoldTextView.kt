package com.example.shopkart

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class BoldTextView(context: Context, attributes: AttributeSet) :
    AppCompatTextView(context, attributes) {
    init {
        applyFont()
    }

    private fun applyFont() {
        val boldTypeFace: Typeface =
            Typeface.createFromAsset(context.assets, "Montserrat-Regular.ttf")
        typeface = boldTypeFace
    }
}
