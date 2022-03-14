package com.longtien.longtien.controller;


import com.longtien.longtien.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.peer.PanelPeer;

@Controller
@SessionAttributes("longtien")
public class ControllerUser {

    @ModelAttribute("longtien")
    public User initUser() {
        return new User();
    }

    @RequestMapping("/login")
    public String Index(@CookieValue(value = "setUser", defaultValue = "") String setUser, Model model) {
        Cookie cookie = new Cookie("setUser", setUser);
        model.addAttribute("cookieValue", cookie);
        return "user/login";
    }

    @PostMapping("/login")
    public String letsLogin(@ModelAttribute("longtien" ) User user, @CookieValue(value = "setUser", defaultValue = "") String setUser,
                            HttpServletResponse response, HttpServletRequest request,  Model model) {
        String view;
        //Implement method nghiệp vụ
        if (user.getUserName().equals("tien@gmail.com") && user.getPassword().equals("123123")) {
            if (user.getUserName() != null) {
                setUser = user.getUserName();
            }

            //Tạo cookie và đặt vào phản hồi(response)
            Cookie cookie = new Cookie("setUser", setUser);
            cookie.setMaxAge(20);
            response.addCookie(cookie);

            // Lấy tất cả cookie
            Cookie[] cookies = request.getCookies();
            for (Cookie ck : cookies) {
                if (ck.getName().equals("setUser")) {
                    model.addAttribute("CookieValue", ck);
                    break;
                } else {
                    ck.setValue("");
                    model.addAttribute("cookieValue", ck);
                    break;
                }
            }
            view = "/user/page";
        } else {
            user.setUserName("");
            Cookie cookie = new Cookie("setUser", setUser);
            model.addAttribute("cookieValue", cookie);
            model.addAttribute("message", "Đăng nhập, không thành công. Vui lòng thử lại");
            view = "/user/login";
        }
        return view;
    }
}
