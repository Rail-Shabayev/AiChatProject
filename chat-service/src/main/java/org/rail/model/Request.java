package org.rail.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @JsonIgnore
    private UUID uuid;
    private String model;
    private String prompt;
    @Nullable
    private boolean raw;
    @Nullable
    private boolean stream;

    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "response_id")
    private Response response;
}
