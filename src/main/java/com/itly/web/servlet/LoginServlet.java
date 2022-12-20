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
import java.io.PrintWriter;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取用户信息
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //2.1获取mybatis对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4
        User user = userMapper.select(username, password);
        //2.5释放
        sqlSession.close();


        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();

        if (user != null){
            //writer.write("登录成功");
            String contextPath = request.getContextPath();
            response.sendRedirect(contextPath+"/brand.html");
        }else{
            writer.write("登录失败");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
