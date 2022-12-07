package study.team.todo.info.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Builder;

@Entity
@Builder
public class Info {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @Column(nullable = false, length = 100)
    String title;

    @Column(nullable = true, length = 3000)
    String content;

    @Column(nullable = false, length = 10)
    String todoyear;

    @Column(nullable = false, length = 10)
    String todomonth;

    @Column(nullable = false, length = 10)
    String tododay;

    @CreatedDate
    @Column(name="regdate", updatable =false)
    private LocalDateTime regDate;

    @LastModifiedDate
    @Column(name="moddate")
    private LocalDateTime modDate;
}
