package com.boomshair.gulimall.member.feign;

import com.boomshair.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    R memberCoupons();

}