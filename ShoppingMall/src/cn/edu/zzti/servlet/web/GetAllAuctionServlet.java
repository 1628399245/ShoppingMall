package cn.edu.zzti.servlet.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.zzti.dao.AuctionDAO;
import cn.edu.zzti.entity.AuctionDO;
import util.DAOFactory;
import util.PathConstence;

/**
  * 查看系统中的全部商品需要先从数据访问层获得全部数据,然后再将数据显示到显示层.
  * 实现该功能的Servlet是GetAllAuctionServlet,显示所有商品的界面是auctionList.jsp
 */

@WebServlet("/GetAllAuctionServlet")
//@WebServlet(name = "GetAllAuctionServlet", urlPatterns = {PathConstence.W_SERVLET_BASE + "/getAllAuction" })
public class GetAllAuctionServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	AuctionDAO auctionDAO = (AuctionDAO) DAOFactory.getDAO(DAOFactory.AUCTION_DAO_CLASS_NAME);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetAllAuctionServlet() {
		super();

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

		List<AuctionDO> list = new ArrayList<AuctionDO>();

		try {
			list = auctionDAO.getAll();
		} catch (SQLException e) {

			e.printStackTrace();

		}

		request.setAttribute("auctionList", list);
		request.getRequestDispatcher(PathConstence.JSP_WEB_BASE + "/auction/auctionList.jsp").forward(request,
				response);

	}

}
