package com.gadde.helloworld.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GreetingDto {

    @NotBlank
    @Size(min = 5, max = 50)
    private String name;

    @NotBlank
    @Size(min=5, max = 250)
    private String greeting;


    private Date greetingDate;

}
