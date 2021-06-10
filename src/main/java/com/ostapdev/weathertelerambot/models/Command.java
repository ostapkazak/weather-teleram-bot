package com.ostapdev.weathertelerambot.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
public class Command {
    private String name;
    private String description;
}
