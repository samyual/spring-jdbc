package ru.samyual.tasks.entities;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.ManyToOne;

@Data
@Table("tasks")
public class Task {
    private long id;
    @ManyToOne
    private User user;
    private String name;
    private boolean isActive;
}
