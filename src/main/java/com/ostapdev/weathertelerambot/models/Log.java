package com.ostapdev.weathertelerambot.models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Document(collection = "logs")
public class Log {
    private BigInteger id;

    @NonNull
    @Field(targetType = FieldType.STRING)
    private LogStatus status;

    @NonNull
    private String message;
}
