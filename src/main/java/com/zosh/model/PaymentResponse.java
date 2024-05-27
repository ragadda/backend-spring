package com.zosh.model;

import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "paymentResponses")
public class PaymentResponse {
	
	private String payment_url ;

}
