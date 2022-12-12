package study.team.todo.info.dto;

import lombok.Builder;

@Builder
public class GetResponse {
    
    private String title;

    private String content;

    private String todoYear;

    private String todoMonth;

    private String tododay;

}
