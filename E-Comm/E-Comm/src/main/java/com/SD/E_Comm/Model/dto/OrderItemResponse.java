package com.SD.E_Comm.Model.dto;

import java.math.BigDecimal;

public record OrderItemResponse(String productName,
                                int quantity,
                                BigDecimal totalPrice) {
}
