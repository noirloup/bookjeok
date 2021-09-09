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
import book.model.vo.OtherSite;
import review.model.service.ReviewService;
import review.model.vo.Review;

/**
 * Servlet implementation class BookDetailServlet
 */
@WebServlet("/bkupdateview.ad")
public class AdminBookUpdateViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminBookUpdateViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				RequestDispatcher view = null;
				
				int bookid = 0;
				bookid = Integer.parseInt(request.getParameter("bookid"));
				BookService bservice = new BookService();		
				Book book = bservice.selectAdminOneDetail(bookid);
				
				if(request.getParameter("bookid") != null) {
					view = request.getRequestDispatcher("views/book/BookAdminUpdateView.jsp");
					request.setAttribute("book", book);
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
