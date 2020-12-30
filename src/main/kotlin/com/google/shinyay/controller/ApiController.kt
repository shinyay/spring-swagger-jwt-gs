package com.google.shinyay.controller

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

@RestController("/api/v1")
@Api(tags = ["Hello", "Default"], description = "Default Controller")
class ApiController {

    @ApiOperation(value = "This function is to get Hello Response",
                  notes = "This function is to get Hello and Current time as Response")
    @GetMapping()
    fun hello() = listOf<String>(
            "Hello",
            ZonedDateTime.now(ZoneId.of("Japan")).
            format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
}