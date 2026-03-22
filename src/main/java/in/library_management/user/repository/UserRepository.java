package in.library_management.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.library_management.user.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
			
}
