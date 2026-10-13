package com.SD.E_Comm.Model.dto;

import java.util.List;

public record OrderRequest(String customerName,
                           String email,
                           List<OrderItemRequest> items) {
}
