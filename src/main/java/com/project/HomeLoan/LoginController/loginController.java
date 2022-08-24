package com.project.HomeLoan.LoginController;
import com.project.HomeLoan.LoginDomain.Users;
import com.project.HomeLoan.LoginService.loginService;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.HomeLoan.LoginDomain.Users;
import com.project.HomeLoan.LoginService.loginService;

@Controller
public class loginController {

        @Autowired
        private loginService userService;

        @GetMapping("/login")

        public ModelAndView login() {
                ModelAndView mav = new ModelAndView("users");
                mav.addObject("user", new Users());
                return mav;
        }

        @PostMapping("/login")
        public String login(@ModelAttribute("user") Users user ) {

                Users oauthUser = userService.login(user.getEmail(), user.getPasswrd());


                System.out.print(oauthUser);
                if(Objects.nonNull(oauthUser))
                {

                        return "redirect:/";


                } else {
                        return "redirect:/login";


                }

        }

        @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
        public String logoutDo(HttpServletRequest request,HttpServletResponse response)
        {


                return "redirect:/login";
        }

}
