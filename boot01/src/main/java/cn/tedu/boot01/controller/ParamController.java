package cn.tedu.boot01.controller;

import cn.tedu.boot01.entity.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ParamController {
    @RequestMapping("/p1")
    @ResponseBody
    public String p1(HttpServletRequest request){
        String info = request.getParameter("info");
        return "參數: "+info;
    }

    @RequestMapping("/p2")
    @ResponseBody
    public String p2(String name,int age){
        return "參數: "+ name+":"+age;
    }

    @RequestMapping("/p3")
    @ResponseBody
    public String p3(Emp emp){
        return "參數:"+emp.toString();
    }

}
