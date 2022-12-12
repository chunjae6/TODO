package study.team.todo.info;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import study.team.todo.info.dto.GetResponse;
import study.team.todo.service.InfoService;

@RestController
@RequestMapping("/TODO")
@AllArgsConstructor
public class InfoController {
    private final InfoService infoService;
    
    @GetMapping("/getTodo")
    public ResponseEntity<GetResponse> selectTODO(@RequestParam(value = "todoId", required = true) Long todoId) {
        return new ResponseEntity<>(infoService.GetTodoList(todoId),HttpStatus.OK);
    }
}