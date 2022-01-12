package com.rocket.newsservice

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class NewsServiceApplication
val logger = LoggerFactory.getLogger(NewsServiceApplication::class.java.name)
fun main(args: Array<String>) {
	runApplication<NewsServiceApplication>(*args)
}
