package com.um.User_Management.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
@Entity
public class UserManagement {

    @Id
    private Integer userId;
    @NotBlank
    private String userName;
    @NonNull
    private LocalDate dateOfBirth;
   @Email(message = "enter valid email")
    private String email;

    private Long phoneNumber;
    private LocalDate date;
    private LocalTime time;

    public Integer getUserId() {
        return userId;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
