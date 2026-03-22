package in.library_management.user.service;

import java.util.List;

import in.library_management.user.entity.Users;

public interface UserService {
		 void saveUser(Users user);
		 
		 List<Users> getUser();
		 
		 void deleteUser(Integer id);
		 
		 Users getUserById(Integer id);
		 
		 Users User(Integer id);

		 Users updateUser(Integer id);
			
		
}
