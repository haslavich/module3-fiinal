package com.javarush.quest;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/game")
public class GameServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        String answer=req.getParameter("answer");
        if(answer==null){
            req.setAttribute("message","Please enter your answer.");
            req.getRequestDispatcher("/question.jsp").forward(req,resp);
        }
        if("accept".equals(answer)){
            session.setAttribute("result", "Вы приняли вызов");
        } else {
            session.setAttribute("result","Вы отказались!");
        }
        resp.sendRedirect(req.getContextPath()+"/result.jsp");
        }
}
