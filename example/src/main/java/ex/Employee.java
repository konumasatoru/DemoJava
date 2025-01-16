package ex;

import jakarta.servlet.http.HttpServlet;


public class Employee extends HttpServlet {
	private String id;
	private String name;
	public Employee(String id, String name) {
		this.id = id; this.name = name;
	}
	public String getId() {return id; }
	public String getName() { return name; }

	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
