package com.kbalad.joywheel.model.chart

class Chart : HashMap<String, Byte>() {

    companion object {
        val defaultKeys = listOf(
            "spirituality",
            "health",
            "money",
            "business",
            "social",
            "family",
            "growth",
            "recreation",
        )
    }
}
