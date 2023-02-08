package vn.ycomm.backend_demo.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import vn.ycomm.backend_demo.entity.User
import vn.ycomm.backend_demo.repositories.UsersRepository
@Controller
@RequestMapping("/api/v1/users")
class UsersController {
    @Autowired
    private lateinit var userRepository: UsersRepository;

    //get all users
    @GetMapping
    fun getAllUsers() {
        return userRepository.getAllUsers()
    }

    //get user by id
    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: Int, currentUser: User) {
        println(currentUser)
        return userRepository.getUserById(id);
    }
    //create user
    @PostMapping
    fun createUser(@RequestBody user: User) {
        return userRepository.createUser(user);
    }

    //update user
    @PostMapping("/{id}")
    fun updateUser(@PathVariable id: Int, @RequestBody user: User) {
        return userRepository.updateUser(id, user);
    }
}