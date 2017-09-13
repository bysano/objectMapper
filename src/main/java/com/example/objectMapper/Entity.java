package com.example.objectMapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@NoArgsConstructor
public class Entity {
   @JsonProperty("name")
   private  String name;
   @JsonProperty("field")
   private  String field;
   @JsonProperty("list")
   private List<String> list =new ArrayList<>();

}
