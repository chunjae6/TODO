package study.team.todo.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import study.team.todo.info.entity.Info;

public interface InfoRepository extends JpaRepository<Info,Long>{
    
}
