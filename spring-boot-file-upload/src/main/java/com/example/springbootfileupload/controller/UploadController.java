package com.example.springbootfileupload.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UploadController {
    Map<String, Object> result = new HashMap<>();
    /// Receive message
    @RequestMapping("/uploadFile")
    public Map<String, Object> upload(@RequestParam("attach") MultipartFile[] files) throws IOException {
        // File info
        for(MultipartFile a : files) {
            System.out.println("File name = "  + a.getOriginalFilename());
            System.out.println("File type = " + a.getContentType());

            // Save to disk
            // file path example 1) Windows c:/, 3) Mac ~/Documents/
            String filePath = "~/Documents/";
            a.transferTo(new File(filePath + a.getOriginalFilename()));
        }


        result.put("Success", true);
        return result;
    }
}
