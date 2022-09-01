package com.pentagono.pentagono.exceptions;/*jessica 1 sept*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDTO {
    private LocalDateTime datetime;
    private String message;
    private String path;
}
