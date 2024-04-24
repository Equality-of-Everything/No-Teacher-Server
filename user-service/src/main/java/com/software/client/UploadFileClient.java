package com.software.client;

import com.noteacher.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author : Zhang
 * @Date : Created in 2024/4/24 10:09
 * @Decription : 用于远程调用文件上传
 */

@FeignClient("commons-service")
public interface UploadFileClient {
    @PostMapping("/upload/image")
    Result uploadFile(@RequestParam MultipartFile file);
}
