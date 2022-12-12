package study.team.todo.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import study.team.todo.service.entity.Info;


public interface InfoRepository extends JpaRepository<Info,Long>{
}
