package usedshop.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import usedshop.model.service.UsedShopService;
import usedshop.model.vo.UsedShopAuctionSelect;
import usedshop.model.vo.UsedShopNormalSelect;

/**
 * Servlet implementation class AdminUsedAuctionSearchServlet
 */
@WebServlet("/usmybidsearch")
public class UsedMyBidSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UsedMyBidSearchServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 관리자용 경매 장터 목록 검색 컨트롤러

		// 1. 전송 온 값에 한글이 있다면, 인코딩 처리함
		request.setCharacterEncoding("utf-8");
		
		// 2. 전송 온 값 꺼내서, 변수 또는 객체에 기록함
		String userid = request.getParameter("userid");
		String keyword = request.getParameter("keyword");


		// 3. 서비스 객체 생성하고, 메소드 실행하고 결과받기
		UsedShopService usservice = new UsedShopService();
		ArrayList<UsedShopAuctionSelect> list = null;

		list = usservice.selectMyBidSearchBookName(userid, keyword);

		// 4. 받은 결과로 성공/실패 페이지 내보내기
		RequestDispatcher view = null;
		if (list.size() > 0) {
			view = request.getRequestDispatcher("views/usedshop/UsedMyBidListView.jsp");
			request.setAttribute("list", list);
			view.forward(request, response);
		} else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", keyword + " 검색에 대한 결과가 존재하지 않습니다.");
			view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
