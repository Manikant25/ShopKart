package com.example.shopkart.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class SKEditText(context: Context, attributeSet: AttributeSet) :
    AppCompatEditText(context, attributeSet) {
    init {
        applyFont()
    }

    private fun applyFont() {
        val boldTypeFace: Typeface =
            Typeface.createFromAsset(context.assets, "Montserrat-Regular.ttf")
        typeface = boldTypeFace
    }
}
