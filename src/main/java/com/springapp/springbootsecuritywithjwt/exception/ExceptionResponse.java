package com.springapp.springbootsecuritywithjwt.exception;

import java.time.LocalDateTime;

public record ExceptionResponse(LocalDateTime timestamp,
                                String message,
                                String details) {
}