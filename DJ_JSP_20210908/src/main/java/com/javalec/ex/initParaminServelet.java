package com.javalec.ex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class initParaminServelet
 */
@WebServlet(
		urlPatterns={"/initParaminServelet"},
		initParams= {@WebInitParam(name="name",value="aaaa"),
				@WebInitParam(name="path",value="C:\\Users\\곽우영\\Documents\\카카오톡 받은 파일")})
public class initParaminServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public initParaminServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	

		String name = getInitParameter("name");
		String path = getInitParameter("path");
		response.setContentType("text/html; charset=utf-8");
		response.getWriter().println("<body>");
		response.getWriter().println(name);
		response.getWriter().println("<br>");
		response.getWriter().println(path);
		String id = getServletContext().getInitParameter("id");
		String pw = getServletContext().getInitParameter("pw");
		response.getWriter().println("   id :"+id);
		response.getWriter().println("  p    w :"+pw);
		response.getWriter().println("</body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
