package com.noteacher.client;

import com.noteacher.entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/15 10:28
 * @Decription :
 */

@FeignClient("user-service")
public interface UserClient {
    @PostMapping("/userInfo/updateLexile")
    Result updateLexile(@RequestParam String userId,@RequestParam int lexile);
}
