package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Schema(name = "Customer", description = "Schema to hold customer and account information")
public class CustomerDto {


    @NotEmpty(message = "Name should not be empty")
    @Size(min = 5, max = 20, message = "Name should be between 5 and 20 characters")
    @Schema(
            description = "Name of the customer", example = "Eazy Bytes"
    )
    private String name;

    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Email should be valid")
    @Schema(
            description = "Email address of the customer", example = "tutor@eazybytes.com"
    )
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number should be 10 digits")
    @Schema(
            description = "Mobile Number of the customer", example = "9345432123"
    )
    private String mobileNumber;

    @Schema(
            description = "Account details of the Customer"
    )
    private AccountsDto accountsDto;
}
