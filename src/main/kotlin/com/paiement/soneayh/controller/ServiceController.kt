package com.paiement.soneayh.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ServiceController {

    @GetMapping("testController")
    fun testController():String{
        return "Ernest has created this projet"
    }
}