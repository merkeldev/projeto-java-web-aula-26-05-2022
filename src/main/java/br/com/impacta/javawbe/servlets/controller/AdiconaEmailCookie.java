package br.com.impacta.javawbe.servlets.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AdiconaEmailCookie", value = "/adicionaEmailCookie")
public class AdiconaEmailCookie extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String emailRecebido = request.getParameter("email");
    Cookie cookieEmail = new Cookie("email", emailRecebido);
    response.addCookie(cookieEmail);
    RequestDispatcher dispatcher = request.getRequestDispatcher("/login.html");
    dispatcher.forward(request, response);
  }
}
