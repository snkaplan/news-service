package com.rocket.newsservice.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class AppProperties {
    @Value("\${app.API_KEY}")
    lateinit var apiKey: String
    @Value("\${app.BASE_URL}")
    lateinit var baseUrl: String
}