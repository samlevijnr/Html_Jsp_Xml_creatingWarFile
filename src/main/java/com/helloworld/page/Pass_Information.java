package com.helloworld.page;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Pass_Information extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String value = req.getParameter("name_1");
		JOptionPane.showMessageDialog(null, "Hi " + value);

		PrintWriter outPuttingValueToUrl = res.getWriter();
		outPuttingValueToUrl.println("thank you for the confirmation ...  " + value);
	}
}
