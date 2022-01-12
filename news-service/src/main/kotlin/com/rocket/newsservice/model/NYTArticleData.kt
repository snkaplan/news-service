package com.rocket.newsservice.model

import com.google.gson.annotations.SerializedName

data class NYTArticleResponse(
        @SerializedName("response")
        val result: NYTArticleResult
        )

data class NYTArticleResult(
        @SerializedName("docs")
        val nytArticleDocs: List<NYTArticleDocs>
        )

data class NYTArticleDocs(
        @SerializedName("_id")
        val id: String?,
        val abstract: String,
        @SerializedName("web_url")
        val webUrl: String,
        @SerializedName("lead_paragraph")
        val leadParagraph: String

        )

