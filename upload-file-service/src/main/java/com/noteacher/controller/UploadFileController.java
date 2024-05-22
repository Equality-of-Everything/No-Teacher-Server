package com.noteacher.controller;

import com.noteacher.result.Result;
import com.noteacher.util.AliOssUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

/**
 * @Author : Zhang
 * @Date : Created in 2024/4/24 8:56
 * @Decription :
 */

@RequestMapping("/upload")
@RestController
public class UploadFileController {
    @Autowired
    private AliOssUtil aliOssUtil;
    @PostMapping("/image")
    public Result uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            if (!aliOssUtil.verifyImageSzie(file.getSize())) {
                return new Result(false, "文件大小超过限制", null);
            }
            //原始文件名
            String originalFilename = file.getOriginalFilename();

            //截取原始文件名的后缀 dfdfdf.png
            String extension = originalFilename.substring(originalFilename.lastIndexOf("."));

            // 后缀名限定，只允许上传jpg，png
            if (!extension.equals(".jpg") && !extension.equals(".png"))
                return new Result(false, "文件格式不正确,只允许上传jpg或png", null);


            //构造新文件名称
            String objectName = UUID.randomUUID().toString() + extension;

            //文件的请求路径
            String filePath = aliOssUtil.upload(file.getBytes(), objectName);

            return new Result(true, "上传成功", filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Result(false, "上传失败", null);
    }

}
