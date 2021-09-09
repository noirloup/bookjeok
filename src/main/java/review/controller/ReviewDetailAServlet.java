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
 * Servlet implementation class ReviewDetailAServlet
 */
@WebServlet("/rdetaila")
public class ReviewDetailAServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReviewDetailAServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bookNm = request.getParameter("booknm");

		
		ReviewService rservice = new ReviewService();
		

		ReviewList review = rservice.selectReview(bookNm);

		ArrayList<ReviewList> list = rservice.selectAudioDetailList(bookNm);


		RequestDispatcher view = null;
		if (request.getParameter("booknm") != null && list.size() > 0) {
			view = request.getRequestDispatcher("views/review/ReviewDetailAView.jsp");
			request.setAttribute("review", review);
			request.setAttribute("list", list);
			view.forward(request, response);
		} else {
			view = request.getRequestDispatcher("views/common/error.jsp");
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
