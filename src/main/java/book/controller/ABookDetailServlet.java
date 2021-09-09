package book.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.model.service.BookService;
import book.model.vo.Book;
import review.model.service.ReviewService;
import review.model.vo.Review;

/**
 * Servlet implementation class ABookDetailServlet
 */
@WebServlet("/abkdetail")
public class ABookDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ABookDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = null;
		if(request.getParameter("bookid") != null) {
			int bookId = 0;
			bookId = Integer.parseInt(request.getParameter("bookid"));
			BookService bservice = new BookService();		
			Book book = bservice.selectAOneDetail(bookId);
			Review review = new ReviewService().selectAOne(bookId);
			view = request.getRequestDispatcher("views/book/BookDetailView.jsp");
			request.setAttribute("book", book);
			request.setAttribute("review", review);
			view.forward(request, response);
		} else if(request.getParameter("booknm") != null) {
			String bookNm = null;
			bookNm = request.getParameter("booknm");
			BookService bservice = new BookService();		
			Book book = bservice.selectAOneNmDetail(bookNm);
			Review review = new ReviewService().selectANmOne(bookNm);
			view = request.getRequestDispatcher("views/book/BookDetailView.jsp");
			request.setAttribute("book", book);
			request.setAttribute("review", review);
			view.forward(request, response);

		} else {
			view = request.getRequestDispatcher(
					"views/common/error.jsp");
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
