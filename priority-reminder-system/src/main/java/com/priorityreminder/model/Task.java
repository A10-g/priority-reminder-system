package com.priorityreminder.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class Task {

    @Id
    @GeneratedValue
    private UUID id;

    private String title;

    private String description;

    private String priority;

    private LocalDateTime remindAt;

    private String status;
}

