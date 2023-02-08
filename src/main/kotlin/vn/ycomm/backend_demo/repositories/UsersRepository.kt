package vn.ycomm.backend_demo.repositories

import vn.ycomm.backend_demo.entity.User

@org.springframework.stereotype.Repository
interface UsersRepository {
    //get all users
    fun getAllUsers();
    //get user by id
    fun getUserById(id: Int);
    //create user
    fun createUser(user: User);

    //update user
    fun updateUser(id: Int, user: User);
}

