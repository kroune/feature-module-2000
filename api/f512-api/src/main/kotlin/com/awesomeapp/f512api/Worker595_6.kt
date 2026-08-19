package com.awesomeapp.f512api

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters

class Worker595_6(
    context: Context,
    params: WorkerParameters
) : CoroutineWorker(context, params) {
    override suspend fun doWork(): Result {
        return try {
            Thread.sleep(100)
            Result.success()
        } catch (e: Exception) {
            Result.failure()
        }
    }
}
