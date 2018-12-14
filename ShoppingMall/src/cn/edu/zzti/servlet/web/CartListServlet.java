package cn.edu.zzti.servlet.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.edu.zzti.dao.TemporaryCartDAO;
import cn.edu.zzti.entity.CartDO;
import cn.edu.zzti.entity.UserDO;
import util.DAOFactory;
import util.PathConstence;

/**
 * Servlet implementation class CartListServllet
 */
@WebServlet("/CartListServlet")
public class CartListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TemporaryCartDAO temporaryCartDAO=(TemporaryCartDAO) DAOFactory.getDAO(DAOFactory.TEMPORARY_DAO_CLASS_NAME);   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		UserDO user = (UserDO) session.getAttribute("user");
		List<CartDO> list = this.temporaryCartDAO.getAllFromCart(user.getUsername());
		request.setAttribute("cartList", list);
		request.getRequestDispatcher(PathConstence.JSP_WEB_BASE+"/shoppingCart/myShoppingCart.jsp").forward(request, response);
	}

}
