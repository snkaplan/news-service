package com.rocket.newsservice.service

import com.rocket.newsservice.config.AppProperties
import com.rocket.newsservice.model.NYTArticleResponse
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.InitializingBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.PropertySource
import org.springframework.stereotype.Service
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Service
@PropertySource(value = ["application.properties"])
class NYTService: InitializingBean {
    @Autowired
    lateinit var appProperties: AppProperties
    final val logger = LoggerFactory.getLogger(NYTService::class.java.name)
    private lateinit var service: NYTInterface

    override fun afterPropertiesSet() {
        val retrofit = Retrofit.Builder()
            .baseUrl(appProperties.baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        service = retrofit.create(NYTInterface::class.java)
    }

    fun getArticlesByFilter(allParams: Map<String, String>): NYTArticleResponse? {
        val listArticles = service.listArticles(allParams, appProperties.apiKey)
        val execute = listArticles?.execute()
        return execute?.body()
    }

}