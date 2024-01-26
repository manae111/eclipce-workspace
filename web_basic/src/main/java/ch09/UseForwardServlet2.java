package ch09;

import java.io.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UseForwardServlet2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		//フォワード先の指定
		RequestDispatcher dispatcher =	request.getRequestDispatcher("/UseForwardServlet1");

		//フォワードの実行
		dispatcher.forward(request, response);
	}
}