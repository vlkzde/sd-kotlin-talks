package org.sdkotlin.meetup.firstwednesday

import java.time.DayOfWeek.WEDNESDAY
import java.time.LocalDate.now
import java.time.temporal.TemporalAdjusters.dayOfWeekInMonth

fun firstWednesday() =
	now() == now().with(dayOfWeekInMonth(1, WEDNESDAY))

fun main(args: Array<String>) {
	when (firstWednesday()) {
		true -> println("SD Kotlin time!")
	}
}

