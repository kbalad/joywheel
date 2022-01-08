package com.kbalad.joywheel.controller

import com.kbalad.joywheel.model.chart.Chart
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("chart")
class ChartController {

    private val log = LoggerFactory.getLogger(this::class.java)

    @GetMapping
    fun getChart(): Chart {
        val username = "default"
        log.debug("calling getChart() for user: $username")

        return dummyChart()
    }

    // TODO remove
    fun dummyChart(): Chart {
        val c = Chart()
        c.putAll(
            mapOf(
                "health" to 2,
                "family" to 4
            )
        )
        return c
    }
}
