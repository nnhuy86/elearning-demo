package cybersoft.java11.crm.servlet;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cybersoft.java11.crm.biz.HomeBiz;
import cybersoft.java11.crm.utils.JspPathConst;
import cybersoft.java11.crm.utils.UrlConst;

@WebServlet(name = "homeServlet", urlPatterns = {
		UrlConst.HOME,
		UrlConst.HEALTH
})
public class HomeServlet extends HttpServlet {
	private HomeBiz biz;
	
	@Override
	public void init() throws ServletException {
		// TODO: init HomeBiz
		super.init();
		biz = new HomeBiz();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO: check database health
		/* cookies and sessions demo 
		// create a new cookie: "username" is name of cookie and "huy" is value
		Cookie cookie = new Cookie("username", "huy");// username la ten user tu email login (vidu: huy@gmail.com thi username la huy)
		// set time to live for cookie is 20 seconds
		cookie.setMaxAge(20);
		// add cookie to response to send to client
		resp.addCookie(cookie);
		
		Date curTime = Calendar.getInstance().getTime();
		String now = "" + curTime.getHours() 
						+ "." + curTime.getMinutes() 
						+ "." + curTime.getSeconds()
						+ "." + curTime.getDate()
						+ "." + curTime.getMonth()
						+ "." + curTime.getYear();
		
		Cookie anotherCookie = new Cookie("lastAccess", now);
		anotherCookie.setMaxAge(60*60*24*30);
		resp.addCookie(anotherCookie);
		
		// get current session from request
		HttpSession currentSession = req.getSession();
		
		System.out.println(currentSession.getAttribute("loggedUser"));
		
		if(currentSession.getAttribute("loggedUser") == null) {
			// set an attribute to current session
			currentSession.setAttribute("loggedUser", "huy");
			// set max time to wait for another request from client
			currentSession.setMaxInactiveInterval(20);
		}
		
		boolean databaseCheckResult = biz.checkHealth();
		if(databaseCheckResult)
			resp.getWriter().append("Connection to database has been made successfully.");
		else
			resp.getWriter().append("Connection to database has been made unsuccessfully.");
		*/
		req.getRequestDispatcher(JspPathConst.HOME_DASHBOARD).forward(req, resp);
	}
}
