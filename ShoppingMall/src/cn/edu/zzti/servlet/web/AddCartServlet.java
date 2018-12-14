package cn.edu.zzti.servlet.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.zzti.dao.AuctionDAO;
import cn.edu.zzti.dao.TemporaryCartDAO;
import cn.edu.zzti.entity.AuctionDO;
import cn.edu.zzti.entity.UserDO;
import util.DAOFactory;
import util.PathConstence;

/**
 * Servlet implementation class AddCartServlet
 */
@WebServlet("/AddCartServlet")
//@WebServlet(name = "/AddCartServlet", urlPatterns = { PathConstence.W_SERVLET_BASE + "/AddCartServlet" })
public class AddCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TemporaryCartDAO temporaryCartDAO = (TemporaryCartDAO) DAOFactory
			.getDAO(DAOFactory.TEMPORARY_DAO_CLASS_NAME);
	private AuctionDAO auctionDAO = (AuctionDAO) DAOFactory.getDAO(DAOFactory.AUCTION_DAO_CLASS_NAME);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddCartServlet() {
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

//		String basePath = request.getContextPath() + PathConstence.W_SERVLET_BASE;
		String basePath = request.getContextPath();
		String aucId = request.getParameter("id");

		if (aucId == null || "".equals(aucId)) {
			response.sendRedirect(basePath + "/GetAllAuctionServlet");
		}

		try {

			AuctionDO auctionDO = auctionDAO.getAuction(aucId);
			this.temporaryCartDAO.addToCart(((UserDO) request.getSession().getAttribute("user")).getUsername(),
					auctionDO);
			response.sendRedirect(basePath + "/GetAllAuctionServlet");

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}

}
