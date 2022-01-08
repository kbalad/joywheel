package com.kbalad.joywheel.controller

import com.kbalad.joywheel.model.chart.Chart
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("chart")
class ChartController {

    @GetMapping("keys")
    fun getChartKeys(): List<String> {
        return Chart.defaultKeys
    }
}
