package com.example.objectMapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by alka0317 on 9/13/2017.
 */
@Data
@NoArgsConstructor
public class Pojo {
    @JsonProperty("embeded")
    private String pojo;
}
