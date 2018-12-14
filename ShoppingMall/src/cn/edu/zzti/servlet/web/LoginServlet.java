package cn.edu.zzti.servlet.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String errorInfo = "";
		String path = request.getContextPath();
		String forwardPath = "/login.jsp";
		
		if (username != null && !"".equals(username.trim()) && password != null && !"".equals(password.trim())) {

			if (!"admin".equals(username) || !"admin".equals(password)) {

				errorInfo = "用户名或者密码错误";

			}
			if ("admin".equals(username) && "admin".equals(password)) {

				forwardPath = path+"/GetAllAuctionServlet";

			}
			request.setAttribute("errorInfo", errorInfo);
			response.sendRedirect(forwardPath);

		}
	}

}
