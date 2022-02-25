package com.example.status_control

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val NCREATE = "Activity CREATED"
    private val NSTART = "Activity STARTED"
    private val NRESUME = "Activity RESUME"
    private val NPAUSE = "Activity PAUSED"
    private val NSTOP = "Activity STOPPED"
    private val NRESTART = "Activity RESTARTED"
    private val NDESTROY = "Activity DESTROYED"

    override fun onCreate(savedInstanceState: Bundle?) {
        //ntf - notification
        super.onCreate(savedInstanceState)
        var ntf = Toast.makeText(this, NCREATE, Toast.LENGTH_SHORT)
        ntf.show()
    }

    override fun onStart() {
        super.onStart()
        var ntf = Toast.makeText(this, NSTART, Toast.LENGTH_SHORT)
        ntf.setGravity(Gravity.LEFT, 0, 0)
        ntf.show()
    }

    override fun onResume() {
        super.onResume()
        var ntf = Toast.makeText(this, NRESUME, Toast.LENGTH_SHORT)
        ntf.setGravity(Gravity.TOP, 0, 0)
        ntf.show()
    }

    override fun onPause() {
        super.onPause()
        var ntf = Toast.makeText(this, NPAUSE, Toast.LENGTH_SHORT)
        ntf.setGravity(Gravity.RIGHT, 0, 0)
        ntf.show()
    }

    override fun onStop() {
        super.onStop()
        var ntf = Toast.makeText(this, NSTOP, Toast.LENGTH_SHORT)
        ntf.setGravity(Gravity.CENTER, 0, 0)
        ntf.show()
    }

    override fun onRestart() {
        super.onRestart()
        var ntf = Toast.makeText(this, NRESTART, Toast.LENGTH_SHORT)
        ntf.setGravity(Gravity.FILL_HORIZONTAL, 0, 0)
        ntf.show()
    }

    override fun onDestroy() {
        super.onDestroy()
        var ntf = Toast.makeText(this, NDESTROY, Toast.LENGTH_SHORT)
        ntf.setGravity(Gravity.FILL, 0, 0)
        ntf.show()
    }
}