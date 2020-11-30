package com.google.shinyay.configuration

import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.service.ApiInfo

@Configuration
class SwaggerConfiguration {

    private fun apiInfo(): ApiInfo = ApiInfoBuilder()
            .build()
}