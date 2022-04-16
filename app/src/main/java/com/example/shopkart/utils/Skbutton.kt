package com.example.shopkart.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton

class Skbutton(context: Context, attributeSet: AttributeSet) : AppCompatButton(context, attributeSet)
{
    init {
        applyFont()
    }

    private fun applyFont() {
        val boldTypeFace: Typeface =
            Typeface.createFromAsset(context.assets, "Montserrat-Regular.ttf")
        typeface = boldTypeFace
    }

}
