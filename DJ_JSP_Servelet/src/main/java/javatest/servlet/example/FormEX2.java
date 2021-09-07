package javatest.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormEX
 */
@WebServlet("/FormEX2")
public class FormEX2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormEX2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		String name= request.getParameter("animalname");
		int age= Integer.parseInt(request.getParameter("animalage"));
		int number= Integer.parseInt(request.getParameter("animalnumber"));
		String kind= request.getParameter("a_mykinds");
		System.out.println(name);
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		
		
		animal an = new animal(name,age,number,kind);
		writer.print("동물이름은:"+an.getName()+"동물 나이는"+an.getAge()+"동물 번호는"+an.getNumber()+"동물 종류는"+an.getKind());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		request.setCharacterEncoding("utf-8");
		String name= request.getParameter("myname_post");
		System.out.println(name);
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.println(name+"안녕 post입니다");
	}

}
