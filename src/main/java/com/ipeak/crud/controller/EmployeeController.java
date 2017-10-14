package com.ipeak.crud.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ipeak.crud.bean.Employee;
import com.ipeak.crud.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by payne on 2017/10/13.
 * 处理员工crud请求
 */
@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/emps")
    public String getEmps(@RequestParam(value = "pn",defaultValue ="1")Integer pn,Model model){

//      1.引入分页插件
//      在查询之前调用传入页码，以及每页的大小
        PageHelper.startPage(pn,5);
        List<Employee> emps = employeeService.getAll();
//        使用pageinfo包装，只需要将pageinfo交给页面就行了
//        它封装了详细的分页信息，包括我们查询出来的信息,连续显示5个页数
        PageInfo page = new PageInfo(emps,5);
        model.addAttribute("pageInfo",page);

        return "list";
}

}
