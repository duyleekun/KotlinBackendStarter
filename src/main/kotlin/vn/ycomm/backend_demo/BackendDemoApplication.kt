package vn.ycomm.backend_demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.reactive.config.EnableWebFlux

@SpringBootApplication
@EnableWebFlux
class BackendDemoApplication

fun main(args: Array<String>) {
	runApplication<BackendDemoApplication>(*args)

}
