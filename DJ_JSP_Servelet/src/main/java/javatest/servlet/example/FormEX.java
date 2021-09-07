package javatest.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormEX")
public class FormEX extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FormEX() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("myname");
		int age = Integer.parseInt(request.getParameter("myage"));
		int number = Integer.parseInt(request.getParameter("mynumber"));
		System.out.println(name);
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.println(name + "안녕");

		Student s = new Student(name, age, number);
		writer.println(s.getName() + "님 안녕 나이는" + s.getAge() + "살이구나 너의 번호는" + s.getNumber());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("myname_post");
		System.out.println(name);
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.println(name + "안녕 post입니다");
	}

}
