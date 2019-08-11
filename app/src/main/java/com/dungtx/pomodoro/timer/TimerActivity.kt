package com.dungtx.pomodoro.timer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.dungtx.pomodoro.R

class TimerActivity : AppCompatActivity() {

    private lateinit var TIMER : CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    fun startTimer(length : Long)
    {
        TIMER = object : CountDownTimer(length, 1000){
            override fun onFinish() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onTick(p0: Long) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        }.start()
    }

    fun pauseTimer()
    {
        TIMER.
    }

    fun stopTimer()
    {

    }
}
