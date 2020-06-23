package com.rair.workmanager

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

/**
 * @author Rair
 * @date 2020/6/23
 *
 * desc:
 */
class MyWorker(context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {

    override fun doWork(): Result {
        Log.d("Rair", "开始...")
        Thread.sleep(3000)
        Log.d("Rair", "结束...")
        return Result.success()
    }
}