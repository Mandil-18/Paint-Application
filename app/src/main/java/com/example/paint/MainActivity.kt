package com.example.paint

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.paint.PaintView.Companion.colorList
import com.example.paint.PaintView.Companion.currentBrush
import com.example.paint.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object{
        var path = Path()
        var paintBrush = Paint()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val redBtn = findViewById<ImageButton>(R.id.redcolor)
        val blueBtn = findViewById<ImageButton>(R.id.bluecolor)
        val blackBtn = findViewById<ImageButton>(R.id.blackcolor)
        val eraser = findViewById<ImageButton>(R.id.whitecolor)

        redBtn.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.setColor(Color.RED)
            currentColor(paintBrush.color)
        }
        blueBtn.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.setColor(Color.BLUE)
            currentColor(paintBrush.color)
        }
        blackBtn.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.setColor(Color.BLACK)
            currentColor(paintBrush.color)
        }
        eraser.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }
    }
    private fun currentColor(color:Int)
    {
        currentBrush = color
        path = Path()
    }
}