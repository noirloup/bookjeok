package review.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import review.model.service.ReviewService;
import review.model.vo.ReviewList;

/**
 * Servlet implementation class ReviewAllSearchServlet
 */
@WebServlet("/allsearch")
public class ReviewAllSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReviewAllSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 전송 온 값에 한글이 있다면, 인코딩 처리함
		request.setCharacterEncoding("utf-8");
		
		// 2. 전송 온 값 꺼내서, 변수 또는 객체에 기록함
		String searchtype = request.getParameter("searchtype");
		String keyword = request.getParameter("keyword");

		
		// 3. 서비스 객체 생성하고, 메소드 실행하고 결과받기
		ReviewService rservice = new ReviewService();
		ArrayList<ReviewList> list = null;
//		UsedShopService usservice = new UsedShopService();
//		ArrayList<UsedShopAuctionSelect> list = null;

		switch (searchtype) {
		case "bookname":
			list = rservice.selectAllSearchBookName(keyword);
			break;
		case "writerid":
			list = rservice.selectAllSearchWriterId(keyword);
			break;
		}

		// 4. 받은 결과로 성공/실패 페이지 내보내기
		RequestDispatcher view = null;
		if (list.size() > 0) {
			view = request.getRequestDispatcher("views/review/ReviewAllDetailView.jsp");
			request.setAttribute("list", list);
			view.forward(request, response);
		} else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", searchtype + " 검색에 대한 " + keyword + "결과가 존재하지 않습니다.");
			view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
