package com.software.client;

import com.noteacher.entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author : Zhang
 * @Date : Created in 2024/4/24 10:09
 * @Decription : 用于远程调用文件上传
 */

@FeignClient("upload-file-service")
public interface UploadFileClient {
    @PostMapping(value = "/upload/image",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    Result uploadFile(@RequestPart MultipartFile file);

}
