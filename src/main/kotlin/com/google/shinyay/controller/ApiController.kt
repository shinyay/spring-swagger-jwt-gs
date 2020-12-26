package com.google.shinyay.controller

import io.swagger.annotations.Api
import org.springframework.web.bind.annotation.RestController
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

@RestController("/api/v1")
@Api(tags = ["Hello", "Default"], description = "Default Controller")
class ApiController {

    fun hello() = listOf<String>(
            "Hello",
            ZonedDateTime.now(ZoneId.of("Japan")).
            format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
}