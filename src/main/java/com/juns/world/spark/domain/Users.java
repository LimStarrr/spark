package com.juns.world.spark.domain;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.springframework.data.annotation.CreatedDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.LocalDateTime;

@Entity
@Data
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Min(1)
    @Max(20)
    private String userId;

    private String password;

    @Email
    private String email;

    @CreatedDate
    private LocalDateTime createdAt;

//    @PrePersist
//    public void prePersist() {
//        createdAt = LocalDateTime.now();
//    }
}
