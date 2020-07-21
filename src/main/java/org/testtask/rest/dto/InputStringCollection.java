package org.testtask.rest.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

@JsonAutoDetect
@Data
public class InputStringCollection {
    private String[] strings;
}
