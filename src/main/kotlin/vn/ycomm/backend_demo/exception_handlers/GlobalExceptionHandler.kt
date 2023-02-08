package vn.ycomm.backend_demo.exception_handlers

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
//import vn.ycomm.backend_demo.exceptions.UserNotFoundException
@ControllerAdvice
class GlobalExceptionHandler {
//    @ResponseBody
//    @ExceptionHandler(UserNotFoundException::class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    fun userNotFoundHandler(ex: UserNotFoundException): String {
//        return ex.message!!
//    }
}