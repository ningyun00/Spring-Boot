package com.ning.test.Entity;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@Data
@EntityScan
public class Users {
    private Integer ID;
    private String Name;
    private Integer Age;
    private String Sex;
}
