package com.java.couponcustomerserv.api.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchCoupon {
    private Long userId;
    private Long shopId;
    private Integer couponStatus;

}
