package com.awesomeapp.foundation14

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters

class Worker15_6(
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
