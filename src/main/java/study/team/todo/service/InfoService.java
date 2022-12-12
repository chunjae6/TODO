package study.team.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import study.team.todo.info.dto.GetResponse;
import study.team.todo.service.entity.Info;
import study.team.todo.service.repository.InfoRepository;

@Service
@AllArgsConstructor
public class InfoService {
    
    @Autowired
    InfoRepository repos;

    public GetResponse GetTodoList(Long todoId) {
        Info data = repos.findById(todoId).get();

        return entityToDto(data);
    }

    private GetResponse entityToDto(Info data) {
        return GetResponse.builder()
        .title(data.getTitle())
        .content(data.getContent())
        .todoYear(data.getTodoyear())
        .todoMonth(data.getTodomonth())
        .tododay(data.getTododay()).build();
    }

    //Todo조회
    //Request : 년, 월
    //Response : Id, 년, 월, 일, 제목, 내용
    public String GetTodoList(long id) {
        // Blog blog = repos.findById(id).orElse(new Blog());
        // return BlogDto.fromBlog(blog);
        return "GetTodoList(조회조건)";
    }

    //Todo 등록
    //Request : 년, 월, 일, 제목, 내용
    //Response : 
    public String PostTodo(long id) {
        // Blog blog = repos.save(dto.toBlog());
        // return BlogDto.fromBlog(blog);
        return "PostTodo(데이터)";
    }

    //Todo 수정
    //Request : 년, 월, 일, 제목, 내용
    //Response : 
    public String PutTodo(long id) {
        // Blog blog = repos.save(dto.toBlog());
        // return BlogDto.fromBlog(blog);
        return "PutTodo(데이터)";
    }

    //Todo 삭제
    //Request : Id
    //Response : 
    public String DeleteTodo(Long id) {
        // repos.deleteById(id);
        return "DeleteTodo(" + id.toString() + ")";
    }

    // @Override
    // public Blog test() {
    //     return repos.test();
    // }
}
