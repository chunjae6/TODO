package study.team.todo.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import study.team.todo.info.repository.InfoRepository;

@Service
@AllArgsConstructor
public class InfoService {
    private final InfoRepository repository;
}
