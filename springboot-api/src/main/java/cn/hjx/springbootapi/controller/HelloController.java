package cn.hjx.springbootapi.controller;

import cn.hjx.springbootutils.utils.TimeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping("getDate")
    public String getDate(){
        Date currentDate = TimeUtils.getCurrentDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "当前时间:"+sdf.format(currentDate);
    }
}
