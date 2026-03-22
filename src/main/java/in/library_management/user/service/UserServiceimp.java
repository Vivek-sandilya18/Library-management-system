package in.library_management.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.library_management.user.entity.Users;
import in.library_management.user.repository.UserRepository;

@Service
public class UserServiceimp implements UserService {
	@Autowired
	private UserRepository userrepo;

	@Override
	public void saveUser(Users user) {
		userrepo.save(user);

	}

	@Override
	public List<Users> getUser() {
		// TODO Auto-generated method stub
		return userrepo.findAll();
	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		Optional<Users> user = userrepo.findById(id);
		if (user.isPresent()) {
			userrepo.delete(user.get());
		}
	}

	@Override
	public Users updateUser(Integer id) {
		// TODO Auto-generated method stub
		Optional<Users> optional = userrepo.findById(id);
		if (optional.isPresent()) {
			userrepo.save(optional.get());
		}
		return optional.get();
	}

	@Override
	public Users getUserById(Integer id) {
		// TODO Auto-generated method stub
		return userrepo.findById(id).get();
	}

	@Override
	public Users User(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
