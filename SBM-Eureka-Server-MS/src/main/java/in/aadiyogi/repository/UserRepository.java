package in.aadiyogi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.aadiyogi.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	
}
