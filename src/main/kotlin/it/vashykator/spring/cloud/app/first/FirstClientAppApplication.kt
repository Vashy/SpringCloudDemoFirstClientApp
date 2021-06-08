package it.vashykator.spring.cloud.app.first

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
class FirstClientAppApplication

fun main(args: Array<String>) {
	runApplication<FirstClientAppApplication>(*args)
}

@RestController
class Controller {
	@GetMapping("/aooo")
	fun a() = "Value!"
}

@FeignClient("spring-cloud-eureka-client")
interface GreetingClient {
	@RequestMapping("/greeting")
	fun greeting(): String
}