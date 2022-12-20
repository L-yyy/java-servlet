package com.itly.web.servlet;

import com.itly.mapper.UserMapper;
import com.itly.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.InputStream;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.接收用户信息
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //封装用户信息
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        //2.1获取mybatis对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //2.4调用方法
        User u = userMapper.SelectByUsername(username);

        //3 判断
        if(u == null){
            userMapper.add(user);

            //提交事务
            sqlSession.commit();
            //释放资源
            sqlSession.close();

            String contextPath = request.getContextPath();
            response.sendRedirect(contextPath+"/index.html");
        }else {
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("该用户已经存在");
        }



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
