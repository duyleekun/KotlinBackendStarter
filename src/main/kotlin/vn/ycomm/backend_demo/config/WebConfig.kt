package vn.ycomm.backend_demo.config


//webflux configure
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.config.WebFluxConfigurer
import org.springframework.web.reactive.config.WebFluxConfigurerComposite
import org.springframework.web.reactive.result.method.annotation.ArgumentResolverConfigurer
import vn.ycomm.backend_demo.resolvers.UserArgumentResolver

@Configuration
class MyWebFluxConfigurer : WebFluxConfigurer {
    @Bean
    fun webFluxConfigurer(): WebFluxConfigurer {
        return WebFluxConfigurerComposite()
    }

    override fun configureArgumentResolvers(configurer: ArgumentResolverConfigurer) {
        super.configureArgumentResolvers(configurer)
        configurer.addCustomResolver(UserArgumentResolver())
    }
}