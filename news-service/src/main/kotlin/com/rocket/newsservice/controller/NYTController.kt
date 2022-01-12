package com.rocket.newsservice.controller

import com.rocket.newsservice.model.NYTArticleResponse
import com.rocket.newsservice.service.NYTService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class NYTController(private val nytService: NYTService) {
    @GetMapping("/articles")
    fun getArticlesByFilter(@RequestParam allParams: Map<String,String>): NYTArticleResponse? =
        nytService.getArticlesByFilter(allParams)
}