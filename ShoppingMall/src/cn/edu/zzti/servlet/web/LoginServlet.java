package cn.edu.zzti.servlet.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.zzti.dao.impl.constance.UserDAOImpl;
import cn.edu.zzti.entity.UserDO;

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
		UserDAOImpl userDAO = new UserDAOImpl();

		UserDO user = new UserDO();
		try {

			user = userDAO.findUser(username, password);

		} catch (SQLException e) {

			e.printStackTrace();

		}

		if (user != null) {
			forwardPath = path + "/GetAllAuctionServlet";
		} else {
			errorInfo = "用户名或者密码错误";
		}

		request.setAttribute("errorInfo", errorInfo);
		request.getSession().setAttribute("user", user);
		response.sendRedirect(forwardPath);

	}

}
