package com.dungtx.pomodoro.timer

import android.content.Context
import android.os.CountDownTimer
import com.dungtx.pomodoro.utils.SingletonHolder

class Timer private constructor(context: Context) {
    init {

    }

    companion object : SingletonHolder<Timer, Context>(::Timer)

    private lateinit var timer : CountDownTimer

    fun startTimer(length: Long) {
        timer = object : CountDownTimer(length, 1000)
        {
            override fun onFinish() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onTick(p0: Long) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        }.start()
        return
    }

    fun pauseTimer() {
        return
    }

    fun stopTimer() {

    }
}