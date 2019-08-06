package com.education.web;

import com.education.bean.Order;
import com.education.bean.Teacher;
import com.education.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {

    @Resource
    private OrderService orderService;


    @RequestMapping("timetable")
    public Map timetable (String starttime, int studentid, ModelMap map) {
        Order byid = orderService.timetable(starttime, studentid);
        if (byid == null) {
            Map map1 = new HashMap();
            map1.put("code", 1);
            map1.put("msg", "失败");
            map1.put("data", 0);
            return map1;
        }else {
            Map map1 = new HashMap();
            Map map2 = new HashMap();
            map1.put("code", 0);
            map1.put("msg", "成功");
            map1.put("data", map2);
            map2.put("11",11);
            return map1;
        }
    }














    @RequestMapping("/test1")
    @ResponseBody
    public Teacher test(){
        Teacher teacher=new Teacher();
        teacher.setTname("王老师");
        teacher.setTage(35);
        System.out.println("git");
        return teacher;
    }


}
