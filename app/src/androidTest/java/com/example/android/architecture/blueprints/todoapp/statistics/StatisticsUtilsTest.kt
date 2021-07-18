package com.example.android.architecture.blueprints.todoapp.statistics

import com.example.android.architecture.blueprints.todoapp.data.Task
import org.hamcrest.core.Is.`is`
import org.junit.Assert.*
import org.junit.Test

class StatisticsUtilsTest {




    @Test
    fun getActiveAndCompletedStats_noCompleted_returnsHundredZero() {
        // Create an active task
        val tasks = listOf<Task>(Task("Title", "Desc", isCompleted = false ))
        // Call your function
        val result = getActiveAndCompletedStats(tasks)
        // Check the result
        assertThat(result.completedTasksPercent, `is`(0f))
        assertThat(result.activeTasksPercent, `is`(100f))
    }
}

//Given: setup the object and the state of the app that you need for your test. For this test, what is given is
// that you have a list of task where the task is active

// When do the actual action on the object you're testing. For his tes is means calling

// Then is where you actually check what happens when you do the action wher eyou check if the test passed
// or failed. This isuually a number of assert functions calls. For this tes it is the two asserts that check
// you have the correct active and completed percentages

