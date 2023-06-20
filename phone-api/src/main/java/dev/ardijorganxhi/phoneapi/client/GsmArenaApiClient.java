package dev.ardijorganxhi.phoneapi.client;


import dev.ardijorganxhi.phoneapi.model.response.PhoneResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "gsmarenaapiclient", url = "${gsmarena.api.url}")
public interface GsmArenaApiClient {

    @GetMapping("/apple")
    List<PhoneResponse> getApplePhones();

    @GetMapping("/huawei")
    List<PhoneResponse> getHuaweiPhones();

    @GetMapping("/samsung")
    List<PhoneResponse> getSamsungPhones();

    @GetMapping("/xiaomi")
    List<PhoneResponse> getXiaomiPhones();
}
