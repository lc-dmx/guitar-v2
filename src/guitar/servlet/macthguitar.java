package guitar.servlet;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import guitarshop.bll.inventoryBll;
import guitarshop.entity.guitar;
import guitarshop.entity.guitarspec;

/**
 * Servlet implementation class macthguitar
 */
@WebServlet("/macthguitar")
public class macthguitar extends HttpServlet {
	@SuppressWarnings("null")
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	@SuppressWarnings("null")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ����ҳ���ѯ����������װ��spec
		guitarspec spec = new guitarspec(null);
		
		spec.setBuilder(request.getParameter("builder"));

		// �½�һ��guitar List �����洢ƥ�䵽��guitars
		List<guitar> matchingGuitars = new LinkedList<guitar>();

		matchingGuitars = inventoryBll.inventory().search(spec);
		
		System.out.println(matchingGuitars);
		
		request.setAttribute("aaa", matchingGuitars);
		request.getRequestDispatcher("match.jsp").forward(request, response);
	}
}
