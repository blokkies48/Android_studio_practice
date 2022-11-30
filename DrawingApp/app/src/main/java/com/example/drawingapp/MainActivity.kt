package com.example.drawingapp

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.widget.AppCompatImageButton

class MainActivity : AppCompatActivity() {
    private  var drawingView: DrawingView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawingView = findViewById(R.id.drawing_view)
        drawingView?.setSizeBrush(20.toFloat())

        val ibBrushBtn: ImageButton = findViewById(R.id.ib_brush_size_selector)
        ibBrushBtn.setOnClickListener{
            showBrushSizeChooserDialog()
        }


    }

    private fun showBrushSizeChooserDialog(){
        val brushDialog = Dialog(this)
        brushDialog.setContentView(R.layout.dialog_brush_size)
        brushDialog.setTitle("Brush Siz: ")
        val smallBtn: ImageButton =
            brushDialog.findViewById(R.id.ib_small_brush)
        smallBtn.setOnClickListener{
            drawingView?.setSizeBrush(10.toFloat())
            brushDialog.dismiss()
        }

        val mediumBtn : ImageButton =
            brushDialog.findViewById(R.id.ib_medium_brush)
        mediumBtn.setOnClickListener{
            drawingView?.setSizeBrush(20.toFloat())
            brushDialog.dismiss()
        }

        val largeBtn : ImageButton =
            brushDialog.findViewById(R.id.ib_large_brush)
        largeBtn.setOnClickListener{
            drawingView?.setSizeBrush(30.toFloat())
            brushDialog.dismiss()
        }
        brushDialog.show()
    }
}