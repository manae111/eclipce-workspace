package ch12;

import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UseMyclassServlet1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		//フォームから送信されたパラメータを取得
		String num1Str = request.getParameter("num1");
		String num2Str = request.getParameter("num2");
		
		//入力した数値を整数に変換
		int num1 = Integer.parseInt(num1Str);
		int num2 = Integer.parseInt(num2Str);
		
		//足し算の結果を表示
		int sum = num1 + num2;
		
		//JSPに渡すデータをセット
		request.setAttribute("num1", num1);
		request.setAttribute("num2", num2);
		request.setAttribute("sum", sum);
		
		//結果を表示するJSPにフォワード
		request.getRequestDispatcher("/useMyclass.jsp").forward(request, response);
		
		
	}
}