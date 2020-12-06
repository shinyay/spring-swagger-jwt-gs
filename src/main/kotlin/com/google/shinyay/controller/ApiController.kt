package com.google.shinyay.controller

import io.swagger.annotations.Api
import org.springframework.web.bind.annotation.RestController

@RestController
@Api(tags = ["Hello", "Default"], description = "Default Controller")
class ApiController {
}