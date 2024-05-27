package com.zosh.model;

import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name = "passwordResetTokens")
public class PasswordResetToken {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;
	
	private @NonNull String token;
	
	@ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
	private @NonNull User user;
	
	private @NonNull  Date expiryDate;
	
	public boolean isExpired() {
        return expiryDate.before(new Date());
    }

}
