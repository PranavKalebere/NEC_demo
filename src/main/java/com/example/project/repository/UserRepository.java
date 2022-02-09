package com.example.project.repository;

import com.example.project.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer>
{
    @Query(value = "select * from user WHERE token =:n",nativeQuery = true)
    public UserEntity getByToken(@Param("n") String token);
}
