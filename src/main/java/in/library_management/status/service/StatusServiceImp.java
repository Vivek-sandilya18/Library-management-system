package in.library_management.status.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.library_management.status.entity.Status;
import in.library_management.status.repository.Status_Repository;
import in.library_management.user.entity.Users;
import in.library_management.user.repository.UserRepository;  

@Service
public class StatusServiceImp implements StatusService {

	@Autowired
	private Status_Repository statusRepository;

	@Autowired
	private UserRepository userRepository; 

	@Override
	public Status getBookById(Integer id) {
		return statusRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Status not found with id: " + id));
	}

	@Override
	public Status saveBook(Status status) {
		return statusRepository.save(status);
	}

	@Override
	public void deleteBook(Integer id) {  
		if (!statusRepository.existsById(id)) {
			throw new RuntimeException("Status not found with id: " + id);
		}
		statusRepository.deleteById(id);
	}

	@Override
	public List<Status> getBooksByUser(Integer userId) {
		return statusRepository.findByUserId(userId);
	}

	@Override
	public Users getUserById(Integer userId) { 
		return userRepository.findById(userId)
				.orElseThrow(() -> new RuntimeException("User not found with id: " + userId));
	}
}
